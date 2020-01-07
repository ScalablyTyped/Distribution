package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProductstatusesDollarGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * If set, only issues for the specified destinations are returned,
    * otherwise only issues for the Shopping destination.
    */
  var destinations: js.UndefOr[js.Array[String]] = js.native
  /**
    * Flag to include full product data in the result of this get request. The
    * default value is false.
    */
  var includeAttributes: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the account that contains the product. This account cannot be a
    * multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.native
  /**
    * The REST ID of the product.
    */
  var productId: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarProductstatusesDollarGet {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    destinations: js.Array[String] = null,
    fields: String = null,
    includeAttributes: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    merchantId: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    productId: String = null,
    quotaUser: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarProductstatusesDollarGet = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (destinations != null) __obj.updateDynamic("destinations")(destinations.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(includeAttributes)) __obj.updateDynamic("includeAttributes")(includeAttributes.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarProductstatusesDollarGet]
  }
}

