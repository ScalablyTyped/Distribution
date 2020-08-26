package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGmail.anon.HistoryTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryResource extends js.Object {
  /** Lists the history of all changes to the given mailbox. History results are returned in chronological order (increasing historyId). */
  def list(request: HistoryTypes): Request[ListHistoryResponse] = js.native
}

object HistoryResource {
  @scala.inline
  def apply(list: HistoryTypes => Request[ListHistoryResponse]): HistoryResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[HistoryResource]
  }
  @scala.inline
  implicit class HistoryResourceOps[Self <: HistoryResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setList(value: HistoryTypes => Request[ListHistoryResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

