package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.BatchEditCardValidating event.
  */
@js.native
trait ASPxClientCardViewBatchEditCardValidatingEventArgs extends ASPxClientEventArgs {
  /**
    * Provides validation information of a card currently being validated.
    */
  var validationInfo: js.Any = js.native
  /**
    * Gets the processed card's visible index.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientCardViewBatchEditCardValidatingEventArgs {
  @scala.inline
  def apply(validationInfo: js.Any, visibleIndex: Double): ASPxClientCardViewBatchEditCardValidatingEventArgs = {
    val __obj = js.Dynamic.literal(validationInfo = validationInfo.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewBatchEditCardValidatingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientCardViewBatchEditCardValidatingEventArgsOps[Self <: ASPxClientCardViewBatchEditCardValidatingEventArgs] (val x: Self) extends AnyVal {
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
    def setValidationInfo(value: js.Any): Self = this.set("validationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibleIndex(value: Double): Self = this.set("visibleIndex", value.asInstanceOf[js.Any])
  }
  
}

