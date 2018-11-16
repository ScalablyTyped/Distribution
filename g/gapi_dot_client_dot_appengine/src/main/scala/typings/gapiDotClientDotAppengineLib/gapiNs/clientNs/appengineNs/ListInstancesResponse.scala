package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListInstancesResponse extends js.Object {
  /** The instances belonging to the requested version. */
  var instances: js.UndefOr[js.Array[Instance]] = js.undefined
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

