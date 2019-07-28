package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.ColorPicker")
@js.native
class ColorPicker protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.ColorPickerNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.ColorPickerNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.ColorPickerNs.Model = js.native
  @JSName("model")
  var model_ColorPicker: typings.ejDotWebDotAll.ejNs.ColorPickerNs.Model = js.native
  /** Convert color value from HSV to RGB
    * @param {any} Specified HSV code converted to RGB
    * @returns {any}
    */
  def HSVToRGB(HSV: js.Any): js.Any = js.native
  /** Convert color value from RGB to HEX
    * @param {any} Specified RGB code converted to HEX code
    * @returns {string}
    */
  def RGBToHEX(RGB: js.Any): String = js.native
  /** Convert color value from RGB to HSV
    * @param {any} Specified RGB code converted to HSV code
    * @returns {any}
    */
  def RGBToHSV(RGB: js.Any): js.Any = js.native
  /** Disables the color picker control
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** Enable the color picker control
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** Gets the selected color in RGB format
    * @returns {any}
    */
  def getColor(): js.Any = js.native
  /** Gets the selected color value as string
    * @returns {string}
    */
  def getValue(): String = js.native
  /** To Convert color value from hexCode to RGB
    * @param {string} Specified HEX code converted to RGB
    * @returns {any}
    */
  def hexCodeToRGB(colorCode: String): js.Any = js.native
  /** Hides the ColorPicker popup, if in opened state.
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** Open the ColorPicker popup.
    * @returns {void}
    */
  def show(): Unit = js.native
}

/* static members */
@JSGlobal("ej.ColorPicker")
@js.native
object ColorPicker extends js.Object {
  var Locale: js.Any = js.native
  var fn: ColorPicker = js.native
}

