package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.pagetab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddPageTabDialogParams extends DialogParams {
  
  var method: pagetab = js.native
  
  @JSName("redirect_uri")
  var redirect_uri_AddPageTabDialogParams: String = js.native
}
object AddPageTabDialogParams {
  
  @scala.inline
  def apply(method: pagetab, redirect_uri: String): AddPageTabDialogParams = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], redirect_uri = redirect_uri.asInstanceOf[js.Any])
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
