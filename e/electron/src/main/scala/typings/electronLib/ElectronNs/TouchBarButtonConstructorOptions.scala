package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarButtonConstructorOptions extends js.Object {
  /**
    * Button background color in hex format, i.e #ABCDEF.
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Function to call when the button is clicked.
    */
  var click: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Button icon.
    */
  var icon: js.UndefOr[NativeImage] = js.undefined
  /**
    * Can be left, right or overlay.
    */
  var iconPosition: js.UndefOr[
    electronLib.electronLibStrings.left | electronLib.electronLibStrings.right | electronLib.electronLibStrings.overlay
  ] = js.undefined
  /**
    * Button text.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
}

