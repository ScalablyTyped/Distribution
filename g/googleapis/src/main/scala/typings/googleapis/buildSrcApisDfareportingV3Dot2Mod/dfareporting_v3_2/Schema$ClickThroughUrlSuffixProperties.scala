package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Click Through URL Suffix settings.
  */
@js.native
trait Schema$ClickThroughUrlSuffixProperties extends js.Object {
  /**
    * Click-through URL suffix to apply to all ads in this entity&#39;s scope.
    * Must be less than 128 characters long.
    */
  var clickThroughUrlSuffix: js.UndefOr[String] = js.native
  /**
    * Whether this entity should override the inherited click-through URL
    * suffix with its own defined value.
    */
  var overrideInheritedSuffix: js.UndefOr[Boolean] = js.native
}

object Schema$ClickThroughUrlSuffixProperties {
  @scala.inline
  def apply(clickThroughUrlSuffix: String = null, overrideInheritedSuffix: js.UndefOr[Boolean] = js.undefined): Schema$ClickThroughUrlSuffixProperties = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrlSuffix != null) __obj.updateDynamic("clickThroughUrlSuffix")(clickThroughUrlSuffix.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideInheritedSuffix)) __obj.updateDynamic("overrideInheritedSuffix")(overrideInheritedSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClickThroughUrlSuffixProperties]
  }
}

