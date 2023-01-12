package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.canvas_editor
import typings.facebookJsSdk.facebookJsSdkStrings.popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstantExperiencesAdsDialogParams
  extends StObject
     with DialogParams {
  
  var business_id: String
  
  var canvas_id: js.UndefOr[String] = js.undefined
  
  @JSName("display")
  var display_InstantExperiencesAdsDialogParams: popup
  
  var method: canvas_editor
  
  var page_id: String
}
object InstantExperiencesAdsDialogParams {
  
  inline def apply(business_id: String, page_id: String): InstantExperiencesAdsDialogParams = {
    val __obj = js.Dynamic.literal(business_id = business_id.asInstanceOf[js.Any], display = "popup", method = "canvas_editor", page_id = page_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantExperiencesAdsDialogParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstantExperiencesAdsDialogParams] (val x: Self) extends AnyVal {
    
    inline def setBusiness_id(value: String): Self = StObject.set(x, "business_id", value.asInstanceOf[js.Any])
    
    inline def setCanvas_id(value: String): Self = StObject.set(x, "canvas_id", value.asInstanceOf[js.Any])
    
    inline def setCanvas_idUndefined: Self = StObject.set(x, "canvas_id", js.undefined)
    
    inline def setDisplay(value: popup): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: canvas_editor): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPage_id(value: String): Self = StObject.set(x, "page_id", value.asInstanceOf[js.Any])
  }
}
