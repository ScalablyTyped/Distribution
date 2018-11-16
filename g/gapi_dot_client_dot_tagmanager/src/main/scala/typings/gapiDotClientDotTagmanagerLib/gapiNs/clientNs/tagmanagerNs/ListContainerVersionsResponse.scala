package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListContainerVersionsResponse extends js.Object {
  /** All container version headers of a GTM Container. */
  var containerVersionHeader: js.UndefOr[js.Array[ContainerVersionHeader]] = js.undefined
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

