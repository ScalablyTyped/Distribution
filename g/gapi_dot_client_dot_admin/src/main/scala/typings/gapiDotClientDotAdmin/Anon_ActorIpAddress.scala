package typings.gapiDotClientDotAdmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActorIpAddress extends js.Object {
  /** IP Address of host where the event was performed. Supports both IPv4 and IPv6 addresses. */
  var actorIpAddress: js.UndefOr[String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Application name for which the events are to be retrieved. */
  var applicationName: String
  /** Represents the customer for which the data is to be fetched. */
  var customerId: js.UndefOr[String] = js.undefined
  /** Return events which occurred at or before this time. */
  var endTime: js.UndefOr[String] = js.undefined
  /** Name of the event being queried. */
  var eventName: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Event parameters in the form [parameter1 name][operator][parameter1 value],[parameter2 name][operator][parameter2 value],... */
  var filters: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** Number of activity records to be shown in each page. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Token to specify next page. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Return events which occurred at or after this time. */
  var startTime: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /**
    * Represents the profile id or the user email for which the data should be filtered. When 'all' is specified as the userKey, it returns usageReports for
    * all users.
    */
  var userKey: String
}

object Anon_ActorIpAddress {
  @scala.inline
  def apply(
    applicationName: String,
    userKey: String,
    actorIpAddress: String = null,
    alt: String = null,
    customerId: String = null,
    endTime: String = null,
    eventName: String = null,
    fields: String = null,
    filters: String = null,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    startTime: String = null,
    userIp: String = null
  ): Anon_ActorIpAddress = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], userKey = userKey.asInstanceOf[js.Any])
    if (actorIpAddress != null) __obj.updateDynamic("actorIpAddress")(actorIpAddress.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActorIpAddress]
  }
}

