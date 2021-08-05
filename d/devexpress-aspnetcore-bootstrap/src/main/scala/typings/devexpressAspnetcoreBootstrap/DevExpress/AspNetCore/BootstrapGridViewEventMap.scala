package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapGridViewEventMap
  extends StObject
     with BootstrapGridBaseEventMap {
  
  var batchEditChangesCanceling: GridViewBatchEditChangesCancelingEventArgs
  
  var batchEditChangesSaving: GridViewBatchEditChangesSavingEventArgs
  
  var batchEditConfirmShowing: GridViewBatchEditConfirmShowingEventArgs
  
  var batchEditEndEditing: GridViewBatchEditEndEditingEventArgs
  
  var batchEditRowDeleting: GridViewBatchEditRowDeletingEventArgs
  
  var batchEditRowInserting: GridViewBatchEditRowInsertingEventArgs
  
  var batchEditRowValidating: GridViewBatchEditRowValidatingEventArgs
  
  var batchEditStartEditing: GridViewBatchEditStartEditingEventArgs
  
  var batchEditTemplateCellFocused: GridViewBatchEditTemplateCellFocusedEventArgs
  
  var beginCallback: BeginCallbackEventArgs
  
  var callbackError: CallbackErrorEventArgs
  
  var columnGrouping: GridViewColumnCancelEventArgs
  
  var columnMoving: GridViewColumnMovingEventArgs
  
  var columnResized: GridViewColumnProcessingModeEventArgs
  
  var columnResizing: GridViewColumnCancelEventArgs
  
  var columnSorting: GridViewColumnCancelEventArgs
  
  var columnStartDragging: GridViewColumnCancelEventArgs
  
  var contextMenu: GridViewContextMenuEventArgs
  
  var contextMenuItemClick: GridViewContextMenuItemClickEventArgs
  
  var customButtonClick: GridViewCustomButtonEventArgs
  
  var customizationWindowCloseUp: EventArgs
  
  var detailRowCollapsing: GridViewRowCancelEventArgs
  
  var detailRowExpanding: GridViewRowCancelEventArgs
  
  var endCallback: EndCallbackEventArgs
  
  var focusedCellChanging: GridViewFocusedCellChangingEventArgs
  
  var focusedRowChanged: GridViewFocusEventArgs
  
  var rowClick: GridViewRowClickEventArgs
  
  var rowCollapsing: GridViewRowCancelEventArgs
  
  var rowDblClick: GridViewRowClickEventArgs
  
  var rowExpanding: GridViewRowCancelEventArgs
  
  var rowFocusing: GridViewRowFocusingEventArgs
  
  var selectionChanged: GridViewSelectionEventArgs
}
object BootstrapGridViewEventMap {
  
