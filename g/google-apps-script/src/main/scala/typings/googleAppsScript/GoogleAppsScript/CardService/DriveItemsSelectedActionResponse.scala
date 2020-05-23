package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a response that makes changes to Drive while Drive items are selected and in reaction to an action taken in the UI, such as a button click.
  */
trait DriveItemsSelectedActionResponse extends js.Object {
  def printJson(): String
}

object DriveItemsSelectedActionResponse {
  @scala.inline
  def apply(printJson: () => String): DriveItemsSelectedActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
    __obj.asInstanceOf[DriveItemsSelectedActionResponse]
  }
}

