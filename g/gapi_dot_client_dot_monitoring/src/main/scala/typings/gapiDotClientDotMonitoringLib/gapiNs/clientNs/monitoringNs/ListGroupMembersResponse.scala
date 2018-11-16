package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

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
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of elements matching this request. */
  var totalSize: js.UndefOr[scala.Double] = js.undefined
}

