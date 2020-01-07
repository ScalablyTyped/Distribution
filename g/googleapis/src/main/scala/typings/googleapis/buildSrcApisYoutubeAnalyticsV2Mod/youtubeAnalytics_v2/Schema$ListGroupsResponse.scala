package typings.googleapis.buildSrcApisYoutubeAnalyticsV2Mod.youtubeAnalytics_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for GroupsService.ListGroups.
  */
@js.native
trait Schema$ListGroupsResponse extends js.Object {
  /**
    * Apiary error details
    */
  var errors: js.UndefOr[Schema$Errors] = js.native
  /**
    * The Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * A list of groups that match the API request parameters. Each item in the
    * list represents a `group` resource.
    */
  var items: js.UndefOr[js.Array[Schema$Group]] = js.native
  /**
    * Identifies the API resource&#39;s type. The value will be
    * `youtube#groupListResponse`.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The token that can be used as the value of the `pageToken` parameter to
    * retrieve the next page in the result set.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListGroupsResponse {
  @scala.inline
  def apply(
    errors: Schema$Errors = null,
    etag: String = null,
    items: js.Array[Schema$Group] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$ListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListGroupsResponse]
  }
}

