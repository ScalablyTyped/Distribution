package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.SelectionChanged event.
  */
@js.native
trait ASPxClientCardViewSelectionEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets whether all cards displayed within a page have been selected or unselected.
    */
  var isAllRecordsOnPage: Boolean = js.native
  /**
    * Gets whether a selection has been changed on the server.
    */
  var isChangedOnServer: Boolean = js.native
  /**
    * Gets whether the card has been selected.
    */
  var isSelected: Boolean = js.native
  /**
    * Gets the visible index of the card whose selected state has been changed.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientCardViewSelectionEventArgs {
  @scala.inline
  def apply(
    isAllRecordsOnPage: Boolean,
    isChangedOnServer: Boolean,
    isSelected: Boolean,
    processOnServer: Boolean,
    visibleIndex: Double
  ): ASPxClientCardViewSelectionEventArgs = {
    val __obj = js.Dynamic.literal(isAllRecordsOnPage = isAllRecordsOnPage.asInstanceOf[js.Any], isChangedOnServer = isChangedOnServer.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewSelectionEventArgs]
  }
  @scala.inline
  implicit class ASPxClientCardViewSelectionEventArgsOps[Self <: ASPxClientCardViewSelectionEventArgs] (val x: Self) extends AnyVal {
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
    def setIsAllRecordsOnPage(value: Boolean): Self = this.set("isAllRecordsOnPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsChangedOnServer(value: Boolean): Self = this.set("isChangedOnServer", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibleIndex(value: Double): Self = this.set("visibleIndex", value.asInstanceOf[js.Any])
  }
  
}

