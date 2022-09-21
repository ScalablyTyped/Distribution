package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubscription extends StObject {
  
  /**
    * Output only. Whether this subscription is archived. Archived subscriptions are not available to any subscriber any longer, cannot be updated, and are not returned in list requests unless the show archived flag is passed in.
    */
  var archived: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The set of base plans for this subscription. Represents the prices and duration of the subscription if no other offers apply.
    */
  var basePlans: js.UndefOr[js.Array[SchemaBasePlan]] = js.undefined
  
  /**
    * Required. List of localized listings for this subscription. Must contain at least an entry for the default language of the parent app.
    */
  var listings: js.UndefOr[js.Array[SchemaSubscriptionListing]] = js.undefined
  
  /**
    * Immutable. Package name of the parent app.
    */
  var packageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. Unique product ID of the product. Unique within the parent app. Product IDs must be composed of lower-case letters (a-z), numbers (0-9), underscores (_) and dots (.). It must start with a lower-case letter or number, and be between 1 and 40 (inclusive) characters in length.
    */
  var productId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details about taxes and legal compliance.
    */
  var taxAndComplianceSettings: js.UndefOr[SchemaSubscriptionTaxAndComplianceSettings] = js.undefined
}
object SchemaSubscription {
  
  inline def apply(): SchemaSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscription]
  }
  
  extension [Self <: SchemaSubscription](x: Self) {
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedNull: Self = StObject.set(x, "archived", null)
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setBasePlans(value: js.Array[SchemaBasePlan]): Self = StObject.set(x, "basePlans", value.asInstanceOf[js.Any])
    
    inline def setBasePlansUndefined: Self = StObject.set(x, "basePlans", js.undefined)
    
    inline def setBasePlansVarargs(value: SchemaBasePlan*): Self = StObject.set(x, "basePlans", js.Array(value*))
    
    inline def setListings(value: js.Array[SchemaSubscriptionListing]): Self = StObject.set(x, "listings", value.asInstanceOf[js.Any])
    
    inline def setListingsUndefined: Self = StObject.set(x, "listings", js.undefined)
    
    inline def setListingsVarargs(value: SchemaSubscriptionListing*): Self = StObject.set(x, "listings", js.Array(value*))
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setTaxAndComplianceSettings(value: SchemaSubscriptionTaxAndComplianceSettings): Self = StObject.set(x, "taxAndComplianceSettings", value.asInstanceOf[js.Any])
    
    inline def setTaxAndComplianceSettingsUndefined: Self = StObject.set(x, "taxAndComplianceSettings", js.undefined)
  }
}
