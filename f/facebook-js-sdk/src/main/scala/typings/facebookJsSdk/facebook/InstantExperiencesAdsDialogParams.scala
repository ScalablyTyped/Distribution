package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.canvas_editor
import typings.facebookJsSdk.facebookJsSdkStrings.popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstantExperiencesAdsDialogParams extends DialogParams {
  
  var business_id: String = js.native
  
  var canvas_id: js.UndefOr[String] = js.native
  
  @JSName("display")
  var display_InstantExperiencesAdsDialogParams: popup = js.native
  
  var method: canvas_editor = js.native
  
  var page_id: String = js.native
}
object InstantExperiencesAdsDialogParams {
  
  @scala.inline
  def apply(business_id: String, display: popup, method: canvas_editor, page_id: String): InstantExperiencesAdsDialogParams = {
    val __obj = js.Dynamic.literal(business_id = business_id.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], page_id = page_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantExperiencesAdsDialogParams]
  }
  
  @scala.inline
  implicit class InstantExperiencesAdsDialogParamsMutableBuilder[Self <: InstantExperiencesAdsDialogParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusiness_id(value: String): Self = StObject.set(x, "business_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvas_id(value: String): Self = StObject.set(x, "canvas_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvas_idUndefined: Self = StObject.set(x, "canvas_id", js.undefined)
    
    @scala.inline
    def setDisplay(value: popup): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: canvas_editor): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_id(value: String): Self = StObject.set(x, "page_id", value.asInstanceOf[js.Any])
  }
}
