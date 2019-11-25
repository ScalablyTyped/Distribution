package typings.gapiDotClientDotSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInstancesResponse extends js.Object {
  /** The list of requested instances. */
  var instances: js.UndefOr[js.Array[Instance]] = js.undefined
  /**
    * `next_page_token` can be sent in a subsequent
    * ListInstances call to fetch more
    * of the matching instances.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListInstancesResponse {
  @scala.inline
  def apply(instances: js.Array[Instance] = null, nextPageToken: String = null): ListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstancesResponse]
  }
}

