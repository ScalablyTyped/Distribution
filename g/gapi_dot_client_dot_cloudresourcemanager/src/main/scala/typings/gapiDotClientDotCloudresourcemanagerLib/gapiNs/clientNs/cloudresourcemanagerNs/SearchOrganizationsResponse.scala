package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOrganizationsResponse extends js.Object {
  /**
    * A pagination token to be used to retrieve the next page of results. If the
    * result is too large to fit within the page size specified in the request,
    * this field will be set with a token that can be used to fetch the next page
    * of results. If this field is empty, it indicates that this response
    * contains the last page of results.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The list of Organizations that matched the search query, possibly
    * paginated.
    */
  var organizations: js.UndefOr[js.Array[Organization]] = js.undefined
}

object SearchOrganizationsResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, organizations: js.Array[Organization] = null): SearchOrganizationsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (organizations != null) __obj.updateDynamic("organizations")(organizations)
    __obj.asInstanceOf[SearchOrganizationsResponse]
  }
}

