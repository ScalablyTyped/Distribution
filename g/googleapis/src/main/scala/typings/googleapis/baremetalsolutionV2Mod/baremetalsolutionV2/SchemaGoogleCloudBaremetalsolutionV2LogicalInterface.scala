package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBaremetalsolutionV2LogicalInterface extends StObject {
  
  /**
    * The index of the logical interface mapping to the index of the hardware bond or nic on the chosen network template. This field is deprecated.
    */
  var interfaceIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * List of logical network interfaces within a logical interface.
    */
  var logicalNetworkInterfaces: js.UndefOr[js.Array[SchemaLogicalNetworkInterface]] = js.undefined
  
  /**
    * Interface name. This is of syntax or and forms part of the network template name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudBaremetalsolutionV2LogicalInterface {
  
  inline def apply(): SchemaGoogleCloudBaremetalsolutionV2LogicalInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBaremetalsolutionV2LogicalInterface]
  }
  
  extension [Self <: SchemaGoogleCloudBaremetalsolutionV2LogicalInterface](x: Self) {
    
    inline def setInterfaceIndex(value: Double): Self = StObject.set(x, "interfaceIndex", value.asInstanceOf[js.Any])
    
    inline def setInterfaceIndexNull: Self = StObject.set(x, "interfaceIndex", null)
    
    inline def setInterfaceIndexUndefined: Self = StObject.set(x, "interfaceIndex", js.undefined)
    
    inline def setLogicalNetworkInterfaces(value: js.Array[SchemaLogicalNetworkInterface]): Self = StObject.set(x, "logicalNetworkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setLogicalNetworkInterfacesUndefined: Self = StObject.set(x, "logicalNetworkInterfaces", js.undefined)
    
    inline def setLogicalNetworkInterfacesVarargs(value: SchemaLogicalNetworkInterface*): Self = StObject.set(x, "logicalNetworkInterfaces", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
