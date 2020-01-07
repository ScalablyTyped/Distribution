package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contain information of Nat mapping for a VM endpoint (i.e., NIC).
  */
@js.native
trait Schema$VmEndpointNatMappings extends js.Object {
  /**
    * Name of the VM instance which the endpoint belongs to
    */
  var instanceName: js.UndefOr[String] = js.native
  var interfaceNatMappings: js.UndefOr[js.Array[Schema$VmEndpointNatMappingsInterfaceNatMappings]] = js.native
}

object Schema$VmEndpointNatMappings {
  @scala.inline
  def apply(
    instanceName: String = null,
    interfaceNatMappings: js.Array[Schema$VmEndpointNatMappingsInterfaceNatMappings] = null
  ): Schema$VmEndpointNatMappings = {
    val __obj = js.Dynamic.literal()
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (interfaceNatMappings != null) __obj.updateDynamic("interfaceNatMappings")(interfaceNatMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VmEndpointNatMappings]
  }
}

