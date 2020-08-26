package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchThreatListUpdatesResponse extends js.Object {
  /** The list updates requested by the clients. */
  var listUpdateResponses: js.UndefOr[js.Array[ListUpdateResponse]] = js.native
  /**
    * The minimum duration the client must wait before issuing any update
    * request. If this field is not set clients may update as soon as they want.
    */
  var minimumWaitDuration: js.UndefOr[String] = js.native
}

object FetchThreatListUpdatesResponse {
  @scala.inline
  def apply(): FetchThreatListUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchThreatListUpdatesResponse]
  }
  @scala.inline
  implicit class FetchThreatListUpdatesResponseOps[Self <: FetchThreatListUpdatesResponse] (val x: Self) extends AnyVal {
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
    def setListUpdateResponsesVarargs(value: ListUpdateResponse*): Self = this.set("listUpdateResponses", js.Array(value :_*))
    @scala.inline
    def setListUpdateResponses(value: js.Array[ListUpdateResponse]): Self = this.set("listUpdateResponses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListUpdateResponses: Self = this.set("listUpdateResponses", js.undefined)
    @scala.inline
    def setMinimumWaitDuration(value: String): Self = this.set("minimumWaitDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumWaitDuration: Self = this.set("minimumWaitDuration", js.undefined)
  }
  
}

