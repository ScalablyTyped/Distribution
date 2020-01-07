package typings.googleapis.buildSrcApisPagespeedonlineV5Mod.pagespeedonline_v5

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarPagespeedapiDollarRunpagespeed extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A Lighthouse category to run; if none are given, only Performance
    * category will be run
    */
  var category: js.UndefOr[js.Array[String]] = js.native
  /**
    * The locale used to localize formatted results
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The analysis strategy (desktop or mobile) to use, and desktop is the
    * default
    */
  var strategy: js.UndefOr[String] = js.native
  /**
    * The URL to fetch and analyze
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Campaign name for analytics.
    */
  var utm_campaign: js.UndefOr[String] = js.native
  /**
    * Campaign source for analytics.
    */
  var utm_source: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarPagespeedapiDollarRunpagespeed {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    category: js.Array[String] = null,
    fields: String = null,
    key: String = null,
    locale: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    strategy: String = null,
    url: String = null,
    userIp: String = null,
    utm_campaign: String = null,
    utm_source: String = null
  ): ParamsDollarResourceDollarPagespeedapiDollarRunpagespeed = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (utm_campaign != null) __obj.updateDynamic("utm_campaign")(utm_campaign.asInstanceOf[js.Any])
    if (utm_source != null) __obj.updateDynamic("utm_source")(utm_source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarPagespeedapiDollarRunpagespeed]
  }
}

