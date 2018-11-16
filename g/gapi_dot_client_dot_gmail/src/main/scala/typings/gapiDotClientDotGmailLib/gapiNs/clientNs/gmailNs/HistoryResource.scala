package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HistoryResource extends js.Object {
  /** Lists the history of all changes to the given mailbox. History results are returned in chronological order (increasing historyId). */
  def list(request: gapiDotClientDotGmailLib.Anon_MaxResults): gapiDotClientLib.gapiNs.clientNs.Request[ListHistoryResponse]
}

