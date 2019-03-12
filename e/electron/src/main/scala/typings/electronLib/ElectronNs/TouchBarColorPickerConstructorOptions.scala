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

object TouchBarColorPickerConstructorOptions {
  @scala.inline
  def apply(
    availableColors: js.Array[java.lang.String] = null,
    change: /* color */ java.lang.String => scala.Unit = null,
    selectedColor: java.lang.String = null
  ): TouchBarColorPickerConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (availableColors != null) __obj.updateDynamic("availableColors")(availableColors)
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (selectedColor != null) __obj.updateDynamic("selectedColor")(selectedColor)
    __obj.asInstanceOf[TouchBarColorPickerConstructorOptions]
  }
}

