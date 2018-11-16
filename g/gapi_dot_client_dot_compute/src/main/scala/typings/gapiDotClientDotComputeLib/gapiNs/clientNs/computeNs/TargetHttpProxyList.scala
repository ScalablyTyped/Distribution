package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TargetHttpProxyList extends js.Object {
  /** [Output Only] Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** A list of TargetHttpProxy resources. */
  var items: js.UndefOr[js.Array[TargetHttpProxy]] = js.undefined
  /** Type of resource. Always compute#targetHttpProxyList for lists of target HTTP proxies. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the
               * nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to
               * continue paging through the results.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Server-defined URL for this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Informational warning message. */
  var warning: js.UndefOr[gapiDotClientDotComputeLib.Anon_Data] = js.undefined
}

