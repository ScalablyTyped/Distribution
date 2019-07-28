package typings.gapiDotClientDotCivicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltFieldsKey extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * A list of office levels to filter by. Only offices that serve at least one of these levels will be returned. Divisions that don't contain a matching
    * office will not be returned.
    */
  var levels: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** The Open Civic Data division identifier of the division to look up. */
  var ocdId: String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * If true, information about all divisions contained in the division requested will be included as well. For example, if querying
    * ocd-division/country:us/district:dc, this would also return all DC's wards and ANCs.
    */
  var recursive: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of office roles to filter by. Only offices fulfilling one of these roles will be returned. Divisions that don't contain a matching office will
    * not be returned.
    */
  var roles: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_AltFieldsKey {
  @scala.inline
  def apply(
    ocdId: String,
    alt: String = null,
    fields: String = null,
    key: String = null,
    levels: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    recursive: js.UndefOr[Boolean] = js.undefined,
    roles: String = null,
    userIp: String = null
  ): Anon_AltFieldsKey = {
    val __obj = js.Dynamic.literal(ocdId = ocdId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (levels != null) __obj.updateDynamic("levels")(levels)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    if (roles != null) __obj.updateDynamic("roles")(roles)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltFieldsKey]
  }
}

