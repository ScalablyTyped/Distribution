package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarEntitlementsDollarPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.native
  /**
    * The ID of the entitlement (a product ID), e.g.
    * "app:com.google.android.gm".
    */
  var entitlementId: js.UndefOr[String] = js.native
  /**
    * Set to true to also install the product on all the user's devices where
    * possible. Failure to install on one or more devices will not prevent this
    * operation from returning successfully, as long as the entitlement was
    * successfully assigned to the user.
    */
  var install: js.UndefOr[Boolean] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Entitlement] = js.native
  /**
    * The ID of the user.
    */
  var userId: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarEntitlementsDollarPatch {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    enterpriseId: String = null,
    entitlementId: String = null,
    fields: String = null,
    install: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestBody: Schema$Entitlement = null,
    userId: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarEntitlementsDollarPatch = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (enterpriseId != null) __obj.updateDynamic("enterpriseId")(enterpriseId.asInstanceOf[js.Any])
    if (entitlementId != null) __obj.updateDynamic("entitlementId")(entitlementId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(install)) __obj.updateDynamic("install")(install.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarEntitlementsDollarPatch]
  }
}

