package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssetV1p7beta1RelationshipAttributes extends StObject {
  
  /**
    * The detail of the relationship, e.g. `contains`, `attaches`
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The source asset type. Example: `compute.googleapis.com/Instance`
    */
  var sourceResourceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The target asset type. Example: `compute.googleapis.com/Disk`
    */
  var targetResourceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique identifier of the relationship type. Example: `INSTANCE_TO_INSTANCEGROUP`
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudAssetV1p7beta1RelationshipAttributes {
  
  inline def apply(): SchemaGoogleCloudAssetV1p7beta1RelationshipAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssetV1p7beta1RelationshipAttributes]
  }
  
  extension [Self <: SchemaGoogleCloudAssetV1p7beta1RelationshipAttributes](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setSourceResourceType(value: String): Self = StObject.set(x, "sourceResourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceResourceTypeNull: Self = StObject.set(x, "sourceResourceType", null)
    
    inline def setSourceResourceTypeUndefined: Self = StObject.set(x, "sourceResourceType", js.undefined)
    
    inline def setTargetResourceType(value: String): Self = StObject.set(x, "targetResourceType", value.asInstanceOf[js.Any])
    
    inline def setTargetResourceTypeNull: Self = StObject.set(x, "targetResourceType", null)
    
    inline def setTargetResourceTypeUndefined: Self = StObject.set(x, "targetResourceType", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
