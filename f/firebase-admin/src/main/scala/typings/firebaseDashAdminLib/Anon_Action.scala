package typings
package firebaseDashAdminLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  /**
    * An action available to the user when the notification is presented
    */
  var action: java.lang.String
  /**
    * Optional icon for a notification action.
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Title of the notification action.
    */
  var title: java.lang.String
}

object Anon_Action {
  @scala.inline
  def apply(action: java.lang.String, title: java.lang.String, icon: java.lang.String = null): Anon_Action = {
    val __obj = js.Dynamic.literal(action = action, title = title)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    __obj.asInstanceOf[Anon_Action]
  }
}

