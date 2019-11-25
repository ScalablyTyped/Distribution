package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListClientsResponse extends js.Object {
  /** The returned list of clients. */
  var clients: js.UndefOr[js.Array[Client]] = js.undefined
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListClientsRequest.pageToken
    * field in the subsequent call to the
    * accounts.clients.list method
    * to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListClientsResponse {
  @scala.inline
  def apply(clients: js.Array[Client] = null, nextPageToken: String = null): ListClientsResponse = {
    val __obj = js.Dynamic.literal()
    if (clients != null) __obj.updateDynamic("clients")(clients.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListClientsResponse]
  }
}

