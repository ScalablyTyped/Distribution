package typings.fabric.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToSVGOptions extends js.Object {
  /**
  	 * Encoding of SVG output
  	 */
  var encoding: js.UndefOr[String] = js.undefined
  /**
  	 * desired height of svg with or without units
  	 */
  var height: js.UndefOr[Double] = js.undefined
  /**
  	 * If true xml tag is not included
  	 */
  var suppressPreamble: js.UndefOr[Boolean] = js.undefined
  /**
  	 * SVG viewbox object
  	 */
  var viewBox: js.UndefOr[IViewBox] = js.undefined
  /**
  	 * desired width of svg with or without units
  	 */
  var width: js.UndefOr[Double] = js.undefined
}

object IToSVGOptions {
  @scala.inline
  def apply(
    encoding: String = null,
    height: Int | Double = null,
    suppressPreamble: js.UndefOr[Boolean] = js.undefined,
    viewBox: IViewBox = null,
    width: Int | Double = null
  ): IToSVGOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressPreamble)) __obj.updateDynamic("suppressPreamble")(suppressPreamble)
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToSVGOptions]
  }
}

