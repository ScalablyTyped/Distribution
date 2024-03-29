package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomerListDevicesResponse extends StObject {
  
  /**
    * The customer's devices.
    */
  var devices: js.UndefOr[js.Array[SchemaDevice]] = js.undefined
  
  /**
    * A token used to access the next page of results. Omitted if no further results are available.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomerListDevicesResponse {
  
  inline def apply(): SchemaCustomerListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerListDevicesResponse]
  }
  
  extension [Self <: SchemaCustomerListDevicesResponse](x: Self) {
    
    inline def setDevices(value: js.Array[SchemaDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: SchemaDevice*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
