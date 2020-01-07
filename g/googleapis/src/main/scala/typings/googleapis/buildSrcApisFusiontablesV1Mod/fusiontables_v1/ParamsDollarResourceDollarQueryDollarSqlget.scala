package typings.googleapis.buildSrcApisFusiontablesV1Mod.fusiontables_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarQueryDollarSqlget extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Should column names be included (in the first row)?. Default is true.
    */
  var hdrs: js.UndefOr[Boolean] = js.native
  /**
    * An SQL SELECT/SHOW/DESCRIBE statement.
    */
  var sql: js.UndefOr[String] = js.native
  /**
    * Should typed values be returned in the (JSON) response -- numbers for
    * numeric values and parsed geometries for KML values? Default is true.
    */
  var typed: js.UndefOr[Boolean] = js.native
}

object ParamsDollarResourceDollarQueryDollarSqlget {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    hdrs: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    sql: String = null,
    typed: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): ParamsDollarResourceDollarQueryDollarSqlget = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(hdrs)) __obj.updateDynamic("hdrs")(hdrs.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (sql != null) __obj.updateDynamic("sql")(sql.asInstanceOf[js.Any])
    if (!js.isUndefined(typed)) __obj.updateDynamic("typed")(typed.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarQueryDollarSqlget]
  }
}

