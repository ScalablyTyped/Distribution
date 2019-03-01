package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////////
// Data Object Interfaces - These interface are not specific part of fabric,
// They are just helpful for for defining function parameters
//////////////////////////////////////////////////////////////////////////////
trait IDataURLOptions extends js.Object {
  var enableRetinaScaling: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The format of the output image. Either "jpeg" or "png"
  	 */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Cropping height. Introduced in v1.2.14
  	 */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Cropping left offset. Introduced in v1.2.14
  	 */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Multiplier to scale by
  	 */
  var multiplier: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Quality level (0..1). Only used for jpeg
  	 */
  var quality: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Cropping top offset. Introduced in v1.2.14
  	 */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Cropping width. Introduced in v1.2.14
  	 */
  var width: js.UndefOr[scala.Double] = js.undefined
  var withoutShadow: js.UndefOr[scala.Boolean] = js.undefined
  var withoutTransform: js.UndefOr[scala.Boolean] = js.undefined
}

object IDataURLOptions {
  @scala.inline
  def apply(
    enableRetinaScaling: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    multiplier: scala.Int | scala.Double = null,
    quality: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    withoutShadow: js.UndefOr[scala.Boolean] = js.undefined,
    withoutTransform: js.UndefOr[scala.Boolean] = js.undefined
  ): IDataURLOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableRetinaScaling)) __obj.updateDynamic("enableRetinaScaling")(enableRetinaScaling)
    if (format != null) __obj.updateDynamic("format")(format)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (multiplier != null) __obj.updateDynamic("multiplier")(multiplier.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutShadow)) __obj.updateDynamic("withoutShadow")(withoutShadow)
    if (!js.isUndefined(withoutTransform)) __obj.updateDynamic("withoutTransform")(withoutTransform)
    __obj.asInstanceOf[IDataURLOptions]
  }
}

