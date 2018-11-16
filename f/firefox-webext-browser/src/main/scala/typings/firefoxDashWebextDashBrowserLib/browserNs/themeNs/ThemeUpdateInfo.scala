package typings
package firefoxDashWebextDashBrowserLib.browserNs.themeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* theme types */
/** Info provided in the onUpdated listener. */

trait ThemeUpdateInfo extends js.Object {
  /** The new theme after update */
  var theme: js.Object
  /** The id of the window the theme has been applied to */
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

