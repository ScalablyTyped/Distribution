package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ListGroups response.
  */
@js.native
trait Schema$ListGroupsResponse extends js.Object {
  /**
    * The groups that match the specified filters.
    */
  var group: js.UndefOr[js.Array[Schema$Group]] = js.native
  /**
    * If there are more results than have been returned, then this field is set
    * to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListGroupsResponse {
  @scala.inline
  def apply(group: js.Array[Schema$Group] = null, nextPageToken: String = null): Schema$ListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListGroupsResponse]
  }
}

