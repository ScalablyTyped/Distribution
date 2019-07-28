package typings.gapiDotClientDotAdexchangebuyer2.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListClientUsersResponse extends js.Object {
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListClientUsersRequest.pageToken
    * field in the subsequent call to the
    * clients.invitations.list
    * method to retrieve the next
    * page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The returned list of client users. */
  var users: js.UndefOr[js.Array[ClientUser]] = js.undefined
}

object ListClientUsersResponse {
  @scala.inline
  def apply(nextPageToken: String = null, users: js.Array[ClientUser] = null): ListClientUsersResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (users != null) __obj.updateDynamic("users")(users)
    __obj.asInstanceOf[ListClientUsersResponse]
  }
}

