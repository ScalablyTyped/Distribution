package typings.googleapis.civicinfoV2Mod.civicinfoV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceRepresentativesRepresentativeinfobydivision extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A list of office levels to filter by. Only offices that serve at least
    * one of these levels will be returned. Divisions that don't contain a
    * matching office will not be returned.
    */
  var levels: js.UndefOr[js.Array[String]] = js.native
  /**
    * The Open Civic Data division identifier of the division to look up.
    */
  var ocdId: js.UndefOr[String] = js.native
  /**
    * If true, information about all divisions contained in the division
    * requested will be included as well. For example, if querying
    * ocd-division/country:us/district:dc, this would also return all DC's
    * wards and ANCs.
    */
  var recursive: js.UndefOr[Boolean] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDivisionRepresentativeInfoRequest] = js.native
  /**
    * A list of office roles to filter by. Only offices fulfilling one of these
    * roles will be returned. Divisions that don't contain a matching office
    * will not be returned.
    */
  var roles: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceRepresentativesRepresentativeinfobydivision {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    key: String = null,
    levels: js.Array[String] = null,
    oauth_token: String = null,
    ocdId: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    recursive: js.UndefOr[Boolean] = js.undefined,
    requestBody: SchemaDivisionRepresentativeInfoRequest = null,
    roles: js.Array[String] = null,
    userIp: String = null
  ): ParamsResourceRepresentativesRepresentativeinfobydivision = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (ocdId != null) __obj.updateDynamic("ocdId")(ocdId.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceRepresentativesRepresentativeinfobydivision]
  }
}

