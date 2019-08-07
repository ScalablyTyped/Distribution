package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object devexpressDashWeb {
  /**
    * References a method that handles the ASPxClientDashboard.ActionAvailabilityChanged event.
    * @param source The event source.
    * @param e A ASPxClientActionAvailabilityChangedEventArgs object that contains event data.
    */
  type ASPxClientActionAvailabilityChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientActionAvailabilityChangedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientSpellChecker.AfterCheck event.
    * @param source The ASPxClientSpellChecker control which fires the event.
    * @param e A ASPxClientSpellCheckerAfterCheckEventArgs object that contains event data
    */
  type ASPxClientAfterCheckEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientSpellCheckerAfterCheckEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientScheduler.AppointmentDeleting event.
    * @param source The event sender (typically an ASPxClientScheduler control).
    * @param e A ASPxClientAppointmentDeletingEventArgs object that contains event data.
    */
  type ASPxClientAppointmentDeletingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientAppointmentDeletingEventArgs, Unit]
  /**
    * A method that will handle the corresponding client event.
    * @param source The event source.
    * @param e An ASPxClientAppointmentToolTipShowingEventArgs object that contains event data.
    */
  type ASPxClientAppointmentToolTipShowingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientAppointmentToolTipShowingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientSpellChecker.BeforeCheck event.
    * @param source The ASPxClientSpellChecker control which fires the event.
    * @param e A ASPxClientSpellCheckerBeforeCheckEventArgs object that contains event data
    */
  type ASPxClientBeforeCheckEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientSpellCheckerBeforeCheckEventArgs, Unit]
  /**
    * A method that will handle client BeginCallback events.
    * @param source An object representing the event source. Identifies the web control that raised the event.
    * @param e An ASPxClientBeginCallbackEventArgs object that contains event data.
    */
  type ASPxClientBeginCallbackEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientBeginCallbackEventArgs, Unit]
  /**
    * A method that will handle the client ASPxClientButton.Click event.
    * @param source An object that is the event's source.
    * @param e An ASPxClientButtonClickEventArgs object that contains event data.
    */
  type ASPxClientButtonClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientButtonClickEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientButtonEditBase.ButtonClick event.
    * @param source An object representing the event source. Identifies the button editor that raised the event.
    * @param e An ASPxClientButtonEditClickEventArgs object that contains event data.
    */
  type ASPxClientButtonEditClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientButtonEditClickEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientDateEdit.CalendarCellClick event.
    * @param source The event source.
    * @param e A ASPxClientCalendarCellClickEventArgs object that contains event data.
    */
  type ASPxClientCalendarCellClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCalendarCellClickEventArgs, Unit]
  /**
    * A method that will handle the client ASPxClientCalendar.CustomDisabledDate event.
    * @param source The event source.
    * @param e An ASPxClientCalendarCustomDisabledDateEventArgs object that contains event data.
    */
  type ASPxClientCalendarCustomDisabledDateEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCalendarCustomDisabledDateEventArgs, Unit]
  /**
    * A method that will handle the client events related to completion of callback server-side processing.
    * @param source An object representing the event source. Identifies the web control that raised the event.
    * @param e An ASPxClientCallbackCompleteEventArgs object that contains event data.
    */
  type ASPxClientCallbackCompleteEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCallbackCompleteEventArgs, Unit]
  /**
    * A method that will handle client CallbackError events.
    * @param source An object representing the event source.
    * @param e A ASPxClientCallbackErrorEventArgs object that contains event data.
    */
  type ASPxClientCallbackErrorEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCallbackErrorEventArgs, Unit]
  /**
    * A method that will handle the cancelable events of a web control's client-side equivalent.
    * @param source An object representing the event source. Identifies the web control that raised the event.
    * @param e An ASPxClientCancelEventArgs object that contains event data.
    */
  type ASPxClientCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCancelEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientCardView.BatchEditCardDeleting event.
    * @param source The event source. This parameter identifies the card view object which raised the event.
    * @param e An ASPxClientCardViewBatchEditCardDeletingEventArgs object that contains event data.
    */
  type ASPxClientCardViewBatchEditCardDeletingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCardViewBatchEditCardDeletingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientCardView.BatchEditCardInserting event.
    * @param source The event source. This parameter identifies the card view object which raised the event.
    * @param e An ASPxClientCardViewBatchEditCardInsertingEventArgs object that contains event data.
    */
  type ASPxClientCardViewBatchEditCardInsertingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCardViewBatchEditCardInsertingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientCardView.BatchEditCardRecovering event.
    * @param source The event source.
    * @param e An ASPxClientCardViewBatchEditCardRecoveringEventArgs object that contains event data.
    */
  type ASPxClientCardViewBatchEditCardRecoveringEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientCardViewBatchEditCardRecoveringEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientCardView.BatchEditCardValidating event.
    * @param source The event source.
    * @param e An ASPxClientCardViewBatchEditCardValidatingEventArgs object that contains event data.
    */
  type ASPxClientCardViewBatchEditCardValidatingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientCardViewBatchEditCardValidatingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientCardView.BatchEditChangesCanceling event.
    * @param source The event source. This parameter identifies the card view object which raised the event.
    * @param e An ASPxClientCardViewBatchEditChangesCancelingEventArgs object that contains event data.
    */
  type ASPxClientCardViewBatchEditChangesCancelingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientCardViewBatchEditChangesCancelingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientCardView.BatchEditChangesSaving event.
    * @param source The event source. This parameter identifies the card view object which raised the event.
    * @param e An ASPxClientCardViewBatchEditChangesSavingEventArgs object that contains event data.
    */
  type ASPxClientCardViewBatchEditChangesSavingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCardViewBatchEditChangesSavingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientCardView.BatchEditConfirmShowing client event.
    * @param source The event source.
    * @param e An ASPxClientCardViewBatchEditConfirmShowingEventArgs object that contains event data.
    */
  type ASPxClientCardViewBatchEditConfirmShowingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientCardViewBatchEditConfirmShowingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientCardView.BatchEditEndEditing event.
    * @param source The event source.
    * @param e An ASPxClientCardViewBatchEditEndEditingEventArgs object that contains event data.
    */
  type ASPxClientCardViewBatchEditEndEditingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCardViewBatchEditEndEditingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientCardView.BatchEditStartEditing event.
    * @param source The event source.
    * @param e An ASPxClientCardViewBatchEditStartEditingEventArgs object that contains event data.
    */
  type ASPxClientCardViewBatchEditStartEditingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCardViewBatchEditStartEditingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientCardView.BatchEditTemplateCellFocused event.
    * @param source An object representing the event source. Identifies the button editor that raised the event.
    * @param e An ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs object that contains event data.
    */
  type ASPxClientCardViewBatchEditTemplateCellFocusedEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientCardView.CardClick event.
    * @param source The event source. This parameter identifies the ASPxClientCardView object that raised the event.
    * @param e An ASPxClientCardViewCardClickEventArgs object that contains event data.
    */
  type ASPxClientCardViewCardClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCardViewCardClickEventArgs, Unit]
  /**
    * Represents a method that will handle the ASPxClientCardView.CardFocusing event.
    * @param source The event source.
    * @param e An ASPxClientCardViewCardFocusingEventArgs object which contains event data.
    */
  type ASPxClientCardViewCardFocusingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCardViewCardFocusingEventArgs, Unit]
  /**
    * A method that will handle the cancelable events of a client ASPxCardView column.
    * @param source The event source. This parameter identifies the ASPxClientCardView object that raised the event.
    * @param e An ASPxClientCardViewColumnCancelEventArgs object that contains event data.
    */
  type ASPxClientCardViewColumnCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCardViewColumnCancelEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientCardView.CustomButtonClick event.
    * @param source The event source.
  This parameter identifies the ASPxClientCardView object that raised the event.
    * @param e An ASPxClientCardViewCustomButtonEventArgs object that contains event data.
    */
  type ASPxClientCardViewCustomButtonEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCardViewCustomButtonEventArgs, Unit]
  /**
    * Represents a method that will handle the ASPxClientCardView.FocusedCardChanged event.
    * @param source The event source.
    * @param e An ASPxClientCardViewFocusEventArgs object which contains event data.
    */
  type ASPxClientCardViewFocusEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCardViewFocusEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientCardView.FocusedCellChanging event.
    * @param source The event source.
    * @param e An ASPxClientCardViewFocusedCellChangingEventArgs object that contains event data.
    */
  type ASPxClientCardViewFocusedCellChangingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCardViewFocusedCellChangingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientCardView.GroupRowCollapsing and ASPxClientCardView.GroupRowExpanding events.
    * @param source The event source.
    * @param e A ASPxClientCardViewGroupCancelEventArgs object that contains event data.
    */
  type ASPxClientCardViewGroupCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCardViewGroupCancelEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientCardView.SelectionChanged event.
    * @param source The event source.
    * @param e An ASPxClientCardViewSelectionEventArgs object that contains event data.
    */
  type ASPxClientCardViewSelectionEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCardViewSelectionEventArgs, Unit]
  /**
    * Represents a JavaScript function which receives the list of card values when the client ASPxClientCardView.GetCardValues, ASPxCardView.GetCurrentPageCardValues or ASPxClientCardView.GetSelectedFieldValues method is called.
    * @param result An object that represents the list of card values received from the server.
    */
  type ASPxClientCardViewValuesCallback = js.Function1[/* result */ js.Any, Unit]
  type ASPxClientChartDesignerCustomizeMenuActionsEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientChartDesignerCustomizeMenuActionsEventArgs, 
    Unit
  ]
  type ASPxClientChartDesignerSaveCommandExecuteEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientChartDesignerSaveCommandExecuteEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientPivotGrid.CellClick or ASPxClientPivotGrid.CellDblClick event.
    * @param source The event source.
    * @param e An ASPxClientClickEventArgs object that contains event data.
    */
  type ASPxClientClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientClickEventArgs, Unit]
  /**
    * A method that will handle client events concerning manipulations with items.
    * @param source The event source. This parameter identifies the cloud control object which raised the event.
    * @param e An ASPxClientCloudControlItemEventArgs object that contains event data.
    */
  type ASPxClientCloudControlItemEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCloudControlItemEventArgs, Unit]
  /**
    * Represents a JavaScript function which receives the action to perform for a control when the client ASPxClientControlCollection.ForEachControl method is called.
    * @param control An object that specifies a control.
    */
  type ASPxClientControlAction = js.Function1[/* control */ js.Any, Unit]
  /**
    * A JavaScript function which returns a value specifying whether an object meets the criteria defined within the method specified by this delegate. true if the object meets the criteria; otherwise, false.
    * @param control An object to compare against the criteria defined within the method.
    */
  type ASPxClientControlPredicate = js.Function1[/* control */ js.Any, Boolean]
  /**
    * A method that will handle the client ASPxClientControlCollection.ControlsInitialized event.
    * @param source An object representing the event source.
    * @param e An ASPxClientControlsInitializedEventArgs object that contains event data.
    */
  type ASPxClientControlsInitializedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientControlsInitializedEventArgs, Unit]
  /**
    * A method that will handle the client CustomCallback event of some controls.
    * @param source An object representing the event source.
    * @param e An ASPxClientCustomDataCallbackEventHandler&lt;Sender&gt; object that contains event data.
    */
  type ASPxClientCustomDataCallbackEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCustomDataCallbackEventArgs, Unit]
  /**
    * References a method that handles the ASPxClientDashboard.BeforeRender event.
    * @param source The event source.
    * @param e An ASPxClientEventArgs object that contains event data.
    */
  type ASPxClientDashboardBeforeRenderEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientEventArgs, Unit]
  /**
    * References a method that handles the ASPxClientDashboard.DashboardBeginUpdate event.
    * @param source The event source.
    * @param e A ASPxClientDashboardBeginUpdateEventArgs object that contains event data.
    */
  type ASPxClientDashboardBeginUpdateEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDashboardBeginUpdateEventArgs, Unit]
  /**
    * References a method that handles the ASPxClientDashboard.DashboardChanged event.
    * @param source The event source.
    * @param e A ASPxClientDashboardChangedEventArgs object that contains event data.
    */
  type ASPxClientDashboardChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDashboardChangedEventArgs, Unit]
  /**
    * References a method that handles the ASPxClientDashboard.DashboardEndUpdate event.
    * @param source The event source.
    * @param e An ASPxClientDashboardEndUpdateEventArgs object that contains event data.
    */
  type ASPxClientDashboardEndUpdateEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDashboardEndUpdateEventArgs, Unit]
  /**
    * References a method that handles the ASPxClientDashboard.DashboardInitialized event.
    * @param source The event source.
    * @param e A ASPxClientDashboardInitializedEventArgs object that contains event data.
    */
  type ASPxClientDashboardInitializedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDashboardInitializedEventArgs, Unit]
  /**
    * References a method that handles the ASPxClientDashboard.DashboardInitializing event.
    * @param source The event source.
    * @param e A ASPxClientDashboardInitializingEventArgs object that contains event data.
    */
  type ASPxClientDashboardInitializingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDashboardInitializingEventArgs, Unit]
  /**
    * References a method that handles the ASPxClientDashboard.ItemBeforeWidgetDisposed event.
    * @param source The event source.
    * @param e A ASPxClientDashboardItemWidgetEventArgs object that contains event data.
    */
  type ASPxClientDashboardItemBeforeWidgetDisposedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDashboardItemWidgetEventArgs, Unit]
  /**
    * References a method that handles the ASPxClientDashboard.ItemCaptionToolbarUpdated event.
    * @param source The event source.
    * @param e The ASPxClientDashboardItemCaptionToolbarUpdatedEventArgs object that contains event data.
    */
  type ASPxClientDashboardItemCaptionToolbarUpdatedEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientDashboardItemCaptionToolbarUpdatedEventArgs, 
    Unit
  ]
  /**
    * References a method that handles the ASPxClientDashboard.ItemClick event.
    * @param source The event source.
    * @param e A ASPxClientDashboardItemClickEventArgs object that contains event data.
    */
  type ASPxClientDashboardItemClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDashboardItemClickEventArgs, Unit]
  /**
    * References a method that handles the ASPxClientDashboard.ItemDrillDownStateChanged event.
    * @param source The event source.
    * @param e An ASPxClientDashboardItemDrillDownStateChangedEventArgs object that contains event data.
    */
  type ASPxClientDashboardItemDrillDownStateChangedEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientDashboardItemDrillDownStateChangedEventArgs, 
    Unit
  ]
  /**
    * References a method that handles the ASPxClientDashboard.ItemElementCustomColor event.
    * @param source The event source.
    * @param e An ASPxClientDashboardItemElementCustomColorEventArgs object that contains event data.
    */
  type ASPxClientDashboardItemElementCustomColorEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientDashboardItemElementCustomColorEventArgs, 
    Unit
  ]
  /**
    * References a method that handles the ASPxClientDashboard.ItemMasterFilterStateChanged event.
    * @param source The event source.
    * @param e An ASPxClientDashboardItemMasterFilterStateChangedEventArgs object that contains event data.
    */
  type ASPxClientDashboardItemMasterFilterStateChangedEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientDashboardItemMasterFilterStateChangedEventArgs, 
    Unit
  ]
  /**
    * References a method executed after an asynchronous request is complete.
    * @param data An object that contains a list of records from the dashboard data source.
    */
  type ASPxClientDashboardItemRequestUnderlyingDataCompleted = js.Function1[/* data */ ASPxClientDashboardItemUnderlyingData, Unit]
  /**
    * References a method that handles the ASPxClientDashboard.ItemSelectionChanged event.
    * @param source The event source.
    * @param e A ASPxClientDashboardItemSelectionChangedEventArgs object containing event data.
    */
  type ASPxClientDashboardItemSelectionChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDashboardItemSelectionChangedEventArgs, Unit]
  /**
    * References a method that handles the ASPxClientDashboard.ItemVisualInteractivity event.
    * @param source The event source.
    * @param e A ASPxClientDashboardItemVisualInteractivityEventArgs object containing event data.
    */
  type ASPxClientDashboardItemVisualInteractivityEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientDashboardItemVisualInteractivityEventArgs, 
    Unit
  ]
  /**
    * References a method that handles the ASPxClientDashboard.ItemWidgetCreated event.
    * @param source The event source.
    * @param e A ASPxClientDashboardItemWidgetEventArgs object that contains event data.
    */
  type ASPxClientDashboardItemWidgetCreatedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDashboardItemWidgetEventArgs, Unit]
  /**
    * References a method that handles the ASPxClientDashboard.ItemWidgetUpdated event.
    * @param source The event source.
    * @param e A ASPxClientDashboardItemWidgetEventArgs object that contains event data.
    */
  type ASPxClientDashboardItemWidgetUpdatedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDashboardItemWidgetEventArgs, Unit]
  /**
    * References a method that handles the ASPxClientDashboard.ItemWidgetUpdating event.
    * @param source The event source.
    * @param e A ASPxClientDashboardItemWidgetEventArgs object that contains event data.
    */
  type ASPxClientDashboardItemWidgetUpdatingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDashboardItemWidgetEventArgs, Unit]
  /**
    * References a method that handles the ASPxClientDashboard.DashboardStateChanged event.
    * @param source The event source.
    * @param e A ASPxClientDashboardStateChangedEventArgs object that contains event data.
    */
  type ASPxClientDashboardStateChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDashboardStateChangedEventArgs, Unit]
  /**
    * References a method that handles the ASPxClientDashboard.DashboardTitleToolbarUpdated event.
    * @param source The event source.
    * @param e A ASPxClientDashboardTitleToolbarUpdatedEventArgs object that contains event data.
    */
  type ASPxClientDashboardTitleToolbarUpdatedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDashboardTitleToolbarUpdatedEventArgs, Unit]
  /**
    * A JavaScript function which receives a callback data obtained via a call to a specific client method (such as the ASPxClientHtmlEditor.PerformDataCallback).
    * @param sender An object whose client method generated a callback.
    * @param result A string value that represents the result of server-side callback processing.
    */
  type ASPxClientDataCallback = js.Function2[/* sender */ js.Any, /* result */ String, Unit]
  /**
    * A method that will handle the ASPxClientDateNavigator.DayCellCustomHighlight event.
    * @param source The event source.
    * @param e A ASPxClientDateNavigatorDayCellCustomHighlightEventArgs object that contains event data.
    */
  type ASPxClientDateNavigatorDayCellCustomHighlightEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientDateNavigatorDayCellCustomHighlightEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientDateNavigator.SelectionChanged event.
    * @param source The event source.
    * @param e A ASPxClientDateNavigatorSelectionChangedEventArgs object that contains event data.
    */
  type ASPxClientDateNavigatorSelectionChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDateNavigatorSelectionChangedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientDateNavigator.VisibleMonthChanged event.
    * @param source The event source.
    * @param e A ASPxClientDateNavigatorVisibleMonthChangedEventArgs object that contains event data.
    */
  type ASPxClientDateNavigatorVisibleMonthChangedEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientDateNavigatorVisibleMonthChangedEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientDockManager.PanelClosing event.
    * @param source The event source. This parameter identifies the dock manager object which raised the event.
    * @param e An ASPxClientDockManagerCancelEventArgs object that contains event data.
    */
  type ASPxClientDockManagerCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDockManagerCancelEventArgs, Unit]
  /**
    * A method that will handle client-side events concerning manipulations with panels.
    * @param source The event source. This parameter identifies the dock manager object which raised the event.
    * @param e An ASPxClientDockManagerEventArgs object that contains event data.
    */
  type ASPxClientDockManagerEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDockManagerEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientDockManager.BeforeDock event.
    * @param source The event source. This parameter identifies the dock manager object which raised the event.
    * @param e An ASPxClientDockManagerProcessingModeCancelEventArgs object that contains event data.
    */
  type ASPxClientDockManagerProcessingModeCancelEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientDockManagerProcessingModeCancelEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientDockManager.AfterDock event.
    * @param source The event source. This parameter identifies the dock manager object which raised the event.
    * @param e An ASPxClientDockManagerProcessingModeEventArgs object that contains event data.
    */
  type ASPxClientDockManagerProcessingModeEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDockManagerProcessingModeEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientDockPanel.BeforeDock event.
    * @param source A ASPxClientDockPanel object that raised the event.
    * @param e A ASPxClientDockPanelProcessingModeCancelEventArgs object that contains event data.
    */
  type ASPxClientDockPanelProcessingModeCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDockPanelProcessingModeCancelEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientDockPanel.AfterFloat event.
    * @param source A ASPxClientDockPanel object that raised the event.
    * @param e A ASPxClientDockPanelProcessingModeEventArgs object that contains event data.
    */
  type ASPxClientDockPanelProcessingModeEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDockPanelProcessingModeEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientDockZone.BeforeDock event.
    * @param source The event source. This parameter identifies the zone object which raised the event.
    * @param e A ASPxClientDockZoneCancelEventArgs object that contains event data.
    */
  type ASPxClientDockZoneCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDockZoneCancelEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientDockZone.AfterDock event.
    * @param source The event source. This parameter identifies the zone object which raised the event.
    * @param e An  ASPxClientDockZoneProcessingModeEventArgs object that contains event data.
    */
  type ASPxClientDockZoneProcessingModeEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDockZoneProcessingModeEventArgs, Unit]
  /**
    * A JavaScript function which returns a value specifying whether an object meets the criteria defined within the method specified by this delegate. true if the object meets the criteria; otherwise, false.
    * @param item An object to compare against the criteria defined within the method.
    */
  type ASPxClientDockingFilterPredicate = js.Function1[/* item */ js.Any, Boolean]
  /**
    * A method that will handle the ASPxClientDropDownEdit.DropDownCommandButtonClick event.
    * @param source The event source.
    * @param e A ASPxClientDropDownCommandEventArgs object that contains event data.
    */
  type ASPxClientDropDownCommandEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDropDownCommandEventArgs, Unit]
  /**
    * References a method that handles the ASPxClientDashboard.DynamicLookUpValuesLoaded event.
    * @param source The event source.
    * @param e A ASPxClientDynamicLookUpValuesLoadedEventArgs object that contains event data.
    */
  type ASPxClientDynamicLookUpValuesLoadedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientDynamicLookUpValuesLoadedEventArgs, Unit]
  /**
    * A method that will handle client-side events which concern clicking within editors.
    * @param source An object representing the event source. Identifies the editor that raised the event.
    * @param e An ASPxClientEditClickEventArgs object that contains event data.
    */
  type ASPxClientEditEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientEditClickEventArgs, Unit]
  /**
    * A method that will handle the client events concerning a keyboard key being pressed.
    * @param source The event source. This parameter identifies the editor which raised the event.
    * @param e An ASPxClientEditKeyEventArgs object that contains event data.
    */
  type ASPxClientEditKeyEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientEditKeyEventArgs, Unit]
  /**
    * A method that will handle client validation events.
    * @param source An object representing the event source. Identifies the button editor that raised the event.
    * @param e An ASPxClientEditValidationEventArgs object that contains event data.
    */
  type ASPxClientEditValidationEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientEditValidationEventArgs, Unit]
  /**
    * A method that will handle client EndCallback events.
    * @param source An object representing the event source.
    * @param e A MenuItemEventArgs object that contains event data.
    */
  type ASPxClientEndCallbackEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientEndCallbackEventArgs, Unit]
  /**
    * A method that will handle the client-side events of a web control's client-side equivalent.
    * @param source An object representing the event source. Identifies the control that raised the event.
    * @param e An ASPxClientEventArgs object that contains event data.
    */
  type ASPxClientEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientEventArgs, Unit]
  /**
    * A JavaScript function which receives callback data obtained by a call to the client ASPxClientFileManager.GetAllItems method.
    * @param items An array of ASPxClientFileManagerItem objects that are items contained in the current folder.
    */
  type ASPxClientFileManagerAllItemsCallback = js.Function1[/* items */ js.Array[ASPxClientFileManagerItem], Unit]
  /**
    * A JavaScript function that receives callback data obtained via a call to the ASPxClientFileManager.SetCurrentFolderPath method.
    * @param result An object that contains a callback data.
    */
  type ASPxClientFileManagerCallback = js.Function1[/* result */ js.Any, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.CurrentFolderChanged event.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientFileManagerCurrentFolderChangedEventArgs object that contains event data.
    */
  type ASPxClientFileManagerCurrentFolderChangedEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientFileManagerCurrentFolderChangedEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientFileManager.CustomCommand event.
    * @param source The event source.
    * @param e An ASPxClientFileManagerCustomCommandEventArgs object that contains event data.
    */
  type ASPxClientFileManagerCustomCommandEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerCustomCommandEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.ErrorAlertDisplaying event.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientFileManagerErrorAlertDisplayingEventArgs object that contains event data.
    */
  type ASPxClientFileManagerErrorAlertDisplayingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientFileManagerErrorAlertDisplayingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the client ASPxClientFileManager.ErrorOccurred event.
    * @param source An object representing the event's source.
    * @param e An ASPxClientFileManagerErrorEventArgs object that contains event data.
    */
  type ASPxClientFileManagerErrorEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerErrorEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.FileDownloading event.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientFileManagerFileDownloadingEventArgs object that contains event data.
    */
  type ASPxClientFileManagerFileDownloadingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerFileDownloadingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.SelectedFileChanged and ASPxClientFileManager.SelectedFileOpened events.
    * @param source An object representing the event's source.
    * @param e An ASPxClientFileManagerFileEventArgs object that contains event data.
    */
  type ASPxClientFileManagerFileEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerFileEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.SelectedFileOpened event.
    * @param source The event source. This parameter identifies the file manager object which raised the event.
    * @param e An ASPxClientFileManagerFileOpenedEventArgs object that contains event data.
    */
  type ASPxClientFileManagerFileOpenedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerFileOpenedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.FileUploaded event.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientFileManagerFileUploadedEventArgs object that contains event data.
    */
  type ASPxClientFileManagerFileUploadedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerFileUploadedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.FileUploading event.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientFileManagerFileUploadingEventArgs object that contains event data.
    */
  type ASPxClientFileManagerFileUploadingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerFileUploadingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.FilesUploaded event.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientFileManagerFilesUploadedEventArgs object that contains event data.
    */
  type ASPxClientFileManagerFilesUploadedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerFilesUploadedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.FilesUploading event.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientFileManagerFilesUploadingEventArgs object that contains event data.
    */
  type ASPxClientFileManagerFilesUploadingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerFilesUploadingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.FocusedItemChanged event.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientFileManagerFocusedItemChangedEventArgs object that contains event data.
    */
  type ASPxClientFileManagerFocusedItemChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerFocusedItemChangedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.HighlightItemTemplate event.
    * @param source The event source. This parameter identifies the file manager object that raised the event.
    * @param e An ASPxClientFileManagerHighlightItemTemplateEventArgs object that contains event data.
    */
  type ASPxClientFileManagerHighlightItemTemplateEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientFileManagerHighlightItemTemplateEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientFileManager.ItemCopied event.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientFileManagerItemCopiedEventArgs object that contains event data.
    */
  type ASPxClientFileManagerItemCopiedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerItemCopiedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.FolderCreated event.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientFileManagerItemCreatedEventArgs object that contains event data.
    */
  type ASPxClientFileManagerItemCreatedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerItemCreatedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.ItemDeleted event.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientFileManagerItemDeletedEventArgs object that contains event data.
    */
  type ASPxClientFileManagerItemDeletedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerItemDeletedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.FolderCreating, ASPxClientFileManager.ItemCopying, ASPxClientFileManager.ItemDeleting, ASPxClientFileManager.ItemMoving, and ASPxClientFileManager.ItemRenaming events.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientFileManagerItemEditingEventArgs object that contains event data.
    */
  type ASPxClientFileManagerItemEditingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerItemEditingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.ItemMoved event.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientFileManagerItemMovedEventArgs object that contains event data.
    */
  type ASPxClientFileManagerItemMovedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerItemMovedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.ItemRenamed event.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientFileManagerItemRenamedEventArgs object that contains event data.
    */
  type ASPxClientFileManagerItemRenamedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerItemRenamedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.ItemsCopied event.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientFileManagerItemsCopiedEventArgs object that contains event data.
    */
  type ASPxClientFileManagerItemsCopiedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerItemsCopiedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.ItemsDeleted event.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientFileManagerItemsDeletedEventArgs object that contains event data.
    */
  type ASPxClientFileManagerItemsDeletedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerItemsDeletedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.ItemsMoved event.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientFileManagerItemsMovedEventArgs object that contains event data.
    */
  type ASPxClientFileManagerItemsMovedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerItemsMovedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.SelectionChanged event.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientFileManagerSelectionChangedEventArgs object that contains event data.
    */
  type ASPxClientFileManagerSelectionChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerSelectionChangedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFileManager.ToolbarUpdating event.
    * @param source The event source.
    * @param e An ASPxClientFileManagerToolbarUpdatingEventArgs object that contains event data.
    */
  type ASPxClientFileManagerToolbarUpdatingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFileManagerToolbarUpdatingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientFilterControl.Applied event.
    * @param source The event source.
    * @param e An ASPxClientFilterAppliedEventArgs object that contains event data.
    */
  type ASPxClientFilterAppliedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFilterAppliedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientObjectContainer.FlashScriptCommand event.
    * @param source The event source.
    * @param e A ASPxClientFlashScriptCommandEventArgs object that contains event data.
    */
  type ASPxClientFlashScriptCommandEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientFlashScriptCommandEventArgs, Unit]
  /**
    * A method that will handle the ActionCollapsing event.
    * @param source The event source.
    * @param e An object that contains event data.
    */
  type ASPxClientFloatingActionButtonActionCollapsingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientFloatingActionButtonActionCollapsingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ActionExpanding event.
    * @param source The event source.
    * @param e An object that contains event data.
    */
  type ASPxClientFloatingActionButtonActionExpandingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientFloatingActionButtonActionExpandingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientFloatingActionButton.ActionItemClick event.
    * @param source The event source.
    * @param e A ASPxClientFloatingActionButtonActionItemClickEventArgs object that contains event data.
    */
  type ASPxClientFloatingActionButtonActionItemClickEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientFloatingActionButtonActionItemClickEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientFloatingActionButton.ContextChanging event.
    * @param source The event source.
    * @param e A ASPxClientFloatingActionButtonContextChangingEventArgs object that contains event data.
    */
  type ASPxClientFloatingActionButtonContextChangingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientFloatingActionButtonContextChangingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientGlobalEvents.BeginCallback event.
    * @param source The event source.
    * @param e An ASPxDataValidationEventArgs object that contains event data.
    */
  type ASPxClientGlobalBeginCallbackEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGlobalBeginCallbackEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGlobalEvents.CallbackError event.
    * @param source The event source.
    * @param e An ASPxDataValidationEventArgs object that contains event data.
    */
  type ASPxClientGlobalCallbackErrorEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGlobalCallbackErrorEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGlobalEvents.EndCallback event.
    * @param source The event source.
    * @param e An ASPxDataValidationEventArgs object that contains event data.
    */
  type ASPxClientGlobalEndCallbackEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGlobalEndCallbackEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGridBase.ToolbarItemClick event.
    * @param source The event source.
    * @param e An ASPxClientGridToolbarItemClickEventArgs object that contains event data.
    */
  type ASPxClientGridToolbarItemClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridToolbarItemClickEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGridView.BatchEditChangesCanceling event.
    * @param source The event source. This parameter identifies the grid view object which raised the event.
    * @param e An ASPxClientGridViewBatchEditChangesCancelingEventArgs object that contains event data.
    */
  type ASPxClientGridViewBatchEditChangesCancelingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientGridViewBatchEditChangesCancelingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientGridView.BatchEditChangesSaving event.
    * @param source The event source. This parameter identifies the grid view object which raised the event.
    * @param e An ASPxClientGridViewBatchEditChangesSavingEventArgs object that contains event data.
    */
  type ASPxClientGridViewBatchEditChangesSavingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridViewBatchEditChangesSavingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGridView.BatchEditConfirmShowing client event.
    * @param source The event source.
    * @param e An ASPxClientGridViewBatchEditConfirmShowingEventArgs object that contains event data.
    */
  type ASPxClientGridViewBatchEditConfirmShowingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientGridViewBatchEditConfirmShowingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientGridView.BatchEditEndEditing event.
    * @param source The event source.
    * @param e An ASPxClientGridViewBatchEditEndEditingEventArgs object that contains event data.
    */
  type ASPxClientGridViewBatchEditEndEditingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridViewBatchEditEndEditingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGridView.BatchEditRowDeleting event.
    * @param source The event source. This parameter identifies the grid view object which raised the event.
    * @param e An ASPxClientGridViewBatchEditRowDeletingEventArgs object that contains event data.
    */
  type ASPxClientGridViewBatchEditRowDeletingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridViewBatchEditRowDeletingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGridView.BatchEditRowInserting event.
    * @param source The event source. This parameter identifies the card view object which raised the event.
    * @param e An ASPxClientGridViewBatchEditRowInsertingEventArgs object that contains event data.
    */
  type ASPxClientGridViewBatchEditRowInsertingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridViewBatchEditRowInsertingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGridView.BatchEditRowRecovering event.
    * @param source The event source.
    * @param e An ASPxClientGridViewBatchEditRowRecoveringEventArgs object that contains event data.
    */
  type ASPxClientGridViewBatchEditRowRecoveringEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridViewBatchEditRowRecoveringEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGridView.BatchEditRowValidating event.
    * @param source The event source.
    * @param e An ASPxClientGridViewBatchEditRowValidatingEventArgs object that contains event data.
    */
  type ASPxClientGridViewBatchEditRowValidatingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridViewBatchEditRowValidatingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGridView.BatchEditStartEditing event.
    * @param source The event source.
    * @param e An ASPxClientGridViewBatchEditStartEditingEventArgs object that contains event data.
    */
  type ASPxClientGridViewBatchEditStartEditingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridViewBatchEditStartEditingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGridView.BatchEditTemplateCellFocused event.
    * @param source An object representing the event source. Identifies the button editor that raised the event.
    * @param e An ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs object that contains event data.
    */
  type ASPxClientGridViewBatchEditTemplateCellFocusedEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the cancelable events of a client ASPxGridView column.
    * @param source The event source.
    * @param e An ASPxClientGridViewColumnCancelEventArgs object that contains event data.
    */
  type ASPxClientGridViewColumnCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridViewColumnCancelEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGridView.ColumnMoving event.
    * @param source The event source.
    * @param e An ASPxClientGridViewColumnMovingEventArgs object that contains event data.
    */
  type ASPxClientGridViewColumnMovingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridViewColumnMovingEventArgs, Unit]
  /**
    * A method that will handle the client events concerned with column processing.
    * @param source The event source.
    * @param e A ASPxClientGridViewColumnProcessingModeEventArgs object that contains event data.
    */
  type ASPxClientGridViewColumnProcessingModeEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridViewColumnProcessingModeEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGridView.ContextMenu event.
    * @param source The event source.
    * @param e An ASPxClientGridViewContextMenuEventArgs object that contains event data.
    */
  type ASPxClientGridViewContextMenuEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridViewContextMenuEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGridView.ContextMenuItemClick event.
    * @param source The event source.
    * @param e An ASPxClientGridViewContextMenuItemClickEventArgs object that contains event data.
    */
  type ASPxClientGridViewContextMenuItemClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridViewContextMenuItemClickEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGridView.CustomButtonClick event.
    * @param source The event source.
  This parameter identifies the ASPxClientGridView object that raised the event.
    * @param e An ASPxClientGridViewCustomButtonEventArgs object that contains event data.
    */
  type ASPxClientGridViewCustomButtonEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridViewCustomButtonEventArgs, Unit]
  /**
    * Represents a method that will handle the ASPxClientGridView.FocusedRowChanged event.
    * @param source The event source.
    * @param e An ASPxClientGridViewFocusEventArgs object which contains event data.
    */
  type ASPxClientGridViewFocusEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridViewFocusEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGridView.FocusedCellChanging event.
    * @param source The event source.
    * @param e An ASPxClientGridViewFocusedCellChangingEventArgs object that contains event data.
    */
  type ASPxClientGridViewFocusedCellChangingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridViewFocusedCellChangingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGridView.RowCollapsing and ASPxClientGridView.RowExpanding events.
    * @param source The event source.
    * @param e An ASPxClientGridViewRowCancelEventArgs object that contains event data.
    */
  type ASPxClientGridViewRowCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridViewRowCancelEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGridView.RowClick event.
    * @param source The event source. This parameter identifies the ASPxClientGridView object that raised the event.
    * @param e An ASPxClientGridViewRowClickEventArgs object that contains event data.
    */
  type ASPxClientGridViewRowClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridViewRowClickEventArgs, Unit]
  /**
    * Represents a method that will handle the ASPxClientGridView.RowFocusing event.
    * @param source The event source.
    * @param e An ASPxClientGridViewRowFocusingEventArgs object which contains event data.
    */
  type ASPxClientGridViewRowFocusingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridViewRowFocusingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGridView.SelectionChanged event.
    * @param source The event source.
    * @param e An ASPxClientGridViewSelectionEventArgs object that contains event data.
    */
  type ASPxClientGridViewSelectionEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientGridViewSelectionEventArgs, Unit]
  /**
    * Represents a JavaScript function which receives the list of row values when the client ASPxClientGridView.GetRowValues, ASPxGridView.GetCurrentPageRowValues or ASPxClientGridView.GetSelectedFieldValues method is called.
    * @param result An object that represents the list of row values received from the server.
    */
  type ASPxClientGridViewValuesCallback = js.Function1[/* result */ js.Any, Unit]
  /**
    * A method that will handle the ASPxClientHint.Hiding event.
    * @param sender The event source.
    * @param e A ASPxClientHintHidingEventArgs object that contains the required data.
    */
  type ASPxClientHintHidingEventHandler = js.Function2[/* sender */ ASPxClientHintWindow, /* e */ ASPxClientHintHidingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientHint.Showing event.
    * @param sender The event source.
    * @param e A ASPxClientHintShowingEventArgs object that contains the required data.
    */
  type ASPxClientHintShowingEventHandler = js.Function2[/* sender */ ASPxClientHintWindow, /* e */ ASPxClientHintShowingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientHtmlEditor.BeforePaste event.
    * @param source The event source. This parameter identifies the HTML editor object that raised the event.
    * @param e An ASPxClientHtmlEditorBeforePasteEventArgs object that contains event data.
    */
  type ASPxClientHtmlEditorBeforePasteEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientHtmlEditorBeforePasteEventArgs, Unit]
  /**
    * A method that will handle the corresponding client event.
    * @param source The event source. This parameter identifies the editor which raised the event.
    * @param e An ASPxClientHtmlEditorCommandEventArgs object that contains event data.
    */
  type ASPxClientHtmlEditorCommandEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientHtmlEditorCommandEventArgs, Unit]
  /**
    * A method that will handle the client ASPxClientHtmlEditor.CommandExecuted event.
    * @param source The event's source.
    * @param e An ASPxClientHtmlEditorCommandExecutingEventArgs object that contains event data.
    */
  type ASPxClientHtmlEditorCommandExecutingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientHtmlEditorCommandExecutingEventArgs, Unit]
  /**
    * A method that will handle the client ASPxClientHtmlEditor.CustomDialogClosed event.
    * @param source An object representing the event's source.
    * @param e An ASPxClientHtmlEditorCustomDialogClosedEventArgs object that contains event data.
    */
  type ASPxClientHtmlEditorCustomDialogClosedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientHtmlEditorCustomDialogClosedEventArgs, Unit]
  /**
    * A method that will handle the client ASPxClientHtmlEditor.CustomDialogClosing event.
    * @param source An object representing the event's source.
    * @param e An ASPxClientHtmlEditorCustomDialogClosingEventArgs object that contains event data.
    */
  type ASPxClientHtmlEditorCustomDialogClosingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientHtmlEditorCustomDialogClosingEventArgs, Unit]
  /**
    * A method that will handle the client ASPxClientHtmlEditor.CustomDialogOpened event.
    * @param source An object representing the event's source.
    * @param e An ASPxClientHtmlEditorCustomDialogEventArgs object that contains event data.
    */
  type ASPxClientHtmlEditorCustomDialogEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientHtmlEditorCustomDialogEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientHtmlEditor.DialogClosed event.
    * @param source The event source.
    * @param e An ASPxClientHtmlEditorDialogClosedEventArgs object that contains event data.
    */
  type ASPxClientHtmlEditorDialogClosedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientHtmlEditorDialogClosedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientHtmlEditor.DialogClosing event.
    * @param source The event source.
    * @param e An ASPxClientHtmlEditorDialogClosingEventArgs object that contains event data.
    */
  type ASPxClientHtmlEditorDialogClosingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientHtmlEditorDialogClosingEventArgs, Unit]
  /**
    * A method that will handle the client ASPxClientHtmlEditor.DialogInitialized event.
    * @param source An object representing the event's source.
    * @param e An ASPxClientHtmlEditorDialogInitializedEventArgs object that contains event data.
    */
  type ASPxClientHtmlEditorDialogInitializedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientHtmlEditorDialogInitializedEventArgs, Unit]
  /**
    * A method that will handle the client ASPxClientHtmlEditor.ActiveTabChanging event.
    * @param source The event's source.
    * @param e An ASPxClientHtmlEditorTabCancelEventArgs object that contains event data.
    */
  type ASPxClientHtmlEditorTabCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientHtmlEditorTabCancelEventArgs, Unit]
  /**
    * A method that will handle the client ASPxClientHtmlEditor.ActiveTabChanged event.
    * @param source The event's source.
    * @param e An ASPxClientHtmlEditorTabEventArgs object that contains event data.
    */
  type ASPxClientHtmlEditorTabEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientHtmlEditorTabEventArgs, Unit]
  /**
    * A method that will handle the client ASPxClientHtmlEditor.Validation event.
    * @param source An object representing the event's source.
    * @param e An ASPxClientHtmlEditorValidationEventArgs object that contains event data.
    */
  type ASPxClientHtmlEditorValidationEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientHtmlEditorValidationEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientImageGallery.FullscreenViewerShowing event.
    * @param source The event source. Identifies the ASPxImageGallery control that raised the event.
    * @param e An ASPxClientImageGalleryCancelEventArgs object that contains event data.
    */
  type ASPxClientImageGalleryCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientImageGalleryCancelEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientImageGallery.FullscreenViewerActiveItemIndexChanged event.
    * @param source The event source. Identifies the ASPxImageGallery control that raised the event.
    * @param e An ASPxClientImageGalleryFullscreenViewerEventArgs object that contains event data.
    */
  type ASPxClientImageGalleryFullscreenViewerEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientImageGalleryFullscreenViewerEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientImageSlider.ActiveItemChanged and ASPxClientImageSlider.ItemClick events.
    * @param source The event source. Identifies the ASPxImageSlider control that raised the event.
    * @param e An ASPxClientImageSliderItemEventArgs object that contains event data.
    */
  type ASPxClientImageSliderItemEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientImageSliderItemEventArgs, Unit]
  /**
    * References a method that handles the ASPxClientDashboard.ItemBeginUpdate event.
    * @param source The event source.
    * @param e A ASPxClientItemBeginUpdateEventArgs object that contains event data.
    */
  type ASPxClientItemBeginUpdateEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientItemBeginUpdateEventArgs, Unit]
  /**
    * References a method that handles the ASPxClientDashboard.ItemEndUpdate event.
    * @param source The event source.
    * @param e A ASPxClientItemEndUpdateEventArgs object that contains event data.
    */
  type ASPxClientItemEndUpdateEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientItemEndUpdateEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientComboBox.CustomHighlighting and ASPxClientListBox.CustomHighlighting events.
    * @param source The event source.
    * @param e A ASPxClientListEditCustomHighlightingEventArgs object that contains event data.
    */
  type ASPxClientListEditCustomHighlightingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientListEditCustomHighlightingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientComboBox.ItemFiltering and ASPxClientListBox.ItemFiltering events.
    * @param source The event source.
    * @param e A ASPxClientListEditItemFilteringEventArgs object that contains event data.
    */
  type ASPxClientListEditItemFilteringEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientListEditItemFilteringEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientListBox.SelectedIndexChanged event.
    * @param source The event source.
    * @param e An ASPxClientListEditItemSelectedChangedEventArgs object that contains event data.
    */
  type ASPxClientListEditItemSelectedChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientListEditItemSelectedChangedEventArgs, Unit]
  /**
    * A method that will handle client ASPxClientMenuBase.ItemClick events.
    * @param source An object representing the event source.
    * @param e A MenuItemEventArgs object that contains event data.
    */
  type ASPxClientMenuItemClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientMenuItemClickEventArgs, Unit]
  /**
    * A method that will handle the menu's client events concerning manipulations with an item.
    * @param source The event source. This parameter identifies the menu object which raised the event.
    * @param e An ASPxClientMenuItemEventArgs object that contains event data.
    */
  type ASPxClientMenuItemEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientMenuItemEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientMenuBase.ItemMouseOut and ASPxClientMenuBase.ItemMouseOver events.
    * @param source An object representing the event source.
    * @param e A MenuItemEventArgs object that contains event data.
    */
  type ASPxClientMenuItemMouseEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientMenuItemMouseEventArgs, Unit]
  /**
    * A method that will handle the navbar's cancelable client events concerning manipulations with a group.
    * @param source An object representing the event's source. Identifies the navbar object that raised the event.
    * @param e An ASPxClientNavBarGroupCancelEventArgs object that contains event data.
    */
  type ASPxClientNavBarGroupCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientNavBarGroupCancelEventArgs, Unit]
  /**
    * A method that will handle the navbar's client events concerning clicks on groups.
    * @param source The event source. This parameter identifies the navbar object which raised the event.
    * @param e An ASPxClientNavBarGroupClickEventArgs object that contains event data.
    */
  type ASPxClientNavBarGroupClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientNavBarGroupClickEventArgs, Unit]
  /**
    * A method that will handle the navbar's client events concerning manipulations with a group.
    * @param source An object representing the event's source. Identifies the navbar object that raised the event.
    * @param e An ASPxClientNavBarGroupEventArgs object that contains event data.
    */
  type ASPxClientNavBarGroupEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientNavBarGroupEventArgs, Unit]
  /**
    * A method that will handle the navbar's client events concerning manipulations with an item.
    * @param source An object representing the event's source. Identifies the navbar object that raised the event.
    * @param e An ASPxClientNavBarItemEventArgs object that contains event data.
    */
  type ASPxClientNavBarItemEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientNavBarItemEventArgs, Unit]
  /**
    * A method that will handle the news control's client events concerning manipulations with an item.
    * @param source An object representing the event's source. Identifies the news control object that raised the event.
    * @param e An ASPxClientNewsControlItemEventArgs object that contains event data.
    */
  type ASPxClientNewsControlItemEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientNewsControlItemEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientDateEdit.ParseDate event.
    * @param source An object representing the event source. Identifies the button editor that raised the event.
    * @param e An ASPxClientParseDateEventArgs object that contains event data.
    */
  type ASPxClientParseDateEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientParseDateEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientPivotGrid.PopupMenuItemClick event.
    * @param source The event source.
    * @param e An ASPxClientPivotMenuItemClickEventArgs object that contains event data.
    */
  type ASPxClientPivotMenuItemClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientPivotMenuItemClickEventArgs, Unit]
  /**
    * A method that will handle the popup window's cancelable client events.
    * @param source An object representing the event's source. Identifies the popup window object that raised the event.
    * @param e An ASPxClientPopupWindowCancelEventArgs object that contains event data.
    */
  type ASPxClientPopupWindowCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientPopupWindowCancelEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientPopupControlBase.CloseUp event.
    * @param source The event source.
    * @param e An ASPxClientPopupWindowCloseUpEventArgs object that contains event data.
    */
  type ASPxClientPopupWindowCloseUpEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientPopupWindowCloseUpEventArgs, Unit]
  /**
    * A method that will handle the popup control's client events when a popup window is manipulated.
    * @param source An object representing the event's source. Identifies the popup control object (ASPxClientPopupControl) that raised the event.
    * @param e An ASPxClientPopupWindowEventArgs object that contains event data.
    */
  type ASPxClientPopupWindowEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientPopupWindowEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientPopupControlBase.PinnedChanged event.
    * @param source The event source.
    * @param e A ASPxClientPopupWindowPinnedChangedEventArgs object that contains event data.
    */
  type ASPxClientPopupWindowPinnedChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientPopupWindowPinnedChangedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientPopupControlBase.Resize event.
    * @param source The event source.
    * @param e A ASPxClientPopupWindowResizeEventArgs object that contains event data.
    */
  type ASPxClientPopupWindowResizeEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientPopupWindowResizeEventArgs, Unit]
  /**
    * A method that will handle the cancelable client-side events which allow the event's processing to be passed to the server side.
    * @param source An object representing the event source. Identifies the web control that raised the event.
    * @param e An ASPxClientProcessingModeCancelEventArgs object that contains event data.
    */
  type ASPxClientProcessingModeCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientProcessingModeCancelEventArgs, Unit]
  /**
    * A method that will handle the client events which can't be cancelled and allow the event's processing to be passed to the server side.
    * @param source An object representing the event source. Identifies the web control that raised the event.
    * @param e An ASPxClientProcessingModeEventArgs object that contains event data.
    */
  type ASPxClientProcessingModeEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientProcessingModeEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientQueryBuilder.BeforeRender event.
    * @param source The event sender.
    */
  type ASPxClientQueryBuilderBeforeRenderEventHandler[Sender] = js.Function2[/* source */ Sender, /* designerModel */ js.Any, Unit]
  /**
    * A method that will handle the ASPxClientQueryBuilder.CustomizeLocalization event.
    * @param source The event sender.
    */
  type ASPxClientQueryBuilderCustomizeLocalizationEventHandler[Sender] = js.Function1[/* source */ Sender, Unit]
  /**
    * A method that will handle the ASPxClientQueryBuilder.CustomizeToolbarActions event.
    * @param source The event sender.
    * @param e An ASPxClientCustomizeMenuActionsEventArgs object that contains data related to the event.
    */
  type ASPxClientQueryBuilderCustomizeToolbarActionsEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCustomizeMenuActionsEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientQueryBuilder.OnServerError event.
    * @param source The event sender.
    * @param e An ASPxClientErrorEventArgs object that contains data related to the event.
    */
  type ASPxClientQueryBuilderErrorEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientErrorEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientQueryBuilder.SaveCommandExecute event.
    * @param source The event sender.
    * @param e An ASPxClientQueryBuilderSaveCommandExecuteEventArgs object that contains data related to the event.
    */
  type ASPxClientQueryBuilderSaveCommandExecuteEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientQueryBuilderSaveCommandExecuteEventArgs, Unit]
  /**
    * A method that will handle the client ASPxClientRatingControl.ItemClick event.
    * @param source An object representing the event source.
    * @param e A ASPxClientRatingControlItemClickEventArgs object that contains event data.
    */
  type ASPxClientRatingControlItemClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientRatingControlItemClickEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientRatingControl.ItemMouseOut and ASPxClientRatingControl.ItemMouseOver events.
    * @param source The event source.
    * @param e An ASPxClientRatingControlItemMouseEventArgs object that contains event data.
    */
  type ASPxClientRatingControlItemMouseEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientRatingControlItemMouseEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientReportDesigner.BeforeRender event.
    * @param source The event sender.
    * @param designerModel A client-side Report Designer model.
    */
  type ASPxClientReportDesignerBeforeRenderEventHandler[Sender] = js.Function2[/* source */ Sender, /* designerModel */ js.Any, Unit]
  /**
    * A method that will handle the ASPxClientReportDesigner.ComponentAdded event.
    * @param source The event sender.
    * @param e An ASPxClientReportDesignerComponentAddedEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerComponentAddedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientReportDesignerComponentAddedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientReportDesigner.CustomizeElements event.
    * @param source The event sender.
    * @param e An ASPxClientCustomizeElementsEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerCustomizeElementsEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCustomizeElementsEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientReportDesigner.CustomizeFieldListActions event.
    * @param source The event sender.
    * @param e An ASPxClientReportDesignerCustomizeFieldListActionsEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerCustomizeFieldListActionsEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientReportDesignerCustomizeFieldListActionsEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientReportDesigner.CustomizeLocalization event.
    * @param source The event sender.
    */
  type ASPxClientReportDesignerCustomizeLocalizationEventHandler[Sender] = js.Function1[/* source */ Sender, Unit]
  /**
    * A method that will handle the ASPxClientReportDesigner.CustomizeMenuActions event.
    * @param source The event sender.
    * @param e An ASPxClientCustomizeMenuActionsEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerCustomizeMenuActionsEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCustomizeMenuActionsEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientReportDesigner.CustomizeOpenDialog event.
    * @param source The event sender.
    * @param e An ASPxClientReportDesignerCustomizeOpenDialogEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerCustomizeOpenDialogEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientReportDesignerCustomizeOpenDialogEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientReportDesigner.CustomizeParameterEditors event.
    * @param source The event sender.
    * @param e An ASPxClientCustomizeParameterEditorsEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerCustomizeParameterEditorsEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCustomizeParameterEditorsEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientReportDesigner.CustomizeParameterLookUpSource event.
    * @param source The event sender.
    * @param e An ASPxClientCustomizeParameterLookUpSourceEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerCustomizeParameterLookUpSourceEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCustomizeParameterLookUpSourceEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientReportDesigner.CustomizeSaveAsDialog event.
    * @param source The event sender.
    * @param e An ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerCustomizeSaveAsDialogEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientReportDesigner.CustomizeSaveDialog event.
    * @param source The event sender.
    * @param e An ASPxClientReportDesignerCustomizeSaveDialogEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerCustomizeSaveDialogEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientReportDesignerCustomizeSaveDialogEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientReportDesigner.CustomizeToolbox event.
    * @param source The event sender.
    * @param e An ASPxClientReportDesignerCustomizeToolboxEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerCustomizeToolboxEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientReportDesignerCustomizeToolboxEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientReportDesigner.OnServerError event.
    * @param source The event sender.
    * @param e An ASPxClientErrorEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerErrorEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientErrorEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientReportDesigner.ExitDesigner event.
    * @param source The event sender.
    * @param e An ASPxClientReportDesignerExitDesignerEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerExitDesignerEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientReportDesignerExitDesignerEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientReportDesigner.ReportOpened event.
    * @param source The event sender.
    * @param e An ASPxClientReportDesignerDialogEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerReportOpenedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientReportDesignerDialogEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientReportDesigner.ReportOpening event.
    * @param source The event sender.
    * @param e An ASPxClientReportDesignerDialogCancelEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerReportOpeningEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientReportDesignerDialogCancelEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientReportDesigner.ReportSaved event.
    * @param source The event sender.
    * @param e An ASPxClientReportDesignerDialogEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerReportSavedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientReportDesignerDialogEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientReportDesigner.ReportSaving event.
    * @param source The event sender.
    * @param e An ASPxClientReportDesignerDialogCancelEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerReportSavingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientReportDesignerDialogCancelEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientReportDesigner.ReportTabClosed event.
    * @param source The event sender.
    * @param e An ASPxClientReportDesignerTabEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerReportTabClosedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientReportDesignerTabEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientReportDesigner.ReportTabClosing event.
    * @param source The event sender.
    * @param e An ASPxClientReportDesignerTabClosingEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerReportTabClosingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientReportDesignerTabClosingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientReportDesigner.SaveCommandExecute event.
    * @param source The event sender.
    * @param e An ASPxClientReportDesignerSaveCommandExecuteEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerSaveCommandExecuteEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientReportDesignerSaveCommandExecuteEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientReportDesigner.TabChanged event.
    * @param source The event sender.
    * @param e An ASPxClientReportDesignerTabEventArgs object that contains data related to the event.
    */
  type ASPxClientReportDesignerTabChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientReportDesignerTabEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientReportViewer.PageLoad event.
    * @param source The event sender.
    * @param e An ASPxClientReportViewerPageLoadEventArgs object that contains data related to the event.
    */
  type ASPxClientReportViewerPageLoadEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientReportViewerPageLoadEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientRibbon.CommandExecuted event.
    * @param source The event source. Identifies the ASPxRibbon control that raised the event.
    * @param e An ASPxClientRibbonCommandExecutedEventArgs object that contains event data.
    */
  type ASPxClientRibbonCommandExecutedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientRibbonCommandExecutedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientRibbon.DialogBoxLauncherClicked event.
    * @param source The event source. This parameter identifies the ribbon object which raised the event.
    * @param e An ASPxClientRibbonDialogBoxLauncherClickedEventArgs object that contains event data.
    */
  type ASPxClientRibbonDialogBoxLauncherClickedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientRibbonDialogBoxLauncherClickedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientRibbon.MinimizationStateChanged event.
    * @param source The event source. Identifies the ASPxRibbon control that raised the event.
    * @param e An ASPxClientRibbonMinimizationStateEventArgs object that contains event data.
    */
  type ASPxClientRibbonMinimizationStateEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientRibbonMinimizationStateEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientRibbon.ActiveTabChanged event.
    * @param source The event source. Identifies the ASPxRibbon control that raised the event.
    * @param e A ASPxClientRibbonTabEventArgs object that contains event data.
    */
  type ASPxClientRibbonTabEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientRibbonTabEventArgs, Unit]
  /**
    * A method that handles the AutoCorrect event.
    * @param source The event source.
    * @param e An object that contains event data.
    */
  type ASPxClientRichEditAutoCorrectEventHandler = js.Function2[
    /* source */ ASPxClientRichEdit, 
    /* e */ ASPxClientRichEditAutoCorrectEventArgs, 
    js.Any
  ]
  /**
    * A method that handles the CharacterPropertiesChanged event.
    * @param source The event source.
    * @param e An object that contains event data.
    */
  type ASPxClientRichEditCharacterPropertiesChangedEventHandler = js.Function2[
    /* source */ ASPxClientRichEdit, 
    /* e */ ASPxClientRichEditCharacterPropertiesChangedEventArgs, 
    js.Any
  ]
  /**
    * A method that handles the ContentInserted event.
    * @param source The event source.
    * @param e An object that contains event data.
    */
  type ASPxClientRichEditContentInsertedEventHandler = js.Function2[
    /* source */ ASPxClientRichEdit, 
    /* e */ ASPxClientRichEditContentInsertedEventArgs, 
    js.Any
  ]
  /**
    * A method that handles the ContentRemoved event.
    * @param source The event source.
    * @param e An object that contains event data.
    */
  type ASPxClientRichEditContentRemovedEventHandler = js.Function2[
    /* source */ ASPxClientRichEdit, 
    /* e */ ASPxClientRichEditContentRemovedEventArgs, 
    js.Any
  ]
  /**
    * A method that handles the CustomCommandExecuted event.
    * @param source The event source.
    * @param e An object that contains event data.
    */
  type ASPxClientRichEditCustomCommandExecutedEventHandler = js.Function2[
    /* source */ ASPxClientRichEdit, 
    /* e */ ASPxClientRichEditCustomCommandExecutedEventArgs, 
    js.Any
  ]
  /**
    * A method that handles the DocumentFormatted event.
    * @param source The event source.
    * @param e An object that contains event data.
    */
  type ASPxClientRichEditDocumentFormattedEventHandler = js.Function2[
    /* source */ ASPxClientRichEdit, 
    /* e */ ASPxClientRichEditDocumentFormattedEventArgs, 
    js.Any
  ]
  /**
    * A method that handles the HyperlinkClick event.
    * @param source The event source.
    * @param e An object that contains event data.
    */
  type ASPxClientRichEditHyperlinkClickEventHandler = js.Function2[
    /* source */ ASPxClientRichEdit, 
    /* e */ ASPxClientRichEditHyperlinkClickEventArgs, 
    js.Any
  ]
  /**
    * A method that handles the KeyDown event.
    * @param source The event source.
    * @param e An object that contains event data.
    */
  type ASPxClientRichEditKeyDownEventHandler = js.Function2[/* source */ ASPxClientRichEdit, /* e */ ASPxClientRichEditKeyDownEventArgs, js.Any]
  /**
    * A method that handles the KeyUp event.
    * @param source The event source.
    * @param e An object that contains event data.
    */
  type ASPxClientRichEditKeyUpEventHandler = js.Function2[/* source */ ASPxClientRichEdit, /* e */ ASPxClientRichEditKeyUpEventArgs, js.Any]
  /**
    * A method that handles the ParagraphPropertiesChanged event.
    * @param source The event source.
    * @param e An object that contains event data.
    */
  type ASPxClientRichEditParagraphPropertiesChangedEventHandler = js.Function2[
    /* source */ ASPxClientRichEdit, 
    /* e */ ASPxClientRichEditParagraphPropertiesChangedEventArgs, 
    js.Any
  ]
  /**
    * A method that handles the PointerDown event.
    * @param source The event source.
    * @param e An object that contains event data.
    */
  type ASPxClientRichEditPointerDownEventHandler = js.Function2[
    /* source */ ASPxClientRichEdit, 
    /* e */ ASPxClientRichEditPointerDownEventArgs, 
    js.Any
  ]
  /**
    * A method that handles the PointerUp event.
    * @param source The event source.
    * @param e An object that contains event data.
    */
  type ASPxClientRichEditPointerUpEventHandler = js.Function2[
    /* source */ ASPxClientRichEdit, 
    /* e */ ASPxClientRichEditPointerUpEventArgs, 
    js.Any
  ]
  /**
    * A method that handles the PopupMenuShowing event.
    * @param source The event source.
    * @param e An object that contains event data.
    */
  type ASPxClientRichEditPopupMenuShowingEventHandler = js.Function2[
    /* source */ ASPxClientRichEdit, 
    /* e */ ASPxClientRichEditPopupMenuShowingEventArgs, 
    js.Any
  ]
  /**
    * References a method that handles the ASPxClientDashboard.SelectedTabPageChanged event.
    * @param source The event source.
    * @param e A ASPxClientSelectedTabPageChangedEventArgs object that contains event data.
    */
  type ASPxClientSelectedTabPageChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientSelectedTabPageChangedEventArgs, Unit]
  /**
    * A method that will handle a splitter control's cancelable client events concerning pane manipulations.
    * @param source An object representing the event's source. Identifies the splitter control object that raised the event.
    * @param e An ASPxClientSplitterPaneCancelEventArgs object that contains event data.
    */
  type ASPxClientSplitterPaneCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientSplitterPaneCancelEventArgs, Unit]
  /**
    * A method that will handle the splitter's client events concerning pane manipulations.
    * @param source An object representing the event's source. Identifies the splitter object that raised the event.
    * @param e An ASPxClientSplitterPaneEventArgs object that contains event data.
    */
  type ASPxClientSplitterPaneEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientSplitterPaneEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientSpreadsheet.CellBeginEdit event.
    * @param source An object representing the event source. Identifies the Spreadsheet that raised the event.
    * @param e A ASPxClientSpreadsheetCellBeginEditEventArgs object that contains event data.
    */
  type ASPxClientSpreadsheetCellBeginEditEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientSpreadsheetCellBeginEditEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientSpreadsheet.CellCancelEdit event.
    * @param source An object representing the event source. Identifies the Spreadsheet that raised the event.
    * @param e A ASPxClientSpreadsheetCellCancelEditEventArgs object that contains event data.
    */
  type ASPxClientSpreadsheetCellCancelEditEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientSpreadsheetCellCancelEditEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientSpreadsheet.CellEndEdit event.
    * @param source An object representing the event source. Identifies the Spreadsheet that raised the event.
    * @param e A ASPxClientSpreadsheetCellEndEditEventArgs object that contains event data.
    */
  type ASPxClientSpreadsheetCellEndEditEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientSpreadsheetCellEndEditEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientSpreadsheet.CustomCommandExecuted event.
    * @param source An object representing the event source. Identifies the Spreadsheet that raised the event.
    * @param e A ASPxClientSpreadsheetCustomCommandExecutedEventArgs object that contains event data.
    */
  type ASPxClientSpreadsheetCustomCommandExecutedEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientSpreadsheetCustomCommandExecutedEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientSpreadsheet.DocumentChanged event.
    * @param source An object representing the event source. Identifies the Spreadsheet that raised the event.
    * @param e A ASPxClientSpreadsheetDocumentChangedEventArgs object that contains event data.
    */
  type ASPxClientSpreadsheetDocumentChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientSpreadsheetDocumentChangedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientSpreadsheet.HyperlinkClick event.
    * @param source An object representing the event source. Identifies the Spreadsheet that raised the event.
    * @param e An ASPxClientSpreadsheetHyperlinkClickEventArgs object that contains event data.
    */
  type ASPxClientSpreadsheetHyperlinkClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientSpreadsheetHyperlinkClickEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientSpreadsheet.PopupMenuShowing event.
    * @param source The event sender (typically an ASPxClientSpreadsheet object).
    * @param e A ASPxClientSpreadsheetPopupMenuShowingEventArgs object that contains event data.
    */
  type ASPxClientSpreadsheetPopupMenuShowingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientSpreadsheetPopupMenuShowingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientSpreadsheet.SelectionChanged event.
    * @param source An object representing the event source. Identifies the button editor that raised the event.
    * @param e An ASPxClientSpreadsheetSelectionChangedEventArgs object that contains event data.
    */
  type ASPxClientSpreadsheetSelectionChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientSpreadsheetSelectionChangedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientSpreadsheet.BeginSynchronization and ASPxClientSpreadsheet.EndSynchronization events.
    * @param source An object representing the event source. Identifies the Spreadsheet that raised the event.
    * @param e A ASPxClientSpreadsheetSynchronizationEventArgs object that contains event data.
    */
  type ASPxClientSpreadsheetSynchronizationEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientSpreadsheetSynchronizationEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientSpreadsheet.ViewModeChanged event.
    * @param source The event sender (typically an ASPxClientSpreadsheet object).
    * @param e A ASPxClientSpreadsheetViewModeChangedEventArgs object that contains event data.
    */
  type ASPxClientSpreadsheetViewModeChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientSpreadsheetViewModeChangedEventArgs, Unit]
  /**
    * A method that will handle a tab control's cancelable client events concerning manipulations with a tab.
    * @param source An object representing the event's source. Identifies the tab control object that raised the event.
    * @param e An ASPxClientTabControlTabCancelEventArgs object that contains event data.
    */
  type ASPxClientTabControlTabCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTabControlTabCancelEventArgs, Unit]
  /**
    * A method that will handle client events concerning clicks on tabs.
    * @param source The event source. This parameter identifies the tab control object which raised the event.
    * @param e An ASPxClientTabControlTabClickEventArgs object that contains event data.
    */
  type ASPxClientTabControlTabClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTabControlTabClickEventArgs, Unit]
  /**
    * A method that will handle a tab control's client events concerning manipulations with a tab.
    * @param source An object representing the event's source. Identifies the tab control object that raised the event.
    * @param e An ASPxClientTabControlTabEventArgs object that contains event data.
    */
  type ASPxClientTabControlTabEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTabControlTabEventArgs, Unit]
  /**
    * A method that will handle the title index control's client events concerning manipulations with an item.
    * @param source An object representing the event's source. Identifies the title index control object that raised the event.
    * @param e An ASPxClientTitleIndexItemEventArgs object that contains event data.
    */
  type ASPxClientTitleIndexItemEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTitleIndexItemEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientDocumentViewer.ToolbarItemValueChanged event.
    * @param source A Object that is the event source.
    * @param e An ASPxClientToolbarItemValueChangedEventArgs object, containing the event arguments.
    */
  type ASPxClientToolbarItemValueChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientToolbarItemValueChangedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientTrackBar.PositionChanging event.
    * @param source The event source. Identifies the ASPxTrackBar control that raised the event.
    * @param e A ASPxClientTrackBarPositionChangingEventArgs object that contains event data.
    */
  type ASPxClientTrackBarPositionChangingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTrackBarPositionChangingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientTreeList.BatchEditChangesCanceling event.
    * @param source The event source.
    * @param e A ASPxClientTreeListBatchEditChangesCancelingEventArgs object that contains event data.
    */
  type ASPxClientTreeListBatchEditChangesCancelingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientTreeListBatchEditChangesCancelingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientTreeList.BatchEditChangesSaving event.
    * @param source The event source.
    * @param e A ASPxClientTreeListBatchEditChangesSavingEventArgs object that contains event data.
    */
  type ASPxClientTreeListBatchEditChangesSavingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTreeListBatchEditChangesSavingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientTreeList.BatchEditConfirmShowing event.
    * @param source The event source.
    * @param e A ASPxClientTreeListBatchEditConfirmShowingEventArgs object that contains event data.
    */
  type ASPxClientTreeListBatchEditConfirmShowingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientTreeListBatchEditConfirmShowingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientTreeList.BatchEditEndEditing event.
    * @param source The event source.
    * @param e A ASPxClientTreeListBatchEditEndEditingEventArgs object that contains event data.
    */
  type ASPxClientTreeListBatchEditEndEditingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTreeListBatchEditEndEditingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientTreeList.BatchEditNodeDeleting event.
    * @param source The event source.
    * @param e A ASPxClientTreeListBatchEditNodeDeletingEventArgs object that contains event data.
    */
  type ASPxClientTreeListBatchEditNodeDeletingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTreeListBatchEditNodeDeletingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientTreeList.BatchEditNodeInserting event.
    * @param source The event source.
    * @param e A ASPxClientTreeListBatchEditNodeInsertingEventArgs object that contains event data.
    */
  type ASPxClientTreeListBatchEditNodeInsertingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTreeListBatchEditNodeInsertingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientTreeList.BatchEditNodeRecovering event.
    * @param source The event source.
    * @param e An ASPxClientTreeListBatchEditNodeRecoveringEventArgs object that contains event data.
    */
  type ASPxClientTreeListBatchEditNodeRecoveringEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientTreeListBatchEditNodeRecoveringEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientTreeList.BatchEditNodeValidating event.
    * @param source The event source.
    * @param e A ASPxClientTreeListBatchEditNodeValidatingEventArgs object that contains event data.
    */
  type ASPxClientTreeListBatchEditNodeValidatingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientTreeListBatchEditNodeValidatingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientTreeList.BatchEditStartEditing event.
    * @param source The event source.
    * @param e A ASPxClientTreeListBatchEditStartEditingEventArgs object that contains event data.
    */
  type ASPxClientTreeListBatchEditStartEditingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTreeListBatchEditStartEditingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientTreeList.BatchEditTemplateCellFocused event.
    * @param source The event sender.
    * @param e A ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs object that contains event data.
    */
  type ASPxClientTreeListBatchEditTemplateCellFocusedEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientTreeList.ColumnResized event.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientTreeListColumnResizedEventArgs object that contains event data.
    */
  type ASPxClientTreeListColumnResizedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTreeListColumnResizedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientTreeList.ColumnResizing event.
    * @param source The event source. Identifies the ASPxFileManager control that raised the event.
    * @param e A ASPxClientTreeListColumnResizingEventArgs object that contains event data.
    */
  type ASPxClientTreeListColumnResizingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTreeListColumnResizingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientTreeList.ContextMenu event.
    * @param source The event sender.
    * @param e An ASPxClientTreeListContextMenuEventArgs object that contains event data.
    */
  type ASPxClientTreeListContextMenuEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTreeListContextMenuEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientTreeList.CustomButtonClick event.
    * @param source The event source.
    * @param e An ASPxClientTreeListCustomButtonEventArgs object that contains event data.
    */
  type ASPxClientTreeListCustomButtonEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTreeListCustomButtonEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientTreeList.CustomDataCallback event.
    * @param source The event source.
    * @param e An ASPxClientTreeListCustomDataCallbackEventArgs object that contains event data.
    */
  type ASPxClientTreeListCustomDataCallbackEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTreeListCustomDataCallbackEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientTreeList.EndDragNode event.
    * @param source The event source.
    * @param e An ASPxClientTreeListEndDragNodeEventArgs object that contains event data.
    */
  type ASPxClientTreeListEndDragNodeEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTreeListEndDragNodeEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientTreeList.FocusedCellChanging event.
    * @param source The event source.
    * @param e A ASPxClientTreeListFocusedCellChangingEventArgs object that contains event data.
    */
  type ASPxClientTreeListFocusedCellChangingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTreeListFocusedCellChangingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientTreeList.NodeDblClick event.
    * @param source The event source.
    * @param e An ASPxClientTreeListNodeEventArgs object that contains event data.
    */
  type ASPxClientTreeListNodeEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTreeListNodeEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientTreeList.StartDragNode event.
    * @param source The event source.
    * @param e An ASPxClientTreeListStartDragNodeEventArgs object that contains event data.
    */
  type ASPxClientTreeListStartDragNodeEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTreeListStartDragNodeEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientTreeList.ToolbarItemClick event.
    * @param source The event source.
    * @param e An ASPxClientTreeListToolbarItemClickEventArgs object that contains event data.
    */
  type ASPxClientTreeListToolbarItemClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTreeListToolbarItemClickEventArgs, Unit]
  /**
    * A JavaScript function which receives the list of row values when a specific client method (such as the ASPxClientTreeList.GetNodeValues or ASPxClientTreeList.GetSelectedNodeValues) is called.
    * @param result An object that represents the list of row values received from the server.
    */
  type ASPxClientTreeListValuesCallback = js.Function1[/* result */ js.Any, Unit]
  /**
    * A method that will handle the ASPxTreeView's cancelable client events, concerning manipulations with nodes.
    * @param source An object representing the event's source. Identifies the ASPxClientTreeView object that raised the event.
    * @param e An ASPxClientTreeViewNodeCancelEventArgs object that contains event data.
    */
  type ASPxClientTreeViewNodeCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTreeViewNodeCancelEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientTreeView.NodeClick event.
    * @param source The ASPxClientTreeView control which fires the event.
    * @param e An ASPxClientTreeViewNodeClickEventArgs object that contains event data.
    */
  type ASPxClientTreeViewNodeClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTreeViewNodeClickEventArgs, Unit]
  /**
    * A method that will handle the ASPxTreeView control's client events, concerning manipulations with a node.
    * @param source An object representing the event's source. Identifies the ASPxClientTreeView control object that raised the event.
    * @param e An ASPxClientTreeViewNodeEventArgs object that contains event data.
    */
  type ASPxClientTreeViewNodeEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTreeViewNodeEventArgs, Unit]
  /**
    * A method that will handle the client events concerned with node processing.
    * @param source An object representing the event source. Identifies the ASPxClientTreeView control that raised the event.
    * @param e An ASPxClientTreeViewNodeProcessingModeEventArgs object that contains event data.
    */
  type ASPxClientTreeViewNodeProcessingModeEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientTreeViewNodeProcessingModeEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientUploadControl.DropZoneEnter event.
    * @param source The event source. This parameter identifies the upload control object which raised the event.
    * @param e An ASPxClientUploadControlDropZoneEnterEventArgs object that contains event data.
    */
  type ASPxClientUploadControlDropZoneEnterEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientUploadControlDropZoneEnterEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientUploadControl.DropZoneLeave event.
    * @param source The event source. Identifies the upload control object that raised the event.
    * @param e A ASPxClientUploadControlDropZoneLeaveEventArgs object that contains event data.
    */
  type ASPxClientUploadControlDropZoneLeaveEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientUploadControlDropZoneLeaveEventArgs, Unit]
  /**
    * A method that will handle the corresponding client event.
    * @param source The event source. This parameter identifies the upload control which raised the event.
    * @param e An ASPxClientUploadControlFileUploadCompleteEventArgs object that contains event data.
    */
  type ASPxClientUploadControlFileUploadCompleteEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientUploadControlFileUploadCompleteEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the client ASPxClientUploadControl.FilesUploadComplete event.
    * @param source The event source. This parameter identifies the upload control which raised the event.
    * @param e A  object that contains event data.
    */
  type ASPxClientUploadControlFilesUploadCompleteEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientUploadControlFilesUploadCompleteEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientUploadControl.FilesUploadStart event.
    * @param source The event source. Identifies the ASPxUploadControl control that raised the event.
    * @param e A ASPxClientUploadControlFilesUploadStartEventArgs object that contains event data.
    */
  type ASPxClientUploadControlFilesUploadStartEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientUploadControlFilesUploadStartEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientUploadControl.TextChanged client event.
    * @param source The event source. This parameter identifies the upload control which raised the event.
    * @param e An ASPxClientUploadControlTextChangedEventArgs object that contains event data.
    */
  type ASPxClientUploadControlTextChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientUploadControlTextChangedEventArgs, Unit]
  /**
    * A method that will handle the ASPxUploadControl's client event concerning the uploading process being changed.
    * @param source An object representing the event's source. Identifies the ASPxUploadControl object that raised the event.
    * @param e An ASPxClientUploadControlUploadingProgressChangedEventArgs object that contains event data.
    */
  type ASPxClientUploadControlUploadingProgressChangedEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientUploadControlUploadingProgressChangedEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientUploadControl.ValidationErrorOccurred event.
    * @param source The event source.
    * @param e An ASPxClientUploadControlValidationErrorOccurredEventArgs object that contains event data.
    */
  type ASPxClientUploadControlValidationErrorOccurredEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientUploadControlValidationErrorOccurredEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientGlobalEvents.ValidationCompleted event.
    * @param source An object representing the event source. Identifies the ASPxClientGlobalEvents object that raised the event.
    * @param e An ASPxClientValidationCompletedEventArgs object that contains event data.
    */
  type ASPxClientValidationCompletedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientValidationCompletedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientValidationSummary.VisibilityChanged client event.
    * @param source An object representing the event source.
    * @param e A ASPxClientValidationSummaryVisibilityChangedEventArgs object that contains event data.
    */
  type ASPxClientValidationSummaryVisibilityChangedEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientValidationSummaryVisibilityChangedEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientVerticalGrid.BatchEditChangesCanceling event.
    * @param source The event source. This parameter identifies the vertical grid object which raised the event.
    * @param e An ASPxClientVerticalGridBatchEditChangesCancelingEventArgs object that contains event data.
    */
  type ASPxClientVerticalGridBatchEditChangesCancelingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientVerticalGridBatchEditChangesCancelingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientVerticalGrid.BatchEditChangesSaving event.
    * @param source The event source. This parameter identifies the vertical grid object which raised the event.
    * @param e An ASPxClientVerticalGridBatchEditChangesSavingEventArgs object that contains event data.
    */
  type ASPxClientVerticalGridBatchEditChangesSavingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientVerticalGridBatchEditChangesSavingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientVerticalGrid.BatchEditConfirmShowing client event.
    * @param source The event source.
    * @param e An ASPxClientVerticalGridBatchEditConfirmShowingEventArgs object that contains event data.
    */
  type ASPxClientVerticalGridBatchEditConfirmShowingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientVerticalGridBatchEditConfirmShowingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientVerticalGrid.BatchEditEndEditing event.
    * @param source The event source.
    * @param e An ASPxClientVerticalGridBatchEditEndEditingEventArgs object that contains event data.
    */
  type ASPxClientVerticalGridBatchEditEndEditingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientVerticalGridBatchEditEndEditingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientVerticalGrid.BatchEditRecordDeleting event.
    * @param source The event source. This parameter identifies the vertical grid object which raised the event.
    * @param e An ASPxClientVerticalGridBatchEditRecordDeletingEventArgs object that contains event data.
    */
  type ASPxClientVerticalGridBatchEditRecordDeletingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientVerticalGridBatchEditRecordDeletingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientVerticalGrid.BatchEditRecordInserting event.
    * @param source The event source. This parameter identifies the vertical grid object which raised the event.
    * @param e An ASPxClientVerticalGridBatchEditRecordInsertingEventArgs object that contains event data.
    */
  type ASPxClientVerticalGridBatchEditRecordInsertingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientVerticalGridBatchEditRecordInsertingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientVerticalGrid.BatchEditRecordRecovering event.
    * @param source The event source.
    * @param e An ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs object that contains event data.
    */
  type ASPxClientVerticalGridBatchEditRecordRecoveringEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientVerticalGrid.BatchEditRecordValidating event.
    * @param source The event source.
    * @param e An ASPxClientVerticalGridBatchEditRecordValidatingEventArgs object that contains event data.
    */
  type ASPxClientVerticalGridBatchEditRecordValidatingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientVerticalGridBatchEditRecordValidatingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientVerticalGrid.BatchEditStartEditing event.
    * @param source The event source.
    * @param e An ASPxClientVerticalGridBatchEditStartEditingEventArgs object that contains event data.
    */
  type ASPxClientVerticalGridBatchEditStartEditingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientVerticalGridBatchEditStartEditingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientVerticalGrid.BatchEditTemplateCellFocused event.
    * @param source An object representing the event source. Identifies the button editor that raised the event.
    * @param e An ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs object that contains event data.
    */
  type ASPxClientVerticalGridBatchEditTemplateCellFocusedEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientVerticalGrid.CustomButtonClick event.
    * @param source The event source.
  This parameter identifies the ASPxClientVerticalGrid object that raised the event.
    * @param e An ASPxClientVerticalGridCustomButtonEventArgs object that contains event data.
    */
  type ASPxClientVerticalGridCustomButtonEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientVerticalGridCustomButtonEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientVerticalGrid.FocusedCellChanging event.
    * @param source The event source.
    * @param e An ASPxClientVerticalGridFocusedCellChangingEventArgs object that contains event data.
    */
  type ASPxClientVerticalGridFocusedCellChangingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientVerticalGridFocusedCellChangingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientVerticalGrid.RecordClick event.
    * @param source The event source. This parameter identifies the ASPxClientVerticalGrid object that raised the event.
    * @param e An ASPxClientVerticalGridRecordClickEventArgs object that contains event data.
    */
  type ASPxClientVerticalGridRecordClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientVerticalGridRecordClickEventArgs, Unit]
  /**
    * A method that will handle the cancelable events of a client ASPxVerticalGrid row.
    * @param source The event source.
    * @param e An ASPxClientVerticalGridRowCancelEventArgs object that contains event data.
    */
  type ASPxClientVerticalGridRowCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientVerticalGridRowCancelEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientVerticalGrid.RowExpandedChanged event.
    * @param source The event source.
    * @param e An ASPxClientVerticalGridRowExpandedEventArgs object that contains event data.
    */
  type ASPxClientVerticalGridRowExpandedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientVerticalGridRowExpandedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientVerticalGrid.RowExpandedChanging event.
    * @param source The event source.
    * @param e An ASPxClientVerticalGridRowExpandedEventArgs object that contains event data.
    */
  type ASPxClientVerticalGridRowExpandingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientVerticalGridRowExpandingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientVerticalGrid.SelectionChanged event.
    * @param source The event source.
    * @param e An ASPxClientVerticalGridSelectionEventArgs object that contains event data.
    */
  type ASPxClientVerticalGridSelectionEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientVerticalGridSelectionEventArgs, Unit]
  /**
    * Represents a JavaScript function which receives the list of record values when the client ASPxClientVerticalGrid.GetRecordValues, ASPxVerticalGrid.GetCurrentPageRecordValues or ASPxClientVerticalGrid.GetSelectedFieldValues method is called.
    * @param result An object that represents the list of record values received from the server.
    */
  type ASPxClientVerticalGridValuesCallback = js.Function1[/* result */ js.Any, Unit]
  /**
    * A method that will handle the ASPxClientWebChartControl.CustomDrawCrosshair event.
    * @param source The event source. This parameter identifies the ASPxClientWebChart.chartControl which raised the event.
    * @param e An ASPxClientWebChartControlCustomDrawCrosshairEventArgs object which contains event data.
    */
  type ASPxClientWebChartControlCustomDrawCrosshairEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientWebChartControlCustomDrawCrosshairEventArgs, 
    Unit
  ]
  /**
    * Represents a method that will handle the ASPxClientWebChartControl.ObjectHotTracked and ASPxClientWebChartControl.ObjectSelected events.
    * @param source The event source. This parameter identifies the ASPxClientWebChartControl which raised the event.
    * @param e An ASPxClientWebChartControlHotTrackEventArgs object which contains event data.
    */
  type ASPxClientWebChartControlHotTrackEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientWebChartControlHotTrackEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientWebDocumentViewer.BeforeRender event.
    * @param source The event sender.
    * @param previewModel A client-side Document Viewer model.
    */
  type ASPxClientWebDocumentViewerBeforeRenderEventHandler[Sender] = js.Function2[/* source */ Sender, /* previewModel */ js.Any, Unit]
  /**
    * A method that will handle the ASPxClientWebDocumentViewer.CustomizeElements or ASPxClientReportDesigner.PreviewCustomizeElements event.
    * @param source The event sender.
    * @param e An ASPxClientCustomizeElementsEventArgs object that contains data related to the event.
    */
  type ASPxClientWebDocumentViewerCustomizeElementsEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCustomizeElementsEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientWebDocumentViewer.CustomizeExportOptions event.
    * @param source The event sender.
    * @param e An ASPxClientCustomizeExportOptionsEventArgs object that contains data related to the event.
    */
  type ASPxClientWebDocumentViewerCustomizeExportOptionsEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCustomizeExportOptionsEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientWebDocumentViewer.CustomizeLocalization event.
    * @param source The event sender.
    */
  type ASPxClientWebDocumentViewerCustomizeLocalizationEventHandler[Sender] = js.Function1[/* source */ Sender, Unit]
  /**
    * A method that will handle the ASPxClientWebDocumentViewer.CustomizeMenuActions event.
    * @param source The event sender.
    * @param e An ASPxClientCustomizeMenuActionsEventArgs object that contains data related to the event.
    */
  type ASPxClientWebDocumentViewerCustomizeMenuActionsEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCustomizeMenuActionsEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientWebDocumentViewer.CustomizeParameterEditors event.
    * @param source The event sender.
    * @param e An ASPxClientCustomizeParameterEditorsEventArgs object that contains data related to the event.
    */
  type ASPxClientWebDocumentViewerCustomizeParameterEditorsEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCustomizeParameterEditorsEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientWebDocumentViewer.CustomizeParameterLookUpSource event.
    * @param source The event sender.
    * @param e An ASPxClientCustomizeParameterLookUpSourceEventArgs object that contains data related to the event.
    */
  type ASPxClientWebDocumentViewerCustomizeParameterLookUpSourceEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientCustomizeParameterLookUpSourceEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientWebDocumentViewer.DocumentReady or ASPxClientReportDesigner.PreviewDocumentReady event.
    * @param source The event sender.
    * @param e An ASPxClientWebDocumentViewerDocumentReadyEventArgs object that contains data related to the event.
    */
  type ASPxClientWebDocumentViewerDocumentReadyEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientWebDocumentViewerDocumentReadyEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientWebDocumentViewer.EditingFieldChanged or ASPxClientReportDesigner.PreviewEditingFieldChanged event.
    * @param source The event sender.
    * @param e An ASPxClientWebDocumentViewerEditingFieldChangedEventArgs object that contains data related to the event.
    */
  type ASPxClientWebDocumentViewerEditingFieldChangedEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ ASPxClientWebDocumentViewerEditingFieldChangedEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the ASPxClientWebDocumentViewer.OnServerError event.
    * @param source The event sender.
    * @param e An ASPxClientErrorEventArgs object that contains data related to the event.
    */
  type ASPxClientWebDocumentViewerErrorEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientErrorEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientWebDocumentViewer.ParametersReset or ASPxClientReportDesigner.PreviewParametersReset event.
    * @param source The event sender.
    * @param e An ASPxClientParametersResetEventArgs object that contains data related to the event.
    */
  type ASPxClientWebDocumentViewerParametersResetEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientParametersResetEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientWebDocumentViewer.ParametersSubmitted or ASPxClientReportDesigner.PreviewParametersSubmitted event.
    * @param source The event sender.
    * @param e An ASPxClientParametersSubmittedEventArgs object that contains data related to the event.
    */
  type ASPxClientWebDocumentViewerParametersSubmittedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientParametersSubmittedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientWebDocumentViewer.PreviewClick or ASPxClientReportDesigner.PreviewClick event.
    * @param source The event sender.
    * @param e An ASPxClientPreviewClickEventArgs object that contains data related to the event.
    */
  type ASPxClientWebDocumentViewerPreviewClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientPreviewClickEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientSpellChecker.AfterCheck event.
    * @param source The event source.
    * @param e An ASPxClientSpellCheckerAfterCheckEventArgs object which contains event data.
    */
  type ASPxClientWordChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientSpellCheckerAfterCheckEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientScheduler.ActiveViewChanging event.
    * @param source The ASPxClientScheduler control which fires the event.
    * @param e An ActiveViewChangingEventArgs object that contains event data
    */
  type ActiveViewChangingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ActiveViewChangingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientScheduler.AppointmentClick event.
    * @param source The event sender (typically an ASPxClientScheduler control).
    * @param e A AppointmentClickEventArgs object that contains event data.
    */
  type AppointmentClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ AppointmentClickEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientScheduler.AppointmentDrag event.
    * @param source The event sender (typically an ASPxClientScheduler object).
    * @param e A ASPxClientAppointmentDragEventArgs object that contains event data.
    */
  type AppointmentDragEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientAppointmentDragEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientScheduler.AppointmentDrop event.
    * @param source The event sender (typically an ASPxClientScheduler object).
    * @param e A ASPxClientAppointmentDropEventArgs object that contains event data.
    */
  type AppointmentDropEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientAppointmentDropEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientScheduler.AppointmentResize event.
    * @param source The event sender (typically an ASPxClientScheduler control).
    * @param e A ASPxClientAppointmentResizeEventArgs object that contains event data.
    */
  type AppointmentResizeEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientAppointmentResizeEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientScheduler.AppointmentResizing event.
    * @param source The event sender (typically an ASPxClientScheduler object).
    * @param e A ASPxClientAppointmentResizingEventArgs object that contains event data.
    */
  type AppointmentResizingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientAppointmentResizingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientScheduler.AppointmentsSelectionChanged event.
    * @param source The ASPxScheduler control which fires the event.
    * @param e A AppointmentsSelectionEventArgs object that contains event data.
    */
  type AppointmentsSelectionEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ AppointmentsSelectionEventArgs, Unit]
  /**
    * A method that will handle the Accordion control's cancelable client events concerning manipulations with a group.
    * @param source An object representing the event source. Identifies the BootstrapClientAccordion control that raised the event.
    * @param e An BootstrapClientAccordionGroupCancelEventArgs object that contains event data.
    */
  type BootstrapClientAccordionGroupCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ BootstrapClientAccordionGroupCancelEventArgs, Unit]
  /**
    * A method that will handle the Accordion control's client events concerning clicks on groups.
    * @param source An object representing the event source. Identifies the BootstrapClientAccordion control that raised the event.
    * @param e An BootstrapClientAccordionGroupClickEventArgs object that contains event data.
    */
  type BootstrapClientAccordionGroupClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ BootstrapClientAccordionGroupClickEventArgs, Unit]
  /**
    * A method that will handle the Accordion control's client events concerning manipulations with a group.
    * @param source An object representing the event source. Identifies the BootstrapClientAccordion control that raised the event.
    * @param e An BootstrapClientAccordionGroupEventArgs object that contains event data.
    */
  type BootstrapClientAccordionGroupEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ BootstrapClientAccordionGroupEventArgs, Unit]
  /**
    * A method that will handle the Accordion control's client events concerning manipulations with an item.
    * @param source An object representing the event source. Identifies the BootstrapClientAccordion control that raised the event.
    * @param e An BootstrapClientAccordionItemEventArgs object that contains event data.
    */
  type BootstrapClientAccordionItemEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ BootstrapClientAccordionItemEventArgs, Unit]
  /**
    * A method that will handle the BootstrapClientChartBase.Done event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetEventArgsBase object that contains event data.
    */
  type BootstrapClientChartBaseDoneEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the BootstrapClientChartBase.LegendClick event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetElementClickEventArgs object that contains event data.
    */
  type BootstrapClientChartBaseLegendClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the BootstrapClientChartBase.PointClick event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetElementClickEventArgs object that contains event data.
    */
  type BootstrapClientChartBasePointClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the BootstrapClientChartBase.PointHoverChanged event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetElementActionEventArgs object that contains event data.
    */
  type BootstrapClientChartBasePointHoverChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the BootstrapClientChartBase.PointSelectionChanged event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetElementActionEventArgs object that contains event data.
    */
  type BootstrapClientChartBasePointSelectionChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the BootstrapClientChartBase.TooltipHidden event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetElementActionEventArgs object that contains event data.
    */
  type BootstrapClientChartBaseTooltipHiddenEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the BootstrapClientChartBase.TooltipShown event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetElementActionEventArgs object that contains event data.
    */
  type BootstrapClientChartBaseTooltipShownEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the BootstrapClientChart.ZoomEnd event.
    * @param source The event source.
    * @param e A BootstrapClientChartZoomEndEventArgs object that contains event data.
    */
  type BootstrapClientChartZoomEndEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the BootstrapClientChart.ZoomStart event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetEventArgsBase object that contains event data.
    */
  type BootstrapClientChartZoomStartEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the Invoke event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetElementClickEventArgs object that contains event data.
    */
  type BootstrapClientCoordinateSystemChartArgumentAxisClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the BootstrapClientChartBase.SeriesClick event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetElementClickEventArgs object that contains event data.
    */
  type BootstrapClientCoordinateSystemChartSeriesClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the BootstrapClientChartBase.SeriesHoverChanged event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetElementActionEventArgs object that contains event data.
    */
  type BootstrapClientCoordinateSystemChartSeriesHoverChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the BootstrapClientChartBase.SeriesSelectionChanged event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetElementActionEventArgs object that contains event data.
    */
  type BootstrapClientCoordinateSystemChartSeriesSelectionChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  type BootstrapClientFloatingActionButtonContextChangingEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ BootstrapClientFloatingActionButtonContextChangingEventArgs, 
    Unit
  ]
  /**
    * A method that will handle client ASPxClientMenuBase.ItemClick events.
    * @param source An object representing the event source. Identifies the BootstrapMenu control that raised the event.
    * @param e An BootstrapClientMenuItemClickEventArgs object that contains event data.
    */
  type BootstrapClientMenuItemClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ BootstrapClientMenuItemClickEventArgs, Unit]
  /**
    * A method that will handle the menu's client events concerning manipulations with an item.
    * @param source An object representing the event source. Identifies the BootstrapMenu control that raised the event.
    * @param e An BootstrapClientMenuItemEventArgs object that contains event data.
    */
  type BootstrapClientMenuItemEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ BootstrapClientMenuItemEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientMenuBase.ItemMouseOut and ASPxClientMenuBase.ItemMouseOver events.
    * @param source An object representing the event source. Identifies the BootstrapMenu control that raised the event.
    * @param e An BootstrapClientMenuItemMouseEventArgs object that contains event data.
    */
  type BootstrapClientMenuItemMouseEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ BootstrapClientMenuItemMouseEventArgs, Unit]
  /**
    * A method that will handle the BootstrapClientRangeSelector.ValueChanged event.
    * @param source The event source.
    * @param e A BootstrapClientRangeSelectorValueChangedEventArgs object that contains event data.
    */
  type BootstrapClientRangeSelectorValueChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  type BootstrapClientSparklineTooltipHiddenEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  type BootstrapClientSparklineTooltipShownEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle a tab control's cancelable client events concerning manipulations with a tab.
    * @param source An object representing the event source. Identifies the BootstrapTabControl that raised the event.
    * @param e An BootstrapClientTabControlTabCancelEventArgs object that contains event data.
    */
  type BootstrapClientTabControlTabCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ BootstrapClientTabControlTabCancelEventArgs, Unit]
  /**
    * A method that will handle client events concerning clicks on tabs.
    * @param source An object representing the event source. Identifies the BootstrapTabControl that raised the event.
    * @param e An BootstrapClientTabControlTabClickEventArgs object that contains event data.
    */
  type BootstrapClientTabControlTabClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ BootstrapClientTabControlTabClickEventArgs, Unit]
  /**
    * A method that will handle a tab control's client events concerning manipulations with a tab.
    * @param source An object representing the event source. Identifies the BootstrapClientTabControl that raised the event.
    * @param e An BootstrapClientTabControlTabEventArgs object that contains event data.
    */
  type BootstrapClientTabControlTabEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ BootstrapClientTabControlTabEventArgs, Unit]
  /**
    * A method that will handle the Tree View's cancelable client events, concerning manipulations with nodes.
    * @param source An object representing the event source. Identifies the BootstrapClientTreeView control that raised the event.
    * @param e An BootstrapClientTreeViewNodeCancelEventArgs object that contains event data.
    */
  type BootstrapClientTreeViewNodeCancelEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ BootstrapClientTreeViewNodeCancelEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientTreeView.NodeClick event.
    * @param source An object representing the event source. Identifies the BootstrapClientTreeView control that raised the event.
    * @param e An BootstrapClientTreeViewNodeClickEventArgs object that contains event data.
    */
  type BootstrapClientTreeViewNodeClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ BootstrapClientTreeViewNodeClickEventArgs, Unit]
  /**
    * A method that will handle the Tree View control's client events, concerning manipulations with a node.
    * @param source An object representing the event source. Identifies the BootstrapClientTreeView control that raised the event.
    * @param e An BootstrapClientTreeViewNodeEventArgs object that contains event data.
    */
  type BootstrapClientTreeViewNodeEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ BootstrapClientTreeViewNodeEventArgs, Unit]
  /**
    * A method that will handle the client events concerned with node processing.
    * @param source An object representing the event source. Identifies the BootstrapClientTreeView control that raised the event.
    * @param e An BootstrapClientTreeViewNodeProcessingModeEventArgs object that contains event data.
    */
  type BootstrapClientTreeViewNodeProcessingModeEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ BootstrapClientTreeViewNodeProcessingModeEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the BootstrapUIWidgetBase.Disposing event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetEventArgsBase object that contains event data.
    */
  type BootstrapUIWidgetDisposingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the BootstrapUIWidgetBase.Drawn event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetEventArgsBase object that contains event data.
    */
  type BootstrapUIWidgetDrawnEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the BootstrapUIWidgetBase.IncidentOccurred event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetErrorEventArgs object that contains event data.
    */
  type BootstrapUIWidgetErrorEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the BootstrapUIWidgetBase.Exported event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetEventArgsBase object that contains event data.
    */
  type BootstrapUIWidgetExportedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the BootstrapUIWidgetBase.Exporting event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetExportEventArgs object that contains event data.
    */
  type BootstrapUIWidgetExportingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the BootstrapUIWidgetBase.FileSaving event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetExportEventArgs object that contains event data.
    */
  type BootstrapUIWidgetFileSavingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the BootstrapUIWidgetBase.Init event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetEventArgsBase object that contains event data.
    */
  type BootstrapUIWidgetInitializedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the BootstrapUIWidgetBase.OptionChanged event.
    * @param source The event source.
    * @param e A BootstrapUIWidgetOptionChangedEventArgs object that contains event data.
    */
  type BootstrapUIWidgetOptionChangedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ js.Any, Unit]
  /**
    * A method that will handle the ASPxClientScheduler.CellClick event.
    * @param source The event source.
    * @param e A ASPxClientSchedulerCellClickEventArgs object that contains event data
    */
  type CellClickEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientSchedulerCellClickEventArgs, Unit]
  /**
    * A method that will handle the MVCxClientReportViewer.BeforeExportRequest event.
    * @param source An object which is the event source. Identifies the client object that raised the event.
    * @param e A MVCxClientBeforeExportRequestEventArgs object that contains event data.
    */
  type MVCxClientBeforeExportRequestEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ MVCxClientBeforeExportRequestEventArgs, Unit]
  /**
    * A method that will handle client BeginCallback events.
    * @param source An object which is the event source. Identifies the client object that raised the event.
    * @param e A MVCxClientBeginCallbackEventArgs object that contains event data.
    */
  type MVCxClientBeginCallbackEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ MVCxClientBeginCallbackEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientGlobalEvents.BeginCallback event.
    * @param source An object which is the event source. Identifies the client object that raised the event.
    * @param e A MVCxClientGlobalBeginCallbackEventArgs object that contains event data.
    */
  type MVCxClientGlobalBeginCallbackEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ MVCxClientGlobalBeginCallbackEventArgs, Unit]
  /**
    * A method that will handle the MVCxClientQueryBuilder.SaveCommandExecuted event.
    * @param source An object which is the event source. Identifies the client object that raised the event.
    * @param e A MVCxClientQueryBuilderSaveCommandExecutedEventArgs object that contains event data.
    */
  type MVCxClientQueryBuilderSaveCommandExecutedEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ MVCxClientQueryBuilderSaveCommandExecutedEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the MVCxReportDesignerClientSideEvents.SaveCommandExecuted event.
    * @param source An object which is the event source. Identifies the client object that raised the event.
    * @param e A MVCxClientBeforeExportRequestEventArgs object that contains event data.
    */
  type MVCxClientReportDesignerSaveCommandExecutedEventHandler[Sender] = js.Function2[
    /* source */ Sender, 
    /* e */ MVCxClientReportDesignerSaveCommandExecutedEventArgs, 
    Unit
  ]
  /**
    * A method that will handle the MVCxSchedulerClientSideEvents.ToolTipDisplaying event.
    * @param source An object which is the event source. Identifies the client object that raised the event.
    * @param e A MVCxClientSchedulerToolTipDisplayingEventArgs object that contains the related arguments.
    */
  type MVCxClientSchedulerToolTipDisplayingEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ MVCxClientSchedulerToolTipDisplayingEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientScheduler.MenuItemClicked event.
    * @param source The ASPxClientScheduler control which fires the event.
    * @param e A MenuItemClickedEventArgs object that contains event data.
    */
  type MenuItemClickedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ MenuItemClickedEventArgs, Unit]
  /**
    * A method that will handle ASPxClientScheduler.MoreButtonClicked event.
    * @param source The ASPxClientScheduler control which fires the event.
    * @param e A MoreButtonClickedEventArgs object that contains event data.
    */
  type MoreButtonClickedEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ MoreButtonClickedEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientSchedulerStorageControl.ReminderAlert event.
    * @param source The event source.
    * @param e An ASPxClientSchedulerStorageControl object that contains event data.
    */
  type ReminderAlertEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ASPxClientSchedulerStorageReminderAlertEventArgs, Unit]
  /**
    * A method that will handle the ASPxClientScheduler.Shortcut event.
    * @param source The event sender (typically an ASPxClientScheduler control).
    * @param e A ShortcutEventArgs object that contains event data.
    */
  type ShortcutEventHandler[Sender] = js.Function2[/* source */ Sender, /* e */ ShortcutEventArgs, Unit]
}
