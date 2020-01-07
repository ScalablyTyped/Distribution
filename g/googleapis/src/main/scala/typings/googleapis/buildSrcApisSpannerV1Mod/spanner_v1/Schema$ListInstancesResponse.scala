package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for ListInstances.
  */
@js.native
trait Schema$ListInstancesResponse extends js.Object {
  /**
    * The list of requested instances.
    */
  var instances: js.UndefOr[js.Array[Schema$Instance]] = js.native
  /**
    * `next_page_token` can be sent in a subsequent ListInstances call to fetch
    * more of the matching instances.
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

