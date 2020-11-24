package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AgendaDuration
import typings.devextreme.anon.AllowAdding
import typings.devextreme.anon.AllowMultiple
import typings.devextreme.anon.AppointmentCount
import typings.devextreme.anon.AppointmentData
import typings.devextreme.anon.AppointmentDataAppointmentElement
import typings.devextreme.anon.AppointmentDataCancel
import typings.devextreme.anon.AppointmentDataComponent
import typings.devextreme.anon.AppointmentElement
import typings.devextreme.anon.AutoScroll
import typings.devextreme.anon.CellData
import typings.devextreme.anon.CellDataCellElement
import typings.devextreme.anon.EndDate
import typings.devextreme.anon.Form
import typings.devextreme.anon.OldData
import typings.devextreme.anon.TargetedAppointmentData
import typings.devextreme.devextremeNumbers.`0`
import typings.devextreme.devextremeNumbers.`1`
import typings.devextreme.devextremeNumbers.`2`
import typings.devextreme.devextremeNumbers.`3`
import typings.devextreme.devextremeNumbers.`4`
import typings.devextreme.devextremeNumbers.`5`
import typings.devextreme.devextremeNumbers.`6`
import typings.devextreme.devextremeStrings.agenda
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.day
import typings.devextreme.devextremeStrings.dialog
import typings.devextreme.devextremeStrings.month
import typings.devextreme.devextremeStrings.occurrence
import typings.devextreme.devextremeStrings.series
import typings.devextreme.devextremeStrings.timelineDay
import typings.devextreme.devextremeStrings.timelineMonth
import typings.devextreme.devextremeStrings.timelineWeek
import typings.devextreme.devextremeStrings.timelineWorkWeek
import typings.devextreme.devextremeStrings.unlimited
import typings.devextreme.devextremeStrings.week
import typings.devextreme.devextremeStrings.workWeek
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSchedulerOptions extends WidgetOptions[dxScheduler] {
  
  /**
    * [descr:dxScheduler.Options.adaptivityEnabled]
    */
  var adaptivityEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxScheduler.Options.allDayExpr]
    */
  var allDayExpr: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxScheduler.Options.appointmentCollectorTemplate]
    */
  var appointmentCollectorTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* data */ AppointmentCount, 
      /* collectorElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  
  /**
    * [descr:dxScheduler.Options.appointmentDragging]
    */
  var appointmentDragging: js.UndefOr[AutoScroll] = js.native
  
  /**
    * [descr:dxScheduler.Options.appointmentTemplate]
    */
  var appointmentTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* model */ AppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  
  /**
    * [descr:dxScheduler.Options.appointmentTooltipTemplate]
    */
  var appointmentTooltipTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* model */ AppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  
  /**
    * [descr:dxScheduler.Options.cellDuration]
    */
  var cellDuration: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxScheduler.Options.crossScrollingEnabled]
    */
  var crossScrollingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxScheduler.Options.currentDate]
    */
  var currentDate: js.UndefOr[Date | Double | String] = js.native
  
  /**
    * [descr:dxScheduler.Options.currentView]
    */
  var currentView: js.UndefOr[
    agenda | day | month | timelineDay | timelineMonth | timelineWeek | timelineWorkWeek | week | workWeek
  ] = js.native
  
  /**
    * [descr:dxScheduler.Options.customizeDateNavigatorText]
    */
  var customizeDateNavigatorText: js.UndefOr[js.Function1[/* info */ EndDate, String]] = js.native
  
  /**
    * [descr:dxScheduler.Options.dataCellTemplate]
    */
  var dataCellTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  
  /**
    * [descr:dxScheduler.Options.dataSource]
    */
  var dataSource: js.UndefOr[String | js.Array[dxSchedulerAppointment] | DataSource | DataSourceOptions] = js.native
  
  /**
    * [descr:dxScheduler.Options.dateCellTemplate]
    */
  var dateCellTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  
  /**
    * [descr:dxScheduler.Options.dateSerializationFormat]
    */
  var dateSerializationFormat: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxScheduler.Options.descriptionExpr]
    */
  var descriptionExpr: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxScheduler.Options.dropDownAppointmentTemplate]
    * @deprecated [depNote:dxScheduler.Options.dropDownAppointmentTemplate]
    */
  var dropDownAppointmentTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  
  /**
    * [descr:dxScheduler.Options.editing]
    */
  var editing: js.UndefOr[Boolean | AllowAdding] = js.native
  
  /**
    * [descr:dxScheduler.Options.endDateExpr]
    */
  var endDateExpr: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxScheduler.Options.endDateTimeZoneExpr]
    */
  var endDateTimeZoneExpr: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxScheduler.Options.endDayHour]
    */
  var endDayHour: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxScheduler.Options.firstDayOfWeek]
    */
  var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
  
  /**
    * [descr:dxScheduler.Options.groupByDate]
    */
  var groupByDate: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxScheduler.Options.groups]
    */
  var groups: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * [descr:dxScheduler.Options.indicatorUpdateInterval]
    */
  var indicatorUpdateInterval: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxScheduler.Options.max]
    */
  var max: js.UndefOr[Date | Double | String] = js.native
  
  /**
    * [descr:dxScheduler.Options.maxAppointmentsPerCell]
    */
  var maxAppointmentsPerCell: js.UndefOr[Double | auto | unlimited] = js.native
  
  /**
    * [descr:dxScheduler.Options.min]
    */
  var min: js.UndefOr[Date | Double | String] = js.native
  
  /**
    * [descr:dxScheduler.Options.noDataText]
    */
  var noDataText: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxScheduler.Options.onAppointmentAdded]
    */
  var onAppointmentAdded: js.UndefOr[js.Function1[/* e */ AppointmentDataComponent, _]] = js.native
  
  /**
    * [descr:dxScheduler.Options.onAppointmentAdding]
    */
  var onAppointmentAdding: js.UndefOr[js.Function1[/* e */ AppointmentDataCancel, _]] = js.native
  
  /**
    * [descr:dxScheduler.Options.onAppointmentClick]
    */
  var onAppointmentClick: js.UndefOr[(js.Function1[/* e */ AppointmentElement, _]) | String] = js.native
  
  /**
    * [descr:dxScheduler.Options.onAppointmentContextMenu]
    */
  var onAppointmentContextMenu: js.UndefOr[(js.Function1[/* e */ TargetedAppointmentData, _]) | String] = js.native
  
  /**
    * [descr:dxScheduler.Options.onAppointmentDblClick]
    */
  var onAppointmentDblClick: js.UndefOr[(js.Function1[/* e */ AppointmentElement, _]) | String] = js.native
  
  /**
    * [descr:dxScheduler.Options.onAppointmentDeleted]
    */
  var onAppointmentDeleted: js.UndefOr[js.Function1[/* e */ AppointmentDataComponent, _]] = js.native
  
  /**
    * [descr:dxScheduler.Options.onAppointmentDeleting]
    */
  var onAppointmentDeleting: js.UndefOr[js.Function1[/* e */ AppointmentDataCancel, _]] = js.native
  
  /**
    * [descr:dxScheduler.Options.onAppointmentFormOpening]
    */
  var onAppointmentFormOpening: js.UndefOr[js.Function1[/* e */ Form, _]] = js.native
  
  /**
    * [descr:dxScheduler.Options.onAppointmentRendered]
    */
  var onAppointmentRendered: js.UndefOr[js.Function1[/* e */ AppointmentDataAppointmentElement, _]] = js.native
  
  /**
    * [descr:dxScheduler.Options.onAppointmentUpdated]
    */
  var onAppointmentUpdated: js.UndefOr[js.Function1[/* e */ AppointmentDataComponent, _]] = js.native
  
  /**
    * [descr:dxScheduler.Options.onAppointmentUpdating]
    */
  var onAppointmentUpdating: js.UndefOr[js.Function1[/* e */ OldData, _]] = js.native
  
  /**
    * [descr:dxScheduler.Options.onCellClick]
    */
  var onCellClick: js.UndefOr[(js.Function1[/* e */ CellData, _]) | String] = js.native
  
  /**
    * [descr:dxScheduler.Options.onCellContextMenu]
    */
  var onCellContextMenu: js.UndefOr[(js.Function1[/* e */ CellDataCellElement, _]) | String] = js.native
  
  /**
    * [descr:dxScheduler.Options.recurrenceEditMode]
    */
  var recurrenceEditMode: js.UndefOr[dialog | occurrence | series] = js.native
  
  /**
    * [descr:dxScheduler.Options.recurrenceExceptionExpr]
    */
  var recurrenceExceptionExpr: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxScheduler.Options.recurrenceRuleExpr]
    */
  var recurrenceRuleExpr: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxScheduler.Options.remoteFiltering]
    */
  var remoteFiltering: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxScheduler.Options.resourceCellTemplate]
    */
  var resourceCellTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  
  /**
    * [descr:dxScheduler.Options.resources]
    */
  var resources: js.UndefOr[js.Array[AllowMultiple]] = js.native
  
  /**
    * [descr:dxScheduler.Options.scrolling]
    */
  var scrolling: js.UndefOr[dxSchedulerScrolling] = js.native
  
  /**
    * [descr:dxScheduler.Options.selectedCellData]
    */
  var selectedCellData: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * [descr:dxScheduler.Options.shadeUntilCurrentTime]
    */
  var shadeUntilCurrentTime: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxScheduler.Options.showAllDayPanel]
    */
  var showAllDayPanel: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxScheduler.Options.showCurrentTimeIndicator]
    */
  var showCurrentTimeIndicator: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxScheduler.Options.startDateExpr]
    */
  var startDateExpr: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxScheduler.Options.startDateTimeZoneExpr]
    */
  var startDateTimeZoneExpr: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxScheduler.Options.startDayHour]
    */
  var startDayHour: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxScheduler.Options.textExpr]
    */
  var textExpr: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxScheduler.Options.timeCellTemplate]
    */
  var timeCellTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  
  /**
    * [descr:dxScheduler.Options.timeZone]
    */
  var timeZone: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxScheduler.Options.useDropDownViewSwitcher]
    */
  var useDropDownViewSwitcher: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxScheduler.Options.views]
    */
  var views: js.UndefOr[
    js.Array[
      day | week | workWeek | month | timelineDay | timelineWeek | timelineWorkWeek | timelineMonth | agenda | AgendaDuration
    ]
  ] = js.native
}
object dxSchedulerOptions {
  
