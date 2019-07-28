package typings.gapiDotClientDotRuntimeconfig.gapiNs.clientNs

import typings.gapiDotClientDotRuntimeconfig.gapiDotClientDotRuntimeconfigStrings.runtimeconfig
import typings.gapiDotClientDotRuntimeconfig.gapiDotClientDotRuntimeconfigStrings.v1
import typings.gapiDotClientDotRuntimeconfig.gapiNs.clientNs.runtimeconfigNs.OperationsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val operations: OperationsResource = js.native
  /** Load Google Cloud Runtime Configuration API v1 */
  def load(name: runtimeconfig, version: v1): js.Thenable[Unit] = js.native
  def load(name: runtimeconfig, version: v1, callback: js.Function0[_]): Unit = js.native
}

