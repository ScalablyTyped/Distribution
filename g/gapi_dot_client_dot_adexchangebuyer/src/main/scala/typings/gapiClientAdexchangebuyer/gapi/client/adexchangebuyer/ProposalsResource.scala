package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer.anon.Fields
import typings.gapiClientAdexchangebuyer.anon.Oauthtoken
import typings.gapiClientAdexchangebuyer.anon.ProposalId
import typings.gapiClientAdexchangebuyer.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProposalsResource extends js.Object {
  /** Get a proposal given its id */
  def get(request: Oauthtoken): Request[Proposal] = js.native
  /** Create the given list of proposals */
  def insert(request: Fields): Request[CreateOrdersResponse] = js.native
  /** Update the given proposal. This method supports patch semantics. */
  def patch(request: ProposalId): Request[Proposal] = js.native
  /** Search for proposals using pql query */
  def search(request: UserIp): Request[GetOrdersResponse] = js.native
  /** Update the given proposal to indicate that setup has been completed. */
  def setupcomplete(request: Oauthtoken): Request[Unit] = js.native
  /** Update the given proposal */
  def update(request: ProposalId): Request[Proposal] = js.native
}

object ProposalsResource {
  @scala.inline
  def apply(
    get: Oauthtoken => Request[Proposal],
    insert: Fields => Request[CreateOrdersResponse],
    patch: ProposalId => Request[Proposal],
    search: UserIp => Request[GetOrdersResponse],
    setupcomplete: Oauthtoken => Request[Unit],
    update: ProposalId => Request[Proposal]
  ): ProposalsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), search = js.Any.fromFunction1(search), setupcomplete = js.Any.fromFunction1(setupcomplete), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ProposalsResource]
  }
  @scala.inline
  implicit class ProposalsResourceOps[Self <: ProposalsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Oauthtoken => Request[Proposal]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Fields => Request[CreateOrdersResponse]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: ProposalId => Request[Proposal]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setSearch(value: UserIp => Request[GetOrdersResponse]): Self = this.set("search", js.Any.fromFunction1(value))
    @scala.inline
    def setSetupcomplete(value: Oauthtoken => Request[Unit]): Self = this.set("setupcomplete", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: ProposalId => Request[Proposal]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

