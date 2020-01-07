package typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarUrlcrawlerrorscountsDollarQuery extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The crawl error category. For example: serverError. If not specified,
    * returns results for all categories.
    */
  var category: js.UndefOr[String] = js.native
  /**
    * If true, returns only the latest crawl error counts.
    */
  var latestCountsOnly: js.UndefOr[Boolean] = js.native
  /**
    * The user agent type (platform) that made the request. For example: web.
    * If not specified, returns results for all platforms.
    */
  var platform: js.UndefOr[String] = js.native
  /**
    * The site's URL, including protocol. For example: http://www.example.com/
    */
  var siteUrl: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarUrlcrawlerrorscountsDollarQuery {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    category: String = null,
    fields: String = null,
    key: String = null,
    latestCountsOnly: js.UndefOr[Boolean] = js.undefined,
    oauth_token: String = null,
    platform: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    siteUrl: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarUrlcrawlerrorscountsDollarQuery = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(latestCountsOnly)) __obj.updateDynamic("latestCountsOnly")(latestCountsOnly.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (siteUrl != null) __obj.updateDynamic("siteUrl")(siteUrl.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarUrlcrawlerrorscountsDollarQuery]
  }
}

