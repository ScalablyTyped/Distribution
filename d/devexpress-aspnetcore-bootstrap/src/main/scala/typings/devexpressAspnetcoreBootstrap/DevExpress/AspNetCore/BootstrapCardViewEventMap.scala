package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapCardViewEventMap extends BootstrapGridBaseEventMap {
  var batchEditCardDeleting: CardViewBatchEditCardDeletingEventArgs = js.native
  var batchEditCardInserting: CardViewBatchEditCardInsertingEventArgs = js.native
  var batchEditCardValidating: CardViewBatchEditCardValidatingEventArgs = js.native
  var batchEditChangesCanceling: CardViewBatchEditChangesCancelingEventArgs = js.native
  var batchEditChangesSaving: CardViewBatchEditChangesSavingEventArgs = js.native
  var batchEditConfirmShowing: CardViewBatchEditConfirmShowingEventArgs = js.native
  var batchEditEndEditing: CardViewBatchEditEndEditingEventArgs = js.native
  var batchEditStartEditing: CardViewBatchEditStartEditingEventArgs = js.native
  var batchEditTemplateCellFocused: CardViewBatchEditTemplateCellFocusedEventArgs = js.native
  var beginCallback: BeginCallbackEventArgs = js.native
  var callbackError: CallbackErrorEventArgs = js.native
  var cardClick: CardViewCardClickEventArgs = js.native
  var cardDblClick: CardViewCardClickEventArgs = js.native
  var cardFocusing: CardViewCardFocusingEventArgs = js.native
  var columnSorting: CardViewColumnCancelEventArgs = js.native
  var customButtonClick: CardViewCustomButtonEventArgs = js.native
  var customizationWindowCloseUp: EventArgs = js.native
  var endCallback: EndCallbackEventArgs = js.native
  var focusedCardChanged: CardViewFocusEventArgs = js.native
  var focusedCellChanging: CardViewFocusedCellChangingEventArgs = js.native
  var selectionChanged: CardViewSelectionEventArgs = js.native
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
    val __obj = js.Dynamic.literal(batchEditCardDeleting = batchEditCardDeleting.asInstanceOf[js.Any], batchEditCardInserting = batchEditCardInserting.asInstanceOf[js.Any], batchEditCardValidating = batchEditCardValidating.asInstanceOf[js.Any], batchEditChangesCanceling = batchEditChangesCanceling.asInstanceOf[js.Any], batchEditChangesSaving = batchEditChangesSaving.asInstanceOf[js.Any], batchEditConfirmShowing = batchEditConfirmShowing.asInstanceOf[js.Any], batchEditEndEditing = batchEditEndEditing.asInstanceOf[js.Any], batchEditStartEditing = batchEditStartEditing.asInstanceOf[js.Any], batchEditTemplateCellFocused = batchEditTemplateCellFocused.asInstanceOf[js.Any], beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], cardClick = cardClick.asInstanceOf[js.Any], cardDblClick = cardDblClick.asInstanceOf[js.Any], cardFocusing = cardFocusing.asInstanceOf[js.Any], columnSorting = columnSorting.asInstanceOf[js.Any], customButtonClick = customButtonClick.asInstanceOf[js.Any], customizationWindowCloseUp = customizationWindowCloseUp.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], focusedCardChanged = focusedCardChanged.asInstanceOf[js.Any], focusedCellChanging = focusedCellChanging.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], toolbarItemClick = toolbarItemClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapCardViewEventMap]
  }
  @scala.inline
  implicit class BootstrapCardViewEventMapOps[Self <: BootstrapCardViewEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBatchEditCardDeleting(value: CardViewBatchEditCardDeletingEventArgs): Self = this.set("batchEditCardDeleting", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchEditCardInserting(value: CardViewBatchEditCardInsertingEventArgs): Self = this.set("batchEditCardInserting", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchEditCardValidating(value: CardViewBatchEditCardValidatingEventArgs): Self = this.set("batchEditCardValidating", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchEditChangesCanceling(value: CardViewBatchEditChangesCancelingEventArgs): Self = this.set("batchEditChangesCanceling", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchEditChangesSaving(value: CardViewBatchEditChangesSavingEventArgs): Self = this.set("batchEditChangesSaving", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchEditConfirmShowing(value: CardViewBatchEditConfirmShowingEventArgs): Self = this.set("batchEditConfirmShowing", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchEditEndEditing(value: CardViewBatchEditEndEditingEventArgs): Self = this.set("batchEditEndEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchEditStartEditing(value: CardViewBatchEditStartEditingEventArgs): Self = this.set("batchEditStartEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchEditTemplateCellFocused(value: CardViewBatchEditTemplateCellFocusedEventArgs): Self = this.set("batchEditTemplateCellFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeginCallback(value: BeginCallbackEventArgs): Self = this.set("beginCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallbackError(value: CallbackErrorEventArgs): Self = this.set("callbackError", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardClick(value: CardViewCardClickEventArgs): Self = this.set("cardClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardDblClick(value: CardViewCardClickEventArgs): Self = this.set("cardDblClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardFocusing(value: CardViewCardFocusingEventArgs): Self = this.set("cardFocusing", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnSorting(value: CardViewColumnCancelEventArgs): Self = this.set("columnSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomButtonClick(value: CardViewCustomButtonEventArgs): Self = this.set("customButtonClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomizationWindowCloseUp(value: EventArgs): Self = this.set("customizationWindowCloseUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndCallback(value: EndCallbackEventArgs): Self = this.set("endCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusedCardChanged(value: CardViewFocusEventArgs): Self = this.set("focusedCardChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusedCellChanging(value: CardViewFocusedCellChangingEventArgs): Self = this.set("focusedCellChanging", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionChanged(value: CardViewSelectionEventArgs): Self = this.set("selectionChanged", value.asInstanceOf[js.Any])
  }
  
}

