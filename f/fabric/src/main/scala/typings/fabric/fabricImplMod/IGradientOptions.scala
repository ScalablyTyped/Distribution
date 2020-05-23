package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGradientOptions extends js.Object {
  /**
    * Color stops object eg. {0:string; 1:string;
    */
  var colorStops: js.UndefOr[IGradientOptionsColorStops] = js.undefined
  var coords: js.UndefOr[IGradientOptionsCoords] = js.undefined
  var gradientTransform: js.UndefOr[js.Any] = js.undefined
  /**
    * Horizontal offset for aligning gradients coming from SVG when outside pathgroups
    * @type Number
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  /**
    * Vertical offset for aligning gradients coming from SVG when outside pathgroups
    * @type Number
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object IGradientOptions {
  @scala.inline
  def apply(
    colorStops: IGradientOptionsColorStops = null,
    coords: IGradientOptionsCoords = null,
    gradientTransform: js.Any = null,
    offsetX: js.UndefOr[Double] = js.undefined,
    offsetY: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): IGradientOptions = {
    val __obj = js.Dynamic.literal()
    if (colorStops != null) __obj.updateDynamic("colorStops")(colorStops.asInstanceOf[js.Any])
    if (coords != null) __obj.updateDynamic("coords")(coords.asInstanceOf[js.Any])
    if (gradientTransform != null) __obj.updateDynamic("gradientTransform")(gradientTransform.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGradientOptions]
  }
}

