package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGeoTaxonomy extends StObject {
  
  /**
    * The list of regions associated with a sku. Empty for Global skus, which are associated with all Google Cloud regions.
    */
  var regions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The type of Geo Taxonomy: GLOBAL, REGIONAL, or MULTI_REGIONAL.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGeoTaxonomy {
  
  inline def apply(): SchemaGeoTaxonomy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeoTaxonomy]
  }
  
  extension [Self <: SchemaGeoTaxonomy](x: Self) {
    
    inline def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsNull: Self = StObject.set(x, "regions", null)
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
