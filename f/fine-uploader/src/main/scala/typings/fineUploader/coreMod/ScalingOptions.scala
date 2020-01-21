package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalingOptions extends js.Object {
  /**
    * Ignored if the current browser does not support image previews.
    *
    * If you want to use an alternate scaling library, you must contribute a function for this option that returns a Promise.
    * Once the resize is complete, your promise must be fulfilled. You may, of course, reject your returned Promise is the resize fails in some way
    *
    * @default `undefined`
    */
  var customResizer: js.UndefOr[CustomResizerCallBack] = js.undefined
  /**
    * A value between `1` and `100` that describes the requested quality of scaled images.
    *
    * Ignored unless the scaled image type target is `image/jpeg`
    *
    * @default `80`
    */
  var defaultQuality: js.UndefOr[Double] = js.undefined
  /**
    * Scaled images will assume this image type if you don't specify a specific type in your size object, or if the type specified in the size object is not valid.
    *
    * You generally should not use any value other than `image/jpeg` or `image/png` here.
    *
    * The default value of null will ensure the scaled image type is `PNG`, unless the original file is a `JPEG`, in which case the scaled file will also be a `JPEG`.
    * The default is probably the safest option.
    *
    * @default `null`
    */
  var defaultType: js.UndefOr[String] = js.undefined
  /**
    * Text sent to your `complete` event handler as an `error` property of the `response` param if a scaled image could not be generated
    *
    * @default `'failed to scale'`
    */
  var failureText: js.UndefOr[String] = js.undefined
  /**
    * Ensure the `EXIF` data from the reference image is inserted into the scaled image. Only applicable when both the reference and the target are type `image/jpeg`
    *
    * @default `false`
    */
  var includeExif: js.UndefOr[Boolean] = js.undefined
  /**
    * Set this to `false` if you do not want scaled images to be re-oriented based on parsed `EXIF` data before they are uploaded
    *
    * @default `true`
    */
  var orient: js.UndefOr[Boolean] = js.undefined
  /**
    * Set this to `false` if you don't want to original file to be uploaded as well
    *
    * @default `true`
    */
  var sendOriginal: js.UndefOr[Boolean] = js.undefined
  /**
    * An array containing size objects that describe scaled versions of each submitted image that should be generated and uploaded
    *
    * @default `[]`
    */
  var sizes: js.UndefOr[SizeOptions] = js.undefined
}

object ScalingOptions {
  @scala.inline
  def apply(
    customResizer: /* resizeInfo */ ResizeInfo => PromiseOptions = null,
    defaultQuality: Int | Double = null,
    defaultType: String = null,
    failureText: String = null,
    includeExif: js.UndefOr[Boolean] = js.undefined,
    orient: js.UndefOr[Boolean] = js.undefined,
    sendOriginal: js.UndefOr[Boolean] = js.undefined,
    sizes: SizeOptions = null
  ): ScalingOptions = {
    val __obj = js.Dynamic.literal()
    if (customResizer != null) __obj.updateDynamic("customResizer")(js.Any.fromFunction1(customResizer))
    if (defaultQuality != null) __obj.updateDynamic("defaultQuality")(defaultQuality.asInstanceOf[js.Any])
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType.asInstanceOf[js.Any])
    if (failureText != null) __obj.updateDynamic("failureText")(failureText.asInstanceOf[js.Any])
    if (!js.isUndefined(includeExif)) __obj.updateDynamic("includeExif")(includeExif.asInstanceOf[js.Any])
    if (!js.isUndefined(orient)) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (!js.isUndefined(sendOriginal)) __obj.updateDynamic("sendOriginal")(sendOriginal.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingOptions]
  }
}

