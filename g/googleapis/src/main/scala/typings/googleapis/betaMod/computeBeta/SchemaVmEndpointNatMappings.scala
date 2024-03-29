package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVmEndpointNatMappings extends StObject {
  
  /**
    * Name of the VM instance which the endpoint belongs to
    */
  var instanceName: js.UndefOr[String | Null] = js.undefined
  
  var interfaceNatMappings: js.UndefOr[js.Array[SchemaVmEndpointNatMappingsInterfaceNatMappings]] = js.undefined
}
object SchemaVmEndpointNatMappings {
  
  inline def apply(): SchemaVmEndpointNatMappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVmEndpointNatMappings]
  }
  
  extension [Self <: SchemaVmEndpointNatMappings](x: Self) {
    
    inline def setInstanceName(value: String): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setInstanceNameNull: Self = StObject.set(x, "instanceName", null)
    
    inline def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    inline def setInterfaceNatMappings(value: js.Array[SchemaVmEndpointNatMappingsInterfaceNatMappings]): Self = StObject.set(x, "interfaceNatMappings", value.asInstanceOf[js.Any])
    
    inline def setInterfaceNatMappingsUndefined: Self = StObject.set(x, "interfaceNatMappings", js.undefined)
    
    inline def setInterfaceNatMappingsVarargs(value: SchemaVmEndpointNatMappingsInterfaceNatMappings*): Self = StObject.set(x, "interfaceNatMappings", js.Array(value*))
  }
}
