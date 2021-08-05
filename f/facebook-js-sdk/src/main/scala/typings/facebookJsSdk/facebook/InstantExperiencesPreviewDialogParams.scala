package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.canvas_preview
import typings.facebookJsSdk.facebookJsSdkStrings.popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstantExperiencesPreviewDialogParams
  extends StObject
     with DialogParams {
  
  var canvas_id: String
  
  @JSName("display")
  var display_InstantExperiencesPreviewDialogParams: popup
  
  var method: canvas_preview
}
object InstantExperiencesPreviewDialogParams {
  
  inline def apply(canvas_id: String): InstantExperiencesPreviewDialogParams = {
    val __obj = js.Dynamic.literal(canvas_id = canvas_id.asInstanceOf[js.Any], display = "popup", method = "canvas_preview")
    __obj.asInstanceOf[InstantExperiencesPreviewDialogParams]
  }
  
  extension [Self <: InstantExperiencesPreviewDialogParams](x: Self) {
    
    inline def setCanvas_id(value: String): Self = StObject.set(x, "canvas_id", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: popup): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: canvas_preview): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
