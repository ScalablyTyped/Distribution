package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssetV1p7beta1RelatedAssets extends StObject {
  
  /**
    * The peer resources of the relationship.
    */
  var assets: js.UndefOr[js.Array[SchemaGoogleCloudAssetV1p7beta1RelatedAsset]] = js.undefined
  
  /**
    * The detailed relation attributes.
    */
  var relationshipAttributes: js.UndefOr[SchemaGoogleCloudAssetV1p7beta1RelationshipAttributes] = js.undefined
}
object SchemaGoogleCloudAssetV1p7beta1RelatedAssets {
  
  inline def apply(): SchemaGoogleCloudAssetV1p7beta1RelatedAssets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssetV1p7beta1RelatedAssets]
  }
  
  extension [Self <: SchemaGoogleCloudAssetV1p7beta1RelatedAssets](x: Self) {
    
    inline def setAssets(value: js.Array[SchemaGoogleCloudAssetV1p7beta1RelatedAsset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: SchemaGoogleCloudAssetV1p7beta1RelatedAsset*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setRelationshipAttributes(value: SchemaGoogleCloudAssetV1p7beta1RelationshipAttributes): Self = StObject.set(x, "relationshipAttributes", value.asInstanceOf[js.Any])
    
    inline def setRelationshipAttributesUndefined: Self = StObject.set(x, "relationshipAttributes", js.undefined)
  }
}
