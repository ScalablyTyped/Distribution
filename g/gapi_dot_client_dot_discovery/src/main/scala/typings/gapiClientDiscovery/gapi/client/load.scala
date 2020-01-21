package typings.gapiClientDiscovery.gapi.client

import typings.gapiClientDiscovery.gapiClientDiscoveryStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.load")
@js.native
object load extends js.Object {
  /** Load APIs Discovery Service v1 */
  def apply(name: typings.gapiClientDiscovery.gapiClientDiscoveryStrings.discovery, version: v1): js.Thenable[Unit] = js.native
  def apply(
    name: typings.gapiClientDiscovery.gapiClientDiscoveryStrings.discovery,
    version: v1,
    callback: js.Function0[_]
  ): Unit = js.native
}

