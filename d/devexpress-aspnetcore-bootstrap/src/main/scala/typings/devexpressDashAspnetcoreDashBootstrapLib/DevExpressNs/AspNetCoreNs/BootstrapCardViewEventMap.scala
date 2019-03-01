package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("batchEditCardDeleting")(batchEditCardDeleting)
    __obj.updateDynamic("batchEditCardInserting")(batchEditCardInserting)
    __obj.updateDynamic("batchEditCardValidating")(batchEditCardValidating)
    __obj.updateDynamic("batchEditChangesCanceling")(batchEditChangesCanceling)
    __obj.updateDynamic("batchEditChangesSaving")(batchEditChangesSaving)
    __obj.updateDynamic("batchEditConfirmShowing")(batchEditConfirmShowing)
    __obj.updateDynamic("batchEditEndEditing")(batchEditEndEditing)
    __obj.updateDynamic("batchEditStartEditing")(batchEditStartEditing)
    __obj.updateDynamic("batchEditTemplateCellFocused")(batchEditTemplateCellFocused)
    __obj.updateDynamic("beginCallback")(beginCallback)
    __obj.updateDynamic("callbackError")(callbackError)
    __obj.updateDynamic("cardClick")(cardClick)
    __obj.updateDynamic("cardDblClick")(cardDblClick)
    __obj.updateDynamic("cardFocusing")(cardFocusing)
    __obj.updateDynamic("columnSorting")(columnSorting)
    __obj.updateDynamic("customButtonClick")(customButtonClick)
    __obj.updateDynamic("customizationWindowCloseUp")(customizationWindowCloseUp)
    __obj.updateDynamic("endCallback")(endCallback)
    __obj.updateDynamic("focusedCardChanged")(focusedCardChanged)
    __obj.updateDynamic("focusedCellChanging")(focusedCellChanging)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("selectionChanged")(selectionChanged)
    __obj.updateDynamic("toolbarItemClick")(toolbarItemClick)
    __obj.asInstanceOf[BootstrapCardViewEventMap]
  }
}

