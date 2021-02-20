package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogResponse extends StObject {
  
  var error_code: js.UndefOr[Double] = js.native
  
  var error_message: js.UndefOr[String] = js.native
}
object DialogResponse {
  
  @scala.inline
  def apply(): DialogResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogResponse]
  }
  
  @scala.inline
  implicit class DialogResponseMutableBuilder[Self <: DialogResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError_code(value: Double): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_codeUndefined: Self = StObject.set(x, "error_code", js.undefined)
    
    @scala.inline
    def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_messageUndefined: Self = StObject.set(x, "error_message", js.undefined)
  }
}
