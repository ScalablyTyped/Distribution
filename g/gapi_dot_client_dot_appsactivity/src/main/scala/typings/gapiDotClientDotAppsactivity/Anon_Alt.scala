package typings.gapiDotClientDotAppsactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alt extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Identifies the Drive folder containing the items for which to return activities. */
  @JSName("drive.ancestorId")
  var driveDotancestorId: js.UndefOr[String] = js.undefined
  /** Identifies the Drive item to return activities for. */
  @JSName("drive.fileId")
  var driveDotfileId: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Indicates the strategy to use when grouping singleEvents items in the associated combinedEvent object. */
  var groupingStrategy: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** The maximum number of events to return on a page. The response includes a continuation token if there are more events. */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** A token to retrieve a specific page of results. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * The Google service from which to return activities. Possible values of source are:
    * - drive.google.com
    */
  var source: js.UndefOr[String] = js.undefined
  /** Indicates the user to return activity for. Use the special value me to indicate the currently authenticated user. */
  var userId: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_Alt {
  @scala.inline
  def apply(
    alt: String = null,
    driveDotancestorId: String = null,
    driveDotfileId: String = null,
    fields: String = null,
    groupingStrategy: String = null,
    key: String = null,
    oauth_token: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    source: String = null,
    userId: String = null,
    userIp: String = null
  ): Anon_Alt = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (driveDotancestorId != null) __obj.updateDynamic("drive.ancestorId")(driveDotancestorId.asInstanceOf[js.Any])
    if (driveDotfileId != null) __obj.updateDynamic("drive.fileId")(driveDotfileId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (groupingStrategy != null) __obj.updateDynamic("groupingStrategy")(groupingStrategy.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alt]
  }
}

