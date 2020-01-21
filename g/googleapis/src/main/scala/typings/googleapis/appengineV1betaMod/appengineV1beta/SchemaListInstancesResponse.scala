package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for Instances.ListInstances.
  */
@js.native
trait SchemaListInstancesResponse extends js.Object {
  /**
    * The instances belonging to the requested version.
    */
  var instances: js.UndefOr[js.Array[SchemaInstance]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListInstancesResponse {
  @scala.inline
  def apply(instances: js.Array[SchemaInstance] = null, nextPageToken: String = null): SchemaListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListInstancesResponse]
  }
}

