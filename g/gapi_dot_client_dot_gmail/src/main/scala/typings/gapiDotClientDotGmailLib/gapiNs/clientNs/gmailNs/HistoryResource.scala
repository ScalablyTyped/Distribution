package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryResource extends js.Object {
  /** Lists the history of all changes to the given mailbox. History results are returned in chronological order (increasing historyId). */
  def list(request: gapiDotClientDotGmailLib.Anon_AltFieldsHistoryTypes): gapiDotClientLib.gapiNs.clientNs.Request[ListHistoryResponse]
}

object HistoryResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotGmailLib.Anon_AltFieldsHistoryTypes => gapiDotClientLib.gapiNs.clientNs.Request[ListHistoryResponse]
  ): HistoryResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[HistoryResource]
  }
}

