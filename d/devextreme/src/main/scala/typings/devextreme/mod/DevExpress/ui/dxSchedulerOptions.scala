package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonAgendaDuration
import typings.devextreme.AnonAllowAdding
import typings.devextreme.AnonAllowMultiple
import typings.devextreme.AnonAppointmentCount
import typings.devextreme.AnonAppointmentData
import typings.devextreme.AnonAppointmentDataAppointmentElement
import typings.devextreme.AnonAppointmentDataCancel
import typings.devextreme.AnonAppointmentDataComponent
import typings.devextreme.AnonAppointmentElement
import typings.devextreme.AnonAutoScroll
import typings.devextreme.AnonCellData
import typings.devextreme.AnonCellDataCellElement
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementForm
import typings.devextreme.AnonEndDate
import typings.devextreme.AnonForm
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.AnonOldData
import typings.devextreme.AnonTargetedAppointmentData
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
import typings.devextreme.mod._Global_.JQuery
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSchedulerOptions extends WidgetOptions[dxScheduler] {
  /** @name dxScheduler.Options.adaptivityEnabled */
  var adaptivityEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxScheduler.Options.allDayExpr */
  var allDayExpr: js.UndefOr[String] = js.undefined
  /** @name dxScheduler.Options.appointmentCollectorTemplate */
  var appointmentCollectorTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* data */ AnonAppointmentCount, 
      /* collectorElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxScheduler.Options.appointmentDragging */
  var appointmentDragging: js.UndefOr[AnonAutoScroll] = js.undefined
  /** @name dxScheduler.Options.appointmentTemplate */
  var appointmentTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* model */ AnonAppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxScheduler.Options.appointmentTooltipTemplate */
  var appointmentTooltipTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* model */ AnonAppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxScheduler.Options.cellDuration */
  var cellDuration: js.UndefOr[Double] = js.undefined
  /** @name dxScheduler.Options.crossScrollingEnabled */
  var crossScrollingEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxScheduler.Options.currentDate */
  var currentDate: js.UndefOr[Date | Double | String] = js.undefined
  /** @name dxScheduler.Options.currentView */
  var currentView: js.UndefOr[
    agenda | day | month | timelineDay | timelineMonth | timelineWeek | timelineWorkWeek | week | workWeek
  ] = js.undefined
  /** @name dxScheduler.Options.customizeDateNavigatorText */
  var customizeDateNavigatorText: js.UndefOr[js.Function1[/* info */ AnonEndDate, String]] = js.undefined
  /** @name dxScheduler.Options.dataCellTemplate */
  var dataCellTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxScheduler.Options.dataSource */
  var dataSource: js.UndefOr[String | js.Array[dxSchedulerAppointment] | DataSource | DataSourceOptions] = js.undefined
  /** @name dxScheduler.Options.dateCellTemplate */
  var dateCellTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxScheduler.Options.dateSerializationFormat */
  var dateSerializationFormat: js.UndefOr[String] = js.undefined
  /** @name dxScheduler.Options.descriptionExpr */
  var descriptionExpr: js.UndefOr[String] = js.undefined
  /** @deprecated */
  /** @name dxScheduler.Options.dropDownAppointmentTemplate */
  var dropDownAppointmentTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxScheduler.Options.editing */
  var editing: js.UndefOr[Boolean | AnonAllowAdding] = js.undefined
  /** @name dxScheduler.Options.endDateExpr */
  var endDateExpr: js.UndefOr[String] = js.undefined
  /** @name dxScheduler.Options.endDateTimeZoneExpr */
  var endDateTimeZoneExpr: js.UndefOr[String] = js.undefined
  /** @name dxScheduler.Options.endDayHour */
  var endDayHour: js.UndefOr[Double] = js.undefined
  /** @name dxScheduler.Options.firstDayOfWeek */
  var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  /** @name dxScheduler.Options.groupByDate */
  var groupByDate: js.UndefOr[Boolean] = js.undefined
  /** @name dxScheduler.Options.groups */
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  /** @name dxScheduler.Options.indicatorUpdateInterval */
  var indicatorUpdateInterval: js.UndefOr[Double] = js.undefined
  /** @name dxScheduler.Options.max */
  var max: js.UndefOr[Date | Double | String] = js.undefined
  /** @name dxScheduler.Options.maxAppointmentsPerCell */
  var maxAppointmentsPerCell: js.UndefOr[Double | auto | unlimited] = js.undefined
  /** @name dxScheduler.Options.min */
  var min: js.UndefOr[Date | Double | String] = js.undefined
  /** @name dxScheduler.Options.noDataText */
  var noDataText: js.UndefOr[String] = js.undefined
  /** @name dxScheduler.Options.onAppointmentAdded */
  var onAppointmentAdded: js.UndefOr[js.Function1[/* e */ AnonAppointmentDataComponent, _]] = js.undefined
  /** @name dxScheduler.Options.onAppointmentAdding */
  var onAppointmentAdding: js.UndefOr[js.Function1[/* e */ AnonAppointmentDataCancel, _]] = js.undefined
  /** @name dxScheduler.Options.onAppointmentClick */
  var onAppointmentClick: js.UndefOr[(js.Function1[/* e */ AnonAppointmentElement, _]) | String] = js.undefined
  /** @name dxScheduler.Options.onAppointmentContextMenu */
  var onAppointmentContextMenu: js.UndefOr[(js.Function1[/* e */ AnonTargetedAppointmentData, _]) | String] = js.undefined
  /** @name dxScheduler.Options.onAppointmentDblClick */
  var onAppointmentDblClick: js.UndefOr[(js.Function1[/* e */ AnonAppointmentElement, _]) | String] = js.undefined
  /** @name dxScheduler.Options.onAppointmentDeleted */
  var onAppointmentDeleted: js.UndefOr[js.Function1[/* e */ AnonAppointmentDataComponent, _]] = js.undefined
  /** @name dxScheduler.Options.onAppointmentDeleting */
  var onAppointmentDeleting: js.UndefOr[js.Function1[/* e */ AnonAppointmentDataCancel, _]] = js.undefined
  /** @deprecated */
  /** @name dxScheduler.Options.onAppointmentFormCreated */
  var onAppointmentFormCreated: js.UndefOr[js.Function1[/* e */ AnonForm, _]] = js.undefined
  /** @name dxScheduler.Options.onAppointmentFormOpening */
  var onAppointmentFormOpening: js.UndefOr[js.Function1[/* e */ AnonElementForm, _]] = js.undefined
  /** @name dxScheduler.Options.onAppointmentRendered */
  var onAppointmentRendered: js.UndefOr[js.Function1[/* e */ AnonAppointmentDataAppointmentElement, _]] = js.undefined
  /** @name dxScheduler.Options.onAppointmentUpdated */
  var onAppointmentUpdated: js.UndefOr[js.Function1[/* e */ AnonAppointmentDataComponent, _]] = js.undefined
  /** @name dxScheduler.Options.onAppointmentUpdating */
  var onAppointmentUpdating: js.UndefOr[js.Function1[/* e */ AnonOldData, _]] = js.undefined
  /** @name dxScheduler.Options.onCellClick */
  var onCellClick: js.UndefOr[(js.Function1[/* e */ AnonCellData, _]) | String] = js.undefined
  /** @name dxScheduler.Options.onCellContextMenu */
  var onCellContextMenu: js.UndefOr[(js.Function1[/* e */ AnonCellDataCellElement, _]) | String] = js.undefined
  /** @name dxScheduler.Options.recurrenceEditMode */
  var recurrenceEditMode: js.UndefOr[dialog | occurrence | series] = js.undefined
  /** @name dxScheduler.Options.recurrenceExceptionExpr */
  var recurrenceExceptionExpr: js.UndefOr[String] = js.undefined
  /** @name dxScheduler.Options.recurrenceRuleExpr */
  var recurrenceRuleExpr: js.UndefOr[String] = js.undefined
  /** @name dxScheduler.Options.remoteFiltering */
  var remoteFiltering: js.UndefOr[Boolean] = js.undefined
  /** @name dxScheduler.Options.resourceCellTemplate */
  var resourceCellTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxScheduler.Options.resources */
  var resources: js.UndefOr[js.Array[AnonAllowMultiple]] = js.undefined
  /** @name dxScheduler.Options.selectedCellData */
  var selectedCellData: js.UndefOr[js.Array[_]] = js.undefined
  /** @name dxScheduler.Options.shadeUntilCurrentTime */
  var shadeUntilCurrentTime: js.UndefOr[Boolean] = js.undefined
  /** @name dxScheduler.Options.showAllDayPanel */
  var showAllDayPanel: js.UndefOr[Boolean] = js.undefined
  /** @name dxScheduler.Options.showCurrentTimeIndicator */
  var showCurrentTimeIndicator: js.UndefOr[Boolean] = js.undefined
  /** @name dxScheduler.Options.startDateExpr */
  var startDateExpr: js.UndefOr[String] = js.undefined
  /** @name dxScheduler.Options.startDateTimeZoneExpr */
  var startDateTimeZoneExpr: js.UndefOr[String] = js.undefined
  /** @name dxScheduler.Options.startDayHour */
  var startDayHour: js.UndefOr[Double] = js.undefined
  /** @name dxScheduler.Options.textExpr */
  var textExpr: js.UndefOr[String] = js.undefined
  /** @name dxScheduler.Options.timeCellTemplate */
  var timeCellTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxScheduler.Options.timeZone */
  var timeZone: js.UndefOr[String] = js.undefined
  /** @name dxScheduler.Options.useDropDownViewSwitcher */
  var useDropDownViewSwitcher: js.UndefOr[Boolean] = js.undefined
  /** @name dxScheduler.Options.views */
  var views: js.UndefOr[
    js.Array[
      day | week | workWeek | month | timelineDay | timelineWeek | timelineWorkWeek | timelineMonth | agenda | AnonAgendaDuration
    ]
  ] = js.undefined
}

object dxSchedulerOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    adaptivityEnabled: js.UndefOr[Boolean] = js.undefined,
    allDayExpr: String = null,
    appointmentCollectorTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* data */ AnonAppointmentCount, 
      /* collectorElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    appointmentDragging: AnonAutoScroll = null,
    appointmentTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* model */ AnonAppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    appointmentTooltipTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* model */ AnonAppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    bindingOptions: js.Any = null,
    cellDuration: Int | Double = null,
    crossScrollingEnabled: js.UndefOr[Boolean] = js.undefined,
    currentDate: Date | Double | String = null,
    currentView: agenda | day | month | timelineDay | timelineMonth | timelineWeek | timelineWorkWeek | week | workWeek = null,
    customizeDateNavigatorText: /* info */ AnonEndDate => String = null,
    dataCellTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    dataSource: String | js.Array[dxSchedulerAppointment] | DataSource | DataSourceOptions = null,
    dateCellTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    dateSerializationFormat: String = null,
    descriptionExpr: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropDownAppointmentTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    editing: Boolean | AnonAllowAdding = null,
    elementAttr: js.Any = null,
    endDateExpr: String = null,
    endDateTimeZoneExpr: String = null,
    endDayHour: Int | Double = null,
    firstDayOfWeek: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    groupByDate: js.UndefOr[Boolean] = js.undefined,
    groups: js.Array[String] = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    indicatorUpdateInterval: Int | Double = null,
    max: Date | Double | String = null,
    maxAppointmentsPerCell: Double | auto | unlimited = null,
    min: Date | Double | String = null,
    noDataText: String = null,
    onAppointmentAdded: /* e */ AnonAppointmentDataComponent => _ = null,
    onAppointmentAdding: /* e */ AnonAppointmentDataCancel => _ = null,
    onAppointmentClick: (js.Function1[/* e */ AnonAppointmentElement, _]) | String = null,
    onAppointmentContextMenu: (js.Function1[/* e */ AnonTargetedAppointmentData, _]) | String = null,
    onAppointmentDblClick: (js.Function1[/* e */ AnonAppointmentElement, _]) | String = null,
    onAppointmentDeleted: /* e */ AnonAppointmentDataComponent => _ = null,
    onAppointmentDeleting: /* e */ AnonAppointmentDataCancel => _ = null,
    onAppointmentFormCreated: /* e */ AnonForm => _ = null,
    onAppointmentFormOpening: /* e */ AnonElementForm => _ = null,
    onAppointmentRendered: /* e */ AnonAppointmentDataAppointmentElement => _ = null,
    onAppointmentUpdated: /* e */ AnonAppointmentDataComponent => _ = null,
    onAppointmentUpdating: /* e */ AnonOldData => _ = null,
    onCellClick: (js.Function1[/* e */ AnonCellData, _]) | String = null,
    onCellContextMenu: (js.Function1[/* e */ AnonCellDataCellElement, _]) | String = null,
    onContentReady: /* e */ AnonComponentElement[dxScheduler] => _ = null,
    onDisposing: /* e */ AnonModel[dxScheduler] => _ = null,
    onInitialized: /* e */ AnonElement[dxScheduler] => _ = null,
    onOptionChanged: /* e */ AnonName[dxScheduler] => _ = null,
    recurrenceEditMode: dialog | occurrence | series = null,
    recurrenceExceptionExpr: String = null,
    recurrenceRuleExpr: String = null,
    remoteFiltering: js.UndefOr[Boolean] = js.undefined,
    resourceCellTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    resources: js.Array[AnonAllowMultiple] = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectedCellData: js.Array[_] = null,
    shadeUntilCurrentTime: js.UndefOr[Boolean] = js.undefined,
    showAllDayPanel: js.UndefOr[Boolean] = js.undefined,
    showCurrentTimeIndicator: js.UndefOr[Boolean] = js.undefined,
    startDateExpr: String = null,
    startDateTimeZoneExpr: String = null,
    startDayHour: Int | Double = null,
    tabIndex: Int | Double = null,
    textExpr: String = null,
    timeCellTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    timeZone: String = null,
    useDropDownViewSwitcher: js.UndefOr[Boolean] = js.undefined,
    views: js.Array[
      day | week | workWeek | month | timelineDay | timelineWeek | timelineWorkWeek | timelineMonth | agenda | AnonAgendaDuration
    ] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxSchedulerOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(adaptivityEnabled)) __obj.updateDynamic("adaptivityEnabled")(adaptivityEnabled.asInstanceOf[js.Any])
    if (allDayExpr != null) __obj.updateDynamic("allDayExpr")(allDayExpr.asInstanceOf[js.Any])
    if (appointmentCollectorTemplate != null) __obj.updateDynamic("appointmentCollectorTemplate")(appointmentCollectorTemplate.asInstanceOf[js.Any])
    if (appointmentDragging != null) __obj.updateDynamic("appointmentDragging")(appointmentDragging.asInstanceOf[js.Any])
    if (appointmentTemplate != null) __obj.updateDynamic("appointmentTemplate")(appointmentTemplate.asInstanceOf[js.Any])
    if (appointmentTooltipTemplate != null) __obj.updateDynamic("appointmentTooltipTemplate")(appointmentTooltipTemplate.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (cellDuration != null) __obj.updateDynamic("cellDuration")(cellDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(crossScrollingEnabled)) __obj.updateDynamic("crossScrollingEnabled")(crossScrollingEnabled.asInstanceOf[js.Any])
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate.asInstanceOf[js.Any])
    if (currentView != null) __obj.updateDynamic("currentView")(currentView.asInstanceOf[js.Any])
    if (customizeDateNavigatorText != null) __obj.updateDynamic("customizeDateNavigatorText")(js.Any.fromFunction1(customizeDateNavigatorText))
    if (dataCellTemplate != null) __obj.updateDynamic("dataCellTemplate")(dataCellTemplate.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dateCellTemplate != null) __obj.updateDynamic("dateCellTemplate")(dateCellTemplate.asInstanceOf[js.Any])
    if (dateSerializationFormat != null) __obj.updateDynamic("dateSerializationFormat")(dateSerializationFormat.asInstanceOf[js.Any])
    if (descriptionExpr != null) __obj.updateDynamic("descriptionExpr")(descriptionExpr.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dropDownAppointmentTemplate != null) __obj.updateDynamic("dropDownAppointmentTemplate")(dropDownAppointmentTemplate.asInstanceOf[js.Any])
    if (editing != null) __obj.updateDynamic("editing")(editing.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (endDateExpr != null) __obj.updateDynamic("endDateExpr")(endDateExpr.asInstanceOf[js.Any])
    if (endDateTimeZoneExpr != null) __obj.updateDynamic("endDateTimeZoneExpr")(endDateTimeZoneExpr.asInstanceOf[js.Any])
    if (endDayHour != null) __obj.updateDynamic("endDayHour")(endDayHour.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(groupByDate)) __obj.updateDynamic("groupByDate")(groupByDate.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (indicatorUpdateInterval != null) __obj.updateDynamic("indicatorUpdateInterval")(indicatorUpdateInterval.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxAppointmentsPerCell != null) __obj.updateDynamic("maxAppointmentsPerCell")(maxAppointmentsPerCell.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onAppointmentAdded != null) __obj.updateDynamic("onAppointmentAdded")(js.Any.fromFunction1(onAppointmentAdded))
    if (onAppointmentAdding != null) __obj.updateDynamic("onAppointmentAdding")(js.Any.fromFunction1(onAppointmentAdding))
    if (onAppointmentClick != null) __obj.updateDynamic("onAppointmentClick")(onAppointmentClick.asInstanceOf[js.Any])
    if (onAppointmentContextMenu != null) __obj.updateDynamic("onAppointmentContextMenu")(onAppointmentContextMenu.asInstanceOf[js.Any])
    if (onAppointmentDblClick != null) __obj.updateDynamic("onAppointmentDblClick")(onAppointmentDblClick.asInstanceOf[js.Any])
    if (onAppointmentDeleted != null) __obj.updateDynamic("onAppointmentDeleted")(js.Any.fromFunction1(onAppointmentDeleted))
    if (onAppointmentDeleting != null) __obj.updateDynamic("onAppointmentDeleting")(js.Any.fromFunction1(onAppointmentDeleting))
    if (onAppointmentFormCreated != null) __obj.updateDynamic("onAppointmentFormCreated")(js.Any.fromFunction1(onAppointmentFormCreated))
    if (onAppointmentFormOpening != null) __obj.updateDynamic("onAppointmentFormOpening")(js.Any.fromFunction1(onAppointmentFormOpening))
    if (onAppointmentRendered != null) __obj.updateDynamic("onAppointmentRendered")(js.Any.fromFunction1(onAppointmentRendered))
    if (onAppointmentUpdated != null) __obj.updateDynamic("onAppointmentUpdated")(js.Any.fromFunction1(onAppointmentUpdated))
    if (onAppointmentUpdating != null) __obj.updateDynamic("onAppointmentUpdating")(js.Any.fromFunction1(onAppointmentUpdating))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(onCellClick.asInstanceOf[js.Any])
    if (onCellContextMenu != null) __obj.updateDynamic("onCellContextMenu")(onCellContextMenu.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (recurrenceEditMode != null) __obj.updateDynamic("recurrenceEditMode")(recurrenceEditMode.asInstanceOf[js.Any])
    if (recurrenceExceptionExpr != null) __obj.updateDynamic("recurrenceExceptionExpr")(recurrenceExceptionExpr.asInstanceOf[js.Any])
    if (recurrenceRuleExpr != null) __obj.updateDynamic("recurrenceRuleExpr")(recurrenceRuleExpr.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteFiltering)) __obj.updateDynamic("remoteFiltering")(remoteFiltering.asInstanceOf[js.Any])
    if (resourceCellTemplate != null) __obj.updateDynamic("resourceCellTemplate")(resourceCellTemplate.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (selectedCellData != null) __obj.updateDynamic("selectedCellData")(selectedCellData.asInstanceOf[js.Any])
    if (!js.isUndefined(shadeUntilCurrentTime)) __obj.updateDynamic("shadeUntilCurrentTime")(shadeUntilCurrentTime.asInstanceOf[js.Any])
    if (!js.isUndefined(showAllDayPanel)) __obj.updateDynamic("showAllDayPanel")(showAllDayPanel.asInstanceOf[js.Any])
    if (!js.isUndefined(showCurrentTimeIndicator)) __obj.updateDynamic("showCurrentTimeIndicator")(showCurrentTimeIndicator.asInstanceOf[js.Any])
    if (startDateExpr != null) __obj.updateDynamic("startDateExpr")(startDateExpr.asInstanceOf[js.Any])
    if (startDateTimeZoneExpr != null) __obj.updateDynamic("startDateTimeZoneExpr")(startDateTimeZoneExpr.asInstanceOf[js.Any])
    if (startDayHour != null) __obj.updateDynamic("startDayHour")(startDayHour.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (textExpr != null) __obj.updateDynamic("textExpr")(textExpr.asInstanceOf[js.Any])
    if (timeCellTemplate != null) __obj.updateDynamic("timeCellTemplate")(timeCellTemplate.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (!js.isUndefined(useDropDownViewSwitcher)) __obj.updateDynamic("useDropDownViewSwitcher")(useDropDownViewSwitcher.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSchedulerOptions]
  }
}

