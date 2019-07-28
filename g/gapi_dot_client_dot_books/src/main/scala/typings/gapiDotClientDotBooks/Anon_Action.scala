package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  /** Action that caused this reading position to be set. */
  var action: js.UndefOr[String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Volume content version for which this reading position applies. */
  var contentVersion: js.UndefOr[String] = js.undefined
  /** Random persistent device cookie optional on set position. */
  var deviceCookie: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Position string for the new volume reading position. */
  var position: String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** String to identify the originator of this request. */
  var source: js.UndefOr[String] = js.undefined
  /** RFC 3339 UTC format timestamp associated with this reading position. */
  var timestamp: String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /** ID of volume for which to update the reading position. */
  var volumeId: String
}

object Anon_Action {
  @scala.inline
  def apply(
    position: String,
    timestamp: String,
    volumeId: String,
    action: String = null,
    alt: String = null,
    contentVersion: String = null,
    deviceCookie: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    source: String = null,
    userIp: String = null
  ): Anon_Action = {
    val __obj = js.Dynamic.literal(position = position, timestamp = timestamp, volumeId = volumeId)
    if (action != null) __obj.updateDynamic("action")(action)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (contentVersion != null) __obj.updateDynamic("contentVersion")(contentVersion)
    if (deviceCookie != null) __obj.updateDynamic("deviceCookie")(deviceCookie)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (source != null) __obj.updateDynamic("source")(source)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_Action]
  }
}

