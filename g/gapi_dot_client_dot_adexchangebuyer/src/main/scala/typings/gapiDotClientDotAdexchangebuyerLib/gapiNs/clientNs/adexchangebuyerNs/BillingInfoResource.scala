package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BillingInfoResource extends js.Object {
  /** Returns the billing information for one account specified by account ID. */
  def get(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintAccountId): gapiDotClientLib.gapiNs.clientNs.Request[BillingInfo]
  /** Retrieves a list of billing information for all accounts of the authenticated user. */
  def list(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[BillingInfoList]
}

