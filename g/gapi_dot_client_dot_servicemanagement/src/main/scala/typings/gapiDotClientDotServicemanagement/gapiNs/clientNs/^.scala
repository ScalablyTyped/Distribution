package typings.gapiDotClientDotServicemanagement.gapiNs.clientNs

import typings.gapiDotClientDotServicemanagement.gapiDotClientDotServicemanagementStrings.servicemanagement
import typings.gapiDotClientDotServicemanagement.gapiDotClientDotServicemanagementStrings.v1
import typings.gapiDotClientDotServicemanagement.gapiNs.clientNs.servicemanagementNs.OperationsResource
import typings.gapiDotClientDotServicemanagement.gapiNs.clientNs.servicemanagementNs.ServicesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val operations: OperationsResource = js.native
  val services: ServicesResource = js.native
  /** Load Google Service Management API v1 */
  def load(name: servicemanagement, version: v1): js.Thenable[Unit] = js.native
  def load(name: servicemanagement, version: v1, callback: js.Function0[_]): Unit = js.native
}

