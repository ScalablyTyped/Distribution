package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreativesResource extends js.Object {
  /** Add a deal id association for the creative. */
  def addDeal(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintAccountIdQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets the status for a single creative. A creative will be available 30-40 minutes after submission. */
  def get(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintAccountIdQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Creative]
  /** Submit a new creative. */
  def insert(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[Creative]
  /** Retrieves a list of the authenticated user's active creatives. A creative will be available 30-40 minutes after submission. */
  def list(request: gapiDotClientDotAdexchangebuyerLib.Anon_MaxResults): gapiDotClientLib.gapiNs.clientNs.Request[CreativesList]
  /** Lists the external deal ids associated with the creative. */
  def listDeals(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintAccountIdQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[CreativeDealIds]
  /** Remove a deal id associated with the creative. */
  def removeDeal(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintAccountIdQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

