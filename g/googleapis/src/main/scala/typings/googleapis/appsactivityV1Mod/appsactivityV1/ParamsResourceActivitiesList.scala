package typings.googleapis.appsactivityV1Mod.appsactivityV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceActivitiesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Identifies the Drive folder containing the items for which to return
    * activities.
    */
  @JSName("drive.ancestorId")
  var driveDotancestorId: js.UndefOr[String] = js.native
  /**
    * Identifies the Drive item to return activities for.
    */
  @JSName("drive.fileId")
  var driveDotfileId: js.UndefOr[String] = js.native
  /**
    * Indicates the strategy to use when grouping singleEvents items in the
    * associated combinedEvent object.
    */
  var groupingStrategy: js.UndefOr[String] = js.native
  /**
    * The maximum number of events to return on a page. The response includes a
    * continuation token if there are more events.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token to retrieve a specific page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The Google service from which to return activities. Possible values of
    * source are:  - drive.google.com
    */
  var source: js.UndefOr[String] = js.native
  /**
    * The ID used for ACL checks (does not filter the resulting event list by
    * the assigned value). Use the special value me to indicate the currently
    * authenticated user.
    */
  var userId: js.UndefOr[String] = js.native
}

object ParamsResourceActivitiesList {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    driveDotancestorId: String = null,
    driveDotfileId: String = null,
    fields: String = null,
    groupingStrategy: String = null,
    key: String = null,
    oauth_token: String = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    source: String = null,
    userId: String = null,
    userIp: String = null
  ): ParamsResourceActivitiesList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (driveDotancestorId != null) __obj.updateDynamic("drive.ancestorId")(driveDotancestorId.asInstanceOf[js.Any])
    if (driveDotfileId != null) __obj.updateDynamic("drive.fileId")(driveDotfileId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (groupingStrategy != null) __obj.updateDynamic("groupingStrategy")(groupingStrategy.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceActivitiesList]
  }
}

