package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditRowValidating event.
  */
@js.native
trait ASPxClientGridViewBatchEditRowValidatingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the row's key.
    */
  var key: js.Any = js.native
  /**
    * Provides validation information of a row currently being validated.
    */
  var validationInfo: js.Any = js.native
  /**
    * Gets the processed row's visible index.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientGridViewBatchEditRowValidatingEventArgs {
  @scala.inline
  def apply(key: js.Any, validationInfo: js.Any, visibleIndex: Double): ASPxClientGridViewBatchEditRowValidatingEventArgs = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], validationInfo = validationInfo.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditRowValidatingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientGridViewBatchEditRowValidatingEventArgsOps[Self <: ASPxClientGridViewBatchEditRowValidatingEventArgs] (val x: Self) extends AnyVal {
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
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidationInfo(value: js.Any): Self = this.set("validationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibleIndex(value: Double): Self = this.set("visibleIndex", value.asInstanceOf[js.Any])
  }
  
}

