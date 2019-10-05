package typings.fineDashUploader.fineDashUploaderMod

import typings.fineDashUploader.libCoreMod.PromiseOptions
import typings.fineDashUploader.libCoreMod.ResizeInfo
import typings.fineDashUploader.libCoreMod.ScalingOptions
import typings.fineDashUploader.libCoreMod.SizeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIScalingOptions extends ScalingOptions {
  /**
    * Set this to true if you do not want any scaled images to be displayed in the file list
    *
    * @default `false`
    */
  var hideScaled: js.UndefOr[Boolean] = js.undefined
}

object UIScalingOptions {
  @scala.inline
  def apply(
    customResizer: /* resizeInfo */ ResizeInfo => PromiseOptions = null,
    defaultQuality: Int | Double = null,
    defaultType: String = null,
    failureText: String = null,
    hideScaled: js.UndefOr[Boolean] = js.undefined,
    includeExif: js.UndefOr[Boolean] = js.undefined,
    orient: js.UndefOr[Boolean] = js.undefined,
    sendOriginal: js.UndefOr[Boolean] = js.undefined,
    sizes: SizeOptions = null
  ): UIScalingOptions = {
    val __obj = js.Dynamic.literal()
    if (customResizer != null) __obj.updateDynamic("customResizer")(js.Any.fromFunction1(customResizer))
    if (defaultQuality != null) __obj.updateDynamic("defaultQuality")(defaultQuality.asInstanceOf[js.Any])
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (failureText != null) __obj.updateDynamic("failureText")(failureText)
    if (!js.isUndefined(hideScaled)) __obj.updateDynamic("hideScaled")(hideScaled)
    if (!js.isUndefined(includeExif)) __obj.updateDynamic("includeExif")(includeExif)
    if (!js.isUndefined(orient)) __obj.updateDynamic("orient")(orient)
    if (!js.isUndefined(sendOriginal)) __obj.updateDynamic("sendOriginal")(sendOriginal)
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    __obj.asInstanceOf[UIScalingOptions]
  }
}

