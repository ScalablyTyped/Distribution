package typings
package gapiDotClientDotResellerLib.gapiNs.clientNs.resellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CustomersResource extends js.Object {
  /** Get a customer account. */
  def get(request: gapiDotClientDotResellerLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[Customer]
  /** Order a new customer's account. */
  def insert(request: gapiDotClientDotResellerLib.Anon_PrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Customer]
  /** Update a customer account's settings. This method supports patch semantics. */
  def patch(request: gapiDotClientDotResellerLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[Customer]
  /** Update a customer account's settings. */
  def update(request: gapiDotClientDotResellerLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[Customer]
}

