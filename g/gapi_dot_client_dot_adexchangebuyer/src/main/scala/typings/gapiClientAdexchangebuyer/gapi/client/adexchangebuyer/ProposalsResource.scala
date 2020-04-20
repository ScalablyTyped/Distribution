package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer.AnonFields
import typings.gapiClientAdexchangebuyer.AnonOauthtoken
import typings.gapiClientAdexchangebuyer.AnonProposalId
import typings.gapiClientAdexchangebuyer.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProposalsResource extends js.Object {
  /** Get a proposal given its id */
  def get(request: AnonOauthtoken): Request_[Proposal]
  /** Create the given list of proposals */
  def insert(request: AnonFields): Request_[CreateOrdersResponse]
  /** Update the given proposal. This method supports patch semantics. */
  def patch(request: AnonProposalId): Request_[Proposal]
  /** Search for proposals using pql query */
  def search(request: AnonUserIp): Request_[GetOrdersResponse]
  /** Update the given proposal to indicate that setup has been completed. */
  def setupcomplete(request: AnonOauthtoken): Request_[Unit]
  /** Update the given proposal */
  def update(request: AnonProposalId): Request_[Proposal]
}

object ProposalsResource {
  @scala.inline
  def apply(
    get: AnonOauthtoken => Request_[Proposal],
    insert: AnonFields => Request_[CreateOrdersResponse],
    patch: AnonProposalId => Request_[Proposal],
    search: AnonUserIp => Request_[GetOrdersResponse],
    setupcomplete: AnonOauthtoken => Request_[Unit],
    update: AnonProposalId => Request_[Proposal]
  ): ProposalsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), search = js.Any.fromFunction1(search), setupcomplete = js.Any.fromFunction1(setupcomplete), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ProposalsResource]
  }
}

