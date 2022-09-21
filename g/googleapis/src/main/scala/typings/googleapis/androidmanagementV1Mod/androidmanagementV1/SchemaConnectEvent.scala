package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConnectEvent extends StObject {
  
  /**
    * The destination IP address of the connect call.
    */
  var destinationIpAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The destination port of the connect call.
    */
  var destinationPort: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The package name of the UID that performed the connect call.
    */
  var packageName: js.UndefOr[String | Null] = js.undefined
}
object SchemaConnectEvent {
  
  inline def apply(): SchemaConnectEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectEvent]
  }
  
  extension [Self <: SchemaConnectEvent](x: Self) {
    
    inline def setDestinationIpAddress(value: String): Self = StObject.set(x, "destinationIpAddress", value.asInstanceOf[js.Any])
    
    inline def setDestinationIpAddressNull: Self = StObject.set(x, "destinationIpAddress", null)
    
    inline def setDestinationIpAddressUndefined: Self = StObject.set(x, "destinationIpAddress", js.undefined)
    
    inline def setDestinationPort(value: Double): Self = StObject.set(x, "destinationPort", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortNull: Self = StObject.set(x, "destinationPort", null)
    
    inline def setDestinationPortUndefined: Self = StObject.set(x, "destinationPort", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
