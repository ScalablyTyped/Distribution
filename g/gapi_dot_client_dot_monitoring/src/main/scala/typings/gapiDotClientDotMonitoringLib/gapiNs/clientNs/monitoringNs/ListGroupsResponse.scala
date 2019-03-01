package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupsResponse extends js.Object {
  /** The groups that match the specified filters. */
  var group: js.UndefOr[js.Array[Group]] = js.undefined
  /**
    * If there are more results than have been returned, then this field is set to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListGroupsResponse {
  @scala.inline
  def apply(group: js.Array[Group] = null, nextPageToken: java.lang.String = null): ListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListGroupsResponse]
  }
}

