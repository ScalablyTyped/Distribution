package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetingValueCreativeSize extends js.Object {
  /** For video size type, the list of companion sizes. */
  var companionSizes: js.UndefOr[js.Array[TargetingValueSize]] = js.undefined
  /** The Creative size type. */
  var creativeSizeType: js.UndefOr[String] = js.undefined
  /** The native template for native ad. */
  var nativeTemplate: js.UndefOr[String] = js.undefined
  /** For regular or video creative size type, specifies the size of the creative. */
  var size: js.UndefOr[TargetingValueSize] = js.undefined
  /** The skippable ad type for video size. */
  var skippableAdType: js.UndefOr[String] = js.undefined
}

object TargetingValueCreativeSize {
  @scala.inline
  def apply(
    companionSizes: js.Array[TargetingValueSize] = null,
    creativeSizeType: String = null,
    nativeTemplate: String = null,
    size: TargetingValueSize = null,
    skippableAdType: String = null
  ): TargetingValueCreativeSize = {
    val __obj = js.Dynamic.literal()
    if (companionSizes != null) __obj.updateDynamic("companionSizes")(companionSizes)
    if (creativeSizeType != null) __obj.updateDynamic("creativeSizeType")(creativeSizeType)
    if (nativeTemplate != null) __obj.updateDynamic("nativeTemplate")(nativeTemplate)
    if (size != null) __obj.updateDynamic("size")(size)
    if (skippableAdType != null) __obj.updateDynamic("skippableAdType")(skippableAdType)
    __obj.asInstanceOf[TargetingValueCreativeSize]
  }
}

