package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1alpha1OperationMetadata extends StObject {
  
  /**
    * The RPC that initiated this Long Running Operation.
    */
  var operationType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1alpha1OperationMetadata {
  
  inline def apply(): SchemaGoogleCloudChannelV1alpha1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1alpha1OperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1alpha1OperationMetadata](x: Self) {
    
    inline def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeNull: Self = StObject.set(x, "operationType", null)
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
  }
}
