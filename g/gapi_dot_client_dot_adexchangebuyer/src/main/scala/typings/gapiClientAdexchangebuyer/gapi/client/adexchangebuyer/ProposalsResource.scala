package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer.AnonAltFields
import typings.gapiClientAdexchangebuyer.AnonAltFieldsKey
import typings.gapiClientAdexchangebuyer.AnonAltFieldsKeyOauthtokenPqlQuery
import typings.gapiClientAdexchangebuyer.AnonAltFieldsKeyOauthtokenPrettyPrintProposalId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProposalsResource extends js.Object {
  /** Get a proposal given its id */
  def get(request: AnonAltFieldsKey): Request_[Proposal]
  /** Create the given list of proposals */
  def insert(request: AnonAltFields): Request_[CreateOrdersResponse]
  /** Update the given proposal. This method supports patch semantics. */
  def patch(request: AnonAltFieldsKeyOauthtokenPrettyPrintProposalId): Request_[Proposal]
  /** Search for proposals using pql query */
  def search(request: AnonAltFieldsKeyOauthtokenPqlQuery): Request_[GetOrdersResponse]
  /** Update the given proposal to indicate that setup has been completed. */
  def setupcomplete(request: AnonAltFieldsKey): Request_[Unit]
  /** Update the given proposal */
  def update(request: AnonAltFieldsKeyOauthtokenPrettyPrintProposalId): Request_[Proposal]
}

object ProposalsResource {
  @scala.inline
  def apply(
    get: AnonAltFieldsKey => Request_[Proposal],
    insert: AnonAltFields => Request_[CreateOrdersResponse],
    patch: AnonAltFieldsKeyOauthtokenPrettyPrintProposalId => Request_[Proposal],
    search: AnonAltFieldsKeyOauthtokenPqlQuery => Request_[GetOrdersResponse],
    setupcomplete: AnonAltFieldsKey => Request_[Unit],
    update: AnonAltFieldsKeyOauthtokenPrettyPrintProposalId => Request_[Proposal]
  ): ProposalsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), search = js.Any.fromFunction1(search), setupcomplete = js.Any.fromFunction1(setupcomplete), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ProposalsResource]
  }
}

