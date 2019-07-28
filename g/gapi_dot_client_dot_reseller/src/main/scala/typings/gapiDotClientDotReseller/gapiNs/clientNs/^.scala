package typings.gapiDotClientDotReseller.gapiNs.clientNs

import typings.gapiDotClientDotReseller.gapiDotClientDotResellerStrings.reseller
import typings.gapiDotClientDotReseller.gapiDotClientDotResellerStrings.v1
import typings.gapiDotClientDotReseller.gapiNs.clientNs.resellerNs.CustomersResource
import typings.gapiDotClientDotReseller.gapiNs.clientNs.resellerNs.ResellernotifyResource
import typings.gapiDotClientDotReseller.gapiNs.clientNs.resellerNs.SubscriptionsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val customers: CustomersResource = js.native
  val resellernotify: ResellernotifyResource = js.native
  val subscriptions: SubscriptionsResource = js.native
  /** Load Enterprise Apps Reseller API v1 */
  def load(name: reseller, version: v1): js.Thenable[Unit] = js.native
  def load(name: reseller, version: v1, callback: js.Function0[_]): Unit = js.native
}

