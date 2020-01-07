package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a landing page deep link.
  */
@js.native
trait Schema$DeepLink extends js.Object {
  /**
    * The URL of the mobile app being linked to.
    */
  var appUrl: js.UndefOr[String] = js.native
  /**
    * The fallback URL. This URL will be served to users who do not have the
    * mobile app installed.
    */
  var fallbackUrl: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#deepLink&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The mobile app targeted by this deep link.
    */
  var mobileApp: js.UndefOr[Schema$MobileApp] = js.native
  /**
    * Ads served to users on these remarketing lists will use this deep link.
    * Applicable when mobileApp.directory is APPLE_APP_STORE.
    */
  var remarketingListIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$DeepLink {
  @scala.inline
  def apply(
    appUrl: String = null,
    fallbackUrl: String = null,
    kind: String = null,
    mobileApp: Schema$MobileApp = null,
    remarketingListIds: js.Array[String] = null
  ): Schema$DeepLink = {
    val __obj = js.Dynamic.literal()
    if (appUrl != null) __obj.updateDynamic("appUrl")(appUrl.asInstanceOf[js.Any])
    if (fallbackUrl != null) __obj.updateDynamic("fallbackUrl")(fallbackUrl.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mobileApp != null) __obj.updateDynamic("mobileApp")(mobileApp.asInstanceOf[js.Any])
    if (remarketingListIds != null) __obj.updateDynamic("remarketingListIds")(remarketingListIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeepLink]
  }
}