  inline def apply(
    batchEditChangesCanceling: GridViewBatchEditChangesCancelingEventArgs,
    batchEditChangesSaving: GridViewBatchEditChangesSavingEventArgs,
    batchEditConfirmShowing: GridViewBatchEditConfirmShowingEventArgs,
    batchEditEndEditing: GridViewBatchEditEndEditingEventArgs,
    batchEditRowDeleting: GridViewBatchEditRowDeletingEventArgs,
    batchEditRowInserting: GridViewBatchEditRowInsertingEventArgs,
    batchEditRowValidating: GridViewBatchEditRowValidatingEventArgs,
    batchEditStartEditing: GridViewBatchEditStartEditingEventArgs,
    batchEditTemplateCellFocused: GridViewBatchEditTemplateCellFocusedEventArgs,
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    columnGrouping: GridViewColumnCancelEventArgs,
    columnMoving: GridViewColumnMovingEventArgs,
    columnResized: GridViewColumnProcessingModeEventArgs,
    columnResizing: GridViewColumnCancelEventArgs,
    columnSorting: GridViewColumnCancelEventArgs,
    columnStartDragging: GridViewColumnCancelEventArgs,
    contextMenu: GridViewContextMenuEventArgs,
    contextMenuItemClick: GridViewContextMenuItemClickEventArgs,
    customButtonClick: GridViewCustomButtonEventArgs,
    customizationWindowCloseUp: EventArgs,
    detailRowCollapsing: GridViewRowCancelEventArgs,
    detailRowExpanding: GridViewRowCancelEventArgs,
    endCallback: EndCallbackEventArgs,
    focusedCellChanging: GridViewFocusedCellChangingEventArgs,
    focusedRowChanged: GridViewFocusEventArgs,
    init: EventArgs,
    rowClick: GridViewRowClickEventArgs,
    rowCollapsing: GridViewRowCancelEventArgs,
    rowDblClick: GridViewRowClickEventArgs,
    rowExpanding: GridViewRowCancelEventArgs,
    rowFocusing: GridViewRowFocusingEventArgs,
    selectionChanged: GridViewSelectionEventArgs,
    toolbarItemClick: GridToolbarItemClickEventArgs
  ): BootstrapGridViewEventMap = {
    val __obj = js.Dynamic.literal(batchEditChangesCanceling = batchEditChangesCanceling.asInstanceOf[js.Any], batchEditChangesSaving = batchEditChangesSaving.asInstanceOf[js.Any], batchEditConfirmShowing = batchEditConfirmShowing.asInstanceOf[js.Any], batchEditEndEditing = batchEditEndEditing.asInstanceOf[js.Any], batchEditRowDeleting = batchEditRowDeleting.asInstanceOf[js.Any], batchEditRowInserting = batchEditRowInserting.asInstanceOf[js.Any], batchEditRowValidating = batchEditRowValidating.asInstanceOf[js.Any], batchEditStartEditing = batchEditStartEditing.asInstanceOf[js.Any], batchEditTemplateCellFocused = batchEditTemplateCellFocused.asInstanceOf[js.Any], beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], columnGrouping = columnGrouping.asInstanceOf[js.Any], columnMoving = columnMoving.asInstanceOf[js.Any], columnResized = columnResized.asInstanceOf[js.Any], columnResizing = columnResizing.asInstanceOf[js.Any], columnSorting = columnSorting.asInstanceOf[js.Any], columnStartDragging = columnStartDragging.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], contextMenuItemClick = contextMenuItemClick.asInstanceOf[js.Any], customButtonClick = customButtonClick.asInstanceOf[js.Any], customizationWindowCloseUp = customizationWindowCloseUp.asInstanceOf[js.Any], detailRowCollapsing = detailRowCollapsing.asInstanceOf[js.Any], detailRowExpanding = detailRowExpanding.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], focusedCellChanging = focusedCellChanging.asInstanceOf[js.Any], focusedRowChanged = focusedRowChanged.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], rowClick = rowClick.asInstanceOf[js.Any], rowCollapsing = rowCollapsing.asInstanceOf[js.Any], rowDblClick = rowDblClick.asInstanceOf[js.Any], rowExpanding = rowExpanding.asInstanceOf[js.Any], rowFocusing = rowFocusing.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], toolbarItemClick = toolbarItemClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapGridViewEventMap]
  }
  
  extension [Self <: BootstrapGridViewEventMap](x: Self) {
    
    inline def setBatchEditChangesCanceling(value: GridViewBatchEditChangesCancelingEventArgs): Self = StObject.set(x, "batchEditChangesCanceling", value.asInstanceOf[js.Any])
    
    inline def setBatchEditChangesSaving(value: GridViewBatchEditChangesSavingEventArgs): Self = StObject.set(x, "batchEditChangesSaving", value.asInstanceOf[js.Any])
    
    inline def setBatchEditConfirmShowing(value: GridViewBatchEditConfirmShowingEventArgs): Self = StObject.set(x, "batchEditConfirmShowing", value.asInstanceOf[js.Any])
    
    inline def setBatchEditEndEditing(value: GridViewBatchEditEndEditingEventArgs): Self = StObject.set(x, "batchEditEndEditing", value.asInstanceOf[js.Any])
    
    inline def setBatchEditRowDeleting(value: GridViewBatchEditRowDeletingEventArgs): Self = StObject.set(x, "batchEditRowDeleting", value.asInstanceOf[js.Any])
    
    inline def setBatchEditRowInserting(value: GridViewBatchEditRowInsertingEventArgs): Self = StObject.set(x, "batchEditRowInserting", value.asInstanceOf[js.Any])
    
    inline def setBatchEditRowValidating(value: GridViewBatchEditRowValidatingEventArgs): Self = StObject.set(x, "batchEditRowValidating", value.asInstanceOf[js.Any])
    
    inline def setBatchEditStartEditing(value: GridViewBatchEditStartEditingEventArgs): Self = StObject.set(x, "batchEditStartEditing", value.asInstanceOf[js.Any])
    
    inline def setBatchEditTemplateCellFocused(value: GridViewBatchEditTemplateCellFocusedEventArgs): Self = StObject.set(x, "batchEditTemplateCellFocused", value.asInstanceOf[js.Any])
    
    inline def setBeginCallback(value: BeginCallbackEventArgs): Self = StObject.set(x, "beginCallback", value.asInstanceOf[js.Any])
    
    inline def setCallbackError(value: CallbackErrorEventArgs): Self = StObject.set(x, "callbackError", value.asInstanceOf[js.Any])
    
    inline def setColumnGrouping(value: GridViewColumnCancelEventArgs): Self = StObject.set(x, "columnGrouping", value.asInstanceOf[js.Any])
    
    inline def setColumnMoving(value: GridViewColumnMovingEventArgs): Self = StObject.set(x, "columnMoving", value.asInstanceOf[js.Any])
    
    inline def setColumnResized(value: GridViewColumnProcessingModeEventArgs): Self = StObject.set(x, "columnResized", value.asInstanceOf[js.Any])
    
    inline def setColumnResizing(value: GridViewColumnCancelEventArgs): Self = StObject.set(x, "columnResizing", value.asInstanceOf[js.Any])
    
    inline def setColumnSorting(value: GridViewColumnCancelEventArgs): Self = StObject.set(x, "columnSorting", value.asInstanceOf[js.Any])
    
    inline def setColumnStartDragging(value: GridViewColumnCancelEventArgs): Self = StObject.set(x, "columnStartDragging", value.asInstanceOf[js.Any])
    
    inline def setContextMenu(value: GridViewContextMenuEventArgs): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuItemClick(value: GridViewContextMenuItemClickEventArgs): Self = StObject.set(x, "contextMenuItemClick", value.asInstanceOf[js.Any])
    
    inline def setCustomButtonClick(value: GridViewCustomButtonEventArgs): Self = StObject.set(x, "customButtonClick", value.asInstanceOf[js.Any])
    
    inline def setCustomizationWindowCloseUp(value: EventArgs): Self = StObject.set(x, "customizationWindowCloseUp", value.asInstanceOf[js.Any])
    
    inline def setDetailRowCollapsing(value: GridViewRowCancelEventArgs): Self = StObject.set(x, "detailRowCollapsing", value.asInstanceOf[js.Any])
    
    inline def setDetailRowExpanding(value: GridViewRowCancelEventArgs): Self = StObject.set(x, "detailRowExpanding", value.asInstanceOf[js.Any])
    
    inline def setEndCallback(value: EndCallbackEventArgs): Self = StObject.set(x, "endCallback", value.asInstanceOf[js.Any])
    
    inline def setFocusedCellChanging(value: GridViewFocusedCellChangingEventArgs): Self = StObject.set(x, "focusedCellChanging", value.asInstanceOf[js.Any])
    
    inline def setFocusedRowChanged(value: GridViewFocusEventArgs): Self = StObject.set(x, "focusedRowChanged", value.asInstanceOf[js.Any])
    
    inline def setRowClick(value: GridViewRowClickEventArgs): Self = StObject.set(x, "rowClick", value.asInstanceOf[js.Any])
    
    inline def setRowCollapsing(value: GridViewRowCancelEventArgs): Self = StObject.set(x, "rowCollapsing", value.asInstanceOf[js.Any])
    
    inline def setRowDblClick(value: GridViewRowClickEventArgs): Self = StObject.set(x, "rowDblClick", value.asInstanceOf[js.Any])
    
    inline def setRowExpanding(value: GridViewRowCancelEventArgs): Self = StObject.set(x, "rowExpanding", value.asInstanceOf[js.Any])
    
    inline def setRowFocusing(value: GridViewRowFocusingEventArgs): Self = StObject.set(x, "rowFocusing", value.asInstanceOf[js.Any])
    
    inline def setSelectionChanged(value: GridViewSelectionEventArgs): Self = StObject.set(x, "selectionChanged", value.asInstanceOf[js.Any])
  }
}
