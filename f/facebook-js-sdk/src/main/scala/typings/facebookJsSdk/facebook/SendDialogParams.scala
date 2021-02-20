package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.send
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendDialogParams extends DialogParams {
  
  var link: String = js.native
  
  var method: send = js.native
  
  var to: js.UndefOr[String] = js.native
}
object SendDialogParams {
  
  @scala.inline
  def apply(link: String, method: send): SendDialogParams = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendDialogParams]
  }
  
  @scala.inline
  implicit class SendDialogParamsMutableBuilder[Self <: SendDialogParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: send): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
