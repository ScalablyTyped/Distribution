package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object devexpressDashWebLib {
  type ANCxClientBeginCallbackEventHandler[S] = js.Function2[/* source */ S, /* e */ ANCxClientBeginCallbackEventArgs, scala.Unit]
  /**
   * References a method that will handle the ActionAvailabilityChanged event.
   */
  type ASPxClientActionAvailabilityChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientActionAvailabilityChangedEventArgs, scala.Unit]
  /**
   * Represents an object that will handle the client-side AfterCheck event.
   */
  type ASPxClientAfterCheckEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientSpellCheckerAfterCheckEventArgs, scala.Unit]
  /**
   * Represents the client-side equivalent of the Annotation class.
   */
  type ASPxClientAnnotation = ASPxClientWebChartElementNamed
  type ASPxClientAppointmentDeletingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientAppointmentDeletingEventArgs, scala.Unit]
  /**
   * A method that will handle the client AppointmentToolTipShowing event.
   */
  type ASPxClientAppointmentToolTipShowingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientAppointmentToolTipShowingEventArgs, scala.Unit]
  /**
   * Represents the client-side equivalent of the Axis3D class.
   */
  type ASPxClientAxis3D = ASPxClientAxisBase
  /**
   * Represents an object that will handle the client-side BeforeCheck event.
   */
  type ASPxClientBeforeCheckEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientSpellCheckerBeforeCheckEventArgs, scala.Unit]
  /**
   * A method that will handle the client events related to the begining of a callback processing round trip.
   */
  type ASPxClientBeginCallbackEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientBeginCallbackEventArgs, scala.Unit]
  /**
   * A method that will handle the client Click event.
   */
  type ASPxClientButtonClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientButtonClickEventArgs, scala.Unit]
  /**
   * Represents the client-side equivalent of the ASPxButtonEdit control.
   */
  type ASPxClientButtonEdit = ASPxClientButtonEditBase
  type ASPxClientButtonEditBaseStatic = ASPxClientTextBoxBaseStatic
  /**
   * A method that will handle the ButtonClick event.
   */
  type ASPxClientButtonEditClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientButtonEditClickEventArgs, scala.Unit]
  type ASPxClientCalendarCellClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCalendarCellClickEventArgs, scala.Unit]
  /**
   * A method that will handle the client CustomDisabledDate event.
   */
  type ASPxClientCalendarCustomDisabledDateEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCalendarCustomDisabledDateEventArgs, scala.Unit]
  /**
   * A method that will handle the client events related to completion of callback server-side processing.
   */
  type ASPxClientCallbackCompleteEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCallbackCompleteEventArgs, scala.Unit]
  /**
   * A method that will handle client events related to server-side errors that occured during callback processing.
   */
  type ASPxClientCallbackErrorEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCallbackErrorEventArgs, scala.Unit]
  /**
   * A method that will handle the cancelable events of a web control's client-side equivalent.
   */
  type ASPxClientCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCancelEventArgs, scala.Unit]
  /**
   * A method that will handle the BatchEditCardDeleting event.
   */
  type ASPxClientCardViewBatchEditCardDeletingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCardViewBatchEditCardDeletingEventArgs, scala.Unit]
  /**
   * A method that will handle the BatchEditCardInserting event.
   */
  type ASPxClientCardViewBatchEditCardInsertingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientCardViewBatchEditCardInsertingEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the BatchEditCardRecovering event.
   */
  type ASPxClientCardViewBatchEditCardRecoveringEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientCardViewBatchEditCardRecoveringEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the client BatchEditCardValidating event.
   */
  type ASPxClientCardViewBatchEditCardValidatingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientCardViewBatchEditCardValidatingEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the BatchEditChangesCanceling event.
   */
  type ASPxClientCardViewBatchEditChangesCancelingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientCardViewBatchEditChangesCancelingEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the BatchEditChangesSaving event.
   */
  type ASPxClientCardViewBatchEditChangesSavingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientCardViewBatchEditChangesSavingEventArgs, 
    scala.Unit
  ]
  /**
   * Represents an object that will handle the client-side BatchEditConfirmShowing event.
   */
  type ASPxClientCardViewBatchEditConfirmShowingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientCardViewBatchEditConfirmShowingEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the client BatchEditEndEditing event.
   */
  type ASPxClientCardViewBatchEditEndEditingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCardViewBatchEditEndEditingEventArgs, scala.Unit]
  /**
   * A method that will handle the client BatchEditStartEditing event.
   */
  type ASPxClientCardViewBatchEditStartEditingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCardViewBatchEditStartEditingEventArgs, scala.Unit]
  /**
   * A method that will handle the client BatchEditTemplateCellFocused event.
   */
  type ASPxClientCardViewBatchEditTemplateCellFocusedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the CardClick event.
   */
  type ASPxClientCardViewCardClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCardViewCardClickEventArgs, scala.Unit]
  /**
   * A method that will handle the client CardFocusing event.
   */
  type ASPxClientCardViewCardFocusingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCardViewCardFocusingEventArgs, scala.Unit]
  /**
   * A method that will handle the cancelable events of a client ASPxCardView column.
   */
  type ASPxClientCardViewColumnCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCardViewColumnCancelEventArgs, scala.Unit]
  /**
   * A method that will handle the CustomButtonClick event.
   */
  type ASPxClientCardViewCustomButtonEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCardViewCustomButtonEventArgs, scala.Unit]
  /**
   * Lists values that specify the document formats available for export from the grid.
   */
  type ASPxClientCardViewExportFormat = ASPxClientGridExportFormat
  type ASPxClientCardViewExportFormatStatic = ASPxClientGridExportFormatStatic
  /**
   * A method that will handle the client FocusedCardChanged event.
   */
  type ASPxClientCardViewFocusEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCardViewFocusEventArgs, scala.Unit]
  /**
   * A method that will handle the FocusedCellChanging event.
   */
  type ASPxClientCardViewFocusedCellChangingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCardViewFocusedCellChangingEventArgs, scala.Unit]
  type ASPxClientCardViewGroupCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCardViewGroupCancelEventArgs, scala.Unit]
  /**
   * A method that will handle the SelectionChanged event.
   */
  type ASPxClientCardViewSelectionEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCardViewSelectionEventArgs, scala.Unit]
  /**
   * Represents a JavaScript function which receives the list of card values when the client GetSelectedFieldValues method is called.
   */
  type ASPxClientCardViewValuesCallback = js.Function1[/* result */ js.Object, scala.Unit]
  /**
   * Represents a method that will handle the CustomizeMenuActions events.
   */
  type ASPxClientChartDesignerCustomizeMenuActionsEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientChartDesignerCustomizeMenuActionsEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the SaveCommandExecute  event.
   */
  type ASPxClientChartDesignerSaveCommandExecuteEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientChartDesignerSaveCommandExecuteEventArgs, 
    scala.Unit
  ]
  /**
   * Represents the client-side equivalent of the ChartTitle class.
   */
  type ASPxClientChartTitle = ASPxClientTitleBase
  type ASPxClientCheckListBaseStatic = ASPxClientListEditStatic
  /**
   * A method that will handle the CellDblClick event.
   */
  type ASPxClientClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientClickEventArgs, scala.Unit]
  /**
   * A method that will handle client events involving manipulations with the control's items.
   */
  type ASPxClientCloudControlItemEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCloudControlItemEventArgs, scala.Unit]
  /**
   * Represents a JavaScript function which receives the action to perform for a control when the client ForEachControl method is called.
   */
  type ASPxClientControlAction = js.Function1[/* control */ js.Object, scala.Unit]
  /**
   * A JavaScript function which returns a value specifying whether an object meets the criteria defined within the method specified by this delegate.
   */
  type ASPxClientControlPredicate = js.Function1[/* control */ js.Object, scala.Boolean]
  /**
   * A method that will handle the client ControlsInitialized event.
   */
  type ASPxClientControlsInitializedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientControlsInitializedEventArgs, scala.Unit]
  /**
   * The client-side equivalent of the CrosshairMousePosition class.
   */
  type ASPxClientCrosshairMousePosition = ASPxClientCrosshairPosition
  /**
   * A method that will handle a CustomCallback client event exposed by some DevExpress web controls.
   */
  type ASPxClientCustomDataCallbackEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCustomDataCallbackEventArgs, scala.Unit]
  type ASPxClientDailyRecurrenceControlStatic = ASPxClientRecurrenceControlBaseStatic
  /**
   * References a method that will handle the ActionAvailabilityChanged event.
   */
  type ASPxClientDashboardActionAvailabilityChangedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientDashboardActionAvailabilityChangedEventArgs, 
    scala.Unit
  ]
  /**
   * References a method that will handle the BeforeRender event.
   */
  type ASPxClientDashboardBeforeRenderEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientEventArgs, scala.Unit]
  /**
   * References a method that will handle the DashboardBeginUpdate event.
   */
  type ASPxClientDashboardBeginUpdateEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDashboardBeginUpdateEventArgs, scala.Unit]
  /**
   * References a method that will handle the DashboardChanged event.
   */
  type ASPxClientDashboardChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDashboardChangedEventArgs, scala.Unit]
  /**
   * References a method that will handle the DataLoadingError event.
   */
  type ASPxClientDashboardDataLoadingErrorEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDashboardDataLoadingErrorEventArgs, scala.Unit]
  /**
   * References a method that will handle the DrillDownPerformed event.
   */
  type ASPxClientDashboardDrillDownPerformedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDashboardDrillDownPerformedEventArgs, scala.Unit]
  /**
   * References a method that will handle the DrillUpPerformed event.
   */
  type ASPxClientDashboardDrillUpPerformedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDashboardDrillUpPerformedEventArgs, scala.Unit]
  /**
   * References a method that will handle the DashboardEndUpdate event.
   */
  type ASPxClientDashboardEndUpdateEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDashboardEndUpdateEventArgs, scala.Unit]
  type ASPxClientDashboardInitializedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDashboardInitializedEventArgs, scala.Unit]
  type ASPxClientDashboardItemBeforeWidgetDisposedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDashboardItemWidgetEventArgs, scala.Unit]
  /**
   * References a method that will handle the ItemCaptionToolbarUpdated event.
   */
  type ASPxClientDashboardItemCaptionToolbarUpdatedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientDashboardItemCaptionToolbarUpdatedEventArgs, 
    scala.Unit
  ]
  /**
   * References a method that will handle the ItemClick events.
   */
  type ASPxClientDashboardItemClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDashboardItemClickEventArgs, scala.Unit]
  /**
   * References a method that will handle the ItemDrillDownStateChanged event.
   */
  type ASPxClientDashboardItemDrillDownStateChangedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientDashboardItemDrillDownStateChangedEventArgs, 
    scala.Unit
  ]
  /**
   * References a method that will handle the ItemElementCustomColor event.
   */
  type ASPxClientDashboardItemElementCustomColorEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientDashboardItemElementCustomColorEventArgs, 
    scala.Unit
  ]
  /**
   * References a method that will handle the ItemMasterFilterStateChanged event.
   */
  type ASPxClientDashboardItemMasterFilterStateChangedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientDashboardItemMasterFilterStateChangedEventArgs, 
    scala.Unit
  ]
  /**
   * References a method executed after an asynchronous request is complete.
   */
  type ASPxClientDashboardItemRequestUnderlyingDataCompleted = js.Function1[/* data */ ASPxClientDashboardItemUnderlyingData, scala.Unit]
  /**
   * References a method that will handle the ItemSelectionChanged events.
   */
  type ASPxClientDashboardItemSelectionChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDashboardItemSelectionChangedEventArgs, scala.Unit]
  /**
   * References a method that will handle the ItemVisualInteractivity events.
   */
  type ASPxClientDashboardItemVisualInteractivityEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientDashboardItemVisualInteractivityEventArgs, 
    scala.Unit
  ]
  /**
   * References a method that will handle the ItemWidgetCreated events.
   */
  type ASPxClientDashboardItemWidgetCreatedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDashboardItemWidgetEventArgs, scala.Unit]
  /**
   * References a method that will handle the ItemWidgetUpdated event.
   */
  type ASPxClientDashboardItemWidgetUpdatedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDashboardItemWidgetEventArgs, scala.Unit]
  /**
   * References a method that will handle the ItemWidgetUpdating event.
   */
  type ASPxClientDashboardItemWidgetUpdatingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDashboardItemWidgetEventArgs, scala.Unit]
  /**
   * References a method that will handle the MasterFilterCleared event.
   */
  type ASPxClientDashboardMasterFilterClearedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDashboardMasterFilterClearedEventArgs, scala.Unit]
  /**
   * References a method that will handle the MasterFilterSet event.
   */
  type ASPxClientDashboardMasterFilterSetEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDashboardMasterFilterSetEventArgs, scala.Unit]
  /**
   * References a method that will handle the DashboardStateChanged event.
   */
  type ASPxClientDashboardStateChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDashboardStateChangedEventArgs, scala.Unit]
  type ASPxClientDashboardStatic = ASPxClientControlStatic
  /**
   * References a method that will handle the DashboardTitleToolbarUpdated event.
   */
  type ASPxClientDashboardTitleToolbarUpdatedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDashboardTitleToolbarUpdatedEventArgs, scala.Unit]
  /**
   * Represents a JavaScript function which receives callback data obtained via a call to a specific client method (such as the PerformDataCallback).
   */
  type ASPxClientDataCallback = js.Function2[/* sender */ js.Object, /* result */ java.lang.String, scala.Unit]
  /**
   * Represents the client-side equivalent of the DataSourceBasedErrorBars class.
   */
  type ASPxClientDataSourceBasedErrorBars = ASPxClientIndicator
  type ASPxClientDateNavigatorDayCellCustomHighlightEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientDateNavigatorDayCellCustomHighlightEventArgs, 
    scala.Unit
  ]
  type ASPxClientDateNavigatorSelectionChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDateNavigatorSelectionChangedEventArgs, scala.Unit]
  type ASPxClientDateNavigatorStatic = ASPxClientControlStatic
  type ASPxClientDateNavigatorVisibleMonthChangedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientDateNavigatorVisibleMonthChangedEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the client BeforeDock event.
   */
  type ASPxClientDockManagerCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDockManagerCancelEventArgs, scala.Unit]
  /**
   * A method that will handle client-side events concerning manipulations with panels.
   */
  type ASPxClientDockManagerEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDockManagerEventArgs, scala.Unit]
  /**
   * A method that will handle the client BeforeDock event.
   */
  type ASPxClientDockManagerProcessingModeCancelEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientDockManagerProcessingModeCancelEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the client AfterDock event.
   */
  type ASPxClientDockManagerProcessingModeEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDockManagerProcessingModeEventArgs, scala.Unit]
  /**
   * A method that will handle the client BeforeDock event.
   */
  type ASPxClientDockPanelProcessingModeCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDockPanelProcessingModeCancelEventArgs, scala.Unit]
  /**
   * A method that will handle the client BeforeDock event.
   */
  type ASPxClientDockPanelProcessingModeEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDockPanelProcessingModeEventArgs, scala.Unit]
  /**
   * A method that will handle the client BeforeDock event.
   */
  type ASPxClientDockZoneCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDockZoneCancelEventArgs, scala.Unit]
  /**
   * A method that will handle the client AfterDock event.
   */
  type ASPxClientDockZoneProcessingModeEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDockZoneProcessingModeEventArgs, scala.Unit]
  /**
   * A JavaScript function which returns a value specifying whether an object meets the criteria defined within the method specified by this delegate.
   */
  type ASPxClientDockingFilterPredicate = js.Function1[/* item */ js.Object, scala.Boolean]
  type ASPxClientDropDownCommandEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDropDownCommandEventArgs, scala.Unit]
  type ASPxClientDropDownEditBaseStatic = ASPxClientButtonEditBaseStatic
  /**
   * References a method that will handle the DynamicLookUpValuesLoaded event.
   */
  type ASPxClientDynamicLookUpValuesLoadedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientDynamicLookUpValuesLoadedEventArgs, scala.Unit]
  type ASPxClientEditBaseStatic = ASPxClientControlStatic
  /**
   * A method that will handle client-side events which concern clicking within editors.
   */
  type ASPxClientEditEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientEditClickEventArgs, scala.Unit]
  /**
   * A method that will handle the client events involving a keyboard key being pressed or released.
   */
  type ASPxClientEditKeyEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientEditKeyEventArgs, scala.Unit]
  /**
   * A method that will handle client validation events.
   */
  type ASPxClientEditValidationEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientEditValidationEventArgs, scala.Unit]
  /**
   * Provides data for client events related to the completion of a callback processing round trip.
   */
  type ASPxClientEndCallbackEventArgs = ASPxClientEventArgs
  /**
   * A method that will handle the client events related to the completion of a callback processing round trip.
   */
  type ASPxClientEndCallbackEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientEndCallbackEventArgs, scala.Unit]
  /**
   * A method that will handle the client-side events of a web control's client-side equivalent.
   */
  type ASPxClientEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientEventArgs, scala.Unit]
  /**
   * The client-side equivalent of the ExponentialMovingAverage class.
   */
  type ASPxClientExponentialMovingAverage = ASPxClientMovingAverage
  /**
   * Represents the client-side equivalent of the FibonacciIndicator class.
   */
  type ASPxClientFibonacciIndicator = ASPxClientFinancialIndicator
  /**
   * A JavaScript function which receives callback data obtained by a call to the client GetAllItems method.
   */
  type ASPxClientFileManagerAllItemsCallback = js.Function1[/* items */ js.Array[ASPxClientFileManagerItem], scala.Unit]
  /**
   * A JavaScript function which receives callback data obtained via a call to the client SetCurrentFolderPath method.
   */
  type ASPxClientFileManagerCallback = js.Function1[/* result */ js.Object, scala.Unit]
  /**
   * A method that will handle the client CurrentFolderChanged event.
   */
  type ASPxClientFileManagerCurrentFolderChangedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientFileManagerCurrentFolderChangedEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the CustomCommand event.
   */
  type ASPxClientFileManagerCustomCommandEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerCustomCommandEventArgs, scala.Unit]
  /**
   * A method that will handle the client ErrorAlertDisplaying event.
   */
  type ASPxClientFileManagerErrorAlertDisplayingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientFileManagerErrorAlertDisplayingEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the client ErrorOccurred event.
   */
  type ASPxClientFileManagerErrorEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerErrorEventArgs, scala.Unit]
  /**
   * A method that will handle the client FileDownloading event.
   */
  type ASPxClientFileManagerFileDownloadingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerFileDownloadingEventArgs, scala.Unit]
  /**
   * A method that will handle the client SelectedFileOpened events.
   */
  type ASPxClientFileManagerFileEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerFileEventArgs, scala.Unit]
  /**
   * A method that will handle the client SelectedFileOpened event.
   */
  type ASPxClientFileManagerFileOpenedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerFileOpenedEventArgs, scala.Unit]
  /**
   * A method that will handle the client FileUploaded event.
   */
  type ASPxClientFileManagerFileUploadedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerFileUploadedEventArgs, scala.Unit]
  /**
   * A method that will handle the client FileUploading event.
   */
  type ASPxClientFileManagerFileUploadingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerFileUploadingEventArgs, scala.Unit]
  /**
   * A method that will handle the client FilesUploaded event.
   */
  type ASPxClientFileManagerFilesUploadedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerFilesUploadedEventArgs, scala.Unit]
  /**
   * A method that will handle the client FilesUploading event.
   */
  type ASPxClientFileManagerFilesUploadingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerFilesUploadingEventArgs, scala.Unit]
  /**
   * A method that will handle the client FocusedItemChanged event.
   */
  type ASPxClientFileManagerFocusedItemChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerFocusedItemChangedEventArgs, scala.Unit]
  /**
   * A method that will handle the client HighlightItemTemplate event.
   */
  type ASPxClientFileManagerHighlightItemTemplateEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientFileManagerHighlightItemTemplateEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the client ItemCopied event.
   */
  type ASPxClientFileManagerItemCopiedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerItemCopiedEventArgs, scala.Unit]
  /**
   * Provides data for the FolderCreated event.
   */
  type ASPxClientFileManagerItemCreatedEventArgs = ASPxClientFileManagerActionEventArgsBase
  /**
   * A method that will handle the client FolderCreated event.
   */
  type ASPxClientFileManagerItemCreatedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerItemCreatedEventArgs, scala.Unit]
  /**
   * Provides data for the ItemDeleted event.
   */
  type ASPxClientFileManagerItemDeletedEventArgs = ASPxClientFileManagerActionEventArgsBase
  /**
   * A method that will handle the client ItemDeleted event.
   */
  type ASPxClientFileManagerItemDeletedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerItemDeletedEventArgs, scala.Unit]
  /**
   * A method that will handle the client ItemRenaming events.
   */
  type ASPxClientFileManagerItemEditingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerItemEditingEventArgs, scala.Unit]
  /**
   * A method that will handle the client ItemMoved event.
   */
  type ASPxClientFileManagerItemMovedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerItemMovedEventArgs, scala.Unit]
  /**
   * A method that will handle the client ItemRenamed event.
   */
  type ASPxClientFileManagerItemRenamedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerItemRenamedEventArgs, scala.Unit]
  /**
   * A method that will handle the client ItemsCopied event.
   */
  type ASPxClientFileManagerItemsCopiedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerItemsCopiedEventArgs, scala.Unit]
  /**
   * A method that will handle the client ItemsDeleted event.
   */
  type ASPxClientFileManagerItemsDeletedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerItemsDeletedEventArgs, scala.Unit]
  /**
   * A method that will handle the client ItemsMoved event.
   */
  type ASPxClientFileManagerItemsMovedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerItemsMovedEventArgs, scala.Unit]
  /**
   * A method that will handle the client SelectionChanged event.
   */
  type ASPxClientFileManagerSelectionChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerSelectionChangedEventArgs, scala.Unit]
  /**
   * A method that will handle the ToolbarUpdating event.
   */
  type ASPxClientFileManagerToolbarUpdatingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFileManagerToolbarUpdatingEventArgs, scala.Unit]
  /**
   * A method that will handle the Applied event.
   */
  type ASPxClientFilterAppliedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFilterAppliedEventArgs, scala.Unit]
  /**
   * A method that will handle the FlashScriptCommand event.
   */
  type ASPxClientFlashScriptCommandEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientFlashScriptCommandEventArgs, scala.Unit]
  type ASPxClientFloatingActionButtonActionCollapsingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientFloatingActionButtonActionCollapsingEventArgs, 
    scala.Unit
  ]
  type ASPxClientFloatingActionButtonActionExpandingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientFloatingActionButtonActionExpandingEventArgs, 
    scala.Unit
  ]
  type ASPxClientFloatingActionButtonActionItemClickEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientFloatingActionButtonActionItemClickEventArgs, 
    scala.Unit
  ]
  type ASPxClientFloatingActionButtonContextChangingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientFloatingActionButtonContextChangingEventArgs, 
    scala.Unit
  ]
  type ASPxClientFloatingActionButtonStatic = ASPxClientControlStatic
  /**
   * A method that will handle the BeginCallback event.
   */
  type ASPxClientGlobalBeginCallbackEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGlobalBeginCallbackEventArgs, scala.Unit]
  /**
   * A method that will handle the CallbackError event.
   */
  type ASPxClientGlobalCallbackErrorEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGlobalCallbackErrorEventArgs, scala.Unit]
  /**
   * A method that will handle the EndCallback event.
   */
  type ASPxClientGlobalEndCallbackEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGlobalEndCallbackEventArgs, scala.Unit]
  type ASPxClientGridBaseStatic = ASPxClientControlStatic
  /**
   * A method that will handle the ToolbarItemClick event.
   */
  type ASPxClientGridToolbarItemClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGridToolbarItemClickEventArgs, scala.Unit]
  /**
   * A method that will handle the BatchEditChangesCanceling event.
   */
  type ASPxClientGridViewBatchEditChangesCancelingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientGridViewBatchEditChangesCancelingEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the BatchEditChangesSaving event.
   */
  type ASPxClientGridViewBatchEditChangesSavingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientGridViewBatchEditChangesSavingEventArgs, 
    scala.Unit
  ]
  /**
   * Represents an object that will handle the client-side BatchEditConfirmShowing event.
   */
  type ASPxClientGridViewBatchEditConfirmShowingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientGridViewBatchEditConfirmShowingEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the client BatchEditEndEditing event.
   */
  type ASPxClientGridViewBatchEditEndEditingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGridViewBatchEditEndEditingEventArgs, scala.Unit]
  /**
   * A method that will handle the BatchEditRowDeleting event.
   */
  type ASPxClientGridViewBatchEditRowDeletingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGridViewBatchEditRowDeletingEventArgs, scala.Unit]
  /**
   * A method that will handle the BatchEditRowInserting event.
   */
  type ASPxClientGridViewBatchEditRowInsertingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGridViewBatchEditRowInsertingEventArgs, scala.Unit]
  /**
   * A method that will handle the BatchEditRowRecovering event.
   */
  type ASPxClientGridViewBatchEditRowRecoveringEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientGridViewBatchEditRowRecoveringEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the client BatchEditRowValidating event.
   */
  type ASPxClientGridViewBatchEditRowValidatingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientGridViewBatchEditRowValidatingEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the client BatchEditStartEditing event.
   */
  type ASPxClientGridViewBatchEditStartEditingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGridViewBatchEditStartEditingEventArgs, scala.Unit]
  /**
   * A method that will handle the client BatchEditTemplateCellFocused event.
   */
  type ASPxClientGridViewBatchEditTemplateCellFocusedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the cancelable events of a client ASPxGridView column.
   */
  type ASPxClientGridViewColumnCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGridViewColumnCancelEventArgs, scala.Unit]
  /**
   * A method that will handle the ColumnMoving event.
   */
  type ASPxClientGridViewColumnMovingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGridViewColumnMovingEventArgs, scala.Unit]
  /**
   * A method that will handle the client events concerned with column processing.
   */
  type ASPxClientGridViewColumnProcessingModeEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGridViewColumnProcessingModeEventArgs, scala.Unit]
  /**
   * A method that will handle the ContextMenu event.
   */
  type ASPxClientGridViewContextMenuEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGridViewContextMenuEventArgs, scala.Unit]
  /**
   * A method that will handle the client ContextMenuItemClick event.
   */
  type ASPxClientGridViewContextMenuItemClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGridViewContextMenuItemClickEventArgs, scala.Unit]
  /**
   * A method that will handle the CustomButtonClick event.
   */
  type ASPxClientGridViewCustomButtonEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGridViewCustomButtonEventArgs, scala.Unit]
  /**
   * Lists values that specify the document formats available for export from the grid.
   */
  type ASPxClientGridViewExportFormat = ASPxClientGridExportFormat
  type ASPxClientGridViewExportFormatStatic = ASPxClientGridExportFormatStatic
  /**
   * A method that will handle the client FocusedRowChanged event.
   */
  type ASPxClientGridViewFocusEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGridViewFocusEventArgs, scala.Unit]
  /**
   * A method that will handle the FocusedCellChanging event.
   */
  type ASPxClientGridViewFocusedCellChangingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGridViewFocusedCellChangingEventArgs, scala.Unit]
  /**
   * A method that will handle the RowExpanding events.
   */
  type ASPxClientGridViewRowCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGridViewRowCancelEventArgs, scala.Unit]
  /**
   * A method that will handle the RowClick events.
   */
  type ASPxClientGridViewRowClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGridViewRowClickEventArgs, scala.Unit]
  /**
   * A method that will handle the client RowFocusing event.
   */
  type ASPxClientGridViewRowFocusingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGridViewRowFocusingEventArgs, scala.Unit]
  /**
   * A method that will handle the SelectionChanged event.
   */
  type ASPxClientGridViewSelectionEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientGridViewSelectionEventArgs, scala.Unit]
  /**
   * Represents a JavaScript function which receives the list of row values when the client GetSelectedFieldValues method is called.
   */
  type ASPxClientGridViewValuesCallback = js.Function1[/* result */ js.Object, scala.Unit]
  /**
   * A method that will handle the Hiding event.
   */
  type ASPxClientHintHidingEventHandler = js.Function2[/* sender */ ASPxClientHintWindow, /* e */ ASPxClientHintHidingEventArgs, scala.Unit]
  /**
   * A method that will handle the Showing event.
   */
  type ASPxClientHintShowingEventHandler = js.Function2[
    /* sender */ ASPxClientHintWindow, 
    /* e */ ASPxClientHintShowingEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the BeforePaste event.
   */
  type ASPxClientHtmlEditorBeforePasteEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientHtmlEditorBeforePasteEventArgs, scala.Unit]
  /**
   * Contains settings related to the CHANGEAUDIO_COMMAND command parameter.
   */
  type ASPxClientHtmlEditorChangeAudioCommandArguments = ASPxClientHtmlEditorInsertAudioCommandArguments
  /**
   * Contains settings related to the CHANGEFLASH_COMMAND command parameter.
   */
  type ASPxClientHtmlEditorChangeFlashCommandArguments = ASPxClientHtmlEditorInsertFlashCommandArguments
  /**
   * Contains settings related to the CHANGEIMAGE_COMMAND command parameter.
   */
  type ASPxClientHtmlEditorChangeImageCommandArguments = ASPxClientHtmlEditorInsertImageCommandArguments
  /**
   * Contains settings related to the CHANGEVIDEO_COMMAND command parameter.
   */
  type ASPxClientHtmlEditorChangeVideoCommandArguments = ASPxClientHtmlEditorInsertVideoCommandArguments
  /**
   * Contains settings related to the CHANGEYOUTUBEVIDEO_COMMAND command parameter.
   */
  type ASPxClientHtmlEditorChangeYouTubeVideoCommandArguments = ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments
  /**
   * A method that will handle the client events related to command processing.
   */
  type ASPxClientHtmlEditorCommandEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientHtmlEditorCommandEventArgs, scala.Unit]
  /**
   * A method that will handle the CommandExecuting event.
   */
  type ASPxClientHtmlEditorCommandExecutingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientHtmlEditorCommandExecutingEventArgs, scala.Unit]
  /**
   * A method that will handle the CustomDialogClosed client event.
   */
  type ASPxClientHtmlEditorCustomDialogClosedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientHtmlEditorCustomDialogClosedEventArgs, scala.Unit]
  /**
   * A method that will handle the CustomDialogClosing client event.
   */
  type ASPxClientHtmlEditorCustomDialogClosingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientHtmlEditorCustomDialogClosingEventArgs, scala.Unit]
  /**
   * A method that will handle the client events that relate to custom dialog operations.
   */
  type ASPxClientHtmlEditorCustomDialogEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientHtmlEditorCustomDialogEventArgs, scala.Unit]
  /**
   * Provides data for the DialogClosed event.
   */
  type ASPxClientHtmlEditorDialogClosedEventArgs = ASPxClientHtmlEditorDialogCloseEventArgs
  /**
   * A method that will handle the DialogClosed event.
   */
  type ASPxClientHtmlEditorDialogClosedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientHtmlEditorDialogClosedEventArgs, scala.Unit]
  /**
   * A method that will handle the DialogClosing event.
   */
  type ASPxClientHtmlEditorDialogClosingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientHtmlEditorDialogClosingEventArgs, scala.Unit]
  /**
   * A method that will handle the DialogInitialized client event.
   */
  type ASPxClientHtmlEditorDialogInitializedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientHtmlEditorDialogInitializedEventArgs, scala.Unit]
  /**
   * Contains settings related to the INSERTAUDIO_COMMAND command parameter.
   */
  type ASPxClientHtmlEditorInsertAudioCommandArguments = ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments
  /**
   * A method that will handle the ActiveTabChanging event.
   */
  type ASPxClientHtmlEditorTabCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientHtmlEditorTabCancelEventArgs, scala.Unit]
  /**
   * A method that will handle the ActiveTabChanged event.
   */
  type ASPxClientHtmlEditorTabEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientHtmlEditorTabEventArgs, scala.Unit]
  /**
   * A method that will handle the Validation client event.
   */
  type ASPxClientHtmlEditorValidationEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientHtmlEditorValidationEventArgs, scala.Unit]
  /**
   * Represents the client-side equivalent of the ImageAnnotation class.
   */
  type ASPxClientImageAnnotation = ASPxClientAnnotation
  type ASPxClientImageBaseStatic = ASPxClientStaticEditStatic
  /**
   * A method that will handle the client FullscreenViewerShowing event.
   */
  type ASPxClientImageGalleryCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientImageGalleryCancelEventArgs, scala.Unit]
  /**
   * A method that will handle the client FullscreenViewerActiveItemIndexChanged event.
   */
  type ASPxClientImageGalleryFullscreenViewerEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientImageGalleryFullscreenViewerEventArgs, scala.Unit]
  /**
   * A method that will handle the ItemClick events.
   */
  type ASPxClientImageSliderItemEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientImageSliderItemEventArgs, scala.Unit]
  /**
   * The client-side equivalent of the ASPxImageZoomNavigator object.
   */
  type ASPxClientImageZoomNavigator = ASPxClientImageSlider
  type ASPxClientImageZoomNavigatorStatic = ASPxClientImageSliderStatic
  type ASPxClientImageZoomStatic = ASPxClientControlStatic
  /**
   * References a method that will handle the ItemBeginUpdate event.
   */
  type ASPxClientItemBeginUpdateEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientItemBeginUpdateEventArgs, scala.Unit]
  /**
   * References a method that will handle the ItemEndUpdate event.
   */
  type ASPxClientItemEndUpdateEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientItemEndUpdateEventArgs, scala.Unit]
  /**
   * A method that will handle the CustomHighlighting events.
   */
  type ASPxClientListEditCustomHighlightingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientListEditCustomHighlightingEventArgs, scala.Unit]
  /**
   * A method that will handle the ItemFiltering events.
   */
  type ASPxClientListEditItemFilteringEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientListEditItemFilteringEventArgs, scala.Unit]
  /**
   * A method that will handle the SelectedIndexChanged event.
   */
  type ASPxClientListEditItemSelectedChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientListEditItemSelectedChangedEventArgs, scala.Unit]
  type ASPxClientListEditStatic = ASPxClientEditStatic
  type ASPxClientMediaFileSelectorStatic = ASPxClientControlStatic
  /**
   * Represents the client-side equivalent of the MedianPrice class.
   */
  type ASPxClientMedianPrice = ASPxClientIndicator
  /**
   * Represents the client-side equivalent of the ASPxMemo control.
   */
  type ASPxClientMemo = ASPxClientTextEdit
  /**
   * A method that will handle client events concerning clicks on the control's items.
   */
  type ASPxClientMenuItemClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientMenuItemClickEventArgs, scala.Unit]
  /**
   * A method that will handle the menu's client events concerning manipulations with an item.
   */
  type ASPxClientMenuItemEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientMenuItemEventArgs, scala.Unit]
  /**
   * A method that will handle client events which relate to mouse hovering (such as entering or leaving) over menu items.
   */
  type ASPxClientMenuItemMouseEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientMenuItemMouseEventArgs, scala.Unit]
  type ASPxClientMonthlyRecurrenceControlStatic = ASPxClientRecurrenceControlBaseStatic
  /**
   * A method that will handle the navbar's cancelable client events concerning manipulations with a group.
   */
  type ASPxClientNavBarGroupCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientNavBarGroupCancelEventArgs, scala.Unit]
  /**
   * A method that will handle client events concerning clicks on the control's group headers.
   */
  type ASPxClientNavBarGroupClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientNavBarGroupClickEventArgs, scala.Unit]
  /**
   * A method that will handle the navbar's client events concerning manipulations with a group.
   */
  type ASPxClientNavBarGroupEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientNavBarGroupEventArgs, scala.Unit]
  /**
   * A method that will handle the navbar's client events concerning manipulations with an item.
   */
  type ASPxClientNavBarItemEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientNavBarItemEventArgs, scala.Unit]
  /**
   * A method that will handle client events concerning manipulations with an item.
   */
  type ASPxClientNewsControlItemEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientNewsControlItemEventArgs, scala.Unit]
  /**
   * Represents the client-side equivalent of the ASPxPager control.
   */
  type ASPxClientPager = ASPxClientControl
  type ASPxClientPagerStatic = ASPxClientControlStatic
  /**
   * A method that will handle the client ParseDate event, that parses a date editor's value when entered.
   */
  type ASPxClientParseDateEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientParseDateEventArgs, scala.Unit]
  type ASPxClientPivotCustomizationStatic = ASPxClientControlStatic
  /**
   * A method that will handle the PopupMenuItemClick event.
   */
  type ASPxClientPivotMenuItemClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientPivotMenuItemClickEventArgs, scala.Unit]
  type ASPxClientPopupControlBaseStatic = ASPxClientControlStatic
  /**
   * A method that will handle the popup window's cancellable client events, such as the Closing.
   */
  type ASPxClientPopupWindowCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientPopupWindowCancelEventArgs, scala.Unit]
  /**
   * A method that will handle the CloseUp event.
   */
  type ASPxClientPopupWindowCloseUpEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientPopupWindowCloseUpEventArgs, scala.Unit]
  /**
   * A method that will handle the popup control's client events invoked in response to manipulating a popup window.
   */
  type ASPxClientPopupWindowEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientPopupWindowEventArgs, scala.Unit]
  /**
   * A method that will handle the PinnedChanged event.
   */
  type ASPxClientPopupWindowPinnedChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientPopupWindowPinnedChangedEventArgs, scala.Unit]
  /**
   * A method that will handle the Resize event.
   */
  type ASPxClientPopupWindowResizeEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientPopupWindowResizeEventArgs, scala.Unit]
  /**
   * A method that will handle the cancelable client-side events which allow the event's processing to be passed to the server side.
   */
  type ASPxClientProcessingModeCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientProcessingModeCancelEventArgs, scala.Unit]
  /**
   * A method that will handle the client events which can't be cancelled and allow the event's processing to be passed to the server side.
   */
  type ASPxClientProcessingModeEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientProcessingModeEventArgs, scala.Unit]
  /**
   * A method that will handle the CustomizeLocalization event.
   */
  type ASPxClientQueryBuilderCustomizeLocalizationEventHandler[S] = js.Function1[/* source */ S, scala.Unit]
  /**
   * A method that will handle the CustomizeToolbarActions event.
   */
  type ASPxClientQueryBuilderCustomizeToolbarActionsEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCustomizeMenuActionsEventArgs, scala.Unit]
  /**
   * A method that will handle the SaveCommandExecute event.
   */
  type ASPxClientQueryBuilderSaveCommandExecuteEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientQueryBuilderSaveCommandExecuteEventArgs, 
    scala.Unit
  ]
  /**
   * Represents the client-side equivalent of the RadarAxis class.
   */
  type ASPxClientRadarAxis = ASPxClientAxisBase
  /**
   * Represents the client-side equivalent of the ASPxRadioButtonList control.
   */
  type ASPxClientRadioButtonList = ASPxClientCheckListBase
  /**
   * A method that will handle the client ItemClick event.
   */
  type ASPxClientRatingControlItemClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientRatingControlItemClickEventArgs, scala.Unit]
  /**
   * A method that will handle the rating control's ItemMouseOver and ItemMouseOut client events (such as ItemMouseOut).
   */
  type ASPxClientRatingControlItemMouseEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientRatingControlItemMouseEventArgs, scala.Unit]
  type ASPxClientRecurrenceControlBaseStatic = ASPxClientControlStatic
  type ASPxClientRecurrenceRangeControlStatic = ASPxClientControlStatic
  type ASPxClientRecurrenceTypeEditStatic = ASPxClientRadioButtonListStatic
  /**
   * Represents the client-side equivalent of the RegressionLine class.
   */
  type ASPxClientRegressionLine = ASPxClientSingleLevelIndicator
  /**
   * A method that will handle the BeforeRender event.
   */
  type ASPxClientReportDesignerBeforeRenderEventHandler[S] = js.Function2[/* source */ S, /* designerModel */ js.Object, scala.Unit]
  /**
   * A method that will handle the ComponentAdded event.
   */
  type ASPxClientReportDesignerComponentAddedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientReportDesignerComponentAddedEventArgs, scala.Unit]
  /**
   * A method that will handle the CustomizeElements event.
   */
  type ASPxClientReportDesignerCustomizeElementsEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCustomizeElementsEventArgs, scala.Unit]
  type ASPxClientReportDesignerCustomizeFieldListActionsEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientReportDesignerCustomizeFieldListActionsEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the CustomizeLocalization event.
   */
  type ASPxClientReportDesignerCustomizeLocalizationEventHandler[S] = js.Function1[/* source */ S, scala.Unit]
  /**
   * A method that will handle the CustomizeMenuActions event.
   */
  type ASPxClientReportDesignerCustomizeMenuActionsEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCustomizeMenuActionsEventArgs, scala.Unit]
  /**
   * A method that will handle the CustomizeOpenDialog event.
   */
  type ASPxClientReportDesignerCustomizeOpenDialogEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientReportDesignerCustomizeOpenDialogEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the CustomizeParameterEditors event.
   */
  type ASPxClientReportDesignerCustomizeParameterEditorsEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCustomizeParameterEditorsEventArgs, scala.Unit]
  /**
   * A method that will handle the CustomizeParameterLookUpSource event.
   */
  type ASPxClientReportDesignerCustomizeParameterLookUpSourceEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientCustomizeParameterLookUpSourceEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the CustomizeSaveAsDialog event.
   */
  type ASPxClientReportDesignerCustomizeSaveAsDialogEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the CustomizeSaveDialog event.
   */
  type ASPxClientReportDesignerCustomizeSaveDialogEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientReportDesignerCustomizeSaveDialogEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the CustomizeToolbox event.
   */
  type ASPxClientReportDesignerCustomizeToolboxEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientReportDesignerCustomizeToolboxEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the OnServerError event.
   */
  type ASPxClientReportDesignerErrorEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientReportDesignerErrorEventArgs, scala.Unit]
  /**
   * Provides data for the ExitDesigner event.
   */
  type ASPxClientReportDesignerExitDesignerEventArgs = ASPxClientEventArgs
  /**
   * A method that will handle the ExitDesigner event.
   */
  type ASPxClientReportDesignerExitDesignerEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientReportDesignerExitDesignerEventArgs, scala.Unit]
  /**
   * A method that will handle the ReportOpened event.
   */
  type ASPxClientReportDesignerReportOpenedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientReportDesignerDialogEventArgs, scala.Unit]
  /**
   * A method that will handle the ReportOpening event.
   */
  type ASPxClientReportDesignerReportOpeningEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientReportDesignerDialogCancelEventArgs, scala.Unit]
  /**
   * A method that will handle the ReportSaved event.
   */
  type ASPxClientReportDesignerReportSavedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientReportDesignerDialogEventArgs, scala.Unit]
  /**
   * A method that will handle the ReportSaving event.
   */
  type ASPxClientReportDesignerReportSavingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientReportDesignerDialogCancelEventArgs, scala.Unit]
  /**
   * A method that will handle the ReportTabClosed event.
   */
  type ASPxClientReportDesignerReportTabClosedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientReportDesignerTabEventArgs, scala.Unit]
  /**
   * A method that will handle the ReportTabClosing event.
   */
  type ASPxClientReportDesignerReportTabClosingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientReportDesignerTabClosingEventArgs, scala.Unit]
  /**
   * A method that will handle the SaveCommandExecute event.
   */
  type ASPxClientReportDesignerSaveCommandExecuteEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientReportDesignerSaveCommandExecuteEventArgs, 
    scala.Unit
  ]
  type ASPxClientReportDesignerTabChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientReportDesignerTabEventArgs, scala.Unit]
  type ASPxClientReportDocumentMapStatic = ASPxClientControlStatic
  type ASPxClientReportParametersPanelStatic = ASPxClientControlStatic
  /**
   * A method that will handle the PageLoad events.
   */
  type ASPxClientReportViewerPageLoadEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientReportViewerPageLoadEventArgs, scala.Unit]
  /**
   * A method that will handle the CommandExecuted event.
   */
  type ASPxClientRibbonCommandExecutedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientRibbonCommandExecutedEventArgs, scala.Unit]
  /**
   * A method that will handle the DialogBoxLauncherClicked event.
   */
  type ASPxClientRibbonDialogBoxLauncherClickedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientRibbonDialogBoxLauncherClickedEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the MinimizationStateChanged event.
   */
  type ASPxClientRibbonMinimizationStateEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientRibbonMinimizationStateEventArgs, scala.Unit]
  /**
   * A method that will handle the ActiveTabChanged event.
   */
  type ASPxClientRibbonTabEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientRibbonTabEventArgs, scala.Unit]
  /**
   * A method that will handle the AutoCorrect event.
   */
  type ASPxClientRichEditAutoCorrectEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientRichEditAutoCorrectEventArgs, scala.Unit]
  /**
   * A method that will handle the CharacterPropertiesChanged event.
   */
  type ASPxClientRichEditCharacterPropertiesChangedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientRichEditCharacterPropertiesChangedEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the ContentInserted event.
   */
  type ASPxClientRichEditContentInsertedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientRichEditContentInsertedEventArgs, scala.Unit]
  /**
   * A method that will handle the ContentRemoved event.
   */
  type ASPxClientRichEditContentRemovedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientRichEditContentRemovedEventArgs, scala.Unit]
  /**
   * A method that will handle the CustomCommandExecuted event.
   */
  type ASPxClientRichEditCustomCommandExecutedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientRichEditCustomCommandExecutedEventArgs, scala.Unit]
  /**
   * A method that will handle the HyperlinkClick event.
   */
  type ASPxClientRichEditHyperlinkClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientRichEditHyperlinkClickEventArgs, scala.Unit]
  /**
   * A method that will handle the KeyDown event.
   */
  type ASPxClientRichEditKeyDownEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientRichEditKeyDownEventArgs, scala.Unit]
  /**
   * A method that will handle the KeyUp event.
   */
  type ASPxClientRichEditKeyUpEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientRichEditKeyUpEventArgs, scala.Unit]
  /**
   * A method that will handle the ParagraphPropertiesChanged event.
   */
  type ASPxClientRichEditParagraphPropertiesChangedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientRichEditParagraphPropertiesChangedEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the PointerDown event.
   */
  type ASPxClientRichEditPointerDownEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientRichEditPointerDownEventArgs, scala.Unit]
  /**
   * A method that will handle the PointerUp event.
   */
  type ASPxClientRichEditPointerUpEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientRichEditPointerUpEventArgs, scala.Unit]
  /**
   * A method that will handle the PopupMenuShowing event.
   */
  type ASPxClientRichEditPopupMenuShowingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientRichEditPopupMenuShowingEventArgs, scala.Unit]
  type ASPxClientSchedulerStorageControlStatic = ASPxClientControlStatic
  type ASPxClientSelectedTabPageChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientSelectedTabPageChangedEventArgs, scala.Unit]
  /**
   * Represents the client-side equivalent of the SimpleDiagram class.
   */
  type ASPxClientSimpleDiagram = ASPxClientWebChartEmptyElement
  /**
   * The client-side equivalent of the SimpleMovingAverage class.
   */
  type ASPxClientSimpleMovingAverage = ASPxClientMovingAverage
  type ASPxClientSpinEditBaseStatic = ASPxClientButtonEditBaseStatic
  /**
   * A method that will handle a splitter control's cancelable client events concerning manipulations with a pane.
   */
  type ASPxClientSplitterPaneCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientSplitterPaneCancelEventArgs, scala.Unit]
  /**
   * A method that will handle the splitter's client events concerning manipulations with a pane.
   */
  type ASPxClientSplitterPaneEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientSplitterPaneEventArgs, scala.Unit]
  /**
   * A method that will handle the CellBeginEdit event.
   */
  type ASPxClientSpreadsheetCellBeginEditEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientSpreadsheetCellBeginEditEventArgs, scala.Unit]
  /**
   * A method that will handle the CellCancelEdit event.
   */
  type ASPxClientSpreadsheetCellCancelEditEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientSpreadsheetCellCancelEditEventArgs, scala.Unit]
  /**
   * A method that will handle the CellEndEdit event.
   */
  type ASPxClientSpreadsheetCellEndEditEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientSpreadsheetCellEndEditEventArgs, scala.Unit]
  /**
   * A method that will handle the CustomCommandExecuted event.
   */
  type ASPxClientSpreadsheetCustomCommandExecutedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientSpreadsheetCustomCommandExecutedEventArgs, 
    scala.Unit
  ]
  /**
   * Provides data for the DocumentChanged event.
   */
  type ASPxClientSpreadsheetDocumentChangedEventArgs = ASPxClientEventArgs
  /**
   * A method that will handle the DocumentChanged event.
   */
  type ASPxClientSpreadsheetDocumentChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientSpreadsheetDocumentChangedEventArgs, scala.Unit]
  /**
   * A method that will handle the HyperlinkClick event.
   */
  type ASPxClientSpreadsheetHyperlinkClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientSpreadsheetHyperlinkClickEventArgs, scala.Unit]
  /**
   * A method that will handle the PopupMenuShowing event.
   */
  type ASPxClientSpreadsheetPopupMenuShowingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientSpreadsheetPopupMenuShowingEventArgs, scala.Unit]
  /**
   * A method that will handle the client SelectionChanged event.
   */
  type ASPxClientSpreadsheetSelectionChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientSpreadsheetSelectionChangedEventArgs, scala.Unit]
  /**
   * Provides data for the EndSynchronization events.
   */
  type ASPxClientSpreadsheetSynchronizationEventArgs = ASPxClientEventArgs
  /**
   * A method that will handle the EndSynchronization events.
   */
  type ASPxClientSpreadsheetSynchronizationEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientSpreadsheetSynchronizationEventArgs, scala.Unit]
  /**
   * A method that will handle the ViewModeChanged event.
   */
  type ASPxClientSpreadsheetViewModeChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientSpreadsheetViewModeChangedEventArgs, scala.Unit]
  /**
   * Represents the client-side equivalent of the StandardErrorBars class.
   */
  type ASPxClientStandardErrorBars = ASPxClientIndicator
  type ASPxClientStaticEditStatic = ASPxClientEditBaseStatic
  /**
   * Represents the client-side equivalent of the SwiftPlotDiagram class.
   */
  type ASPxClientSwiftPlotDiagram = ASPxClientXYDiagram2D
  /**
   * Represents the client-side equivalent of the SwiftPlotDiagramAxis class.
   */
  type ASPxClientSwiftPlotDiagramAxis = ASPxClientAxis2D
  /**
   * Represents a client-side equivalent of the ASPxTabControl object.
   */
  type ASPxClientTabControl = ASPxClientTabControlBase
  type ASPxClientTabControlBaseStatic = ASPxClientControlStatic
  /**
   * A method that will handle a tab control's cancelable client events concerning manipulations with a tab.
   */
  type ASPxClientTabControlTabCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTabControlTabCancelEventArgs, scala.Unit]
  /**
   * A method that will handle client events concerning clicks on the control's tabs.
   */
  type ASPxClientTabControlTabClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTabControlTabClickEventArgs, scala.Unit]
  /**
   * A method that will handle a tab control's client events concerning manipulations with a tab.
   */
  type ASPxClientTabControlTabEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTabControlTabEventArgs, scala.Unit]
  /**
   * Represents the client-side equivalent of the ASPxTextBox control.
   */
  type ASPxClientTextBox = ASPxClientTextBoxBase
  /**
   * Represents a base for client-side editors which are capable of displaying and editing text data in their edit regions.
   */
  type ASPxClientTextBoxBase = ASPxClientTextEdit
  type ASPxClientTextBoxBaseStatic = ASPxClientTextEditStatic
  type ASPxClientTextEditStatic = ASPxClientEditStatic
  /**
   * A method that will handle client events concerning manipulations with an item.
   */
  type ASPxClientTitleIndexItemEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTitleIndexItemEventArgs, scala.Unit]
  /**
   * A method that will handle the ItemValueChanged event.
   */
  type ASPxClientToolbarItemValueChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientToolbarItemValueChangedEventArgs, scala.Unit]
  /**
   * A method that will handle the client PositionChanging event.
   */
  type ASPxClientTrackBarPositionChangingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTrackBarPositionChangingEventArgs, scala.Unit]
  /**
   * A method that will handle the BatchEditChangesCanceling event.
   */
  type ASPxClientTreeListBatchEditChangesCancelingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientTreeListBatchEditChangesCancelingEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the BatchEditChangesSaving event.
   */
  type ASPxClientTreeListBatchEditChangesSavingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientTreeListBatchEditChangesSavingEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the BatchEditConfirmShowing event.
   */
  type ASPxClientTreeListBatchEditConfirmShowingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientTreeListBatchEditConfirmShowingEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the BatchEditEndEditing event.
   */
  type ASPxClientTreeListBatchEditEndEditingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTreeListBatchEditEndEditingEventArgs, scala.Unit]
  /**
   * A method that will handle the BatchEditNodeDeleting event.
   */
  type ASPxClientTreeListBatchEditNodeDeletingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTreeListBatchEditNodeDeletingEventArgs, scala.Unit]
  /**
   * A method that will handle the BatchEditNodeInserting event.
   */
  type ASPxClientTreeListBatchEditNodeInsertingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientTreeListBatchEditNodeInsertingEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the BatchEditNodeRecovering event.
   */
  type ASPxClientTreeListBatchEditNodeRecoveringEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientTreeListBatchEditNodeRecoveringEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the BatchEditNodeValidating event.
   */
  type ASPxClientTreeListBatchEditNodeValidatingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientTreeListBatchEditNodeValidatingEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the BatchEditStartEditing event.
   */
  type ASPxClientTreeListBatchEditStartEditingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTreeListBatchEditStartEditingEventArgs, scala.Unit]
  /**
   * A method that will handle the BatchEditTemplateCellFocused event.
   */
  type ASPxClientTreeListBatchEditTemplateCellFocusedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the client ColumnResized event.
   */
  type ASPxClientTreeListColumnResizedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTreeListColumnResizedEventArgs, scala.Unit]
  /**
   * A method that will handle the client ColumnResizing event.
   */
  type ASPxClientTreeListColumnResizingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTreeListColumnResizingEventArgs, scala.Unit]
  /**
   * A method that will handle the ContextMenu event.
   */
  type ASPxClientTreeListContextMenuEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTreeListContextMenuEventArgs, scala.Unit]
  /**
   * A method that will handle the CustomButtonClick event.
   */
  type ASPxClientTreeListCustomButtonEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTreeListCustomButtonEventArgs, scala.Unit]
  /**
   * A method that will handle the CustomDataCallback event.
   */
  type ASPxClientTreeListCustomDataCallbackEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTreeListCustomDataCallbackEventArgs, scala.Unit]
  /**
   * A method that will handle the EndDragNode event.
   */
  type ASPxClientTreeListEndDragNodeEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTreeListEndDragNodeEventArgs, scala.Unit]
  /**
   * A method that will handle the FocusedCellChanging event.
   */
  type ASPxClientTreeListFocusedCellChangingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTreeListFocusedCellChangingEventArgs, scala.Unit]
  /**
   * A method that will handle the NodeDblClick event.
   */
  type ASPxClientTreeListNodeEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTreeListNodeEventArgs, scala.Unit]
  /**
   * A method that will handle the StartDragNode event.
   */
  type ASPxClientTreeListStartDragNodeEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTreeListStartDragNodeEventArgs, scala.Unit]
  /**
   * A method that will handle the ToolbarItemClick event.
   */
  type ASPxClientTreeListToolbarItemClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTreeListToolbarItemClickEventArgs, scala.Unit]
  /**
   * Represents a JavaScript function which receives the list of row values when a specific client method (such as the GetSelectedNodeValues) is called.
   */
  type ASPxClientTreeListValuesCallback = js.Function1[/* result */ js.Object, scala.Unit]
  /**
   * A method that will handle the ASPxTreeView's cancelable client events, concerning manipulations with nodes.
   */
  type ASPxClientTreeViewNodeCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTreeViewNodeCancelEventArgs, scala.Unit]
  /**
   * A method that will handle the ASPxClientTreeView.ItemClick event.
   */
  type ASPxClientTreeViewNodeClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTreeViewNodeClickEventArgs, scala.Unit]
  /**
   * A method that will handle the ASPxTreeView control's client events concerning manipulations with a node.
   */
  type ASPxClientTreeViewNodeEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTreeViewNodeEventArgs, scala.Unit]
  /**
   * A method that will handle the client events concerned with node processing.
   */
  type ASPxClientTreeViewNodeProcessingModeEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientTreeViewNodeProcessingModeEventArgs, scala.Unit]
  /**
   * Represents the client-side equivalent of the TrendLine class.
   */
  type ASPxClientTrendLine = ASPxClientFinancialIndicator
  /**
   * The client-side equivalent of the TriangularMovingAverage class.
   */
  type ASPxClientTriangularMovingAverage = ASPxClientMovingAverage
  /**
   * Represents the client-side equivalent of the TripleExponentialMovingAverageTema class.
   */
  type ASPxClientTripleExponentialMovingAverageTema = ASPxClientMovingAverage
  /**
   * Represents the client-side equivalent of the TypicalPrice class.
   */
  type ASPxClientTypicalPrice = ASPxClientIndicator
  /**
   * A method that will handle the DropZoneEnter event.
   */
  type ASPxClientUploadControlDropZoneEnterEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientUploadControlDropZoneEnterEventArgs, scala.Unit]
  /**
   * A method that will handle the DropZoneLeave event.
   */
  type ASPxClientUploadControlDropZoneLeaveEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientUploadControlDropZoneLeaveEventArgs, scala.Unit]
  /**
   * A method that handles the FileUploadComplete client event.
   */
  type ASPxClientUploadControlFileUploadCompleteEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientUploadControlFileUploadCompleteEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the FilesUploadComplete client event.
   */
  type ASPxClientUploadControlFilesUploadCompleteEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientUploadControlFilesUploadCompleteEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the client FilesUploadStart event.
   */
  type ASPxClientUploadControlFilesUploadStartEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientUploadControlFilesUploadStartEventArgs, scala.Unit]
  /**
   * A method that will handle the TextChanged client event.
   */
  type ASPxClientUploadControlTextChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientUploadControlTextChangedEventArgs, scala.Unit]
  /**
   * A method that will handle the ASPxUploadControl's client event, concerned with changes in upload progress.
   */
  type ASPxClientUploadControlUploadingProgressChangedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientUploadControlUploadingProgressChangedEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the ValidationErrorOccurred client event.
   */
  type ASPxClientUploadControlValidationErrorOccurredEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientUploadControlValidationErrorOccurredEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the ValidationCompleted client event.
   */
  type ASPxClientValidationCompletedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientValidationCompletedEventArgs, scala.Unit]
  type ASPxClientValidationSummaryStatic = ASPxClientControlStatic
  /**
   * A method that will handle the VisibilityChanged event.
   */
  type ASPxClientValidationSummaryVisibilityChangedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientValidationSummaryVisibilityChangedEventArgs, 
    scala.Unit
  ]
  /**
   * Represents an object that will handle the client-side BatchEditChangesCanceling event.
   */
  type ASPxClientVerticalGridBatchEditChangesCancelingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientVerticalGridBatchEditChangesCancelingEventArgs, 
    scala.Unit
  ]
  /**
   * Represents an object that will handle the client-side BatchEditChangesSaving event.
   */
  type ASPxClientVerticalGridBatchEditChangesSavingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientVerticalGridBatchEditChangesSavingEventArgs, 
    scala.Unit
  ]
  /**
   * Represents an object that will handle the client-side BatchEditConfirmShowing event.
   */
  type ASPxClientVerticalGridBatchEditConfirmShowingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientVerticalGridBatchEditConfirmShowingEventArgs, 
    scala.Unit
  ]
  /**
   * Represents an object that will handle the client-side BatchEditEndEditing event.
   */
  type ASPxClientVerticalGridBatchEditEndEditingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientVerticalGridBatchEditEndEditingEventArgs, 
    scala.Unit
  ]
  /**
   * Represents an object that will handle the client-side BatchEditRecordDeleting event.
   */
  type ASPxClientVerticalGridBatchEditRecordDeletingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientVerticalGridBatchEditRecordDeletingEventArgs, 
    scala.Unit
  ]
  /**
   * Represents an object that will handle the client-side BatchEditRecordInserting event.
   */
  type ASPxClientVerticalGridBatchEditRecordInsertingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientVerticalGridBatchEditRecordInsertingEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the BatchEditRecordRecovering event.
   */
  type ASPxClientVerticalGridBatchEditRecordRecoveringEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs, 
    scala.Unit
  ]
  /**
   * Represents an object that will handle the client-side BatchEditRecordValidating event.
   */
  type ASPxClientVerticalGridBatchEditRecordValidatingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientVerticalGridBatchEditRecordValidatingEventArgs, 
    scala.Unit
  ]
  /**
   * Represents an object that will handle the client-side BatchEditStartEditing event.
   */
  type ASPxClientVerticalGridBatchEditStartEditingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientVerticalGridBatchEditStartEditingEventArgs, 
    scala.Unit
  ]
  /**
   * Represents an object that will handle the client-side BatchEditTemplateCellFocused event.
   */
  type ASPxClientVerticalGridBatchEditTemplateCellFocusedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the CustomButtonClick event.
   */
  type ASPxClientVerticalGridCustomButtonEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientVerticalGridCustomButtonEventArgs, scala.Unit]
  /**
   * Lists values that specify the document formats available for export from the grid.
   */
  type ASPxClientVerticalGridExportFormat = ASPxClientGridExportFormat
  type ASPxClientVerticalGridExportFormatStatic = ASPxClientGridExportFormatStatic
  /**
   * A method that will handle the FocusedCellChanging event.
   */
  type ASPxClientVerticalGridFocusedCellChangingEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientVerticalGridFocusedCellChangingEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the RecordClick event.
   */
  type ASPxClientVerticalGridRecordClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientVerticalGridRecordClickEventArgs, scala.Unit]
  /**
   * A method that will handle the CustomButtonClick event.
   */
  type ASPxClientVerticalGridRowCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientVerticalGridRowCancelEventArgs, scala.Unit]
  /**
   * A method that will handle the RowExpandedChanged event.
   */
  type ASPxClientVerticalGridRowExpandedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientVerticalGridRowExpandedEventArgs, scala.Unit]
  /**
   * A method that will handle the RowExpandedChanging event.
   */
  type ASPxClientVerticalGridRowExpandingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientVerticalGridRowExpandingEventArgs, scala.Unit]
  /**
   * A method that will handle the SelectionChanged event.
   */
  type ASPxClientVerticalGridSelectionEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientVerticalGridSelectionEventArgs, scala.Unit]
  /**
   * Represents a JavaScript function which receives the list of record values when the client GetSelectedFieldValues method is called.
   */
  type ASPxClientVerticalGridValuesCallback = js.Function1[/* result */ js.Object, scala.Unit]
  /**
   * A method that will handle the CustomDrawCrosshair  event.
   */
  type ASPxClientWebChartControlCustomDrawCrosshairEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientWebChartControlCustomDrawCrosshairEventArgs, 
    scala.Unit
  ]
  /**
   * Represents a method that will handle the ObjectSelected events.
   */
  type ASPxClientWebChartControlHotTrackEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientWebChartControlHotTrackEventArgs, scala.Unit]
  /**
   * Represents a base class for chart elements, which are not necessarily required to be present on the client side.
   */
  type ASPxClientWebChartEmptyElement = ASPxClientWebChartElement
  /**
   * Represents a base class for chart elements, which are required to be present on the client side.
   */
  type ASPxClientWebChartRequiredElement = ASPxClientWebChartElement
  /**
   * A method that will handle the BeforeRender event.
   */
  type ASPxClientWebDocumentViewerBeforeRenderEventHandler[S] = js.Function2[/* source */ S, /* previewModel */ js.Object, scala.Unit]
  /**
   * A method that will handle the CustomizeElements event.
   */
  type ASPxClientWebDocumentViewerCustomizeElementsEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCustomizeElementsEventArgs, scala.Unit]
  type ASPxClientWebDocumentViewerCustomizeExportOptionsEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCustomizeExportOptionsEventArgs, scala.Unit]
  /**
   * A method that will handle the CustomizeLocalization event.
   */
  type ASPxClientWebDocumentViewerCustomizeLocalizationEventHandler[S] = js.Function1[/* source */ S, scala.Unit]
  /**
   * A method that will handle the CustomizeMenuActions event.
   */
  type ASPxClientWebDocumentViewerCustomizeMenuActionsEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCustomizeMenuActionsEventArgs, scala.Unit]
  /**
   * A method that will handle the CustomizeParameterEditors event.
   */
  type ASPxClientWebDocumentViewerCustomizeParameterEditorsEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientCustomizeParameterEditorsEventArgs, scala.Unit]
  /**
   * A method that will handle the CustomizeParameterLookUpSource event.
   */
  type ASPxClientWebDocumentViewerCustomizeParameterLookUpSourceEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientCustomizeParameterLookUpSourceEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the DocumentReady event.
   */
  type ASPxClientWebDocumentViewerDocumentReadyEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientWebDocumentViewerDocumentReadyEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the EditingFieldChanged event.
   */
  type ASPxClientWebDocumentViewerEditingFieldChangedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ ASPxClientWebDocumentViewerEditingFieldChangedEventArgs, 
    scala.Unit
  ]
  /**
   * A method that will handle the ParametersReset event.
   */
  type ASPxClientWebDocumentViewerParametersResetEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientParametersResetEventArgs, scala.Unit]
  /**
   * A method that will handle the ParametersSubmitted event.
   */
  type ASPxClientWebDocumentViewerParametersSubmittedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientParametersSubmittedEventArgs, scala.Unit]
  /**
   * A method that will handle the PreviewClick event.
   */
  type ASPxClientWebDocumentViewerPreviewClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientPreviewClickEventArgs, scala.Unit]
  type ASPxClientWeekDaysCheckEditStatic = ASPxClientControlStatic
  type ASPxClientWeeklyRecurrenceControlStatic = ASPxClientRecurrenceControlBaseStatic
  /**
   * Represents the client-side equivalent of the WeightedClose class.
   */
  type ASPxClientWeightedClose = ASPxClientIndicator
  /**
   * The client-side equivalent of the WeightedMovingAverage class.
   */
  type ASPxClientWeightedMovingAverage = ASPxClientMovingAverage
  /**
   * Represents an object that will handle the client-side WordChanged event.
   */
  type ASPxClientWordChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientSpellCheckerAfterCheckEventArgs, scala.Unit]
  /**
   * Represents the client-side equivalent of the XYDiagram3D class.
   */
  type ASPxClientXYDiagram3D = ASPxClientXYDiagramBase
  type ASPxClientYearlyRecurrenceControlStatic = ASPxClientRecurrenceControlBaseStatic
  /**
   * A method that will handle the ActiveViewChanging event.
   */
  type ActiveViewChangingEventHandler[S] = js.Function2[/* source */ S, /* e */ ActiveViewChangingEventArgs, scala.Unit]
  type AppointmentClickEventHandler[S] = js.Function2[/* source */ S, /* e */ AppointmentClickEventArgs, scala.Unit]
  /**
   * A method that will handle the AppointmentDrag event.
   */
  type AppointmentDragEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientAppointmentDragEventArgs, scala.Unit]
  /**
   * A method that will handle the AppointmentDrop event.
   */
  type AppointmentDropEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientAppointmentDropEventArgs, scala.Unit]
  type AppointmentResizeEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientAppointmentResizeEventArgs, scala.Unit]
  /**
   * A method that will handle the AppointmentResizing event.
   */
  type AppointmentResizingEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientAppointmentResizingEventArgs, scala.Unit]
  /**
   * A method that will handle the AppointmentsSelectionChanged event.
   */
  type AppointmentsSelectionEventHandler[S] = js.Function2[/* source */ S, /* e */ AppointmentsSelectionEventArgs, scala.Unit]
  /**
   * A method that will handle the Accordion control's cancelable client events concerning manipulations with a group.
   */
  type BootstrapClientAccordionGroupCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapClientAccordionGroupCancelEventArgs, scala.Unit]
  /**
   * A method that will handle the Accordion control's client events concerning clicks on groups.
   */
  type BootstrapClientAccordionGroupClickEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapClientAccordionGroupClickEventArgs, scala.Unit]
  /**
   * A method that will handle the Accordion control's client events concerning manipulations with a group.
   */
  type BootstrapClientAccordionGroupEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapClientAccordionGroupEventArgs, scala.Unit]
  /**
   * A method that will handle the Accordion control's client events concerning manipulations with an item.
   */
  type BootstrapClientAccordionItemEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapClientAccordionItemEventArgs, scala.Unit]
  type BootstrapClientAccordionStatic = ASPxClientNavBarStatic
  /**
   * Represents the client-side equivalent of the BootstrapBinaryImage control.
   */
  type BootstrapClientBinaryImage = ASPxClientHyperLink
  type BootstrapClientBinaryImageStatic = ASPxClientHyperLinkStatic
  /**
   * Represents a client-side equivalent of the BootstrapButtonEdit control.
   */
  type BootstrapClientButtonEdit = ASPxClientButtonEdit
  type BootstrapClientButtonEditStatic = ASPxClientButtonEditStatic
  type BootstrapClientButtonStatic = ASPxClientButtonStatic
  /**
   * Represents a client-side equivalent of the BootstrapCalendar control.
   */
  type BootstrapClientCalendar = ASPxClientCalendar
  type BootstrapClientCalendarStatic = ASPxClientCalendarStatic
  type BootstrapClientCallbackPanelStatic = ASPxClientControlStatic
  /**
   * Represents the client BootstrapCardView.
   */
  type BootstrapClientCardView = ASPxClientCardView
  type BootstrapClientCardViewStatic = ASPxClientCardViewStatic
  /**
   * A method that will handle the Done event.
   */
  type BootstrapClientChartBaseDoneEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetEventArgsBase, scala.Unit]
  /**
   * A method that will handle the LegendClick event.
   */
  type BootstrapClientChartBaseLegendClickEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetElementClickEventArgs, scala.Unit]
  /**
   * A method that will handle the PointClick event.
   */
  type BootstrapClientChartBasePointClickEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetElementClickEventArgs, scala.Unit]
  /**
   * A method that will handle the PointHoverChanged event.
   */
  type BootstrapClientChartBasePointHoverChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetElementActionEventArgs, scala.Unit]
  /**
   * A method that will handle the PointSelectionChanged event.
   */
  type BootstrapClientChartBasePointSelectionChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetElementActionEventArgs, scala.Unit]
  type BootstrapClientChartBaseStatic = BootstrapUIWidgetBaseStatic
  /**
   * A method that will handle the TooltipHidden event.
   */
  type BootstrapClientChartBaseTooltipHiddenEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetElementActionEventArgs, scala.Unit]
  /**
   * A method that will handle the TooltipShown event.
   */
  type BootstrapClientChartBaseTooltipShownEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetElementActionEventArgs, scala.Unit]
  type BootstrapClientChartStatic = BootstrapClientChartBaseStatic
  /**
   * A method that will handle the ZoomEnd event.
   */
  type BootstrapClientChartZoomEndEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapClientChartZoomEndEventArgs, scala.Unit]
  /**
   * A method that will handle the ZoomStart event.
   */
  type BootstrapClientChartZoomStartEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetEventArgsBase, scala.Unit]
  /**
   * Represents a client-side equivalent of the BootstrapCheckBoxList control.
   */
  type BootstrapClientCheckBoxList = ASPxClientCheckBoxList
  type BootstrapClientCheckBoxListStatic = ASPxClientCheckBoxListStatic
  type BootstrapClientCheckBoxStatic = ASPxClientEditStatic
  type BootstrapClientComboBoxStatic = ASPxClientComboBoxStatic
  /**
   * A method that will handle the Invoke event.
   */
  type BootstrapClientCoordinateSystemChartArgumentAxisClickEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetElementClickEventArgs, scala.Unit]
  /**
   * A method that will handle the SeriesClick event.
   */
  type BootstrapClientCoordinateSystemChartSeriesClickEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetElementClickEventArgs, scala.Unit]
  /**
   * A method that will handle the SeriesHoverChanged event.
   */
  type BootstrapClientCoordinateSystemChartSeriesHoverChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetElementActionEventArgs, scala.Unit]
  /**
   * A method that will handle the SeriesSelectionChanged event.
   */
  type BootstrapClientCoordinateSystemChartSeriesSelectionChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetElementActionEventArgs, scala.Unit]
  type BootstrapClientDateEditStatic = ASPxClientDateEditStatic
  /**
   * Represents a client-side equivalent of the BootstrapDropDownEdit control.
   */
  type BootstrapClientDropDownEdit = ASPxClientDropDownEdit
  type BootstrapClientDropDownEditStatic = ASPxClientDropDownEditStatic
  type BootstrapClientFileManager = ASPxClientFileManager
  type BootstrapClientFileManagerStatic = ASPxClientFileManagerStatic
  /**
   * Represents a client-side equivalent of the BootstrapFormLayout control.
   */
  type BootstrapClientFormLayout = ASPxClientFormLayout
  type BootstrapClientFormLayoutStatic = ASPxClientFormLayoutStatic
  /**
   * Represents the client BootstrapGridView.
   */
  type BootstrapClientGridView = ASPxClientGridView
  type BootstrapClientGridViewStatic = ASPxClientGridViewStatic
  type BootstrapClientHyperLinkStatic = ASPxClientHyperLinkStatic
  /**
   * Represents the client-side equivalent of the BootstrapImage control.
   */
  type BootstrapClientImage = ASPxClientImage
  type BootstrapClientImageStatic = ASPxClientImageStatic
  type BootstrapClientListBoxStatic = ASPxClientListBoxStatic
  /**
   * Represents a client-side equivalent of the BootstrapMemo control.
   */
  type BootstrapClientMemo = ASPxClientMemo
  type BootstrapClientMemoStatic = ASPxClientMemoStatic
  /**
   * A method that will handle client ItemClick events.
   */
  type BootstrapClientMenuItemClickEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapClientMenuItemClickEventArgs, scala.Unit]
  /**
   * A method that will handle the menu's client events concerning manipulations with an item.
   */
  type BootstrapClientMenuItemEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapClientMenuItemEventArgs, scala.Unit]
  /**
   * Provides data for client events related to mouse hovering over menu items.
   */
  type BootstrapClientMenuItemMouseEventArgs = BootstrapClientMenuItemEventArgs
  /**
   * A method that will handle the ItemMouseOver events.
   */
  type BootstrapClientMenuItemMouseEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapClientMenuItemMouseEventArgs, scala.Unit]
  type BootstrapClientMenuStatic = ASPxClientMenuStatic
  type BootstrapClientPageControlStatic = ASPxClientPageControlStatic
  /**
   * Represents a client-side equivalent of the BootstrapPager control.
   */
  type BootstrapClientPager = ASPxClientPager
  type BootstrapClientPagerStatic = ASPxClientPagerStatic
  /**
   * Represents a client-side equivalent of the BootstrapPieChart control.
   */
  type BootstrapClientPieChart = BootstrapClientChartBase
  type BootstrapClientPieChartStatic = BootstrapClientChartBaseStatic
  /**
   * Represents a client-side equivalent of the BootstrapPolarChart control.
   */
  type BootstrapClientPolarChart = BootstrapClientChartBase
  type BootstrapClientPolarChartStatic = BootstrapClientChartBaseStatic
  type BootstrapClientPopupControlStatic = ASPxClientPopupControlStatic
  type BootstrapClientPopupMenuStatic = ASPxClientPopupMenuStatic
  /**
   * Represents a client-side equivalent of the BootstrapProgressBar control.
   */
  type BootstrapClientProgressBar = ASPxClientProgressBar
  type BootstrapClientProgressBarStatic = ASPxClientProgressBarStatic
  /**
   * Represents a client-side equivalent of the BootstrapRadioButton control.
   */
  type BootstrapClientRadioButton = BootstrapClientCheckBox
  /**
   * Represents a client-side equivalent of the BootstrapRadioButtonList control.
   */
  type BootstrapClientRadioButtonList = ASPxClientRadioButtonList
  type BootstrapClientRadioButtonListStatic = ASPxClientRadioButtonListStatic
  type BootstrapClientRadioButtonStatic = BootstrapClientCheckBoxStatic
  type BootstrapClientRangeSelectorStatic = BootstrapUIWidgetBaseStatic
  /**
   * A method that will handle the ValueChanged event.
   */
  type BootstrapClientRangeSelectorValueChangedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ BootstrapClientRangeSelectorValueChangedEventArgs, 
    scala.Unit
  ]
  type BootstrapClientRibbonStatic = ASPxClientRibbonStatic
  type BootstrapClientRichEdit = ASPxClientRichEdit
  type BootstrapClientRichEditStatic = ASPxClientRichEditStatic
  type BootstrapClientSparklineOptionChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetOptionChangedEventArgs, scala.Unit]
  type BootstrapClientSparklineStatic = BootstrapUIWidgetBaseStatic
  type BootstrapClientSparklineTooltipHiddenEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetEventArgsBase, scala.Unit]
  type BootstrapClientSparklineTooltipShownEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetEventArgsBase, scala.Unit]
  /**
   * Represents a client-side equivalent of the BootstrapSpinEdit control.
   */
  type BootstrapClientSpinEdit = ASPxClientSpinEdit
  type BootstrapClientSpinEditStatic = ASPxClientSpinEditStatic
  type BootstrapClientTabControlStatic = ASPxClientTabControlStatic
  /**
   * A method that will handle a tab control's cancelable client events concerning manipulations with a tab.
   */
  type BootstrapClientTabControlTabCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapClientTabControlTabCancelEventArgs, scala.Unit]
  /**
   * A method that will handle client events concerning clicks on tabs.
   */
  type BootstrapClientTabControlTabClickEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapClientTabControlTabClickEventArgs, scala.Unit]
  /**
   * A method that will handle a tab control's client events concerning manipulations with a tab.
   */
  type BootstrapClientTabControlTabEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapClientTabControlTabEventArgs, scala.Unit]
  type BootstrapClientTagBoxStatic = ASPxClientTokenBoxStatic
  /**
   * Represents a client-side equivalent of the BootstrapTextBox control.
   */
  type BootstrapClientTextBox = ASPxClientTextBox
  type BootstrapClientTextBoxStatic = ASPxClientTextBoxStatic
  /**
   * Represents the client-side equivalent of the BootstrapClientTimeEdit control.
   */
  type BootstrapClientTimeEdit = ASPxClientTimeEdit
  type BootstrapClientTimeEditStatic = ASPxClientTimeEditStatic
  /**
   * Represents the client-side equivalent of the BootstrapToolbar control.
   */
  type BootstrapClientToolbar = BootstrapClientMenu
  type BootstrapClientToolbarStatic = BootstrapClientMenuStatic
  /**
   * A method that will handle the Tree View's cancelable client events, concerning manipulations with nodes.
   */
  type BootstrapClientTreeViewNodeCancelEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapClientTreeViewNodeCancelEventArgs, scala.Unit]
  /**
   * A method that will handle the NodeClick event.
   */
  type BootstrapClientTreeViewNodeClickEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapClientTreeViewNodeClickEventArgs, scala.Unit]
  /**
   * A method that will handle the Tree View control's client events, concerning manipulations with a node.
   */
  type BootstrapClientTreeViewNodeEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapClientTreeViewNodeEventArgs, scala.Unit]
  /**
   * A method that will handle the client events concerned with node processing.
   */
  type BootstrapClientTreeViewNodeProcessingModeEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ BootstrapClientTreeViewNodeProcessingModeEventArgs, 
    scala.Unit
  ]
  type BootstrapClientTreeViewStatic = ASPxClientTreeViewStatic
  /**
   * Represents a client-side equivalent of the BootstrapUploadControl.
   */
  type BootstrapClientUploadControl = ASPxClientUploadControl
  type BootstrapClientUploadControlStatic = ASPxClientUploadControlStatic
  type BootstrapUIWidgetBaseStatic = ASPxClientControlStatic
  /**
   * A method that will handle the Disposing event.
   */
  type BootstrapUIWidgetDisposingEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetEventArgsBase, scala.Unit]
  /**
   * A method that will handle the Drawn event.
   */
  type BootstrapUIWidgetDrawnEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetEventArgsBase, scala.Unit]
  /**
   * A method that will handle the IncidentOccurred event.
   */
  type BootstrapUIWidgetErrorEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetErrorEventArgs, scala.Unit]
  /**
   * A method that will handle the Exported event.
   */
  type BootstrapUIWidgetExportedEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetEventArgsBase, scala.Unit]
  /**
   * A method that will handle the Exporting event.
   */
  type BootstrapUIWidgetExportingEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetExportEventArgs, scala.Unit]
  /**
   * A method that will handle the FileSaving event.
   */
  type BootstrapUIWidgetFileSavingEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetExportEventArgs, scala.Unit]
  /**
   * A method that will handle the Init event.
   */
  type BootstrapUIWidgetInitializedEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetEventArgsBase, scala.Unit]
  /**
   * A method that will handle the OptionChanged event.
   */
  type BootstrapUIWidgetOptionChangedEventHandler[S] = js.Function2[/* source */ S, /* e */ BootstrapUIWidgetOptionChangedEventArgs, scala.Unit]
  /**
   * A method that will handle the CellDoubleClick events.
   */
  type CellClickEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientSchedulerCellClickEventArgs, scala.Unit]
  /**
   * Contains floating pictures settings.
   */
  type FloatingPictureInfo = FloatingObjectInfo
  /**
   * A method that will handle the BeforeExportRequest event.
   */
  type MVCxClientBeforeExportRequestEventHandler[S] = js.Function2[/* source */ S, /* e */ MVCxClientBeforeExportRequestEventArgs, scala.Unit]
  /**
   * A method that will handle client BeginCallback events.
   */
  type MVCxClientBeginCallbackEventHandler[S] = js.Function2[/* source */ S, /* e */ MVCxClientBeginCallbackEventArgs, scala.Unit]
  /**
   * A client-side counterpart of the DashboardViewer extension.
   */
  type MVCxClientDashboardViewer = ASPxClientDashboardViewer
  type MVCxClientDashboardViewerStatic = ASPxClientDashboardViewerStatic
  /**
   * A client-side counterpart of the DateEdit extension.
   */
  type MVCxClientDateEdit = ASPxClientDateEdit
  type MVCxClientDocumentViewerStatic = ASPxClientDocumentViewerStatic
  /**
   * A method that will handle the BeginCallback event.
   */
  type MVCxClientGlobalBeginCallbackEventHandler[S] = js.Function2[/* source */ S, /* e */ MVCxClientGlobalBeginCallbackEventArgs, scala.Unit]
  /**
   * A method that will handle the SaveCommandExecuted event.
   */
  type MVCxClientQueryBuilderSaveCommandExecutedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ MVCxClientQueryBuilderSaveCommandExecutedEventArgs, 
    scala.Unit
  ]
  type MVCxClientQueryBuilderStatic = ASPxClientQueryBuilderStatic
  /**
   * A method that will handle the SaveCommandExecuted event.
   */
  type MVCxClientReportDesignerSaveCommandExecutedEventHandler[S] = js.Function2[
    /* source */ S, 
    /* e */ MVCxClientReportDesignerSaveCommandExecutedEventArgs, 
    scala.Unit
  ]
  type MVCxClientReportDesignerStatic = ASPxClientReportDesignerStatic
  type MVCxClientReportViewerStatic = ASPxClientReportViewerStatic
  /**
   * A delegate method that enables you to adjust the tooltip content before displaying.
   */
  type MVCxClientSchedulerToolTipDisplayingEventHandler[S] = js.Function2[/* source */ S, /* e */ MVCxClientSchedulerToolTipDisplayingEventArgs, scala.Unit]
  /**
   * A client-side counterpart of the UploadControl extension.
   */
  type MVCxClientUploadControl = ASPxClientUploadControl
  /**
   * A client-side equivalent of the MVCxWebDocumentViewer class.
   */
  type MVCxClientWebDocumentViewer = ASPxClientWebDocumentViewer
  type MVCxClientWebDocumentViewerStatic = ASPxClientWebDocumentViewerStatic
  /**
   * A method that will handle the MenuItemClicked event.
   */
  type MenuItemClickedEventHandler[S] = js.Function2[/* source */ S, /* e */ MenuItemClickedEventArgs, scala.Unit]
  /**
   * A method that will handle the MoreButtonClicked event.
   */
  type MoreButtonClickedEventHandler[S] = js.Function2[/* source */ S, /* e */ MoreButtonClickedEventArgs, scala.Unit]
  /**
   * A method that will handle the ReminderAlert event.
   */
  type ReminderAlertEventHandler[S] = js.Function2[/* source */ S, /* e */ ASPxClientSchedulerStorageReminderAlertEventArgs, scala.Unit]
  /**
   * A method that will handle the Shortcut event.
   */
  type ShortcutEventHandler[S] = js.Function2[/* source */ S, /* e */ ShortcutEventArgs, scala.Unit]
}
