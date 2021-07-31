package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.pagetab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddPageTabDialogParams
  extends StObject
     with DialogParams {
  
  var method: pagetab
  
  @JSName("redirect_uri")
  var redirect_uri_AddPageTabDialogParams: String
}
object AddPageTabDialogParams {
  
  @scala.inline
  def apply(redirect_uri: String): AddPageTabDialogParams = {
    val __obj = js.Dynamic.literal(method = "pagetab", redirect_uri = redirect_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPageTabDialogParams]
  }
  
  @scala.inline
  implicit class AddPageTabDialogParamsMutableBuilder[Self <: AddPageTabDialogParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: pagetab): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
  }
}
