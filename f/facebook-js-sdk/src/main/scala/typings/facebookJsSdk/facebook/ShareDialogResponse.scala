package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareDialogResponse extends DialogResponse {
  
  var post_id: String = js.native
}
object ShareDialogResponse {
  
  @scala.inline
  def apply(post_id: String): ShareDialogResponse = {
    val __obj = js.Dynamic.literal(post_id = post_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareDialogResponse]
  }
  
  @scala.inline
  implicit class ShareDialogResponseMutableBuilder[Self <: ShareDialogResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPost_id(value: String): Self = StObject.set(x, "post_id", value.asInstanceOf[js.Any])
  }
}
