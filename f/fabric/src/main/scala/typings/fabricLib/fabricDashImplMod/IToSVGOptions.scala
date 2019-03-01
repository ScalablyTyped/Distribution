package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToSVGOptions extends js.Object {
  /**
  	 * Encoding of SVG output
  	 */
  var encoding: java.lang.String
  /**
  	 * desired height of svg with or without units
  	 */
  var height: scala.Double
  /**
  	 * If true xml tag is not included
  	 */
  var suppressPreamble: scala.Boolean
  /**
  	 * SVG viewbox object
  	 */
  var viewBox: IViewBox
  /**
  	 * desired width of svg with or without units
  	 */
  var width: scala.Double
}

object IToSVGOptions {
  @scala.inline
  def apply(
    encoding: java.lang.String,
    height: scala.Double,
    suppressPreamble: scala.Boolean,
    viewBox: IViewBox,
    width: scala.Double
  ): IToSVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encoding")(encoding)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("suppressPreamble")(suppressPreamble)
    __obj.updateDynamic("viewBox")(viewBox)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IToSVGOptions]
  }
}

