package typings
package electronDashWindowDashStateLib.electronDashWindowDashStateMod.ElectronWindowStateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowStateKeeperOptions extends js.Object {
  /*
  		 * The height that should be returned if no file exists yet. Defaults to 600.
  		 */
  var defaultHeight: js.UndefOr[scala.Double] = js.undefined
  /*
  		 * The width that should be returned if no file exists yet. Defaults to 800.
  		 */
  var defaultWidth: js.UndefOr[scala.Double] = js.undefined
  /*
  		 * The name of file. Defaults to window-state.json
  		 */
  var file: js.UndefOr[java.lang.String] = js.undefined
  /*
  		 * Should we automatically restore the window to full screen,
  		 * if it was last closed full screen. Defaults to true
  		 */
  var fullScreen: js.UndefOr[scala.Boolean] = js.undefined
  /*
  		 * Should we automatically maximize the window,
  		 * if it was last closed maximized. Defaults to true
  		 */
  var maximize: js.UndefOr[scala.Boolean] = js.undefined
  /*
  		 * The path where the state file should be written to.
  		 * Defaults to app.getPath('userData')
  		 */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

