package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleImageOptions extends js.Object {
  /**
    * Ignored if the current browser does not support image previews.
    *
    * If you want to use an alternate library to resize the image, you must contribute a function for this option that returns a `Promise`.
    *
    * Once the resize is complete, your promise must be fulfilled.
    * You may, of course, reject your returned `Promise` is the resize fails in some way.
    */
  var customResizer: js.UndefOr[CustomResizerCallBack] = js.undefined
  /**
    * @default `false`
    */
  var includeExif: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * required
    */
  var maxSize: scala.Double
  /**
    * @default `true`
    */
  var orient: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * number between `0` and `100`
    *
    * @default `80`
    */
  var quality: js.UndefOr[scala.Double] = js.undefined
  /**
    * defaults to the type of the reference image
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ScaleImageOptions {
  @scala.inline
  def apply(
    maxSize: scala.Double,
    customResizer: CustomResizerCallBack = null,
    includeExif: js.UndefOr[scala.Boolean] = js.undefined,
    orient: js.UndefOr[scala.Boolean] = js.undefined,
    quality: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): ScaleImageOptions = {
    val __obj = js.Dynamic.literal(maxSize = maxSize)
    if (customResizer != null) __obj.updateDynamic("customResizer")(customResizer)
    if (!js.isUndefined(includeExif)) __obj.updateDynamic("includeExif")(includeExif)
    if (!js.isUndefined(orient)) __obj.updateDynamic("orient")(orient)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ScaleImageOptions]
  }
}

