package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRelatedAssets extends StObject {
  
  /**
    * The peer resources of the relationship.
    */
  var assets: js.UndefOr[js.Array[SchemaRelatedAsset]] = js.undefined
  
  /**
    * The detailed relationship attributes.
    */
  var relationshipAttributes: js.UndefOr[SchemaRelationshipAttributes] = js.undefined
}
object SchemaRelatedAssets {
  
  inline def apply(): SchemaRelatedAssets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelatedAssets]
  }
  
  extension [Self <: SchemaRelatedAssets](x: Self) {
    
    inline def setAssets(value: js.Array[SchemaRelatedAsset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: SchemaRelatedAsset*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setRelationshipAttributes(value: SchemaRelationshipAttributes): Self = StObject.set(x, "relationshipAttributes", value.asInstanceOf[js.Any])
    
    inline def setRelationshipAttributesUndefined: Self = StObject.set(x, "relationshipAttributes", js.undefined)
  }
}
