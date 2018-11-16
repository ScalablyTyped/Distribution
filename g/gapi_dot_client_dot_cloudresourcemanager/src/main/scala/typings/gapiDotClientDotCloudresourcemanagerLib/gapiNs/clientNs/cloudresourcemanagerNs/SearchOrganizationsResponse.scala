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

