package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.batchEditChangesCanceling
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.batchEditChangesSaving
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.batchEditConfirmShowing
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.batchEditEndEditing
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.batchEditRowDeleting
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.batchEditRowInserting
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.batchEditRowValidating
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.batchEditStartEditing
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.batchEditTemplateCellFocused
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.beginCallback
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.callbackError
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.columnGrouping
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.columnMoving
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.columnResized
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.columnResizing
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.columnSorting
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.columnStartDragging
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.contextMenu
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.contextMenuItemClick
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.customButtonClick
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.customizationWindowCloseUp
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.detailRowCollapsing
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.detailRowExpanding
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.endCallback
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.focusedCellChanging
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.focusedRowChanged
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.rowClick
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.rowCollapsing
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.rowDblClick
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.rowExpanding
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.rowFocusing
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.selectionChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapGridView")
@js.native
class BootstrapGridView () extends BootstrapGridBase {
  val batchEditApi: BootstrapGridViewBatchEditApi | Null = js.native
  def addNewRow(): Unit = js.native
  def applyFilter(filterExpression: String): Unit = js.native
  def applyOnClickRowFilter(): Unit = js.native
  def applySearchPanelFilter(value: String): Unit = js.native
   // tslint:disable-line:unified-signatures
  def autoFilterByColumn(columnFieldNameOrId: String, `val`: String): Unit = js.native
  def autoFilterByColumn(columnIndex: Double, `val`: String): Unit = js.native
  def autoFilterByColumn(column: BootstrapGridViewColumn, `val`: String): Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def cancelEdit(): Unit = js.native
  def clearFilter(): Unit = js.native
  def closeFilterControl(): Unit = js.native
  def collapseAll(): Unit = js.native
  def collapseAllDetailRows(): Unit = js.native
  def collapseDetailRow(visibleIndex: Double): Unit = js.native
  def collapseRow(visibleIndex: Double): Unit = js.native
  def collapseRow(visibleIndex: Double, recursive: Boolean): Unit = js.native
   // tslint:disable-line:unified-signatures
  def deleteRow(visibleIndex: Double): Unit = js.native
  def deleteRowByKey(key: js.Any): Unit = js.native
  def expandAll(): Unit = js.native
  def expandAllDetailRows(): Unit = js.native
  def expandDetailRow(visibleIndex: Double): Unit = js.native
  def expandRow(visibleIndex: Double): Unit = js.native
  def expandRow(visibleIndex: Double, recursive: Boolean): Unit = js.native
   // tslint:disable-line:unified-signatures
  def focus(): Unit = js.native
   // tslint:disable-line:unified-signatures
  def focusEditor(columnFieldNameOrId: String): Unit = js.native
  def focusEditor(columnIndex: Double): Unit = js.native
  def focusEditor(column: BootstrapGridViewColumn): Unit = js.native
   // tslint:disable-line:unified-signatures
  def getAutoFilterEditor(columnFieldNameOrId: String): js.Any = js.native
  def getAutoFilterEditor(columnIndex: Double): js.Any = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def getAutoFilterEditor(column: BootstrapGridViewColumn): js.Any = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def getColumn(columnIndex: Double): BootstrapGridViewColumn | Null = js.native
  def getColumnByField(columnFieldName: String): BootstrapGridViewColumn | Null = js.native
  def getColumnById(columnId: String): BootstrapGridViewColumn | Null = js.native
  def getColumnCount(): Double = js.native
  def getColumnLayout(): js.Any = js.native
   // tslint:disable-line:unified-signatures
  def getEditValue(columnFieldNameOrId: String): String = js.native
  def getEditValue(columnIndex: Double): String = js.native
  def getEditValue(column: BootstrapGridViewColumn): String = js.native
   // tslint:disable-line:unified-signatures
  def getEditor(columnFieldNameOrId: String): BootstrapClientEdit = js.native
  def getEditor(columnIndex: Double): BootstrapClientEdit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def getEditor(column: BootstrapGridViewColumn): BootstrapClientEdit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def getFocusedCell(): BootstrapGridViewCellInfo | Null = js.native
  def getFocusedRowIndex(): Double = js.native
  def getHorizontalScrollPosition(): Double = js.native
  def getPageCount(): Double = js.native
  def getPageIndex(): Double = js.native
  def getPopupEditForm(): BootstrapPopupControl | Null = js.native
  def getRowIndicesVisibleInViewPort(includePartiallyVisible: Boolean): js.Array[Double] = js.native
  def getRowKey(visibleIndex: Double): String = js.native
  def getSelectedKeysOnPage(): js.Array[_] = js.native
  def getSelectedRowCount(): Double = js.native
  def getTopVisibleIndex(): Double = js.native
  def getVerticalScrollPosition(): Double = js.native
  def getVisibleRowsOnPage(): Double = js.native
  def gotoPage(pageIndex: Double): Unit = js.native
   // tslint:disable-line:unified-signatures
  def groupBy(columnFieldNameOrId: String): Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def groupBy(columnFieldNameOrId: String, groupIndex: Double): Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def groupBy(columnFieldNameOrId: String, groupIndex: Double, sortOrder: String): Unit = js.native
  def groupBy(columnIndex: Double): Unit = js.native
   // tslint:disable-line:unified-signatures
  def groupBy(columnIndex: Double, groupIndex: Double): Unit = js.native
   // tslint:disable-line:unified-signatures
  def groupBy(columnIndex: Double, groupIndex: Double, sortOrder: String): Unit = js.native
  def groupBy(column: BootstrapGridViewColumn): Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def groupBy(column: BootstrapGridViewColumn, groupIndex: Double): Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def groupBy(column: BootstrapGridViewColumn, groupIndex: Double, sortOrder: String): Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def hideCustomizationWindow(): Unit = js.native
  def isCustomizationWindowVisible(): Boolean = js.native
  def isDataRow(visibleIndex: Double): Boolean = js.native
  def isEditing(): Boolean = js.native
  def isGroupRow(visibleIndex: Double): Boolean = js.native
  def isGroupRowExpanded(visibleIndex: Double): Boolean = js.native
  def isNewRowEditing(): Boolean = js.native
  def isRowSelectedOnPage(visibleIndex: Double): Boolean = js.native
  def makeRowVisible(visibleIndex: Double): Unit = js.native
  def nextPage(): Unit = js.native
  @JSName("off")
  def off_batchEditChangesCanceling(eventName: batchEditChangesCanceling): this.type = js.native
  @JSName("off")
  def off_batchEditChangesCanceling(
    eventName: batchEditChangesCanceling,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditChangesCancelingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditChangesSaving(eventName: batchEditChangesSaving): this.type = js.native
  @JSName("off")
  def off_batchEditChangesSaving(
    eventName: batchEditChangesSaving,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditChangesSavingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditConfirmShowing(eventName: batchEditConfirmShowing): this.type = js.native
  @JSName("off")
  def off_batchEditConfirmShowing(
    eventName: batchEditConfirmShowing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditConfirmShowingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditEndEditing(eventName: batchEditEndEditing): this.type = js.native
  @JSName("off")
  def off_batchEditEndEditing(
    eventName: batchEditEndEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditEndEditingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditRowDeleting(eventName: batchEditRowDeleting): this.type = js.native
  @JSName("off")
  def off_batchEditRowDeleting(
    eventName: batchEditRowDeleting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditRowDeletingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditRowInserting(eventName: batchEditRowInserting): this.type = js.native
  @JSName("off")
  def off_batchEditRowInserting(
    eventName: batchEditRowInserting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditRowInsertingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditRowValidating(eventName: batchEditRowValidating): this.type = js.native
  @JSName("off")
  def off_batchEditRowValidating(
    eventName: batchEditRowValidating,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditRowValidatingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditStartEditing(eventName: batchEditStartEditing): this.type = js.native
  @JSName("off")
  def off_batchEditStartEditing(
    eventName: batchEditStartEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditStartEditingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditTemplateCellFocused(eventName: batchEditTemplateCellFocused): this.type = js.native
  @JSName("off")
  def off_batchEditTemplateCellFocused(
    eventName: batchEditTemplateCellFocused,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditTemplateCellFocusedEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_beginCallback(eventName: beginCallback): this.type = js.native
  @JSName("off")
  def off_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_callbackError(eventName: callbackError): this.type = js.native
  @JSName("off")
  def off_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_columnGrouping(eventName: columnGrouping): this.type = js.native
  @JSName("off")
  def off_columnGrouping(
    eventName: columnGrouping,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewColumnCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_columnMoving(eventName: columnMoving): this.type = js.native
  @JSName("off")
  def off_columnMoving(
    eventName: columnMoving,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewColumnMovingEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_columnResized(eventName: columnResized): this.type = js.native
  @JSName("off")
  def off_columnResized(
    eventName: columnResized,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnProcessingModeEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_columnResizing(eventName: columnResizing): this.type = js.native
  @JSName("off")
  def off_columnResizing(
    eventName: columnResizing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewColumnCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_columnSorting(eventName: columnSorting): this.type = js.native
  @JSName("off")
  def off_columnSorting(
    eventName: columnSorting,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewColumnCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_columnStartDragging(eventName: columnStartDragging): this.type = js.native
  @JSName("off")
  def off_columnStartDragging(
    eventName: columnStartDragging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewColumnCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_contextMenu(eventName: contextMenu): this.type = js.native
  @JSName("off")
  def off_contextMenu(
    eventName: contextMenu,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewContextMenuEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_contextMenuItemClick(eventName: contextMenuItemClick): this.type = js.native
  @JSName("off")
  def off_contextMenuItemClick(
    eventName: contextMenuItemClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewContextMenuItemClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_customButtonClick(eventName: customButtonClick): this.type = js.native
  @JSName("off")
  def off_customButtonClick(
    eventName: customButtonClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewCustomButtonEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_customizationWindowCloseUp(eventName: customizationWindowCloseUp): this.type = js.native
  @JSName("off")
  def off_customizationWindowCloseUp(
    eventName: customizationWindowCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_detailRowCollapsing(eventName: detailRowCollapsing): this.type = js.native
  @JSName("off")
  def off_detailRowCollapsing(
    eventName: detailRowCollapsing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_detailRowExpanding(eventName: detailRowExpanding): this.type = js.native
  @JSName("off")
  def off_detailRowExpanding(
    eventName: detailRowExpanding,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_endCallback(eventName: endCallback): this.type = js.native
  @JSName("off")
  def off_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_focusedCellChanging(eventName: focusedCellChanging): this.type = js.native
  @JSName("off")
  def off_focusedCellChanging(
    eventName: focusedCellChanging,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewFocusedCellChangingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_focusedRowChanged(eventName: focusedRowChanged): this.type = js.native
  @JSName("off")
  def off_focusedRowChanged(
    eventName: focusedRowChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewFocusEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_rowClick(eventName: rowClick): this.type = js.native
  @JSName("off")
  def off_rowClick(
    eventName: rowClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_rowCollapsing(eventName: rowCollapsing): this.type = js.native
  @JSName("off")
  def off_rowCollapsing(
    eventName: rowCollapsing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_rowDblClick(eventName: rowDblClick): this.type = js.native
  @JSName("off")
  def off_rowDblClick(
    eventName: rowDblClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_rowExpanding(eventName: rowExpanding): this.type = js.native
  @JSName("off")
  def off_rowExpanding(
    eventName: rowExpanding,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_rowFocusing(eventName: rowFocusing): this.type = js.native
  @JSName("off")
  def off_rowFocusing(
    eventName: rowFocusing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowFocusingEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_selectionChanged(eventName: selectionChanged): this.type = js.native
  @JSName("off")
  def off_selectionChanged(
    eventName: selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewSelectionEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditChangesCanceling(
    eventName: batchEditChangesCanceling,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditChangesCancelingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditChangesSaving(
    eventName: batchEditChangesSaving,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditChangesSavingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditConfirmShowing(
    eventName: batchEditConfirmShowing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditConfirmShowingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditEndEditing(
    eventName: batchEditEndEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditEndEditingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditRowDeleting(
    eventName: batchEditRowDeleting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditRowDeletingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditRowInserting(
    eventName: batchEditRowInserting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditRowInsertingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditRowValidating(
    eventName: batchEditRowValidating,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditRowValidatingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditStartEditing(
    eventName: batchEditStartEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditStartEditingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditTemplateCellFocused(
    eventName: batchEditTemplateCellFocused,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditTemplateCellFocusedEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_columnGrouping(
    eventName: columnGrouping,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewColumnCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_columnMoving(
    eventName: columnMoving,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewColumnMovingEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_columnResized(
    eventName: columnResized,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnProcessingModeEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_columnResizing(
    eventName: columnResizing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewColumnCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_columnSorting(
    eventName: columnSorting,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewColumnCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_columnStartDragging(
    eventName: columnStartDragging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewColumnCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_contextMenu(
    eventName: contextMenu,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewContextMenuEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_contextMenuItemClick(
    eventName: contextMenuItemClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewContextMenuItemClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_customButtonClick(
    eventName: customButtonClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewCustomButtonEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_customizationWindowCloseUp(
    eventName: customizationWindowCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_detailRowCollapsing(
    eventName: detailRowCollapsing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_detailRowExpanding(
    eventName: detailRowExpanding,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_focusedCellChanging(
    eventName: focusedCellChanging,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewFocusedCellChangingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_focusedRowChanged(
    eventName: focusedRowChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewFocusEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rowClick(
    eventName: rowClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rowCollapsing(
    eventName: rowCollapsing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rowDblClick(
    eventName: rowDblClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rowExpanding(
    eventName: rowExpanding,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rowFocusing(
    eventName: rowFocusing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowFocusingEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_selectionChanged(
    eventName: selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewSelectionEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditChangesCanceling(
    eventName: batchEditChangesCanceling,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditChangesCancelingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditChangesSaving(
    eventName: batchEditChangesSaving,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditChangesSavingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditConfirmShowing(
    eventName: batchEditConfirmShowing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditConfirmShowingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditEndEditing(
    eventName: batchEditEndEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditEndEditingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditRowDeleting(
    eventName: batchEditRowDeleting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditRowDeletingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditRowInserting(
    eventName: batchEditRowInserting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditRowInsertingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditRowValidating(
    eventName: batchEditRowValidating,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditRowValidatingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditStartEditing(
    eventName: batchEditStartEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditStartEditingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditTemplateCellFocused(
    eventName: batchEditTemplateCellFocused,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditTemplateCellFocusedEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_columnGrouping(
    eventName: columnGrouping,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewColumnCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_columnMoving(
    eventName: columnMoving,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewColumnMovingEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_columnResized(
    eventName: columnResized,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnProcessingModeEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_columnResizing(
    eventName: columnResizing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewColumnCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_columnSorting(
    eventName: columnSorting,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewColumnCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_columnStartDragging(
    eventName: columnStartDragging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewColumnCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_contextMenu(
    eventName: contextMenu,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewContextMenuEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_contextMenuItemClick(
    eventName: contextMenuItemClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewContextMenuItemClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_customButtonClick(
    eventName: customButtonClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewCustomButtonEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_customizationWindowCloseUp(
    eventName: customizationWindowCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_detailRowCollapsing(
    eventName: detailRowCollapsing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_detailRowExpanding(
    eventName: detailRowExpanding,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_focusedCellChanging(
    eventName: focusedCellChanging,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewFocusedCellChangingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_focusedRowChanged(
    eventName: focusedRowChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewFocusEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rowClick(
    eventName: rowClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rowCollapsing(
    eventName: rowCollapsing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rowDblClick(
    eventName: rowDblClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rowExpanding(
    eventName: rowExpanding,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rowFocusing(
    eventName: rowFocusing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowFocusingEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_selectionChanged(
    eventName: selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewSelectionEventArgs], Unit]
  ): this.type = js.native
  def performCallback(data: js.Any): js.Promise[Unit] = js.native
  def performCallback(data: js.Any, onSuccess: js.Function0[Unit]): Unit = js.native
  def prevPage(): Unit = js.native
  def refresh(): Unit = js.native
  def selectAllRowsOnPage(): Unit = js.native
  def selectRowOnPage(visibleIndex: Double): Unit = js.native
  def selectRowOnPage(visibleIndex: Double, selected: Boolean): Unit = js.native
   // tslint:disable-line:unified-signatures
  def selectRows(): Unit = js.native
  def selectRowsByKey(key: js.Any): Unit = js.native
   // tslint:disable-line:unified-signatures
  def selectRowsByKey(key: js.Any, selected: Boolean): Unit = js.native
  def selectRowsByKey(keys: js.Array[_]): Unit = js.native
   // tslint:disable-line:unified-signatures
  def selectRowsByKey(keys: js.Array[_], selected: Boolean): Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def setColumnLayout(columnLayout: js.Any): Unit = js.native
   // tslint:disable-line:unified-signatures
  def setEditValue(columnFieldNameOrId: String, value: String): Unit = js.native
  def setEditValue(columnIndex: Double, value: String): Unit = js.native
  def setEditValue(column: BootstrapGridViewColumn, value: String): Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def setFilterEnabled(isFilterEnabled: Boolean): Unit = js.native
  def setFixedColumnScrollableRows(scrollableRowSettings: js.Any): Unit = js.native
  def setFocusedCell(rowVisibleIndex: Double, columnIndex: Double): Unit = js.native
  def setFocusedRowIndex(visibleIndex: Double): Unit = js.native
  def setHorizontalScrollPosition(position: Double): Unit = js.native
  def setSearchPanelCustomEditor(editor: BootstrapClientEdit): Unit = js.native
  def setVerticalScrollPosition(position: Double): Unit = js.native
  def showCustomizationDialog(): Unit = js.native
  def showCustomizationWindow(): Unit = js.native
  def showFilterControl(): Unit = js.native
   // tslint:disable-line:unified-signatures
  def sortBy(columnFieldNameOrId: String): Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def sortBy(columnFieldNameOrId: String, sortOrder: String): Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def sortBy(columnFieldNameOrId: String, sortOrder: String, reset: Boolean): Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def sortBy(columnFieldNameOrId: String, sortOrder: String, reset: Boolean, sortIndex: Double): Unit = js.native
  def sortBy(columnIndex: Double): Unit = js.native
   // tslint:disable-line:unified-signatures
  def sortBy(columnIndex: Double, sortOrder: String): Unit = js.native
   // tslint:disable-line:unified-signatures
  def sortBy(columnIndex: Double, sortOrder: String, reset: Boolean): Unit = js.native
   // tslint:disable-line:unified-signatures
  def sortBy(columnIndex: Double, sortOrder: String, reset: Boolean, sortIndex: Double): Unit = js.native
  def sortBy(column: BootstrapGridViewColumn): Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def sortBy(column: BootstrapGridViewColumn, sortOrder: String): Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def sortBy(column: BootstrapGridViewColumn, sortOrder: String, reset: Boolean): Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def sortBy(column: BootstrapGridViewColumn, sortOrder: String, reset: Boolean, sortIndex: Double): Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def startEditRow(visibleIndex: Double): Unit = js.native
  def startEditRowByKey(key: js.Any): Unit = js.native
   // tslint:disable-line:unified-signatures
  def ungroup(columnFieldNameOrId: String): Unit = js.native
  def ungroup(columnIndex: Double): Unit = js.native
  def ungroup(column: BootstrapGridViewColumn): Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def unselectAllRowsOnPage(): Unit = js.native
  def unselectFilteredRows(): Unit = js.native
  def unselectRowOnPage(visibleIndex: Double): Unit = js.native
  def unselectRows(): Unit = js.native
  def unselectRowsByKey(key: js.Any): Unit = js.native
  def unselectRowsByKey(keys: js.Array[_]): Unit = js.native
   // tslint:disable-line:unified-signatures
  def updateEdit(): Unit = js.native
}

