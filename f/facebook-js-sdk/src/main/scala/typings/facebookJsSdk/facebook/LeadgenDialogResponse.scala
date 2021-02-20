package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeadgenDialogResponse extends DialogResponse {
  
  var formID: String = js.native
  
  var success: Boolean = js.native
}
object LeadgenDialogResponse {
  
  @scala.inline
  def apply(formID: String, success: Boolean): LeadgenDialogResponse = {
    val __obj = js.Dynamic.literal(formID = formID.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeadgenDialogResponse]
  }
  
  @scala.inline
  implicit class LeadgenDialogResponseMutableBuilder[Self <: LeadgenDialogResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormID(value: String): Self = StObject.set(x, "formID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
