package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttachedResource extends StObject {
  
  /**
    * The type of this attached resource. Example: `osconfig.googleapis.com/Inventory` You can find the supported attached asset types of each resource in this table: `https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types`
    */
  var assetType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Versioned resource representations of this attached resource. This is repeated because there could be multiple versions of the attached resource representations during version migration.
    */
  var versionedResources: js.UndefOr[js.Array[SchemaVersionedResource]] = js.undefined
}
object SchemaAttachedResource {
  
  inline def apply(): SchemaAttachedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachedResource]
  }
  
  extension [Self <: SchemaAttachedResource](x: Self) {
    
    inline def setAssetType(value: String): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
    
    inline def setAssetTypeNull: Self = StObject.set(x, "assetType", null)
    
    inline def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
    
    inline def setVersionedResources(value: js.Array[SchemaVersionedResource]): Self = StObject.set(x, "versionedResources", value.asInstanceOf[js.Any])
    
    inline def setVersionedResourcesUndefined: Self = StObject.set(x, "versionedResources", js.undefined)
    
    inline def setVersionedResourcesVarargs(value: SchemaVersionedResource*): Self = StObject.set(x, "versionedResources", js.Array(value*))
  }
}
