package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionAdsDialogParams
  extends StObject
     with InstantExperiencesAdsDialogParams {
  
  var account_id: String
  
  @JSName("canvas_id")
  var canvas_id_CollectionAdsDialogParams: Unit
  
  var product_catalog_id: js.UndefOr[String] = js.undefined
  
  var product_set_id: js.UndefOr[String] = js.undefined
  
  var template_id: String
}
object CollectionAdsDialogParams {
  
  inline def apply(account_id: String, business_id: String, canvas_id: Unit, page_id: String, template_id: String): CollectionAdsDialogParams = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], business_id = business_id.asInstanceOf[js.Any], canvas_id = canvas_id.asInstanceOf[js.Any], display = "popup", method = "canvas_editor", page_id = page_id.asInstanceOf[js.Any], template_id = template_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionAdsDialogParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectionAdsDialogParams] (val x: Self) extends AnyVal {
    
    inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setCanvas_id(value: Unit): Self = StObject.set(x, "canvas_id", value.asInstanceOf[js.Any])
    
    inline def setProduct_catalog_id(value: String): Self = StObject.set(x, "product_catalog_id", value.asInstanceOf[js.Any])
    
    inline def setProduct_catalog_idUndefined: Self = StObject.set(x, "product_catalog_id", js.undefined)
    
    inline def setProduct_set_id(value: String): Self = StObject.set(x, "product_set_id", value.asInstanceOf[js.Any])
    
    inline def setProduct_set_idUndefined: Self = StObject.set(x, "product_set_id", js.undefined)
    
    inline def setTemplate_id(value: String): Self = StObject.set(x, "template_id", value.asInstanceOf[js.Any])
  }
}
