package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListUsableSubnetworksResponse is the response of
  * ListUsableSubnetworksRequest.
  */
@js.native
trait Schema$ListUsableSubnetworksResponse extends js.Object {
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `page_size`, use the
    * `next_page_token` as a value for the query parameter `page_token` in the
    * next request. The value will become empty when there are no more pages.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of usable subnetworks in the specified network project.
    */
  var subnetworks: js.UndefOr[js.Array[Schema$UsableSubnetwork]] = js.native
}

object Schema$ListUsableSubnetworksResponse {
  @scala.inline
  def apply(nextPageToken: String = null, subnetworks: js.Array[Schema$UsableSubnetwork] = null): Schema$ListUsableSubnetworksResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (subnetworks != null) __obj.updateDynamic("subnetworks")(subnetworks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListUsableSubnetworksResponse]
  }
}

