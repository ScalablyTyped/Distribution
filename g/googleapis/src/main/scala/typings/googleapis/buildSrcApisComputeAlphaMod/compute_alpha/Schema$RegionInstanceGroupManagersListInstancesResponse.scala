package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RegionInstanceGroupManagersListInstancesResponse extends js.Object {
  /**
    * A list of managed instances.
    */
  var managedInstances: js.UndefOr[js.Array[Schema$ManagedInstance]] = js.native
  /**
    * [Output Only] This token allows you to get the next page of results for
    * list requests. If the number of results is larger than maxResults, use
    * the nextPageToken as a value for the query parameter pageToken in the
    * next list request. Subsequent list requests will have their own
    * nextPageToken to continue paging through the results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$RegionInstanceGroupManagersListInstancesResponse {
  @scala.inline
  def apply(managedInstances: js.Array[Schema$ManagedInstance] = null, nextPageToken: String = null): Schema$RegionInstanceGroupManagersListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (managedInstances != null) __obj.updateDynamic("managedInstances")(managedInstances.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegionInstanceGroupManagersListInstancesResponse]
  }
}

