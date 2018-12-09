package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapCardView")
@js.native
class BootstrapCardView () extends BootstrapGridBase {
  val batchEditApi: BootstrapCardViewBatchEditApi | scala.Null = js.native
  def addNewCard(): scala.Unit = js.native
  def applyFilter(filterExpression: java.lang.String): scala.Unit = js.native
  def applySearchPanelFilter(value: java.lang.String): scala.Unit = js.native
  def cancelEdit(): scala.Unit = js.native
  def clearFilter(): scala.Unit = js.native
  def closeFilterControl(): scala.Unit = js.native
  def deleteCard(visibleIndex: scala.Double): scala.Unit = js.native
  def deleteCardByKey(key: js.Any): scala.Unit = js.native
  def focus(): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def focusEditor(columnFieldNameOrId: java.lang.String): scala.Unit = js.native
  def focusEditor(columnIndex: scala.Double): scala.Unit = js.native
  def focusEditor(column: BootstrapCardViewColumn): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def getCardKey(visibleIndex: scala.Double): java.lang.String = js.native
  def getColumn(columnIndex: scala.Double): BootstrapCardViewColumn | scala.Null = js.native
  def getColumnByField(columnFieldName: java.lang.String): BootstrapCardViewColumn | scala.Null = js.native
  def getColumnById(columnId: java.lang.String): BootstrapCardViewColumn | scala.Null = js.native
  def getColumnCount(): scala.Double = js.native
   // tslint:disable-line:unified-signatures
  def getEditValue(columnFieldNameOrId: java.lang.String): java.lang.String = js.native
  def getEditValue(columnIndex: scala.Double): java.lang.String = js.native
  def getEditValue(column: BootstrapCardViewColumn): java.lang.String = js.native
   // tslint:disable-line:unified-signatures
  def getEditor(columnFieldNameOrId: java.lang.String): BootstrapClientEdit = js.native
  def getEditor(columnIndex: scala.Double): BootstrapClientEdit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def getEditor(column: BootstrapCardViewColumn): BootstrapClientEdit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def getFocusedCardIndex(): scala.Double = js.native
  def getFocusedCell(): BootstrapCardViewCellInfo | scala.Null = js.native
  def getPageCount(): scala.Double = js.native
  def getPageIndex(): scala.Double = js.native
  def getPopupEditForm(): BootstrapPopupControl | scala.Null = js.native
  def getSelectedCardCount(): scala.Double = js.native
  def getSelectedKeysOnPage(): js.Array[_] = js.native
  def getTopVisibleIndex(): scala.Double = js.native
  def getVerticalScrollPosition(): scala.Double = js.native
  def getVisibleCardsOnPage(): scala.Double = js.native
  def gotoPage(pageIndex: scala.Double): scala.Unit = js.native
  def hideCustomizationWindow(): scala.Unit = js.native
  def isCardSelectedOnPage(visibleIndex: scala.Double): scala.Boolean = js.native
  def isCustomizationWindowVisible(): scala.Boolean = js.native
  def isEditing(): scala.Boolean = js.native
  def isNewCardEditing(): scala.Boolean = js.native
   // tslint:disable-line:unified-signatures
  def moveColumn(columnFieldNameOrId: java.lang.String): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def moveColumn(columnFieldNameOrId: java.lang.String, moveToColumnVisibleIndex: scala.Double): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def moveColumn(
    columnFieldNameOrId: java.lang.String,
    moveToColumnVisibleIndex: scala.Double,
    moveBefore: scala.Boolean
  ): scala.Unit = js.native
  def moveColumn(columnIndex: scala.Double): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def moveColumn(columnIndex: scala.Double, moveToColumnVisibleIndex: scala.Double): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def moveColumn(columnIndex: scala.Double, moveToColumnVisibleIndex: scala.Double, moveBefore: scala.Boolean): scala.Unit = js.native
  def moveColumn(column: BootstrapCardViewColumn): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def moveColumn(column: BootstrapCardViewColumn, moveToColumnVisibleIndex: scala.Double): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def moveColumn(column: BootstrapCardViewColumn, moveToColumnVisibleIndex: scala.Double, moveBefore: scala.Boolean): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def nextPage(): scala.Unit = js.native
  @JSName("off")
  def off_batchEditCardDeleting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditCardDeleting
  ): this.type = js.native
  @JSName("off")
  def off_batchEditCardDeleting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditCardDeleting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditCardDeletingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditCardInserting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditCardInserting
  ): this.type = js.native
  @JSName("off")
  def off_batchEditCardInserting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditCardInserting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditCardInsertingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditCardValidating(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditCardValidating
  ): this.type = js.native
  @JSName("off")
  def off_batchEditCardValidating(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditCardValidating,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditCardValidatingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditChangesCanceling(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditChangesCanceling
  ): this.type = js.native
  @JSName("off")
  def off_batchEditChangesCanceling(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditChangesCanceling,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditChangesCancelingEventArgs], 
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
      /* args */ js.UndefOr[CardViewBatchEditChangesSavingEventArgs], 
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
      /* args */ js.UndefOr[CardViewBatchEditConfirmShowingEventArgs], 
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
      /* args */ js.UndefOr[CardViewBatchEditEndEditingEventArgs], 
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
      /* args */ js.UndefOr[CardViewBatchEditStartEditingEventArgs], 
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
      /* args */ js.UndefOr[CardViewBatchEditTemplateCellFocusedEventArgs], 
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
  def off_cardClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cardClick
  ): this.type = js.native
  @JSName("off")
  def off_cardClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cardClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewCardClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_cardDblClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cardDblClick
  ): this.type = js.native
  @JSName("off")
  def off_cardDblClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cardDblClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewCardClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_cardFocusing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cardFocusing
  ): this.type = js.native
  @JSName("off")
  def off_cardFocusing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cardFocusing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewCardFocusingEventArgs], 
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
      /* args */ js.UndefOr[CardViewColumnCancelEventArgs], 
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
      /* args */ js.UndefOr[CardViewCustomButtonEventArgs], 
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
  def off_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback
  ): this.type = js.native
  @JSName("off")
  def off_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_focusedCardChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.focusedCardChanged
  ): this.type = js.native
  @JSName("off")
  def off_focusedCardChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.focusedCardChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewFocusEventArgs], scala.Unit]
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
      /* args */ js.UndefOr[CardViewFocusedCellChangingEventArgs], 
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
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewSelectionEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditCardDeleting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditCardDeleting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditCardDeletingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditCardInserting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditCardInserting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditCardInsertingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditCardValidating(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditCardValidating,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditCardValidatingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditChangesCanceling(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditChangesCanceling,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditChangesCancelingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditChangesSaving(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditChangesSaving,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditChangesSavingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditConfirmShowing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditConfirmShowing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditConfirmShowingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditEndEditing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditEndEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditEndEditingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditStartEditing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditStartEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditStartEditingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditTemplateCellFocused(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditTemplateCellFocused,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditTemplateCellFocusedEventArgs], 
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
  def on_cardClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cardClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewCardClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_cardDblClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cardDblClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewCardClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_cardFocusing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cardFocusing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewCardFocusingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_columnSorting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnSorting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewColumnCancelEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_customButtonClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.customButtonClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewCustomButtonEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_customizationWindowCloseUp(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.customizationWindowCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_focusedCardChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.focusedCardChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewFocusEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_focusedCellChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.focusedCellChanging,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewFocusedCellChangingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_selectionChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewSelectionEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditCardDeleting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditCardDeleting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditCardDeletingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditCardInserting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditCardInserting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditCardInsertingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditCardValidating(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditCardValidating,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditCardValidatingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditChangesCanceling(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditChangesCanceling,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditChangesCancelingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditChangesSaving(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditChangesSaving,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditChangesSavingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditConfirmShowing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditConfirmShowing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditConfirmShowingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditEndEditing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditEndEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditEndEditingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditStartEditing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditStartEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditStartEditingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditTemplateCellFocused(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.batchEditTemplateCellFocused,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditTemplateCellFocusedEventArgs], 
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
  def once_cardClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cardClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewCardClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_cardDblClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cardDblClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewCardClickEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_cardFocusing(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.cardFocusing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewCardFocusingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_columnSorting(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.columnSorting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewColumnCancelEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_customButtonClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.customButtonClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewCustomButtonEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_customizationWindowCloseUp(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.customizationWindowCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_endCallback(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_focusedCardChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.focusedCardChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewFocusEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_focusedCellChanging(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.focusedCellChanging,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewFocusedCellChangingEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_selectionChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewSelectionEventArgs], scala.Unit]
  ): this.type = js.native
  def performCallback(data: js.Any): js.Promise[scala.Unit] = js.native
  def performCallback(data: js.Any, onSuccess: js.Function0[scala.Unit]): scala.Unit = js.native
  def prevPage(): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def selectAllCardsOnPage(): scala.Unit = js.native
  def selectCardOnPage(visibleIndex: scala.Double): scala.Unit = js.native
  def selectCardOnPage(visibleIndex: scala.Double, selected: scala.Boolean): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def selectCards(): scala.Unit = js.native
  def selectCardsByKey(key: js.Any): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def selectCardsByKey(key: js.Any, selected: scala.Boolean): scala.Unit = js.native
  def selectCardsByKey(keys: js.Array[_]): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def selectCardsByKey(keys: js.Array[_], selected: scala.Boolean): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def setEditValue(columnFieldNameOrId: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setEditValue(columnIndex: scala.Double, value: java.lang.String): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def setEditValue(column: BootstrapCardViewColumn, value: java.lang.String): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def setFilterEnabled(isFilterEnabled: scala.Boolean): scala.Unit = js.native
  def setFocusedCardIndex(visibleIndex: scala.Double): scala.Unit = js.native
  def setFocusedCell(cardVisibleIndex: scala.Double, columnIndex: scala.Double): scala.Unit = js.native
  def setSearchPanelCustomEditor(editor: BootstrapClientEdit): scala.Unit = js.native
  def setVerticalScrollPosition(position: scala.Double): scala.Unit = js.native
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
  def sortBy(column: BootstrapCardViewColumn): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures
  def sortBy(column: BootstrapCardViewColumn, sortOrder: java.lang.String): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def sortBy(column: BootstrapCardViewColumn, sortOrder: java.lang.String, reset: scala.Boolean): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def sortBy(
    column: BootstrapCardViewColumn,
    sortOrder: java.lang.String,
    reset: scala.Boolean,
    sortIndex: scala.Double
  ): scala.Unit = js.native
   // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def startEditCard(visibleIndex: scala.Double): scala.Unit = js.native
  def startEditCardByKey(key: js.Any): scala.Unit = js.native
  def unselectAllCardsOnPage(): scala.Unit = js.native
  def unselectCardOnPage(visibleIndex: scala.Double): scala.Unit = js.native
  def unselectCards(): scala.Unit = js.native
  def unselectCardsByKey(key: js.Any): scala.Unit = js.native
  def unselectCardsByKey(keys: js.Array[_]): scala.Unit = js.native
   // tslint:disable-line:unified-signatures
  def unselectFilteredCards(): scala.Unit = js.native
  def updateEdit(): scala.Unit = js.native
}

