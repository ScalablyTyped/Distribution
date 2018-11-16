package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListContainersResponse extends js.Object {
  /** All Containers of a GTM Account. */
  var container: js.UndefOr[js.Array[Container]] = js.undefined
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

