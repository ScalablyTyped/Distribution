package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListDraftsResponse extends js.Object {
  /** List of drafts. */
  var drafts: js.UndefOr[js.Array[Draft]] = js.undefined
  /** Token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Estimated total number of results. */
  var resultSizeEstimate: js.UndefOr[scala.Double] = js.undefined
}

