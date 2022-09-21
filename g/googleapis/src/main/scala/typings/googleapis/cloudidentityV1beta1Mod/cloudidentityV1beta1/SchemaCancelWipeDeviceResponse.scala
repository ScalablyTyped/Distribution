package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCancelWipeDeviceResponse extends StObject {
  
  /**
    * Resultant Device object for the action. Note that asset tags will not be returned in the device object.
    */
  var device: js.UndefOr[SchemaDevice] = js.undefined
}
object SchemaCancelWipeDeviceResponse {
  
  inline def apply(): SchemaCancelWipeDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCancelWipeDeviceResponse]
  }
  
  extension [Self <: SchemaCancelWipeDeviceResponse](x: Self) {
    
    inline def setDevice(value: SchemaDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
