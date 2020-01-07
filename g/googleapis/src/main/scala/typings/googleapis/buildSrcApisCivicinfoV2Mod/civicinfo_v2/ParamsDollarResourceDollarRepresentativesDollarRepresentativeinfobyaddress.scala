package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarRepresentativesDollarRepresentativeinfobyaddress extends StandardParameters {
  /**
    * The address to look up. May only be specified if the field ocdId is not
    * given in the URL.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Whether to return information about offices and officials. If false, only
    * the top-level district information will be returned.
    */
  var includeOffices: js.UndefOr[Boolean] = js.native
  /**
    * A list of office levels to filter by. Only offices that serve at least
    * one of these levels will be returned. Divisions that don't contain a
    * matching office will not be returned.
    */
  var levels: js.UndefOr[js.Array[String]] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$RepresentativeInfoRequest] = js.native
  /**
    * A list of office roles to filter by. Only offices fulfilling one of these
    * roles will be returned. Divisions that don't contain a matching office
    * will not be returned.
    */
  var roles: js.UndefOr[js.Array[String]] = js.native
}

object ParamsDollarResourceDollarRepresentativesDollarRepresentativeinfobyaddress {
  @scala.inline
  def apply(
    address: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    includeOffices: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    levels: js.Array[String] = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestBody: Schema$RepresentativeInfoRequest = null,
    roles: js.Array[String] = null,
    userIp: String = null
  ): ParamsDollarResourceDollarRepresentativesDollarRepresentativeinfobyaddress = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(includeOffices)) __obj.updateDynamic("includeOffices")(includeOffices.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarRepresentativesDollarRepresentativeinfobyaddress]
  }
}

