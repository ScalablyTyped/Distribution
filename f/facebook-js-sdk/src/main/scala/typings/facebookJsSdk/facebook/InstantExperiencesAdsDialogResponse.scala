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
  
  inline def apply(id: String, success: Boolean): InstantExperiencesAdsDialogResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantExperiencesAdsDialogResponse]
  }
  
  extension [Self <: InstantExperiencesAdsDialogResponse](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
