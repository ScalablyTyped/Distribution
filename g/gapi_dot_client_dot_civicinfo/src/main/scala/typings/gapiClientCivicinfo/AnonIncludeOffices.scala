package typings.gapiClientCivicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeOffices extends js.Object {
  /** The address to look up. May only be specified if the field ocdId is not given in the URL. */
  var address: js.UndefOr[String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Whether to return information about offices and officials. If false, only the top-level district information will be returned. */
  var includeOffices: js.UndefOr[Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * A list of office levels to filter by. Only offices that serve at least one of these levels will be returned. Divisions that don't contain a matching
    * office will not be returned.
    */
  var levels: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * A list of office roles to filter by. Only offices fulfilling one of these roles will be returned. Divisions that don't contain a matching office will
    * not be returned.
    */
  var roles: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object AnonIncludeOffices {
  @scala.inline
  def apply(
    address: String = null,
    alt: String = null,
    fields: String = null,
    includeOffices: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    levels: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    roles: String = null,
    userIp: String = null
  ): AnonIncludeOffices = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(includeOffices)) __obj.updateDynamic("includeOffices")(includeOffices.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeOffices]
  }
}

