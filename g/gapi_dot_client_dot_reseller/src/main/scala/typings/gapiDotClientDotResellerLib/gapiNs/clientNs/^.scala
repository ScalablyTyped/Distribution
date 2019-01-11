package typings
package gapiDotClientDotResellerLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val customers: gapiDotClientDotResellerLib.gapiNs.clientNs.resellerNs.CustomersResource = js.native
  val resellernotify: gapiDotClientDotResellerLib.gapiNs.clientNs.resellerNs.ResellernotifyResource = js.native
  val subscriptions: gapiDotClientDotResellerLib.gapiNs.clientNs.resellerNs.SubscriptionsResource = js.native
  /** Load Enterprise Apps Reseller API v1 */
  def load(
    name: gapiDotClientDotResellerLib.gapiDotClientDotResellerLibStrings.reseller,
    version: gapiDotClientDotResellerLib.gapiDotClientDotResellerLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotResellerLib.gapiDotClientDotResellerLibStrings.reseller,
    version: gapiDotClientDotResellerLib.gapiDotClientDotResellerLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

