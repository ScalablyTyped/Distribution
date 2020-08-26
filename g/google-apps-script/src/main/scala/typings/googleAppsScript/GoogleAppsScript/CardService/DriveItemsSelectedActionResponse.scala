package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a response that makes changes to Drive while Drive items are selected and in reaction to an action taken in the UI, such as a button click.
  */
@js.native
trait DriveItemsSelectedActionResponse extends js.Object {
  def printJson(): String = js.native
}

object DriveItemsSelectedActionResponse {
  @scala.inline
  def apply(printJson: () => String): DriveItemsSelectedActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
    __obj.asInstanceOf[DriveItemsSelectedActionResponse]
  }
  @scala.inline
  implicit class DriveItemsSelectedActionResponseOps[Self <: DriveItemsSelectedActionResponse] (val x: Self) extends AnyVal {
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
    def setPrintJson(value: () => String): Self = this.set("printJson", js.Any.fromFunction0(value))
  }
  
}

