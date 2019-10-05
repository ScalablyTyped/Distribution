package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapCardViewEventMap extends BootstrapGridBaseEventMap {
  var batchEditCardDeleting: CardViewBatchEditCardDeletingEventArgs
  var batchEditCardInserting: CardViewBatchEditCardInsertingEventArgs
  var batchEditCardValidating: CardViewBatchEditCardValidatingEventArgs
  var batchEditChangesCanceling: CardViewBatchEditChangesCancelingEventArgs
  var batchEditChangesSaving: CardViewBatchEditChangesSavingEventArgs
  var batchEditConfirmShowing: CardViewBatchEditConfirmShowingEventArgs
  var batchEditEndEditing: CardViewBatchEditEndEditingEventArgs
  var batchEditStartEditing: CardViewBatchEditStartEditingEventArgs
  var batchEditTemplateCellFocused: CardViewBatchEditTemplateCellFocusedEventArgs
  var beginCallback: BeginCallbackEventArgs
  var callbackError: CallbackErrorEventArgs
  var cardClick: CardViewCardClickEventArgs
  var cardDblClick: CardViewCardClickEventArgs
  var cardFocusing: CardViewCardFocusingEventArgs
  var columnSorting: CardViewColumnCancelEventArgs
  var customButtonClick: CardViewCustomButtonEventArgs
  var customizationWindowCloseUp: EventArgs
  var endCallback: EndCallbackEventArgs
  var focusedCardChanged: CardViewFocusEventArgs
  var focusedCellChanging: CardViewFocusedCellChangingEventArgs
  var selectionChanged: CardViewSelectionEventArgs
}

object BootstrapCardViewEventMap {
  @scala.inline
  def apply(
    batchEditCardDeleting: CardViewBatchEditCardDeletingEventArgs,
    batchEditCardInserting: CardViewBatchEditCardInsertingEventArgs,
    batchEditCardValidating: CardViewBatchEditCardValidatingEventArgs,
    batchEditChangesCanceling: CardViewBatchEditChangesCancelingEventArgs,
    batchEditChangesSaving: CardViewBatchEditChangesSavingEventArgs,
    batchEditConfirmShowing: CardViewBatchEditConfirmShowingEventArgs,
    batchEditEndEditing: CardViewBatchEditEndEditingEventArgs,
    batchEditStartEditing: CardViewBatchEditStartEditingEventArgs,
    batchEditTemplateCellFocused: CardViewBatchEditTemplateCellFocusedEventArgs,
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    cardClick: CardViewCardClickEventArgs,
    cardDblClick: CardViewCardClickEventArgs,
    cardFocusing: CardViewCardFocusingEventArgs,
    columnSorting: CardViewColumnCancelEventArgs,
    customButtonClick: CardViewCustomButtonEventArgs,
    customizationWindowCloseUp: EventArgs,
    endCallback: EndCallbackEventArgs,
    focusedCardChanged: CardViewFocusEventArgs,
    focusedCellChanging: CardViewFocusedCellChangingEventArgs,
    init: EventArgs,
    selectionChanged: CardViewSelectionEventArgs,
    toolbarItemClick: GridToolbarItemClickEventArgs
  ): BootstrapCardViewEventMap = {
    val __obj = js.Dynamic.literal(batchEditCardDeleting = batchEditCardDeleting, batchEditCardInserting = batchEditCardInserting, batchEditCardValidating = batchEditCardValidating, batchEditChangesCanceling = batchEditChangesCanceling, batchEditChangesSaving = batchEditChangesSaving, batchEditConfirmShowing = batchEditConfirmShowing, batchEditEndEditing = batchEditEndEditing, batchEditStartEditing = batchEditStartEditing, batchEditTemplateCellFocused = batchEditTemplateCellFocused, beginCallback = beginCallback, callbackError = callbackError, cardClick = cardClick, cardDblClick = cardDblClick, cardFocusing = cardFocusing, columnSorting = columnSorting, customButtonClick = customButtonClick, customizationWindowCloseUp = customizationWindowCloseUp, endCallback = endCallback, focusedCardChanged = focusedCardChanged, focusedCellChanging = focusedCellChanging, init = init, selectionChanged = selectionChanged, toolbarItemClick = toolbarItemClick)
  
    __obj.asInstanceOf[BootstrapCardViewEventMap]
  }
}

