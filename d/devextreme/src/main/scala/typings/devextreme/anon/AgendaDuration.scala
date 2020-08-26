package typings.devextreme.anon

import typings.devextreme.devextremeStrings.agenda
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.day
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.month
import typings.devextreme.devextremeStrings.timelineDay
import typings.devextreme.devextremeStrings.timelineMonth
import typings.devextreme.devextremeStrings.timelineWeek
import typings.devextreme.devextremeStrings.timelineWorkWeek
import typings.devextreme.devextremeStrings.unlimited
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.devextremeStrings.week
import typings.devextreme.devextremeStrings.workWeek
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgendaDuration extends js.Object {
  var agendaDuration: js.UndefOr[Double] = js.native
  var appointmentCollectorTemplate: js.UndefOr[
    template | (js.Function2[
      /* data */ AppointmentCount, 
      /* collectorElement */ dxElement, 
      String | typings.std.Element | JQuery
    ])
  ] = js.native
  var appointmentTemplate: js.UndefOr[
    template | (js.Function3[
      /* model */ AppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | typings.std.Element | JQuery
    ])
  ] = js.native
  var appointmentTooltipTemplate: js.UndefOr[
    template | (js.Function3[
      /* model */ AppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | typings.std.Element | JQuery
    ])
  ] = js.native
  var cellDuration: js.UndefOr[Double] = js.native
  var dataCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | typings.std.Element | JQuery
    ])
  ] = js.native
  var dateCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | typings.std.Element | JQuery
    ])
  ] = js.native
  var dropDownAppointmentTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | typings.std.Element | JQuery
    ])
  ] = js.native
  var endDayHour: js.UndefOr[Double] = js.native
  var firstDayOfWeek: js.UndefOr[
    typings.devextreme.devextremeNumbers.`0` | typings.devextreme.devextremeNumbers.`1` | typings.devextreme.devextremeNumbers.`2` | typings.devextreme.devextremeNumbers.`3` | typings.devextreme.devextremeNumbers.`4` | typings.devextreme.devextremeNumbers.`5` | typings.devextreme.devextremeNumbers.`6`
  ] = js.native
  var groupByDate: js.UndefOr[Boolean] = js.native
  var groupOrientation: js.UndefOr[horizontal | vertical] = js.native
  var groups: js.UndefOr[js.Array[String]] = js.native
  var intervalCount: js.UndefOr[Double] = js.native
  var maxAppointmentsPerCell: js.UndefOr[Double | auto | unlimited] = js.native
  var name: js.UndefOr[String] = js.native
  var resourceCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | typings.std.Element | JQuery
    ])
  ] = js.native
  var startDate: js.UndefOr[typings.std.Date | Double | String] = js.native
  var startDayHour: js.UndefOr[Double] = js.native
  var timeCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | typings.std.Element | JQuery
    ])
  ] = js.native
  var `type`: js.UndefOr[
    agenda | day | month | timelineDay | timelineMonth | timelineWeek | timelineWorkWeek | week | workWeek
  ] = js.native
}

