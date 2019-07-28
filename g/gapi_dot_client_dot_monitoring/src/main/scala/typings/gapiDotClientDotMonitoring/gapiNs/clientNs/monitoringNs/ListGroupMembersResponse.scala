package typings.gapiDotClientDotMonitoring.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupMembersResponse extends js.Object {
  /** A set of monitored resources in the group. */
  var members: js.UndefOr[js.Array[MonitoredResource]] = js.undefined
  /**
    * If there are more results than have been returned, then this field is set to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The total number of elements matching this request. */
  var totalSize: js.UndefOr[Double] = js.undefined
}

object ListGroupMembersResponse {
  @scala.inline
  def apply(
    members: js.Array[MonitoredResource] = null,
    nextPageToken: String = null,
    totalSize: Int | Double = null
  ): ListGroupMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (members != null) __obj.updateDynamic("members")(members)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupMembersResponse]
  }
}

