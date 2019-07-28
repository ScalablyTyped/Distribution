package typings.gapiDotClientDotDfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdvertiserIdAlt extends js.Object {
  /** Select only dynamic targeting keys whose object has this advertiser ID. */
  var advertiserId: js.UndefOr[String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** Select only dynamic targeting keys exactly matching these names. */
  var names: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Select only dynamic targeting keys with this object ID. */
  var objectId: js.UndefOr[String] = js.undefined
  /** Select only dynamic targeting keys with this object type. */
  var objectType: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_AdvertiserIdAlt {
  @scala.inline
  def apply(
    profileId: String,
    advertiserId: String = null,
    alt: String = null,
    fields: String = null,
    key: String = null,
    names: String = null,
    oauth_token: String = null,
    objectId: String = null,
    objectType: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): Anon_AdvertiserIdAlt = {
    val __obj = js.Dynamic.literal(profileId = profileId)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (names != null) __obj.updateDynamic("names")(names)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (objectType != null) __obj.updateDynamic("objectType")(objectType)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AdvertiserIdAlt]
  }
}

