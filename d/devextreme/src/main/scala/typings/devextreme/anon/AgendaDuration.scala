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
import typings.devextreme.mod.DevExpress.ui.dxSchedulerScrolling
import typings.devextreme.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgendaDuration extends StObject {
  
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
  
  var scrolling: js.UndefOr[dxSchedulerScrolling] = js.native
  
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
  implicit class AgendaDurationMutableBuilder[Self <: AgendaDuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgendaDuration(value: Double): Self = StObject.set(x, "agendaDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgendaDurationUndefined: Self = StObject.set(x, "agendaDuration", js.undefined)
    
    @scala.inline
    def setAppointmentCollectorTemplate(
      value: template | (js.Function2[
          /* data */ AppointmentCount, 
          /* collectorElement */ dxElement, 
          String | typings.std.Element | JQuery
        ])
    ): Self = StObject.set(x, "appointmentCollectorTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentCollectorTemplateFunction2(
      value: (/* data */ AppointmentCount, /* collectorElement */ dxElement) => String | typings.std.Element | JQuery
    ): Self = StObject.set(x, "appointmentCollectorTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppointmentCollectorTemplateUndefined: Self = StObject.set(x, "appointmentCollectorTemplate", js.undefined)
    
    @scala.inline
    def setAppointmentTemplate(
      value: template | (js.Function3[
          /* model */ AppointmentData, 
          /* itemIndex */ Double, 
          /* contentElement */ dxElement, 
          String | typings.std.Element | JQuery
        ])
    ): Self = StObject.set(x, "appointmentTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentTemplateFunction3(
      value: (/* model */ AppointmentData, /* itemIndex */ Double, /* contentElement */ dxElement) => String | typings.std.Element | JQuery
    ): Self = StObject.set(x, "appointmentTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAppointmentTemplateUndefined: Self = StObject.set(x, "appointmentTemplate", js.undefined)
    
    @scala.inline
    def setAppointmentTooltipTemplate(
      value: template | (js.Function3[
          /* model */ AppointmentData, 
          /* itemIndex */ Double, 
          /* contentElement */ dxElement, 
          String | typings.std.Element | JQuery
        ])
    ): Self = StObject.set(x, "appointmentTooltipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentTooltipTemplateFunction3(
      value: (/* model */ AppointmentData, /* itemIndex */ Double, /* contentElement */ dxElement) => String | typings.std.Element | JQuery
    ): Self = StObject.set(x, "appointmentTooltipTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAppointmentTooltipTemplateUndefined: Self = StObject.set(x, "appointmentTooltipTemplate", js.undefined)
    
    @scala.inline
    def setCellDuration(value: Double): Self = StObject.set(x, "cellDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellDurationUndefined: Self = StObject.set(x, "cellDuration", js.undefined)
    
    @scala.inline
    def setDataCellTemplate(
      value: template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | typings.std.Element | JQuery
        ])
    ): Self = StObject.set(x, "dataCellTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | typings.std.Element | JQuery
    ): Self = StObject.set(x, "dataCellTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDataCellTemplateUndefined: Self = StObject.set(x, "dataCellTemplate", js.undefined)
    
    @scala.inline
    def setDateCellTemplate(
      value: template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | typings.std.Element | JQuery
        ])
    ): Self = StObject.set(x, "dateCellTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | typings.std.Element | JQuery
    ): Self = StObject.set(x, "dateCellTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDateCellTemplateUndefined: Self = StObject.set(x, "dateCellTemplate", js.undefined)
    
    @scala.inline
    def setDropDownAppointmentTemplate(
      value: template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* contentElement */ dxElement, 
          String | typings.std.Element | JQuery
        ])
    ): Self = StObject.set(x, "dropDownAppointmentTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownAppointmentTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* contentElement */ dxElement) => String | typings.std.Element | JQuery
    ): Self = StObject.set(x, "dropDownAppointmentTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDropDownAppointmentTemplateUndefined: Self = StObject.set(x, "dropDownAppointmentTemplate", js.undefined)
    
    @scala.inline
    def setEndDayHour(value: Double): Self = StObject.set(x, "endDayHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDayHourUndefined: Self = StObject.set(x, "endDayHour", js.undefined)
    
    @scala.inline
    def setFirstDayOfWeek(
      value: typings.devextreme.devextremeNumbers.`0` | typings.devextreme.devextremeNumbers.`1` | typings.devextreme.devextremeNumbers.`2` | typings.devextreme.devextremeNumbers.`3` | typings.devextreme.devextremeNumbers.`4` | typings.devextreme.devextremeNumbers.`5` | typings.devextreme.devextremeNumbers.`6`
    ): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
    
    @scala.inline
    def setGroupByDate(value: Boolean): Self = StObject.set(x, "groupByDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByDateUndefined: Self = StObject.set(x, "groupByDate", js.undefined)
    
    @scala.inline
    def setGroupOrientation(value: horizontal | vertical): Self = StObject.set(x, "groupOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupOrientationUndefined: Self = StObject.set(x, "groupOrientation", js.undefined)
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setIntervalCount(value: Double): Self = StObject.set(x, "intervalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalCountUndefined: Self = StObject.set(x, "intervalCount", js.undefined)
    
    @scala.inline
    def setMaxAppointmentsPerCell(value: Double | auto | unlimited): Self = StObject.set(x, "maxAppointmentsPerCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAppointmentsPerCellUndefined: Self = StObject.set(x, "maxAppointmentsPerCell", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResourceCellTemplate(
      value: template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | typings.std.Element | JQuery
        ])
    ): Self = StObject.set(x, "resourceCellTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | typings.std.Element | JQuery
    ): Self = StObject.set(x, "resourceCellTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setResourceCellTemplateUndefined: Self = StObject.set(x, "resourceCellTemplate", js.undefined)
    
    @scala.inline
    def setScrolling(value: dxSchedulerScrolling): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    
    @scala.inline
    def setStartDate(value: typings.std.Date | Double | String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setStartDayHour(value: Double): Self = StObject.set(x, "startDayHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDayHourUndefined: Self = StObject.set(x, "startDayHour", js.undefined)
    
    @scala.inline
    def setTimeCellTemplate(
      value: template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | typings.std.Element | JQuery
        ])
    ): Self = StObject.set(x, "timeCellTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | typings.std.Element | JQuery
    ): Self = StObject.set(x, "timeCellTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTimeCellTemplateUndefined: Self = StObject.set(x, "timeCellTemplate", js.undefined)
    
    @scala.inline
    def setType(
      value: agenda | day | month | timelineDay | timelineMonth | timelineWeek | timelineWorkWeek | week | workWeek
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
