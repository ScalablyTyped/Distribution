package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProposalsResource extends js.Object {
  /** Get a proposal given its id */
  def get(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintProposalId): gapiDotClientLib.gapiNs.clientNs.Request[Proposal]
  /** Create the given list of proposals */
  def insert(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[CreateOrdersResponse]
  /** Update the given proposal. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintProposalIdQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[Proposal]
  /** Search for proposals using pql query */
  def search(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[GetOrdersResponse]
  /** Update the given proposal to indicate that setup has been completed. */
  def setupcomplete(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintProposalId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Update the given proposal */
  def update(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintProposalIdQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[Proposal]
}

