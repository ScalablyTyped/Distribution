package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMonitoredResourceDescriptorsResponse extends js.Object {
  /**
    * If there are more results than have been returned, then this field is set to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The monitored resource descriptors that are available to this project and that match filter, if present. */
  var resourceDescriptors: js.UndefOr[js.Array[MonitoredResourceDescriptor]] = js.undefined
}

object ListMonitoredResourceDescriptorsResponse {
  @scala.inline
  def apply(
    nextPageToken: java.lang.String = null,
    resourceDescriptors: js.Array[MonitoredResourceDescriptor] = null
  ): ListMonitoredResourceDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (resourceDescriptors != null) __obj.updateDynamic("resourceDescriptors")(resourceDescriptors)
    __obj.asInstanceOf[ListMonitoredResourceDescriptorsResponse]
  }
}

