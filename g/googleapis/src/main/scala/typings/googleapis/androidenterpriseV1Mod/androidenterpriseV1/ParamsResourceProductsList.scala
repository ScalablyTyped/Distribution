package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProductsList extends StandardParameters {
  /**
    * Specifies whether to search among all products (false) or among only
    * products that have been approved (true). Only "true" is supported, and
    * should be specified.
    */
  var approved: js.UndefOr[Boolean] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.native
  /**
    * The BCP47 tag for the user's preferred language (e.g. "en-US", "de").
    * Results are returned in the language best matching the preferred
    * language.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Specifies the maximum number of products that can be returned per
    * request. If not specified, uses a default value of 100, which is also the
    * maximum retrievable within a single response.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The search query as typed in the Google Play store search box. If
    * omitted, all approved apps will be returned (using the pagination
    * parameters), including apps that are not available in the store (e.g.
    * unpublished apps).
    */
  var query: js.UndefOr[String] = js.native
  /**
    * A pagination token is contained in a request's response when there are
    * more products. The token can be used in a subsequent request to obtain
    * more products, and so forth. This parameter cannot be used in the initial
    * request.
    */
  var token: js.UndefOr[String] = js.native
}

object ParamsResourceProductsList {
  @scala.inline
  def apply(
    alt: String = null,
    approved: js.UndefOr[Boolean] = js.undefined,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    enterpriseId: String = null,
    fields: String = null,
    key: String = null,
    language: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    query: String = null,
    quotaUser: String = null,
    token: String = null,
    userIp: String = null
  ): ParamsResourceProductsList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(approved)) __obj.updateDynamic("approved")(approved.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (enterpriseId != null) __obj.updateDynamic("enterpriseId")(enterpriseId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProductsList]
  }
}