object AgendaDuration {
  @scala.inline
  def apply(): AgendaDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgendaDuration]
  }
  @scala.inline
  implicit class AgendaDurationOps[Self <: AgendaDuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAgendaDuration(value: Double): Self = this.set("agendaDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgendaDuration: Self = this.set("agendaDuration", js.undefined)
    @scala.inline
    def setAppointmentCollectorTemplateFunction2(
      value: (/* data */ AppointmentCount, /* collectorElement */ dxElement) => String | typings.std.Element | JQuery
    ): Self = this.set("appointmentCollectorTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setAppointmentCollectorTemplate(
      value: template | (js.Function2[
          /* data */ AppointmentCount, 
          /* collectorElement */ dxElement, 
          String | typings.std.Element | JQuery
        ])
    ): Self = this.set("appointmentCollectorTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppointmentCollectorTemplate: Self = this.set("appointmentCollectorTemplate", js.undefined)
    @scala.inline
    def setAppointmentTemplateFunction3(
      value: (/* model */ AppointmentData, /* itemIndex */ Double, /* contentElement */ dxElement) => String | typings.std.Element | JQuery
    ): Self = this.set("appointmentTemplate", js.Any.fromFunction3(value))
    @scala.inline
    def setAppointmentTemplate(
      value: template | (js.Function3[
          /* model */ AppointmentData, 
          /* itemIndex */ Double, 
          /* contentElement */ dxElement, 
          String | typings.std.Element | JQuery
        ])
    ): Self = this.set("appointmentTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppointmentTemplate: Self = this.set("appointmentTemplate", js.undefined)
    @scala.inline
    def setAppointmentTooltipTemplateFunction3(
      value: (/* model */ AppointmentData, /* itemIndex */ Double, /* contentElement */ dxElement) => String | typings.std.Element | JQuery
    ): Self = this.set("appointmentTooltipTemplate", js.Any.fromFunction3(value))
    @scala.inline
    def setAppointmentTooltipTemplate(
      value: template | (js.Function3[
          /* model */ AppointmentData, 
          /* itemIndex */ Double, 
          /* contentElement */ dxElement, 
          String | typings.std.Element | JQuery
        ])
    ): Self = this.set("appointmentTooltipTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppointmentTooltipTemplate: Self = this.set("appointmentTooltipTemplate", js.undefined)
    @scala.inline
    def setCellDuration(value: Double): Self = this.set("cellDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellDuration: Self = this.set("cellDuration", js.undefined)
    @scala.inline
    def setDataCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | typings.std.Element | JQuery
    ): Self = this.set("dataCellTemplate", js.Any.fromFunction3(value))
    @scala.inline
    def setDataCellTemplate(
      value: template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | typings.std.Element | JQuery
        ])
    ): Self = this.set("dataCellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataCellTemplate: Self = this.set("dataCellTemplate", js.undefined)
    @scala.inline
    def setDateCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | typings.std.Element | JQuery
    ): Self = this.set("dateCellTemplate", js.Any.fromFunction3(value))
    @scala.inline
    def setDateCellTemplate(
      value: template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | typings.std.Element | JQuery
        ])
    ): Self = this.set("dateCellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateCellTemplate: Self = this.set("dateCellTemplate", js.undefined)
    @scala.inline
    def setDropDownAppointmentTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* contentElement */ dxElement) => String | typings.std.Element | JQuery
    ): Self = this.set("dropDownAppointmentTemplate", js.Any.fromFunction3(value))
    @scala.inline
    def setDropDownAppointmentTemplate(
      value: template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* contentElement */ dxElement, 
          String | typings.std.Element | JQuery
        ])
    ): Self = this.set("dropDownAppointmentTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownAppointmentTemplate: Self = this.set("dropDownAppointmentTemplate", js.undefined)
    @scala.inline
    def setEndDayHour(value: Double): Self = this.set("endDayHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDayHour: Self = this.set("endDayHour", js.undefined)
    @scala.inline
    def setFirstDayOfWeek(
      value: typings.devextreme.devextremeNumbers.`0` | typings.devextreme.devextremeNumbers.`1` | typings.devextreme.devextremeNumbers.`2` | typings.devextreme.devextremeNumbers.`3` | typings.devextreme.devextremeNumbers.`4` | typings.devextreme.devextremeNumbers.`5` | typings.devextreme.devextremeNumbers.`6`
    ): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    @scala.inline
    def setGroupByDate(value: Boolean): Self = this.set("groupByDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupByDate: Self = this.set("groupByDate", js.undefined)
    @scala.inline
    def setGroupOrientation(value: horizontal | vertical): Self = this.set("groupOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupOrientation: Self = this.set("groupOrientation", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setIntervalCount(value: Double): Self = this.set("intervalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntervalCount: Self = this.set("intervalCount", js.undefined)
    @scala.inline
    def setMaxAppointmentsPerCell(value: Double | auto | unlimited): Self = this.set("maxAppointmentsPerCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAppointmentsPerCell: Self = this.set("maxAppointmentsPerCell", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setResourceCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | typings.std.Element | JQuery
    ): Self = this.set("resourceCellTemplate", js.Any.fromFunction3(value))
    @scala.inline
    def setResourceCellTemplate(
      value: template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | typings.std.Element | JQuery
        ])
    ): Self = this.set("resourceCellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceCellTemplate: Self = this.set("resourceCellTemplate", js.undefined)
    @scala.inline
    def setStartDate(value: typings.std.Date | Double | String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    @scala.inline
    def setStartDayHour(value: Double): Self = this.set("startDayHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDayHour: Self = this.set("startDayHour", js.undefined)
    @scala.inline
    def setTimeCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | typings.std.Element | JQuery
    ): Self = this.set("timeCellTemplate", js.Any.fromFunction3(value))
    @scala.inline
    def setTimeCellTemplate(
      value: template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | typings.std.Element | JQuery
        ])
    ): Self = this.set("timeCellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeCellTemplate: Self = this.set("timeCellTemplate", js.undefined)
    @scala.inline
    def setType(
      value: agenda | day | month | timelineDay | timelineMonth | timelineWeek | timelineWorkWeek | week | workWeek
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

