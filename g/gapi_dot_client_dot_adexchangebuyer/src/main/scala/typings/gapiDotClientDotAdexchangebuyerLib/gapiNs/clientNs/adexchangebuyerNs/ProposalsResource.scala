package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProposalsResource extends js.Object {
  /** Get a proposal given its id */
  def get(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Proposal]
  /** Create the given list of proposals */
  def insert(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[CreateOrdersResponse]
  /** Update the given proposal. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProposalId): gapiDotClientLib.gapiNs.clientNs.Request[Proposal]
  /** Search for proposals using pql query */
  def search(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKeyOauthtokenPqlQuery): gapiDotClientLib.gapiNs.clientNs.Request[GetOrdersResponse]
  /** Update the given proposal to indicate that setup has been completed. */
  def setupcomplete(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Update the given proposal */
  def update(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProposalId): gapiDotClientLib.gapiNs.clientNs.Request[Proposal]
}

object ProposalsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Proposal]
    ],
    insert: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[CreateOrdersResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProposalId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Proposal]
    ],
    search: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKeyOauthtokenPqlQuery, 
      gapiDotClientLib.gapiNs.clientNs.Request[GetOrdersResponse]
    ],
    setupcomplete: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    update: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProposalId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Proposal]
    ]
  ): ProposalsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("search")(search)
    __obj.updateDynamic("setupcomplete")(setupcomplete)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[ProposalsResource]
  }
}

