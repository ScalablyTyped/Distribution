package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClientsResponse extends js.Object {
  /** The returned list of clients. */
  var clients: js.UndefOr[js.Array[Client]] = js.native
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListClientsRequest.pageToken
    * field in the subsequent call to the
    * accounts.clients.list method
    * to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListClientsResponse {
  @scala.inline
  def apply(): ListClientsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClientsResponse]
  }
  @scala.inline
  implicit class ListClientsResponseOps[Self <: ListClientsResponse] (val x: Self) extends AnyVal {
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
    def setClientsVarargs(value: Client*): Self = this.set("clients", js.Array(value :_*))
    @scala.inline
    def setClients(value: js.Array[Client]): Self = this.set("clients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClients: Self = this.set("clients", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

