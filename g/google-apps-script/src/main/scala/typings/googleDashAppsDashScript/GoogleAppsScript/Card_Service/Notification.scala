package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  def setText(text: String): Notification
}

object Notification {
  @scala.inline
  def apply(setText: String => Notification): Notification = {
    val __obj = js.Dynamic.literal(setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[Notification]
  }
}

