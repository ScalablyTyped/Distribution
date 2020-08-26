package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contain information of Nat mapping for a VM endpoint (i.e., NIC).
  */
@js.native
trait SchemaVmEndpointNatMappings extends js.Object {
  /**
    * Name of the VM instance which the endpoint belongs to
    */
  var instanceName: js.UndefOr[String] = js.native
  var interfaceNatMappings: js.UndefOr[js.Array[SchemaVmEndpointNatMappingsInterfaceNatMappings]] = js.native
}

object SchemaVmEndpointNatMappings {
  @scala.inline
  def apply(): SchemaVmEndpointNatMappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVmEndpointNatMappings]
  }
  @scala.inline
  implicit class SchemaVmEndpointNatMappingsOps[Self <: SchemaVmEndpointNatMappings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInstanceName(value: String): Self = this.set("instanceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceName: Self = this.set("instanceName", js.undefined)
    @scala.inline
    def setInterfaceNatMappingsVarargs(value: SchemaVmEndpointNatMappingsInterfaceNatMappings*): Self = this.set("interfaceNatMappings", js.Array(value :_*))
    @scala.inline
    def setInterfaceNatMappings(value: js.Array[SchemaVmEndpointNatMappingsInterfaceNatMappings]): Self = this.set("interfaceNatMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaceNatMappings: Self = this.set("interfaceNatMappings", js.undefined)
  }
  
}

