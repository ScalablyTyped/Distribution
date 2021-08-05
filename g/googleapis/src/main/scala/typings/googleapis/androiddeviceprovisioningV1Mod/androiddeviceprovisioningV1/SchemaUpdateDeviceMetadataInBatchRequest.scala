package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to update device metadata in batch.
  */
trait SchemaUpdateDeviceMetadataInBatchRequest extends StObject {
  
  /**
    * Required. The list of metadata updates.
    */
  var updates: js.UndefOr[js.Array[SchemaUpdateMetadataArguments]] = js.undefined
}
object SchemaUpdateDeviceMetadataInBatchRequest {
  
  inline def apply(): SchemaUpdateDeviceMetadataInBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDeviceMetadataInBatchRequest]
  }
  
  extension [Self <: SchemaUpdateDeviceMetadataInBatchRequest](x: Self) {
    
    inline def setUpdates(value: js.Array[SchemaUpdateMetadataArguments]): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
    
    inline def setUpdatesVarargs(value: SchemaUpdateMetadataArguments*): Self = StObject.set(x, "updates", js.Array(value :_*))
  }
}
