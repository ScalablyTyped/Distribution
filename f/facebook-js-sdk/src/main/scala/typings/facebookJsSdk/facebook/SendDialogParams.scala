package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.send
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendDialogParams
  extends StObject
     with DialogParams {
  
  var link: String
  
  var method: send
  
  var to: js.UndefOr[String] = js.undefined
}
object SendDialogParams {
  
  @scala.inline
  def apply(link: String): SendDialogParams = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], method = "send")
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
