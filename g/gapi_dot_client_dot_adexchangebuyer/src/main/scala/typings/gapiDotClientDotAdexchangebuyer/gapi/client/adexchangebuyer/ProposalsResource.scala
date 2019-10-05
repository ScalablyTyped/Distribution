package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangebuyer.Anon_AltFields
import typings.gapiDotClientDotAdexchangebuyer.Anon_AltFieldsKey
import typings.gapiDotClientDotAdexchangebuyer.Anon_AltFieldsKeyOauthtokenPqlQuery
import typings.gapiDotClientDotAdexchangebuyer.Anon_AltFieldsKeyOauthtokenPrettyPrintProposalId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProposalsResource extends js.Object {
  /** Get a proposal given its id */
  def get(request: Anon_AltFieldsKey): Request[Proposal]
  /** Create the given list of proposals */
  def insert(request: Anon_AltFields): Request[CreateOrdersResponse]
  /** Update the given proposal. This method supports patch semantics. */
  def patch(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProposalId): Request[Proposal]
  /** Search for proposals using pql query */
  def search(request: Anon_AltFieldsKeyOauthtokenPqlQuery): Request[GetOrdersResponse]
  /** Update the given proposal to indicate that setup has been completed. */
  def setupcomplete(request: Anon_AltFieldsKey): Request[Unit]
  /** Update the given proposal */
  def update(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProposalId): Request[Proposal]
}

object ProposalsResource {
  @scala.inline
  def apply(
    get: Anon_AltFieldsKey => Request[Proposal],
    insert: Anon_AltFields => Request[CreateOrdersResponse],
    patch: Anon_AltFieldsKeyOauthtokenPrettyPrintProposalId => Request[Proposal],
    search: Anon_AltFieldsKeyOauthtokenPqlQuery => Request[GetOrdersResponse],
    setupcomplete: Anon_AltFieldsKey => Request[Unit],
    update: Anon_AltFieldsKeyOauthtokenPrettyPrintProposalId => Request[Proposal]
  ): ProposalsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), search = js.Any.fromFunction1(search), setupcomplete = js.Any.fromFunction1(setupcomplete), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ProposalsResource]
  }
}

