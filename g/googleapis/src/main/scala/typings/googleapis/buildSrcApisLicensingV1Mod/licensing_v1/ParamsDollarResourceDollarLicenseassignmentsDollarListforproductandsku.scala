package typings.googleapis.buildSrcApisLicensingV1Mod.licensing_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarLicenseassignmentsDollarListforproductandsku extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * CustomerId represents the customer for whom licenseassignments are
    * queried
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Maximum number of campaigns to return at one time. Must be positive.
    * Optional. Default value is 100.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Token to fetch the next page.Optional. By default server will return
    * first page
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Name for product
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * Name for sku
    */
  var skuId: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarLicenseassignmentsDollarListforproductandsku {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    customerId: String = null,
    fields: String = null,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    productId: String = null,
    quotaUser: String = null,
    skuId: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarLicenseassignmentsDollarListforproductandsku = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (skuId != null) __obj.updateDynamic("skuId")(skuId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarLicenseassignmentsDollarListforproductandsku]
  }
}

