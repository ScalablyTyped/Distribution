package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Gets one account by ID. */
  def get(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Account]
  /** Retrieves the authenticated user's list of accounts. */
  def list(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[AccountsList]
  /** Updates an existing account. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Account]
  /** Updates an existing account. */
  def update(request: gapiDotClientDotAdexchangebuyerLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Account]
}

