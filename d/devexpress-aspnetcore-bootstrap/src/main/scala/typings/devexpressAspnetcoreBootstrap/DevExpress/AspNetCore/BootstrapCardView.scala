package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.batchEditCardDeleting
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.batchEditCardInserting
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.batchEditCardValidating
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.batchEditChangesCanceling
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.batchEditChangesSaving
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.batchEditConfirmShowing
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.batchEditEndEditing
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.batchEditStartEditing
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.batchEditTemplateCellFocused
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.beginCallback
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.callbackError
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.cardClick
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.cardDblClick
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.cardFocusing
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.columnSorting
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.customButtonClick
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.customizationWindowCloseUp
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.endCallback
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.focusedCardChanged
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.focusedCellChanging
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.selectionChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapCardView
  extends StObject
     with BootstrapGridBase {
  
  def addNewCard(): Unit = js.native
  
  def applyFilter(filterExpression: String): Unit = js.native
  
  def applySearchPanelFilter(value: String): Unit = js.native
  
  val batchEditApi: BootstrapCardViewBatchEditApi | Null = js.native
  
  def cancelEdit(): Unit = js.native
  
  def clearFilter(): Unit = js.native
  
  def closeFilterControl(): Unit = js.native
  
  def deleteCard(visibleIndex: Double): Unit = js.native
  
  def deleteCardByKey(key: Any): Unit = js.native
  
  def focus(): Unit = js.native
  
  // tslint:disable-line:unified-signatures
  def focusEditor(columnFieldNameOrId: String): Unit = js.native
  def focusEditor(columnIndex: Double): Unit = js.native
  def focusEditor(column: BootstrapCardViewColumn): Unit = js.native
  
  // tslint:disable-line:unified-signatures unified-signatures
  def getCardKey(visibleIndex: Double): String = js.native
  
  def getColumn(columnIndex: Double): BootstrapCardViewColumn | Null = js.native
  
  def getColumnByField(columnFieldName: String): BootstrapCardViewColumn | Null = js.native
  
  def getColumnById(columnId: String): BootstrapCardViewColumn | Null = js.native
  
  def getColumnCount(): Double = js.native
  
  // tslint:disable-line:unified-signatures
  def getEditValue(columnFieldNameOrId: String): String = js.native
  def getEditValue(columnIndex: Double): String = js.native
  def getEditValue(column: BootstrapCardViewColumn): String = js.native
  
  // tslint:disable-line:unified-signatures
  def getEditor(columnFieldNameOrId: String): BootstrapClientEdit = js.native
  def getEditor(columnIndex: Double): BootstrapClientEdit = js.native
  // tslint:disable-line:unified-signatures unified-signatures
  def getEditor(column: BootstrapCardViewColumn): BootstrapClientEdit = js.native
  
  // tslint:disable-line:unified-signatures unified-signatures
  def getFocusedCardIndex(): Double = js.native
  
  def getFocusedCell(): BootstrapCardViewCellInfo | Null = js.native
  
  def getPageCount(): Double = js.native
  
  def getPageIndex(): Double = js.native
  
  def getPopupEditForm(): BootstrapPopupControl | Null = js.native
  
  def getSelectedCardCount(): Double = js.native
  
  def getSelectedKeysOnPage(): js.Array[Any] = js.native
  
  def getTopVisibleIndex(): Double = js.native
  
  def getVerticalScrollPosition(): Double = js.native
  
  def getVisibleCardsOnPage(): Double = js.native
  
  def gotoPage(pageIndex: Double): Unit = js.native
  
  def hideCustomizationWindow(): Unit = js.native
  
  def isCardSelectedOnPage(visibleIndex: Double): Boolean = js.native
  
  def isCustomizationWindowVisible(): Boolean = js.native
  
  def isEditing(): Boolean = js.native
  
  def isNewCardEditing(): Boolean = js.native
  
  // tslint:disable-line:unified-signatures
  def moveColumn(columnFieldNameOrId: String): Unit = js.native
  // tslint:disable-line:unified-signatures unified-signatures
  def moveColumn(columnFieldNameOrId: String, moveToColumnVisibleIndex: Double): Unit = js.native
  // tslint:disable-line:unified-signatures unified-signatures
  def moveColumn(columnFieldNameOrId: String, moveToColumnVisibleIndex: Double, moveBefore: Boolean): Unit = js.native
  def moveColumn(columnIndex: Double): Unit = js.native
  // tslint:disable-line:unified-signatures
  def moveColumn(columnIndex: Double, moveToColumnVisibleIndex: Double): Unit = js.native
  // tslint:disable-line:unified-signatures
  def moveColumn(columnIndex: Double, moveToColumnVisibleIndex: Double, moveBefore: Boolean): Unit = js.native
  def moveColumn(column: BootstrapCardViewColumn): Unit = js.native
  // tslint:disable-line:unified-signatures unified-signatures
  def moveColumn(column: BootstrapCardViewColumn, moveToColumnVisibleIndex: Double): Unit = js.native
  // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def moveColumn(column: BootstrapCardViewColumn, moveToColumnVisibleIndex: Double, moveBefore: Boolean): Unit = js.native
  
  // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def nextPage(): Unit = js.native
  
  @JSName("off")
  def off_batchEditCardDeleting(eventName: batchEditCardDeleting): this.type = js.native
  @JSName("off")
  def off_batchEditCardDeleting(
    eventName: batchEditCardDeleting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditCardDeletingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditCardInserting(eventName: batchEditCardInserting): this.type = js.native
  @JSName("off")
  def off_batchEditCardInserting(
    eventName: batchEditCardInserting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditCardInsertingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditCardValidating(eventName: batchEditCardValidating): this.type = js.native
  @JSName("off")
  def off_batchEditCardValidating(
    eventName: batchEditCardValidating,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditCardValidatingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_batchEditChangesCanceling(eventName: batchEditChangesCanceling): this.type = js.native
  @JSName("off")
  def off_batchEditChangesCanceling(
    eventName: batchEditChangesCanceling,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditChangesCancelingEventArgs], 
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
      /* args */ js.UndefOr[CardViewBatchEditChangesSavingEventArgs], 
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
      /* args */ js.UndefOr[CardViewBatchEditConfirmShowingEventArgs], 
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
      /* args */ js.UndefOr[CardViewBatchEditEndEditingEventArgs], 
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
      /* args */ js.UndefOr[CardViewBatchEditStartEditingEventArgs], 
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
      /* args */ js.UndefOr[CardViewBatchEditTemplateCellFocusedEventArgs], 
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
  def off_cardClick(eventName: cardClick): this.type = js.native
  @JSName("off")
  def off_cardClick(
    eventName: cardClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewCardClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_cardDblClick(eventName: cardDblClick): this.type = js.native
  @JSName("off")
  def off_cardDblClick(
    eventName: cardDblClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewCardClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_cardFocusing(eventName: cardFocusing): this.type = js.native
  @JSName("off")
  def off_cardFocusing(
    eventName: cardFocusing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewCardFocusingEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_columnSorting(eventName: columnSorting): this.type = js.native
  @JSName("off")
  def off_columnSorting(
    eventName: columnSorting,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewColumnCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_customButtonClick(eventName: customButtonClick): this.type = js.native
  @JSName("off")
  def off_customButtonClick(
    eventName: customButtonClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewCustomButtonEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_customizationWindowCloseUp(eventName: customizationWindowCloseUp): this.type = js.native
  @JSName("off")
  def off_customizationWindowCloseUp(
    eventName: customizationWindowCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_endCallback(eventName: endCallback): this.type = js.native
  @JSName("off")
  def off_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_focusedCardChanged(eventName: focusedCardChanged): this.type = js.native
  @JSName("off")
  def off_focusedCardChanged(
    eventName: focusedCardChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewFocusEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_focusedCellChanging(eventName: focusedCellChanging): this.type = js.native
  @JSName("off")
  def off_focusedCellChanging(
    eventName: focusedCellChanging,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewFocusedCellChangingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_selectionChanged(eventName: selectionChanged): this.type = js.native
  @JSName("off")
  def off_selectionChanged(
    eventName: selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewSelectionEventArgs], Unit]
  ): this.type = js.native
  
  @JSName("on")
  def on_batchEditCardDeleting(
    eventName: batchEditCardDeleting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditCardDeletingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditCardInserting(
    eventName: batchEditCardInserting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditCardInsertingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditCardValidating(
    eventName: batchEditCardValidating,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditCardValidatingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditChangesCanceling(
    eventName: batchEditChangesCanceling,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditChangesCancelingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditChangesSaving(
    eventName: batchEditChangesSaving,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditChangesSavingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditConfirmShowing(
    eventName: batchEditConfirmShowing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditConfirmShowingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditEndEditing(
    eventName: batchEditEndEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditEndEditingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditStartEditing(
    eventName: batchEditStartEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditStartEditingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_batchEditTemplateCellFocused(
    eventName: batchEditTemplateCellFocused,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditTemplateCellFocusedEventArgs], 
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
  def on_cardClick(
    eventName: cardClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewCardClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_cardDblClick(
    eventName: cardDblClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewCardClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_cardFocusing(
    eventName: cardFocusing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewCardFocusingEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_columnSorting(
    eventName: columnSorting,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewColumnCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_customButtonClick(
    eventName: customButtonClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewCustomButtonEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_customizationWindowCloseUp(
    eventName: customizationWindowCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_focusedCardChanged(
    eventName: focusedCardChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewFocusEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_focusedCellChanging(
    eventName: focusedCellChanging,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewFocusedCellChangingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_selectionChanged(
    eventName: selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewSelectionEventArgs], Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_batchEditCardDeleting(
    eventName: batchEditCardDeleting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditCardDeletingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditCardInserting(
    eventName: batchEditCardInserting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditCardInsertingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditCardValidating(
    eventName: batchEditCardValidating,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditCardValidatingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditChangesCanceling(
    eventName: batchEditChangesCanceling,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditChangesCancelingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditChangesSaving(
    eventName: batchEditChangesSaving,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditChangesSavingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditConfirmShowing(
    eventName: batchEditConfirmShowing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditConfirmShowingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditEndEditing(
    eventName: batchEditEndEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditEndEditingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditStartEditing(
    eventName: batchEditStartEditing,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditStartEditingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_batchEditTemplateCellFocused(
    eventName: batchEditTemplateCellFocused,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewBatchEditTemplateCellFocusedEventArgs], 
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
  def once_cardClick(
    eventName: cardClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewCardClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_cardDblClick(
    eventName: cardDblClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewCardClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_cardFocusing(
    eventName: cardFocusing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewCardFocusingEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_columnSorting(
    eventName: columnSorting,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewColumnCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_customButtonClick(
    eventName: customButtonClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewCustomButtonEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_customizationWindowCloseUp(
    eventName: customizationWindowCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_focusedCardChanged(
    eventName: focusedCardChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewFocusEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_focusedCellChanging(
    eventName: focusedCellChanging,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CardViewFocusedCellChangingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_selectionChanged(
    eventName: selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CardViewSelectionEventArgs], Unit]
  ): this.type = js.native
  
  def performCallback(data: Any): js.Promise[Unit] = js.native
  def performCallback(data: Any, onSuccess: js.Function0[Unit]): Unit = js.native
  
  def prevPage(): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def selectAllCardsOnPage(): Unit = js.native
  
  def selectCardOnPage(visibleIndex: Double): Unit = js.native
  def selectCardOnPage(visibleIndex: Double, selected: Boolean): Unit = js.native
  
  // tslint:disable-line:unified-signatures
  def selectCards(): Unit = js.native
  
  def selectCardsByKey(key: Any): Unit = js.native
  // tslint:disable-line:unified-signatures
  def selectCardsByKey(key: Any, selected: Boolean): Unit = js.native
  def selectCardsByKey(keys: js.Array[Any]): Unit = js.native
  // tslint:disable-line:unified-signatures
  def selectCardsByKey(keys: js.Array[Any], selected: Boolean): Unit = js.native
  
  // tslint:disable-line:unified-signatures
  def setEditValue(columnFieldNameOrId: String, value: String): Unit = js.native
  def setEditValue(columnIndex: Double, value: String): Unit = js.native
  // tslint:disable-line:unified-signatures unified-signatures
  def setEditValue(column: BootstrapCardViewColumn, value: String): Unit = js.native
  
  // tslint:disable-line:unified-signatures unified-signatures
  def setFilterEnabled(isFilterEnabled: Boolean): Unit = js.native
  
  def setFocusedCardIndex(visibleIndex: Double): Unit = js.native
  
  def setFocusedCell(cardVisibleIndex: Double, columnIndex: Double): Unit = js.native
  
  def setSearchPanelCustomEditor(editor: BootstrapClientEdit): Unit = js.native
  
  def setVerticalScrollPosition(position: Double): Unit = js.native
  
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
  def sortBy(column: BootstrapCardViewColumn): Unit = js.native
  // tslint:disable-line:unified-signatures unified-signatures
  def sortBy(column: BootstrapCardViewColumn, sortOrder: String): Unit = js.native
  // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def sortBy(column: BootstrapCardViewColumn, sortOrder: String, reset: Boolean): Unit = js.native
  // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def sortBy(column: BootstrapCardViewColumn, sortOrder: String, reset: Boolean, sortIndex: Double): Unit = js.native
  
  // tslint:disable-line:unified-signatures unified-signatures unified-signatures
  def startEditCard(visibleIndex: Double): Unit = js.native
  
  def startEditCardByKey(key: Any): Unit = js.native
  
  def unselectAllCardsOnPage(): Unit = js.native
  
  def unselectCardOnPage(visibleIndex: Double): Unit = js.native
  
  def unselectCards(): Unit = js.native
  
  def unselectCardsByKey(key: Any): Unit = js.native
  def unselectCardsByKey(keys: js.Array[Any]): Unit = js.native
  
  // tslint:disable-line:unified-signatures
  def unselectFilteredCards(): Unit = js.native
  
  def updateEdit(): Unit = js.native
}
