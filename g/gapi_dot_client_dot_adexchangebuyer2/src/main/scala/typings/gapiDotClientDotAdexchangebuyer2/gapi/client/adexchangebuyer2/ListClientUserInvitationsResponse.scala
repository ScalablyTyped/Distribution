package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListClientUserInvitationsResponse extends js.Object {
  /** The returned list of client users. */
  var invitations: js.UndefOr[js.Array[ClientUserInvitation]] = js.undefined
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListClientUserInvitationsRequest.pageToken
    * field in the subsequent call to the
    * clients.invitations.list
    * method to retrieve the next
    * page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListClientUserInvitationsResponse {
  @scala.inline
  def apply(invitations: js.Array[ClientUserInvitation] = null, nextPageToken: String = null): ListClientUserInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (invitations != null) __obj.updateDynamic("invitations")(invitations)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListClientUserInvitationsResponse]
  }
}

