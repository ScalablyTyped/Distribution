package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPartialUpdateInstanceRequest extends StObject {
  
  /**
    * Required. The Instance which will (partially) replace the current value.
    */
  var instance: js.UndefOr[SchemaInstance] = js.undefined
  
  /**
    * Required. The subset of Instance fields which should be replaced. Must be explicitly set.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaPartialUpdateInstanceRequest {
  
  inline def apply(): SchemaPartialUpdateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartialUpdateInstanceRequest]
  }
  
  extension [Self <: SchemaPartialUpdateInstanceRequest](x: Self) {
    
    inline def setInstance(value: SchemaInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
