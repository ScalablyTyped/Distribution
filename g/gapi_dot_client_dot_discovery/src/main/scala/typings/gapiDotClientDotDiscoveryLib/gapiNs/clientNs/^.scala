package typings
package gapiDotClientDotDiscoveryLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val apis: gapiDotClientDotDiscoveryLib.gapiNs.clientNs.discoveryNs.ApisResource = js.native
  /** Load APIs Discovery Service v1 */
  def load(
    name: gapiDotClientDotDiscoveryLib.gapiDotClientDotDiscoveryLibStrings.discovery,
    version: gapiDotClientDotDiscoveryLib.gapiDotClientDotDiscoveryLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotDiscoveryLib.gapiDotClientDotDiscoveryLibStrings.discovery,
    version: gapiDotClientDotDiscoveryLib.gapiDotClientDotDiscoveryLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

