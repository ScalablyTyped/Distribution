package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSku extends StObject {
  
  /**
    * The category hierarchy of this SKU, purely for organizational purpose.
    */
  var category: js.UndefOr[SchemaCategory] = js.undefined
  
  /**
    * A human readable description of the SKU, has a maximum length of 256 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The geographic taxonomy for this sku.
    */
  var geoTaxonomy: js.UndefOr[SchemaGeoTaxonomy] = js.undefined
  
  /**
    * The resource name for the SKU. Example: "services/DA34-426B-A397/skus/AA95-CD31-42FE"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A timeline of pricing info for this SKU in chronological order.
    */
  var pricingInfo: js.UndefOr[js.Array[SchemaPricingInfo]] = js.undefined
  
  /**
    * Identifies the service provider. This is 'Google' for first party services in Google Cloud Platform.
    */
  var serviceProviderName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of service regions this SKU is offered at. Example: "asia-east1" Service regions can be found at https://cloud.google.com/about/locations/
    */
  var serviceRegions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The identifier for the SKU. Example: "AA95-CD31-42FE"
    */
  var skuId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSku {
  
  inline def apply(): SchemaSku = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSku]
  }
  
  extension [Self <: SchemaSku](x: Self) {
    
    inline def setCategory(value: SchemaCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGeoTaxonomy(value: SchemaGeoTaxonomy): Self = StObject.set(x, "geoTaxonomy", value.asInstanceOf[js.Any])
    
    inline def setGeoTaxonomyUndefined: Self = StObject.set(x, "geoTaxonomy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPricingInfo(value: js.Array[SchemaPricingInfo]): Self = StObject.set(x, "pricingInfo", value.asInstanceOf[js.Any])
    
    inline def setPricingInfoUndefined: Self = StObject.set(x, "pricingInfo", js.undefined)
    
    inline def setPricingInfoVarargs(value: SchemaPricingInfo*): Self = StObject.set(x, "pricingInfo", js.Array(value*))
    
    inline def setServiceProviderName(value: String): Self = StObject.set(x, "serviceProviderName", value.asInstanceOf[js.Any])
    
    inline def setServiceProviderNameNull: Self = StObject.set(x, "serviceProviderName", null)
    
    inline def setServiceProviderNameUndefined: Self = StObject.set(x, "serviceProviderName", js.undefined)
    
    inline def setServiceRegions(value: js.Array[String]): Self = StObject.set(x, "serviceRegions", value.asInstanceOf[js.Any])
    
    inline def setServiceRegionsNull: Self = StObject.set(x, "serviceRegions", null)
    
    inline def setServiceRegionsUndefined: Self = StObject.set(x, "serviceRegions", js.undefined)
    
    inline def setServiceRegionsVarargs(value: String*): Self = StObject.set(x, "serviceRegions", js.Array(value*))
    
    inline def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
    
    inline def setSkuIdNull: Self = StObject.set(x, "skuId", null)
    
    inline def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
  }
}
