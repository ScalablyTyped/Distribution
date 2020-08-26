package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Action
import typings.gapiClientDfareporting.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeLogsResource extends js.Object {
  /** Gets one change log by ID. */
  def get(request: Fields): Request[ChangeLog] = js.native
  /** Retrieves a list of change logs. This method supports paging. */
  def list(request: Action): Request[ChangeLogsListResponse] = js.native
}

object ChangeLogsResource {
  @scala.inline
  def apply(get: Fields => Request[ChangeLog], list: Action => Request[ChangeLogsListResponse]): ChangeLogsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ChangeLogsResource]
  }
  @scala.inline
  implicit class ChangeLogsResourceOps[Self <: ChangeLogsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[ChangeLog]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Action => Request[ChangeLogsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

