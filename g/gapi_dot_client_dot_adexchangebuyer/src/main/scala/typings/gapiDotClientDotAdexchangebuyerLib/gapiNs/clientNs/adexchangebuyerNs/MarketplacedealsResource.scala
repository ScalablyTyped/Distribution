package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MarketplacedealsResource extends js.Object {
  /** Delete the specified deals from the proposal */
  def delete(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintProposalId): gapiDotClientLib.gapiNs.clientNs.Request[DeleteOrderDealsResponse]
  /** Add new deals for the specified proposal */
  def insert(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintProposalId): gapiDotClientLib.gapiNs.clientNs.Request[AddOrderDealsResponse]
  /** List all the deals for a given proposal */
  def list(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintProposalIdQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[GetOrderDealsResponse]
  /** Replaces all the deals in the proposal with the passed in deals */
  def update(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintProposalId): gapiDotClientLib.gapiNs.clientNs.Request[EditAllOrderDealsResponse]
}

