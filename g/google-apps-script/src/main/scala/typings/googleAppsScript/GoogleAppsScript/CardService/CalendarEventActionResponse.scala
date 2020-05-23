package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a response that makes changes to the calendar event that the user is currently editing in reaction to an action taken in the UI, such as a button click.
  */
trait CalendarEventActionResponse extends js.Object {
  def printJson(): String
}

object CalendarEventActionResponse {
  @scala.inline
  def apply(printJson: () => String): CalendarEventActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
    __obj.asInstanceOf[CalendarEventActionResponse]
  }
}

