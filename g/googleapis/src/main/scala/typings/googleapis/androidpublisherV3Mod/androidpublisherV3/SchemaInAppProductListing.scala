package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInAppProductListing extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object SchemaInAppProductListing {
  
  @scala.inline
  def apply(): SchemaInAppProductListing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInAppProductListing]
  }
  
  @scala.inline
  implicit class SchemaInAppProductListingMutableBuilder[Self <: SchemaInAppProductListing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
