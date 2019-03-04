package typings
package gapiDotClientDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltBanAuthor extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The banAuthor parameter lets you indicate that you want to automatically reject any additional comments written by the comment's author. Set the
    * parameter value to true to ban the author.
    *
    * Note: This parameter is only valid if the moderationStatus parameter is also set to rejected.
    */
  var banAuthor: js.UndefOr[scala.Boolean] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** The id parameter specifies a comma-separated list of IDs that identify the comments for which you are updating the moderation status. */
  var id: java.lang.String
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies the new moderation status of the specified comments. */
  var moderationStatus: java.lang.String
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltBanAuthor {
  @scala.inline
  def apply(
    id: java.lang.String,
    moderationStatus: java.lang.String,
    alt: java.lang.String = null,
    banAuthor: js.UndefOr[scala.Boolean] = js.undefined,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltBanAuthor = {
    val __obj = js.Dynamic.literal(id = id, moderationStatus = moderationStatus)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(banAuthor)) __obj.updateDynamic("banAuthor")(banAuthor)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltBanAuthor]
  }
}

