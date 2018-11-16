package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NotificationAction extends js.Object {
  // Docs: http://electron.atom.io/docs/api/structures/notification-action
  /**
       * The label for the given action.
       */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The type of action, can be button.
       */
  var `type`: electronLib.electronLibStrings.button
}