  @scala.inline
  def apply(): dxSchedulerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSchedulerOptions]
  }
  
  @scala.inline
  implicit class dxSchedulerOptionsOps[Self <: dxSchedulerOptions] (val x: Self) extends AnyVal {
    
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
    def setAdaptivityEnabled(value: Boolean): Self = this.set("adaptivityEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdaptivityEnabled: Self = this.set("adaptivityEnabled", js.undefined)
    
    @scala.inline
    def setAllDayExpr(value: String): Self = this.set("allDayExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllDayExpr: Self = this.set("allDayExpr", js.undefined)
    
    @scala.inline
    def setAppointmentCollectorTemplateFunction2(
      value: (/* data */ AppointmentCount, /* collectorElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("appointmentCollectorTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppointmentCollectorTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[
          /* data */ AppointmentCount, 
          /* collectorElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("appointmentCollectorTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppointmentCollectorTemplate: Self = this.set("appointmentCollectorTemplate", js.undefined)
    
    @scala.inline
    def setAppointmentDragging(value: AutoScroll): Self = this.set("appointmentDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppointmentDragging: Self = this.set("appointmentDragging", js.undefined)
    
    @scala.inline
    def setAppointmentTemplateFunction3(
      value: (/* model */ AppointmentData, /* itemIndex */ Double, /* contentElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("appointmentTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAppointmentTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* model */ AppointmentData, 
          /* itemIndex */ Double, 
          /* contentElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("appointmentTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppointmentTemplate: Self = this.set("appointmentTemplate", js.undefined)
    
    @scala.inline
    def setAppointmentTooltipTemplateFunction3(
      value: (/* model */ AppointmentData, /* itemIndex */ Double, /* contentElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("appointmentTooltipTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAppointmentTooltipTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* model */ AppointmentData, 
          /* itemIndex */ Double, 
          /* contentElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("appointmentTooltipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppointmentTooltipTemplate: Self = this.set("appointmentTooltipTemplate", js.undefined)
    
    @scala.inline
    def setCellDuration(value: Double): Self = this.set("cellDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellDuration: Self = this.set("cellDuration", js.undefined)
    
    @scala.inline
    def setCrossScrollingEnabled(value: Boolean): Self = this.set("crossScrollingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossScrollingEnabled: Self = this.set("crossScrollingEnabled", js.undefined)
    
    @scala.inline
    def setCurrentDate(value: Date | Double | String): Self = this.set("currentDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentDate: Self = this.set("currentDate", js.undefined)
    
    @scala.inline
    def setCurrentView(
      value: agenda | day | month | timelineDay | timelineMonth | timelineWeek | timelineWorkWeek | week | workWeek
    ): Self = this.set("currentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentView: Self = this.set("currentView", js.undefined)
    
    @scala.inline
    def setCustomizeDateNavigatorText(value: /* info */ EndDate => String): Self = this.set("customizeDateNavigatorText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeDateNavigatorText: Self = this.set("customizeDateNavigatorText", js.undefined)
    
    @scala.inline
    def setDataCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("dataCellTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDataCellTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("dataCellTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataCellTemplate: Self = this.set("dataCellTemplate", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: dxSchedulerAppointment*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: String | js.Array[dxSchedulerAppointment] | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDateCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("dateCellTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDateCellTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("dateCellTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateCellTemplate: Self = this.set("dateCellTemplate", js.undefined)
    
    @scala.inline
    def setDateSerializationFormat(value: String): Self = this.set("dateSerializationFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateSerializationFormat: Self = this.set("dateSerializationFormat", js.undefined)
    
    @scala.inline
    def setDescriptionExpr(value: String): Self = this.set("descriptionExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptionExpr: Self = this.set("descriptionExpr", js.undefined)
    
    @scala.inline
    def setDropDownAppointmentTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* contentElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("dropDownAppointmentTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDropDownAppointmentTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* contentElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("dropDownAppointmentTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropDownAppointmentTemplate: Self = this.set("dropDownAppointmentTemplate", js.undefined)
    
    @scala.inline
    def setEditing(value: Boolean | AllowAdding): Self = this.set("editing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditing: Self = this.set("editing", js.undefined)
    
    @scala.inline
    def setEndDateExpr(value: String): Self = this.set("endDateExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateExpr: Self = this.set("endDateExpr", js.undefined)
    
    @scala.inline
    def setEndDateTimeZoneExpr(value: String): Self = this.set("endDateTimeZoneExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateTimeZoneExpr: Self = this.set("endDateTimeZoneExpr", js.undefined)
    
    @scala.inline
    def setEndDayHour(value: Double): Self = this.set("endDayHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDayHour: Self = this.set("endDayHour", js.undefined)
    
    @scala.inline
    def setFirstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    
    @scala.inline
    def setGroupByDate(value: Boolean): Self = this.set("groupByDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupByDate: Self = this.set("groupByDate", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setIndicatorUpdateInterval(value: Double): Self = this.set("indicatorUpdateInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorUpdateInterval: Self = this.set("indicatorUpdateInterval", js.undefined)
    
    @scala.inline
    def setMax(value: Date | Double | String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxAppointmentsPerCell(value: Double | auto | unlimited): Self = this.set("maxAppointmentsPerCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAppointmentsPerCell: Self = this.set("maxAppointmentsPerCell", js.undefined)
    
    @scala.inline
    def setMin(value: Date | Double | String): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setNoDataText(value: String): Self = this.set("noDataText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDataText: Self = this.set("noDataText", js.undefined)
    
    @scala.inline
    def setOnAppointmentAdded(value: /* e */ AppointmentDataComponent => _): Self = this.set("onAppointmentAdded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAppointmentAdded: Self = this.set("onAppointmentAdded", js.undefined)
    
    @scala.inline
    def setOnAppointmentAdding(value: /* e */ AppointmentDataCancel => _): Self = this.set("onAppointmentAdding", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAppointmentAdding: Self = this.set("onAppointmentAdding", js.undefined)
    
    @scala.inline
    def setOnAppointmentClickFunction1(value: /* e */ AppointmentElement => _): Self = this.set("onAppointmentClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAppointmentClick(value: (js.Function1[/* e */ AppointmentElement, _]) | String): Self = this.set("onAppointmentClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAppointmentClick: Self = this.set("onAppointmentClick", js.undefined)
    
    @scala.inline
    def setOnAppointmentContextMenuFunction1(value: /* e */ TargetedAppointmentData => _): Self = this.set("onAppointmentContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAppointmentContextMenu(value: (js.Function1[/* e */ TargetedAppointmentData, _]) | String): Self = this.set("onAppointmentContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAppointmentContextMenu: Self = this.set("onAppointmentContextMenu", js.undefined)
    
    @scala.inline
    def setOnAppointmentDblClickFunction1(value: /* e */ AppointmentElement => _): Self = this.set("onAppointmentDblClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAppointmentDblClick(value: (js.Function1[/* e */ AppointmentElement, _]) | String): Self = this.set("onAppointmentDblClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAppointmentDblClick: Self = this.set("onAppointmentDblClick", js.undefined)
    
    @scala.inline
    def setOnAppointmentDeleted(value: /* e */ AppointmentDataComponent => _): Self = this.set("onAppointmentDeleted", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAppointmentDeleted: Self = this.set("onAppointmentDeleted", js.undefined)
    
    @scala.inline
    def setOnAppointmentDeleting(value: /* e */ AppointmentDataCancel => _): Self = this.set("onAppointmentDeleting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAppointmentDeleting: Self = this.set("onAppointmentDeleting", js.undefined)
    
    @scala.inline
    def setOnAppointmentFormOpening(value: /* e */ Form => _): Self = this.set("onAppointmentFormOpening", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAppointmentFormOpening: Self = this.set("onAppointmentFormOpening", js.undefined)
    
    @scala.inline
    def setOnAppointmentRendered(value: /* e */ AppointmentDataAppointmentElement => _): Self = this.set("onAppointmentRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAppointmentRendered: Self = this.set("onAppointmentRendered", js.undefined)
    
    @scala.inline
    def setOnAppointmentUpdated(value: /* e */ AppointmentDataComponent => _): Self = this.set("onAppointmentUpdated", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAppointmentUpdated: Self = this.set("onAppointmentUpdated", js.undefined)
    
    @scala.inline
    def setOnAppointmentUpdating(value: /* e */ OldData => _): Self = this.set("onAppointmentUpdating", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAppointmentUpdating: Self = this.set("onAppointmentUpdating", js.undefined)
    
    @scala.inline
    def setOnCellClickFunction1(value: /* e */ CellData => _): Self = this.set("onCellClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCellClick(value: (js.Function1[/* e */ CellData, _]) | String): Self = this.set("onCellClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCellClick: Self = this.set("onCellClick", js.undefined)
    
    @scala.inline
    def setOnCellContextMenuFunction1(value: /* e */ CellDataCellElement => _): Self = this.set("onCellContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCellContextMenu(value: (js.Function1[/* e */ CellDataCellElement, _]) | String): Self = this.set("onCellContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCellContextMenu: Self = this.set("onCellContextMenu", js.undefined)
    
    @scala.inline
    def setRecurrenceEditMode(value: dialog | occurrence | series): Self = this.set("recurrenceEditMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrenceEditMode: Self = this.set("recurrenceEditMode", js.undefined)
    
    @scala.inline
    def setRecurrenceExceptionExpr(value: String): Self = this.set("recurrenceExceptionExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrenceExceptionExpr: Self = this.set("recurrenceExceptionExpr", js.undefined)
    
    @scala.inline
    def setRecurrenceRuleExpr(value: String): Self = this.set("recurrenceRuleExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrenceRuleExpr: Self = this.set("recurrenceRuleExpr", js.undefined)
    
    @scala.inline
    def setRemoteFiltering(value: Boolean): Self = this.set("remoteFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteFiltering: Self = this.set("remoteFiltering", js.undefined)
    
    @scala.inline
    def setResourceCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("resourceCellTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setResourceCellTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("resourceCellTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceCellTemplate: Self = this.set("resourceCellTemplate", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: AllowMultiple*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[AllowMultiple]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setScrolling(value: dxSchedulerScrolling): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrolling: Self = this.set("scrolling", js.undefined)
    
    @scala.inline
    def setSelectedCellDataVarargs(value: js.Any*): Self = this.set("selectedCellData", js.Array(value :_*))
    
    @scala.inline
    def setSelectedCellData(value: js.Array[_]): Self = this.set("selectedCellData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedCellData: Self = this.set("selectedCellData", js.undefined)
    
    @scala.inline
    def setShadeUntilCurrentTime(value: Boolean): Self = this.set("shadeUntilCurrentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadeUntilCurrentTime: Self = this.set("shadeUntilCurrentTime", js.undefined)
    
    @scala.inline
    def setShowAllDayPanel(value: Boolean): Self = this.set("showAllDayPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAllDayPanel: Self = this.set("showAllDayPanel", js.undefined)
    
    @scala.inline
    def setShowCurrentTimeIndicator(value: Boolean): Self = this.set("showCurrentTimeIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCurrentTimeIndicator: Self = this.set("showCurrentTimeIndicator", js.undefined)
    
    @scala.inline
    def setStartDateExpr(value: String): Self = this.set("startDateExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateExpr: Self = this.set("startDateExpr", js.undefined)
    
    @scala.inline
    def setStartDateTimeZoneExpr(value: String): Self = this.set("startDateTimeZoneExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateTimeZoneExpr: Self = this.set("startDateTimeZoneExpr", js.undefined)
    
    @scala.inline
    def setStartDayHour(value: Double): Self = this.set("startDayHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDayHour: Self = this.set("startDayHour", js.undefined)
    
    @scala.inline
    def setTextExpr(value: String): Self = this.set("textExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextExpr: Self = this.set("textExpr", js.undefined)
    
    @scala.inline
    def setTimeCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("timeCellTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTimeCellTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("timeCellTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeCellTemplate: Self = this.set("timeCellTemplate", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setUseDropDownViewSwitcher(value: Boolean): Self = this.set("useDropDownViewSwitcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDropDownViewSwitcher: Self = this.set("useDropDownViewSwitcher", js.undefined)
    
    @scala.inline
    def setViewsVarargs(
      value: (day | week | workWeek | month | timelineDay | timelineWeek | timelineWorkWeek | timelineMonth | agenda | AgendaDuration)*
    ): Self = this.set("views", js.Array(value :_*))
    
    @scala.inline
    def setViews(
      value: js.Array[
          day | week | workWeek | month | timelineDay | timelineWeek | timelineWorkWeek | timelineMonth | agenda | AgendaDuration
        ]
    ): Self = this.set("views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
}
