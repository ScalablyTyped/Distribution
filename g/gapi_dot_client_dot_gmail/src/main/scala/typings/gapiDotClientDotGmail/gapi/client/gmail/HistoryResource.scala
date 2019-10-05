package typings.gapiDotClientDotGmail.gapi.client.gmail

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGmail.Anon_AltFieldsHistoryTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryResource extends js.Object {
  /** Lists the history of all changes to the given mailbox. History results are returned in chronological order (increasing historyId). */
  def list(request: Anon_AltFieldsHistoryTypes): Request[ListHistoryResponse]
}

object HistoryResource {
  @scala.inline
  def apply(list: Anon_AltFieldsHistoryTypes => Request[ListHistoryResponse]): HistoryResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[HistoryResource]
  }
}

