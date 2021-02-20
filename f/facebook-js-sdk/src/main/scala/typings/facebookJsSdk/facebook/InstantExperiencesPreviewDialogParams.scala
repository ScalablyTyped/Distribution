package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.canvas_preview
import typings.facebookJsSdk.facebookJsSdkStrings.popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstantExperiencesPreviewDialogParams extends DialogParams {
  
  var canvas_id: String = js.native
  
  @JSName("display")
  var display_InstantExperiencesPreviewDialogParams: popup = js.native
  
  var method: canvas_preview = js.native
}
object InstantExperiencesPreviewDialogParams {
  
  @scala.inline
  def apply(canvas_id: String, display: popup, method: canvas_preview): InstantExperiencesPreviewDialogParams = {
    val __obj = js.Dynamic.literal(canvas_id = canvas_id.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantExperiencesPreviewDialogParams]
  }
  
  @scala.inline
  implicit class InstantExperiencesPreviewDialogParamsMutableBuilder[Self <: InstantExperiencesPreviewDialogParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvas_id(value: String): Self = StObject.set(x, "canvas_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay(value: popup): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: canvas_preview): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
