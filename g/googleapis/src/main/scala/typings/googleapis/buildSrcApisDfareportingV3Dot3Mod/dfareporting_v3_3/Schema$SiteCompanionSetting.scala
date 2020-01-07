package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Companion Settings
  */
@js.native
trait Schema$SiteCompanionSetting extends js.Object {
  /**
    * Whether companions are disabled for this site template.
    */
  var companionsDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whitelist of companion sizes to be served via this site template. Set
    * this list to null or empty to serve all companion sizes.
    */
  var enabledSizes: js.UndefOr[js.Array[Schema$Size]] = js.native
  /**
    * Whether to serve only static images as companions.
    */
  var imageOnly: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#siteCompanionSetting&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$SiteCompanionSetting {
  @scala.inline
  def apply(
    companionsDisabled: js.UndefOr[Boolean] = js.undefined,
    enabledSizes: js.Array[Schema$Size] = null,
    imageOnly: js.UndefOr[Boolean] = js.undefined,
    kind: String = null
  ): Schema$SiteCompanionSetting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(companionsDisabled)) __obj.updateDynamic("companionsDisabled")(companionsDisabled.asInstanceOf[js.Any])
    if (enabledSizes != null) __obj.updateDynamic("enabledSizes")(enabledSizes.asInstanceOf[js.Any])
    if (!js.isUndefined(imageOnly)) __obj.updateDynamic("imageOnly")(imageOnly.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SiteCompanionSetting]
  }
}

