package typings
package gapiDotClientDotGmailLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltDeleted extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Mark the email as permanently deleted (not TRASH) and only visible in Google Vault to a Vault administrator. Only used for G Suite accounts. */
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Source for Gmail's internal date of the message. */
  var internalDateSource: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Ignore the Gmail spam classifier decision and never mark this email as SPAM in the mailbox. */
  var neverMarkSpam: js.UndefOr[scala.Boolean] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Process calendar invites in the email and add any extracted meetings to the Google Calendar for this user. */
  var processForCalendar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** The user's email address. The special value me can be used to indicate the authenticated user. */
  var userId: java.lang.String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltDeleted {
  @scala.inline
  def apply(
    userId: java.lang.String,
    alt: java.lang.String = null,
    deleted: js.UndefOr[scala.Boolean] = js.undefined,
    fields: java.lang.String = null,
    internalDateSource: java.lang.String = null,
    key: java.lang.String = null,
    neverMarkSpam: js.UndefOr[scala.Boolean] = js.undefined,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    processForCalendar: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltDeleted = {
    val __obj = js.Dynamic.literal(userId = userId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (internalDateSource != null) __obj.updateDynamic("internalDateSource")(internalDateSource)
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(neverMarkSpam)) __obj.updateDynamic("neverMarkSpam")(neverMarkSpam)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (!js.isUndefined(processForCalendar)) __obj.updateDynamic("processForCalendar")(processForCalendar)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltDeleted]
  }
}

