package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorPicker_ extends Widget_ {
  
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
  
  var defaults: typings.ejWebAll.ej.ColorPicker.Model = js.native
  
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
  
  @JSName("model")
  var model_ColorPicker_ : typings.ejWebAll.ej.ColorPicker.Model = js.native
  
  /** Open the ColorPicker popup.
    * @returns {void}
    */
  def show(): Unit = js.native
}
