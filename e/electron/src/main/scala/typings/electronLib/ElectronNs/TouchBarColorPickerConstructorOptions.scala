package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarColorPickerConstructorOptions extends js.Object {
  /**
    * Array of hex color strings to appear as possible colors to select.
    */
  var availableColors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Function to call when a color is selected.
    */
  var change: js.UndefOr[js.Function1[/* color */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * The selected hex color in the picker, i.e #ABCDEF.
    */
  var selectedColor: js.UndefOr[java.lang.String] = js.undefined
}

