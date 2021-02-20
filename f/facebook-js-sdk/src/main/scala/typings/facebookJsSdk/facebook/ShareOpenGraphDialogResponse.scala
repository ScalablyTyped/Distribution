package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareOpenGraphDialogResponse extends DialogResponse {
  
  var post_id: String = js.native
}
object ShareOpenGraphDialogResponse {
  
  @scala.inline
  def apply(post_id: String): ShareOpenGraphDialogResponse = {
    val __obj = js.Dynamic.literal(post_id = post_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareOpenGraphDialogResponse]
  }
  
  @scala.inline
  implicit class ShareOpenGraphDialogResponseMutableBuilder[Self <: ShareOpenGraphDialogResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPost_id(value: String): Self = StObject.set(x, "post_id", value.asInstanceOf[js.Any])
  }
}
