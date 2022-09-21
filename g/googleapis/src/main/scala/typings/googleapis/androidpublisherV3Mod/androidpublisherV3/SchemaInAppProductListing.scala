package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInAppProductListing extends StObject {
  
  /**
    * Localized entitlement benefits for a subscription.
    */
  var benefits: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Description for the store listing.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Title for the store listing.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaInAppProductListing {
  
  inline def apply(): SchemaInAppProductListing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInAppProductListing]
  }
  
  extension [Self <: SchemaInAppProductListing](x: Self) {
    
    inline def setBenefits(value: js.Array[String]): Self = StObject.set(x, "benefits", value.asInstanceOf[js.Any])
    
    inline def setBenefitsNull: Self = StObject.set(x, "benefits", null)
    
    inline def setBenefitsUndefined: Self = StObject.set(x, "benefits", js.undefined)
    
    inline def setBenefitsVarargs(value: String*): Self = StObject.set(x, "benefits", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
