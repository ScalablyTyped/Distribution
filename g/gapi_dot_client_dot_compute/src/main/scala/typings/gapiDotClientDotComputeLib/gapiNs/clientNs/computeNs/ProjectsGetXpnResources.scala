package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProjectsGetXpnResources extends js.Object {
  /** [Output Only] Type of resource. Always compute#projectsGetXpnResources for lists of service resources (a.k.a service projects) */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the
               * nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to
               * continue paging through the results.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Service resources (a.k.a service projects) attached to this project as their shared VPC host. */
  var resources: js.UndefOr[js.Array[XpnResourceId]] = js.undefined
}

