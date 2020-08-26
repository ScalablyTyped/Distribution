package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRatingControl.ItemClick event.
  */
@js.native
trait ASPxClientRatingControlItemClickEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the index of the item related to the event.
    */
  var index: Double = js.native
}

object ASPxClientRatingControlItemClickEventArgs {
  @scala.inline
  def apply(index: Double, processOnServer: Boolean): ASPxClientRatingControlItemClickEventArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRatingControlItemClickEventArgs]
  }
  @scala.inline
  implicit class ASPxClientRatingControlItemClickEventArgsOps[Self <: ASPxClientRatingControlItemClickEventArgs] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
  }
  
}

