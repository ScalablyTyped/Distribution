package typings.gapiDotClientDotAndroiddeviceprovisioning.gapiNs.clientNs

import typings.gapiDotClientDotAndroiddeviceprovisioning.gapiDotClientDotAndroiddeviceprovisioningStrings.androiddeviceprovisioning
import typings.gapiDotClientDotAndroiddeviceprovisioning.gapiDotClientDotAndroiddeviceprovisioningStrings.v1
import typings.gapiDotClientDotAndroiddeviceprovisioning.gapiNs.clientNs.androiddeviceprovisioningNs.OperationsResource
import typings.gapiDotClientDotAndroiddeviceprovisioning.gapiNs.clientNs.androiddeviceprovisioningNs.PartnersResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val operations: OperationsResource = js.native
  val partners: PartnersResource = js.native
  /** Load Android Device Provisioning Partner API v1 */
  def load(name: androiddeviceprovisioning, version: v1): js.Thenable[Unit] = js.native
  def load(name: androiddeviceprovisioning, version: v1, callback: js.Function0[_]): Unit = js.native
}

