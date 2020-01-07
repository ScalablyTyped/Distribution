package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ListMonitoredResourceDescriptors response.
  */
@js.native
trait Schema$ListMonitoredResourceDescriptorsResponse extends js.Object {
  /**
    * If there are more results than have been returned, then this field is set
    * to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The monitored resource descriptors that are available to this project and
    * that match filter, if present.
    */
  var resourceDescriptors: js.UndefOr[js.Array[Schema$MonitoredResourceDescriptor]] = js.native
}

object Schema$ListMonitoredResourceDescriptorsResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    resourceDescriptors: js.Array[Schema$MonitoredResourceDescriptor] = null
  ): Schema$ListMonitoredResourceDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (resourceDescriptors != null) __obj.updateDynamic("resourceDescriptors")(resourceDescriptors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListMonitoredResourceDescriptorsResponse]
  }
}

