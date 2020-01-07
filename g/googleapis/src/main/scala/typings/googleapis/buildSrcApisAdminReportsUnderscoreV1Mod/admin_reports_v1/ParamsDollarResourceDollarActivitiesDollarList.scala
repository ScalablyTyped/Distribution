package typings.googleapis.buildSrcApisAdminReportsUnderscoreV1Mod.admin_reports_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarActivitiesDollarList extends StandardParameters {
  /**
    * IP Address of host where the event was performed. Supports both IPv4 and
    * IPv6 addresses.
    */
  var actorIpAddress: js.UndefOr[String] = js.native
  /**
    * Application name for which the events are to be retrieved.
    */
  var applicationName: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Represents the customer for which the data is to be fetched.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Return events which occurred at or before this time.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Name of the event being queried.
    */
  var eventName: js.UndefOr[String] = js.native
  /**
    * Event parameters in the form [parameter1 name][operator][parameter1
    * value],[parameter2 name][operator][parameter2 value],...
    */
  var filters: js.UndefOr[String] = js.native
  /**
    * Number of activity records to be shown in each page.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * the organizational unit's(OU) ID to filter activities from users
    * belonging to a specific OU or one of its sub-OU(s)
    */
  var orgUnitID: js.UndefOr[String] = js.native
  /**
    * Token to specify next page.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Return events which occurred at or after this time.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Represents the profile id or the user email for which the data should be
    * filtered. When 'all' is specified as the userKey, it returns usageReports
    * for all users.
    */
  var userKey: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarActivitiesDollarList {
  @scala.inline
  def apply(
    actorIpAddress: String = null,
    alt: String = null,
    applicationName: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    customerId: String = null,
    endTime: String = null,
    eventName: String = null,
    fields: String = null,
    filters: String = null,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    orgUnitID: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    startTime: String = null,
    userIp: String = null,
    userKey: String = null
  ): ParamsDollarResourceDollarActivitiesDollarList = {
    val __obj = js.Dynamic.literal()
    if (actorIpAddress != null) __obj.updateDynamic("actorIpAddress")(actorIpAddress.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orgUnitID != null) __obj.updateDynamic("orgUnitID")(orgUnitID.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (userKey != null) __obj.updateDynamic("userKey")(userKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarActivitiesDollarList]
  }
}

