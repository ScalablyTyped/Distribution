package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstantExperiencesAdsDialogResponse
  extends StObject
     with DialogResponse {
  
  var id: String
  
  var success: Boolean
}
object InstantExperiencesAdsDialogResponse {
  
  @scala.inline
  def apply(id: String, success: Boolean): InstantExperiencesAdsDialogResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantExperiencesAdsDialogResponse]
  }
  
  @scala.inline
  implicit class InstantExperiencesAdsDialogResponseMutableBuilder[Self <: InstantExperiencesAdsDialogResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
