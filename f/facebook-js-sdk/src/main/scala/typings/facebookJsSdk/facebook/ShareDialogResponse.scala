package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareDialogResponse
  extends StObject
     with DialogResponse {
  
  var post_id: String
}
object ShareDialogResponse {
  
  inline def apply(post_id: String): ShareDialogResponse = {
    val __obj = js.Dynamic.literal(post_id = post_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareDialogResponse]
  }
  
  extension [Self <: ShareDialogResponse](x: Self) {
    
    inline def setPost_id(value: String): Self = StObject.set(x, "post_id", value.asInstanceOf[js.Any])
  }
}
