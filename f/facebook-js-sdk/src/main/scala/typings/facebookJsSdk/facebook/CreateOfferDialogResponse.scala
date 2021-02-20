package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOfferDialogResponse extends DialogResponse {
  
  var id: String = js.native
  
  var success: Boolean = js.native
}
object CreateOfferDialogResponse {
  
  @scala.inline
  def apply(id: String, success: Boolean): CreateOfferDialogResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOfferDialogResponse]
  }
  
  @scala.inline
  implicit class CreateOfferDialogResponseMutableBuilder[Self <: CreateOfferDialogResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
