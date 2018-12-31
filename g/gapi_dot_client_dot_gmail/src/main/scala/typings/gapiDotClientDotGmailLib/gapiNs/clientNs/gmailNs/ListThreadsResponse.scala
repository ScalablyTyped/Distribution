package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThreadsResponse extends js.Object {
  /** Page token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Estimated total number of results. */
  var resultSizeEstimate: js.UndefOr[scala.Double] = js.undefined
  /** List of threads. */
  var threads: js.UndefOr[js.Array[Thread]] = js.undefined
}

