package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRelatedResource extends StObject {
  
  /**
    * The type of the asset. Example: `compute.googleapis.com/Instance`
    */
  var assetType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full resource name of the related resource. Example: `//compute.googleapis.com/projects/my_proj_123/zones/instance/instance123`
    */
  var fullResourceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaRelatedResource {
  
  inline def apply(): SchemaRelatedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelatedResource]
  }
  
  extension [Self <: SchemaRelatedResource](x: Self) {
    
    inline def setAssetType(value: String): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
    
    inline def setAssetTypeNull: Self = StObject.set(x, "assetType", null)
    
    inline def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
    
    inline def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    inline def setFullResourceNameNull: Self = StObject.set(x, "fullResourceName", null)
    
    inline def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
  }
}
