package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contain information of Nat mapping for a VM endpoint (i.e., NIC).
  */
@js.native
trait SchemaVmEndpointNatMappings extends StObject {
  
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
  implicit class SchemaVmEndpointNatMappingsMutableBuilder[Self <: SchemaVmEndpointNatMappings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceName(value: String): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    @scala.inline
    def setInterfaceNatMappings(value: js.Array[SchemaVmEndpointNatMappingsInterfaceNatMappings]): Self = StObject.set(x, "interfaceNatMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceNatMappingsUndefined: Self = StObject.set(x, "interfaceNatMappings", js.undefined)
    
    @scala.inline
    def setInterfaceNatMappingsVarargs(value: SchemaVmEndpointNatMappingsInterfaceNatMappings*): Self = StObject.set(x, "interfaceNatMappings", js.Array(value :_*))
  }
}
