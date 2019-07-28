package typings.gapiDotClientDotDiscovery.gapiNs.clientNs

import typings.gapiDotClientDotDiscovery.gapiDotClientDotDiscoveryStrings.discovery
import typings.gapiDotClientDotDiscovery.gapiDotClientDotDiscoveryStrings.v1
import typings.gapiDotClientDotDiscovery.gapiNs.clientNs.discoveryNs.ApisResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val apis: ApisResource = js.native
  /** Load APIs Discovery Service v1 */
  def load(name: discovery, version: v1): js.Thenable[Unit] = js.native
  def load(name: discovery, version: v1, callback: js.Function0[_]): Unit = js.native
}

