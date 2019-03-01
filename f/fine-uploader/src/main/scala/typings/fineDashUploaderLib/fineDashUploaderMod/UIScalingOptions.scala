package typings
package fineDashUploaderLib.fineDashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIScalingOptions
  extends fineDashUploaderLib.libCoreMod.ScalingOptions {
  /**
    * Set this to true if you do not want any scaled images to be displayed in the file list
    *
    * @default `false`
    */
  var hideScaled: js.UndefOr[scala.Boolean] = js.undefined
}

object UIScalingOptions {
  @scala.inline
  def apply(
    customResizer: fineDashUploaderLib.libCoreMod.CustomResizerCallBack = null,
    defaultQuality: scala.Int | scala.Double = null,
    defaultType: java.lang.String = null,
    failureText: java.lang.String = null,
    hideScaled: js.UndefOr[scala.Boolean] = js.undefined,
    includeExif: js.UndefOr[scala.Boolean] = js.undefined,
    orient: js.UndefOr[scala.Boolean] = js.undefined,
    sendOriginal: js.UndefOr[scala.Boolean] = js.undefined,
    sizes: fineDashUploaderLib.libCoreMod.SizeOptions = null
  ): UIScalingOptions = {
    val __obj = js.Dynamic.literal()
    if (customResizer != null) __obj.updateDynamic("customResizer")(customResizer)
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

