package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  def setText(text: java.lang.String): Notification
}

object Notification {
  @scala.inline
  def apply(setText: java.lang.String => Notification): Notification = {
    val __obj = js.Dynamic.literal(setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[Notification]
  }
}

