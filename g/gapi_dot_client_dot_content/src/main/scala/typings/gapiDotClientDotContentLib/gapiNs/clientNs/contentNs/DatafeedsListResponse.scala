package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DatafeedsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "content#datafeedsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The token for the retrieval of the next page of datafeeds. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var resources: js.UndefOr[js.Array[Datafeed]] = js.undefined
}

