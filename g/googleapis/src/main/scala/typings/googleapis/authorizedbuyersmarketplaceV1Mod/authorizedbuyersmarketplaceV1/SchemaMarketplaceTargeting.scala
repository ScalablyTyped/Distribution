package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMarketplaceTargeting extends StObject {
  
  /**
    * Daypart targeting information.
    */
  var daypartTargeting: js.UndefOr[SchemaDayPartTargeting] = js.undefined
  
  /**
    * Output only. Geo criteria IDs to be included/excluded.
    */
  var geoTargeting: js.UndefOr[SchemaCriteriaTargeting] = js.undefined
  
  /**
    * Output only. Inventory sizes to be included/excluded.
    */
  var inventorySizeTargeting: js.UndefOr[SchemaInventorySizeTargeting] = js.undefined
  
  /**
    * Output only. Inventory type targeting information.
    */
  var inventoryTypeTargeting: js.UndefOr[SchemaInventoryTypeTargeting] = js.undefined
  
  /**
    * Output only. Placement targeting information, for example, URL, mobile applications.
    */
  var placementTargeting: js.UndefOr[SchemaPlacementTargeting] = js.undefined
  
  /**
    * Output only. Technology targeting information, for example, operating system, device category.
    */
  var technologyTargeting: js.UndefOr[SchemaTechnologyTargeting] = js.undefined
  
  /**
    * Buyer user list targeting information. User lists can be uploaded using https://developers.google.com/authorized-buyers/rtb/bulk-uploader.
    */
  var userListTargeting: js.UndefOr[SchemaCriteriaTargeting] = js.undefined
  
  /**
    * Output only. Video targeting information.
    */
  var videoTargeting: js.UndefOr[SchemaVideoTargeting] = js.undefined
}
object SchemaMarketplaceTargeting {
  
  inline def apply(): SchemaMarketplaceTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMarketplaceTargeting]
  }
  
  extension [Self <: SchemaMarketplaceTargeting](x: Self) {
    
    inline def setDaypartTargeting(value: SchemaDayPartTargeting): Self = StObject.set(x, "daypartTargeting", value.asInstanceOf[js.Any])
    
    inline def setDaypartTargetingUndefined: Self = StObject.set(x, "daypartTargeting", js.undefined)
    
    inline def setGeoTargeting(value: SchemaCriteriaTargeting): Self = StObject.set(x, "geoTargeting", value.asInstanceOf[js.Any])
    
    inline def setGeoTargetingUndefined: Self = StObject.set(x, "geoTargeting", js.undefined)
    
    inline def setInventorySizeTargeting(value: SchemaInventorySizeTargeting): Self = StObject.set(x, "inventorySizeTargeting", value.asInstanceOf[js.Any])
    
    inline def setInventorySizeTargetingUndefined: Self = StObject.set(x, "inventorySizeTargeting", js.undefined)
    
    inline def setInventoryTypeTargeting(value: SchemaInventoryTypeTargeting): Self = StObject.set(x, "inventoryTypeTargeting", value.asInstanceOf[js.Any])
    
    inline def setInventoryTypeTargetingUndefined: Self = StObject.set(x, "inventoryTypeTargeting", js.undefined)
    
    inline def setPlacementTargeting(value: SchemaPlacementTargeting): Self = StObject.set(x, "placementTargeting", value.asInstanceOf[js.Any])
    
    inline def setPlacementTargetingUndefined: Self = StObject.set(x, "placementTargeting", js.undefined)
    
    inline def setTechnologyTargeting(value: SchemaTechnologyTargeting): Self = StObject.set(x, "technologyTargeting", value.asInstanceOf[js.Any])
    
    inline def setTechnologyTargetingUndefined: Self = StObject.set(x, "technologyTargeting", js.undefined)
    
    inline def setUserListTargeting(value: SchemaCriteriaTargeting): Self = StObject.set(x, "userListTargeting", value.asInstanceOf[js.Any])
    
    inline def setUserListTargetingUndefined: Self = StObject.set(x, "userListTargeting", js.undefined)
    
    inline def setVideoTargeting(value: SchemaVideoTargeting): Self = StObject.set(x, "videoTargeting", value.asInstanceOf[js.Any])
    
    inline def setVideoTargetingUndefined: Self = StObject.set(x, "videoTargeting", js.undefined)
  }
}
