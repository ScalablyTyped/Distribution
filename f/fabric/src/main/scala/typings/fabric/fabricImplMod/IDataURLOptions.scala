package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////////
// Data Object Interfaces - These interface are not specific part of fabric,
// They are just helpful for for defining function parameters
//////////////////////////////////////////////////////////////////////////////
trait IDataURLOptions extends js.Object {
  var enableRetinaScaling: js.UndefOr[Boolean] = js.undefined
  /**
    * The format of the output image. Either "jpeg" or "png"
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * Cropping height. Introduced in v1.2.14
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Cropping left offset. Introduced in v1.2.14
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * Multiplier to scale by
    */
  var multiplier: js.UndefOr[Double] = js.undefined
  /**
    * Quality level (0..1). Only used for jpeg
    */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * Cropping top offset. Introduced in v1.2.14
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    * Cropping width. Introduced in v1.2.14
    */
  var width: js.UndefOr[Double] = js.undefined
  var withoutShadow: js.UndefOr[Boolean] = js.undefined
  var withoutTransform: js.UndefOr[Boolean] = js.undefined
}

object IDataURLOptions {
  @scala.inline
  def apply(
    enableRetinaScaling: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    height: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    multiplier: js.UndefOr[Double] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    withoutShadow: js.UndefOr[Boolean] = js.undefined,
    withoutTransform: js.UndefOr[Boolean] = js.undefined
  ): IDataURLOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableRetinaScaling)) __obj.updateDynamic("enableRetinaScaling")(enableRetinaScaling.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiplier)) __obj.updateDynamic("multiplier")(multiplier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutShadow)) __obj.updateDynamic("withoutShadow")(withoutShadow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutTransform)) __obj.updateDynamic("withoutTransform")(withoutTransform.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataURLOptions]
  }
}

