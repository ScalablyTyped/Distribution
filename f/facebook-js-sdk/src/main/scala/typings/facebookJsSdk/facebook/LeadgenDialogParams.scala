package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.lead_gen
import typings.facebookJsSdk.facebookJsSdkStrings.popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeadgenDialogParams
  extends StObject
     with DialogParams {
  
  var account_id: String
  
  @JSName("display")
  var display_LeadgenDialogParams: popup
  
  var method: lead_gen
  
  var page_id: String
}
object LeadgenDialogParams {
  
  inline def apply(account_id: String, page_id: String): LeadgenDialogParams = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], display = "popup", method = "lead_gen", page_id = page_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeadgenDialogParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LeadgenDialogParams] (val x: Self) extends AnyVal {
    
    inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: popup): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: lead_gen): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPage_id(value: String): Self = StObject.set(x, "page_id", value.asInstanceOf[js.Any])
  }
}
