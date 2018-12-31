package typings
package extjsLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColor
  extends extjsLib.ExtNs.IBase {
  /** [Method] Get the blue component of the color in the range 0 255
  		* @returns Number
  		*/
  var getBlue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Return a new color that is darker than this color
  		* @param factor Number Darker factor (0..1), default to 0.2
  		* @returns Object Ext.draw.Color
  		*/
  var getDarker: js.UndefOr[js.Function1[/* factor */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Method] Returns the gray value 0 to 255 of the color
  		* @returns Number
  		*/
  var getGrayscale: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Get the green component of the color in the range 0 255
  		* @returns Number
  		*/
  var getGreen: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Get the equivalent HSL components of the color
  		* @returns Number[]
  		*/
  var getHSL: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Return a new color that is lighter than this color
  		* @param factor Number Lighter factor (0..1), default to 0.2
  		* @returns Object Ext.draw.Color
  		*/
  var getLighter: js.UndefOr[js.Function1[/* factor */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Method] Get the RGB values
  		* @returns Number[]
  		*/
  var getRGB: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Get the red component of the color in the range 0 255
  		* @returns Number
  		*/
  var getRed: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (Number) */
  var lightnessFactor: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Return the color in the hex format i e
  		* @returns String
  		*/
  @JSName("toString")
  var toString_FIColor: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

