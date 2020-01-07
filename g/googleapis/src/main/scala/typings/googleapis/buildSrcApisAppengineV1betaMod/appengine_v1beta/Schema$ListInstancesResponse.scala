package typings.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for Instances.ListInstances.
  */
@js.native
trait Schema$ListInstancesResponse extends js.Object {
  /**
    * The instances belonging to the requested version.
    */
  var instances: js.UndefOr[js.Array[Schema$Instance]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListInstancesResponse {
  @scala.inline
  def apply(instances: js.Array[Schema$Instance] = null, nextPageToken: String = null): Schema$ListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListInstancesResponse]
  }
}

