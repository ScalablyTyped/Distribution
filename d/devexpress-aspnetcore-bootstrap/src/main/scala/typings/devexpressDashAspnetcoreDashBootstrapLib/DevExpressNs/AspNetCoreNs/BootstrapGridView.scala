package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapGridView")
@js.native
class BootstrapGridView () extends BootstrapGridBase {
  val batchEditApi: BootstrapGridViewBatchEditApi | scala.Null = js.native
  def addNewRow(): scala.Unit = js.native
  def applyFilter(filterExpression: java.lang.String): scala.Unit = js.native
  def applyOnClickRowFilter(): scala.Unit = js.native
  def applySearchPanelFilter(value: java.lang.String): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def autoFilterByColumn(columnFieldNameOrId: java.lang.String, `val`: java.lang.String): scala.Unit = js.native
  def autoFilterByColumn(columnIndex: scala.Double, `val`: java.lang.String): scala.Unit = js.native
  def autoFilterByColumn(column: BootstrapGridViewColumn, `val`: java.lang.String): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def cancelEdit(): scala.Unit = js.native
  def clearFilter(): scala.Unit = js.native
  def closeFilterControl(): scala.Unit = js.native
  def collapseAll(): scala.Unit = js.native
  def collapseAllDetailRows(): scala.Unit = js.native
  def collapseDetailRow(visibleIndex: scala.Double): scala.Unit = js.native
  def collapseRow(visibleIndex: scala.Double): scala.Unit = js.native
  def collapseRow(visibleIndex: scala.Double, recursive: scala.Boolean): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def deleteRow(visibleIndex: scala.Double): scala.Unit = js.native
  def deleteRowByKey(key: js.Any): scala.Unit = js.native
  def expandAll(): scala.Unit = js.native
  def expandAllDetailRows(): scala.Unit = js.native
  def expandDetailRow(visibleIndex: scala.Double): scala.Unit = js.native
  def expandRow(visibleIndex: scala.Double): scala.Unit = js.native
  def expandRow(visibleIndex: scala.Double, recursive: scala.Boolean): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def focus(): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def focusEditor(columnFieldNameOrId: java.lang.String): scala.Unit = js.native
  def focusEditor(columnIndex: scala.Double): scala.Unit = js.native
  def focusEditor(column: BootstrapGridViewColumn): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def getAutoFilterEditor(columnFieldNameOrId: java.lang.String): js.Any = js.native
  def getAutoFilterEditor(columnIndex: scala.Double): js.Any = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def getAutoFilterEditor(column: BootstrapGridViewColumn): js.Any = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def getColumn(columnIndex: scala.Double): BootstrapGridViewColumn | scala.Null = js.native
  def getColumnByField(columnFieldName: java.lang.String): BootstrapGridViewColumn | scala.Null = js.native
  def getColumnById(columnId: java.lang.String): BootstrapGridViewColumn | scala.Null = js.native
  def getColumnCount(): scala.Double = js.native
  def getColumnLayout(): js.Any = js.native
   // tslint:disable-line:unified-signatures
  def getEditValue(columnFieldNameOrId: java.lang.String): java.lang.String = js.native
  def getEditValue(columnIndex: scala.Double): java.lang.String = js.native
  def getEditValue(column: BootstrapGridViewColumn): java.lang.String = js.native
   // tslint:disable-line:unified-signatures
  def getEditor(columnFieldNameOrId: java.lang.String): BootstrapClientEdit = js.native
  def getEditor(columnIndex: scala.Double): BootstrapClientEdit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def getEditor(column: BootstrapGridViewColumn): BootstrapClientEdit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def getFocusedCell(): BootstrapGridViewCellInfo | scala.Null = js.native
  def getFocusedRowIndex(): scala.Double = js.native
  def getHorizontalScrollPosition(): scala.Double = js.native
  def getPageCount(): scala.Double = js.native
  def getPageIndex(): scala.Double = js.native
  def getPopupEditForm(): BootstrapPopupControl | scala.Null = js.native
  def getRowIndicesVisibleInViewPort(includePartiallyVisible: scala.Boolean): js.Array[scala.Double] = js.native
  def getRowKey(visibleIndex: scala.Double): java.lang.String = js.native
  def getSelectedKeysOnPage(): js.Array[_] = js.native
  def getSelectedRowCount(): scala.Double = js.native
  def getTopVisibleIndex(): scala.Double = js.native
  def getVerticalScrollPosition(): scala.Double = js.native
  def getVisibleRowsOnPage(): scala.Double = js.native
  def gotoPage(pageIndex: scala.Double): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def groupBy(columnFieldNameOrId: java.lang.String): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def groupBy(columnFieldNameOrId: java.lang.String, groupIndex: scala.Double): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def groupBy(columnFieldNameOrId: java.lang.String, groupIndex: scala.Double, sortOrder: java.lang.String): scala.Unit = js.native
  def groupBy(columnIndex: scala.Double): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def groupBy(columnIndex: scala.Double, groupIndex: scala.Double): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def groupBy(columnIndex: scala.Double, groupIndex: scala.Double, sortOrder: java.lang.String): scala.Unit = js.native
  def groupBy(column: BootstrapGridViewColumn): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def groupBy(column: BootstrapGridViewColumn, groupIndex: scala.Double): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def groupBy(column: BootstrapGridViewColumn, groupIndex: scala.Double, sortOrder: java.lang.String): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def hideCustomizationWindow(): scala.Unit = js.native
  def isCustomizationWindowVisible(): scala.Boolean = js.native
  def isDataRow(visibleIndex: scala.Double): scala.Boolean = js.native
  def isEditing(): scala.Boolean = js.native
  def isGroupRow(visibleIndex: scala.Double): scala.Boolean = js.native
  def isGroupRowExpanded(visibleIndex: scala.Double): scala.Boolean = js.native
  def isNewRowEditing(): scala.Boolean = js.native
  def isRowSelectedOnPage(visibleIndex: scala.Double): scala.Boolean = js.native
  def makeRowVisible(visibleIndex: scala.Double): scala.Unit = js.native
  def nextPage(): scala.Unit = js.native
  @JSName("off")
  def off_batchEditChangesCanceling(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditChangesCanceling
  ): this.type = js.native
  @JSName("off")
  def off_batchEditChangesCanceling(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditChangesCanceling,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditChangesCancelingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditChangesSaving(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditChangesSaving
  ): this.type = js.native
  @JSName("off")
  def off_batchEditChangesSaving(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditChangesSaving,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditChangesSavingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditConfirmShowing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditConfirmShowing
  ): this.type = js.native
  @JSName("off")
  def off_batchEditConfirmShowing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditConfirmShowing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditConfirmShowingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditEndEditing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditEndEditing
  ): this.type = js.native
  @JSName("off")
  def off_batchEditEndEditing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditEndEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditEndEditingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditRowDeleting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditRowDeleting
  ): this.type = js.native
  @JSName("off")
  def off_batchEditRowDeleting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditRowDeleting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditRowDeletingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditRowInserting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditRowInserting
  ): this.type = js.native
  @JSName("off")
  def off_batchEditRowInserting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditRowInserting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditRowInsertingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditRowValidating(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditRowValidating
  ): this.type = js.native
  @JSName("off")
  def off_batchEditRowValidating(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditRowValidating,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditRowValidatingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditStartEditing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditStartEditing
  ): this.type = js.native
  @JSName("off")
  def off_batchEditStartEditing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditStartEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditStartEditingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditTemplateCellFocused(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditTemplateCellFocused
  ): this.type = js.native
  @JSName("off")
  def off_batchEditTemplateCellFocused(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditTemplateCellFocused,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditTemplateCellFocusedEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_beginCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.beginCallback
  ): this.type = js.native
  @JSName("off")
  def off_beginCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_callbackError(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.callbackError
  ): this.type = js.native
  @JSName("off")
  def off_callbackError(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_columnGrouping(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnGrouping
  ): this.type = js.native
  @JSName("off")
  def off_columnGrouping(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnGrouping,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnCancelEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_columnMoving(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnMoving
  ): this.type = js.native
  @JSName("off")
  def off_columnMoving(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnMoving,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnMovingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_columnResized(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnResized
  ): this.type = js.native
  @JSName("off")
  def off_columnResized(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnResized,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnProcessingModeEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_columnResizing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnResizing
  ): this.type = js.native
  @JSName("off")
  def off_columnResizing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnResizing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnCancelEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_columnSorting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnSorting
  ): this.type = js.native
  @JSName("off")
  def off_columnSorting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnSorting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnCancelEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_columnStartDragging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnStartDragging
  ): this.type = js.native
  @JSName("off")
  def off_columnStartDragging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnStartDragging,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnCancelEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_contextMenu(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.contextMenu
  ): this.type = js.native
  @JSName("off")
  def off_contextMenu(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.contextMenu,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewContextMenuEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_contextMenuItemClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.contextMenuItemClick
  ): this.type = js.native
  @JSName("off")
  def off_contextMenuItemClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.contextMenuItemClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewContextMenuItemClickEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_customButtonClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.customButtonClick
  ): this.type = js.native
  @JSName("off")
  def off_customButtonClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.customButtonClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewCustomButtonEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_customizationWindowCloseUp(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.customizationWindowCloseUp
  ): this.type = js.native
  @JSName("off")
  def off_customizationWindowCloseUp(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.customizationWindowCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_detailRowCollapsing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.detailRowCollapsing
  ): this.type = js.native
  @JSName("off")
  def off_detailRowCollapsing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.detailRowCollapsing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_detailRowExpanding(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.detailRowExpanding
  ): this.type = js.native
  @JSName("off")
  def off_detailRowExpanding(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.detailRowExpanding,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback
  ): this.type = js.native
  @JSName("off")
  def off_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_focusedCellChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.focusedCellChanging
  ): this.type = js.native
  @JSName("off")
  def off_focusedCellChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.focusedCellChanging,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewFocusedCellChangingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_focusedRowChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.focusedRowChanged
  ): this.type = js.native
  @JSName("off")
  def off_focusedRowChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.focusedRowChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewFocusEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_rowClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowClick
  ): this.type = js.native
  @JSName("off")
  def off_rowClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_rowCollapsing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowCollapsing
  ): this.type = js.native
  @JSName("off")
  def off_rowCollapsing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowCollapsing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_rowDblClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowDblClick
  ): this.type = js.native
  @JSName("off")
  def off_rowDblClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowDblClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_rowExpanding(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowExpanding
  ): this.type = js.native
  @JSName("off")
  def off_rowExpanding(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowExpanding,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_rowFocusing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowFocusing
  ): this.type = js.native
  @JSName("off")
  def off_rowFocusing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowFocusing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewRowFocusingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_selectionChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectionChanged
  ): this.type = js.native
  @JSName("off")
  def off_selectionChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewSelectionEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditChangesCanceling(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditChangesCanceling,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditChangesCancelingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditChangesSaving(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditChangesSaving,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditChangesSavingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditConfirmShowing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditConfirmShowing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditConfirmShowingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditEndEditing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditEndEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditEndEditingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditRowDeleting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditRowDeleting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditRowDeletingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditRowInserting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditRowInserting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditRowInsertingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditRowValidating(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditRowValidating,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditRowValidatingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditStartEditing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditStartEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditStartEditingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditTemplateCellFocused(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditTemplateCellFocused,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditTemplateCellFocusedEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_beginCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_callbackError(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_columnGrouping(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnGrouping,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnCancelEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_columnMoving(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnMoving,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnMovingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_columnResized(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnResized,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnProcessingModeEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_columnResizing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnResizing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnCancelEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_columnSorting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnSorting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnCancelEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_columnStartDragging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnStartDragging,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnCancelEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_contextMenu(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.contextMenu,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewContextMenuEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_contextMenuItemClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.contextMenuItemClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewContextMenuItemClickEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_customButtonClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.customButtonClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewCustomButtonEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_customizationWindowCloseUp(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.customizationWindowCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_detailRowCollapsing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.detailRowCollapsing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_detailRowExpanding(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.detailRowExpanding,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_focusedCellChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.focusedCellChanging,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewFocusedCellChangingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_focusedRowChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.focusedRowChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewFocusEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rowClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rowCollapsing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowCollapsing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rowDblClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowDblClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rowExpanding(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowExpanding,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rowFocusing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowFocusing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewRowFocusingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_selectionChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewSelectionEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditChangesCanceling(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditChangesCanceling,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditChangesCancelingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditChangesSaving(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditChangesSaving,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditChangesSavingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditConfirmShowing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditConfirmShowing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditConfirmShowingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditEndEditing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditEndEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditEndEditingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditRowDeleting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditRowDeleting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditRowDeletingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditRowInserting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditRowInserting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditRowInsertingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditRowValidating(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditRowValidating,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditRowValidatingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditStartEditing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditStartEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditStartEditingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditTemplateCellFocused(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditTemplateCellFocused,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewBatchEditTemplateCellFocusedEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_beginCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_callbackError(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_columnGrouping(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnGrouping,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnCancelEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_columnMoving(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnMoving,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnMovingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_columnResized(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnResized,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnProcessingModeEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_columnResizing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnResizing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnCancelEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_columnSorting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnSorting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnCancelEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_columnStartDragging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnStartDragging,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewColumnCancelEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_contextMenu(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.contextMenu,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewContextMenuEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_contextMenuItemClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.contextMenuItemClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewContextMenuItemClickEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_customButtonClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.customButtonClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewCustomButtonEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_customizationWindowCloseUp(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.customizationWindowCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_detailRowCollapsing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.detailRowCollapsing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_detailRowExpanding(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.detailRowExpanding,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_focusedCellChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.focusedCellChanging,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewFocusedCellChangingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_focusedRowChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.focusedRowChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewFocusEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rowClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rowCollapsing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowCollapsing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rowDblClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowDblClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rowExpanding(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowExpanding,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewRowCancelEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rowFocusing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.rowFocusing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridViewRowFocusingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_selectionChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridViewSelectionEventArgs], scala.Unit]
  ): this.type = js.native
  def performCallback(data: js.Any): stdLib.Promise[scala.Unit] = js.native
  def performCallback(data: js.Any, onSuccess: js.Function0[scala.Unit]): scala.Unit = js.native
  def prevPage(): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def selectAllRowsOnPage(): scala.Unit = js.native
  def selectRowOnPage(visibleIndex: scala.Double): scala.Unit = js.native
  def selectRowOnPage(visibleIndex: scala.Double, selected: scala.Boolean): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def selectRows(): scala.Unit = js.native
  def selectRowsByKey(key: js.Any): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def selectRowsByKey(key: js.Any, selected: scala.Boolean): scala.Unit = js.native
  def selectRowsByKey(keys: js.Array[_]): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def selectRowsByKey(keys: js.Array[_], selected: scala.Boolean): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def setColumnLayout(columnLayout: js.Any): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def setEditValue(columnFieldNameOrId: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setEditValue(columnIndex: scala.Double, value: java.lang.String): scala.Unit = js.native
  def setEditValue(column: BootstrapGridViewColumn, value: java.lang.String): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def setFilterEnabled(isFilterEnabled: scala.Boolean): scala.Unit = js.native
  def setFixedColumnScrollableRows(scrollableRowSettings: js.Any): scala.Unit = js.native
  def setFocusedCell(rowVisibleIndex: scala.Double, columnIndex: scala.Double): scala.Unit = js.native
  def setFocusedRowIndex(visibleIndex: scala.Double): scala.Unit = js.native
  def setHorizontalScrollPosition(position: scala.Double): scala.Unit = js.native
  def setSearchPanelCustomEditor(editor: BootstrapClientEdit): scala.Unit = js.native
  def setVerticalScrollPosition(position: scala.Double): scala.Unit = js.native
  def showCustomizationDialog(): scala.Unit = js.native
  def showCustomizationWindow(): scala.Unit = js.native
  def showFilterControl(): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def sortBy(columnFieldNameOrId: java.lang.String): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def sortBy(columnFieldNameOrId: java.lang.String, sortOrder: java.lang.String): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def sortBy(columnFieldNameOrId: java.lang.String, sortOrder: java.lang.String, reset: scala.Boolean): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def sortBy(
    columnFieldNameOrId: java.lang.String,
    sortOrder: java.lang.String,
    reset: scala.Boolean,
    sortIndex: scala.Double
  ): scala.Unit = js.native
  def sortBy(columnIndex: scala.Double): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def sortBy(columnIndex: scala.Double, sortOrder: java.lang.String): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def sortBy(columnIndex: scala.Double, sortOrder: java.lang.String, reset: scala.Boolean): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def sortBy(
    columnIndex: scala.Double,
    sortOrder: java.lang.String,
    reset: scala.Boolean,
    sortIndex: scala.Double
  ): scala.Unit = js.native
  def sortBy(column: BootstrapGridViewColumn): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def sortBy(column: BootstrapGridViewColumn, sortOrder: java.lang.String): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def sortBy(column: BootstrapGridViewColumn, sortOrder: java.lang.String, reset: scala.Boolean): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def sortBy(
    column: BootstrapGridViewColumn,
    sortOrder: java.lang.String,
    reset: scala.Boolean,
    sortIndex: scala.Double
  ): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def startEditRow(visibleIndex: scala.Double): scala.Unit = js.native
  def startEditRowByKey(key: js.Any): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def ungroup(columnFieldNameOrId: java.lang.String): scala.Unit = js.native
  def ungroup(columnIndex: scala.Double): scala.Unit = js.native
  def ungroup(column: BootstrapGridViewColumn): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def unselectAllRowsOnPage(): scala.Unit = js.native
  def unselectFilteredRows(): scala.Unit = js.native
  def unselectRowOnPage(visibleIndex: scala.Double): scala.Unit = js.native
  def unselectRows(): scala.Unit = js.native
  def unselectRowsByKey(key: js.Any): scala.Unit = js.native
  def unselectRowsByKey(keys: js.Array[_]): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def updateEdit(): scala.Unit = js.native
}

