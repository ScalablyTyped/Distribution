package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer2.anon.Accesstoken
import typings.gapiClientAdexchangebuyer2.anon.AccountId
import typings.gapiClientAdexchangebuyer2.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvitationsResource extends js.Object {
  /**
    * Creates and sends out an email invitation to access
    * an Ad Exchange client buyer account.
    */
  def create(request: Accesstoken): Request[ClientUserInvitation] = js.native
  /** Retrieves an existing client user invitation. */
  def get(request: AccountId): Request[ClientUserInvitation] = js.native
  /**
    * Lists all the client users invitations for a client
    * with a given account ID.
    */
  def list(request: Alt): Request[ListClientUserInvitationsResponse] = js.native
}

object InvitationsResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[ClientUserInvitation],
    get: AccountId => Request[ClientUserInvitation],
    list: Alt => Request[ListClientUserInvitationsResponse]
  ): InvitationsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[InvitationsResource]
  }
  @scala.inline
  implicit class InvitationsResourceOps[Self <: InvitationsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Accesstoken => Request[ClientUserInvitation]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: AccountId => Request[ClientUserInvitation]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[ListClientUserInvitationsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

