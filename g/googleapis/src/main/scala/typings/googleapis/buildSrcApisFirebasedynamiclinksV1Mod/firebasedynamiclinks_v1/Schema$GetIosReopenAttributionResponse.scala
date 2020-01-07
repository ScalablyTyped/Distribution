package typings.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for iSDK to get reopen attribution for app universal link open
  * deeplinking. This endpoint is meant for only iOS requests.
  */
@js.native
trait Schema$GetIosReopenAttributionResponse extends js.Object {
  /**
    * The deep-link attributed the app universal link open. For both regular
    * FDL links and invite FDL links.
    */
  var deepLink: js.UndefOr[String] = js.native
  /**
    * Optional invitation ID, for only invite typed requested FDL links.
    */
  var invitationId: js.UndefOr[String] = js.native
  /**
    * FDL input value of the &quot;&amp;imv=&quot; parameter, minimum app
    * version to be returned to Google Firebase SDK running on iOS-9.
    */
  var iosMinAppVersion: js.UndefOr[String] = js.native
  /**
    * The entire FDL, expanded from a short link. It is the same as the
    * requested_link, if it is long.
    */
  var resolvedLink: js.UndefOr[String] = js.native
  /**
    * Scion campaign value to be propagated by iSDK to Scion at app-reopen.
    */
  var utmCampaign: js.UndefOr[String] = js.native
  /**
    * Scion medium value to be propagated by iSDK to Scion at app-reopen.
    */
  var utmMedium: js.UndefOr[String] = js.native
  /**
    * Scion source value to be propagated by iSDK to Scion at app-reopen.
    */
  var utmSource: js.UndefOr[String] = js.native
}

object Schema$GetIosReopenAttributionResponse {
  @scala.inline
  def apply(
    deepLink: String = null,
    invitationId: String = null,
    iosMinAppVersion: String = null,
    resolvedLink: String = null,
    utmCampaign: String = null,
    utmMedium: String = null,
    utmSource: String = null
  ): Schema$GetIosReopenAttributionResponse = {
    val __obj = js.Dynamic.literal()
    if (deepLink != null) __obj.updateDynamic("deepLink")(deepLink.asInstanceOf[js.Any])
    if (invitationId != null) __obj.updateDynamic("invitationId")(invitationId.asInstanceOf[js.Any])
    if (iosMinAppVersion != null) __obj.updateDynamic("iosMinAppVersion")(iosMinAppVersion.asInstanceOf[js.Any])
    if (resolvedLink != null) __obj.updateDynamic("resolvedLink")(resolvedLink.asInstanceOf[js.Any])
    if (utmCampaign != null) __obj.updateDynamic("utmCampaign")(utmCampaign.asInstanceOf[js.Any])
    if (utmMedium != null) __obj.updateDynamic("utmMedium")(utmMedium.asInstanceOf[js.Any])
    if (utmSource != null) __obj.updateDynamic("utmSource")(utmSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetIosReopenAttributionResponse]
  }
}

