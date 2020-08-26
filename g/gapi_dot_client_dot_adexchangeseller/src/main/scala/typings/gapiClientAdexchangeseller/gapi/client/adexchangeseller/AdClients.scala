package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdClients extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.native
  /** The ad clients returned in this list response. */
  var items: js.UndefOr[js.Array[AdClient]] = js.native
  /** Kind of list this is, in this case adexchangeseller#adClients. */
  var kind: js.UndefOr[String] = js.native
  /** Continuation token used to page through ad clients. To retrieve the next page of results, set the next request's "pageToken" value to this. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object AdClients {
  @scala.inline
  def apply(): AdClients = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdClients]
  }
  @scala.inline
  implicit class AdClientsOps[Self <: AdClients] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setItemsVarargs(value: AdClient*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[AdClient]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

