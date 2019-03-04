package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartnersResource extends js.Object {
  var customers: CustomersResource
  var devices: DevicesResource
}

object PartnersResource {
  @scala.inline
  def apply(customers: CustomersResource, devices: DevicesResource): PartnersResource = {
    val __obj = js.Dynamic.literal(customers = customers, devices = devices)
  
    __obj.asInstanceOf[PartnersResource]
  }
}

