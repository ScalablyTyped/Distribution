package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer.anon.Fields
import typings.gapiClientAdexchangebuyer.anon.Oauthtoken
import typings.gapiClientAdexchangebuyer.anon.ProposalId
import typings.gapiClientAdexchangebuyer.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProposalsResource extends js.Object {
  /** Get a proposal given its id */
  def get(request: Oauthtoken): Request[Proposal]
  /** Create the given list of proposals */
  def insert(request: Fields): Request[CreateOrdersResponse]
  /** Update the given proposal. This method supports patch semantics. */
  def patch(request: ProposalId): Request[Proposal]
  /** Search for proposals using pql query */
  def search(request: UserIp): Request[GetOrdersResponse]
  /** Update the given proposal to indicate that setup has been completed. */
  def setupcomplete(request: Oauthtoken): Request[Unit]
  /** Update the given proposal */
  def update(request: ProposalId): Request[Proposal]
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
}

