package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeadgenDialogResponse
  extends StObject
     with DialogResponse {
  
  var formID: String
  
  var success: Boolean
}
object LeadgenDialogResponse {
  
  inline def apply(formID: String, success: Boolean): LeadgenDialogResponse = {
    val __obj = js.Dynamic.literal(formID = formID.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeadgenDialogResponse]
  }
  
  extension [Self <: LeadgenDialogResponse](x: Self) {
    
    inline def setFormID(value: String): Self = StObject.set(x, "formID", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
