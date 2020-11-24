package typings.followRedirects.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FollowResponse extends js.Object {
  
  var redirects: js.Array[Redirect] = js.native
  
  var responseUrl: String = js.native
}
object FollowResponse {
  
  @scala.inline
  def apply(redirects: js.Array[Redirect], responseUrl: String): FollowResponse = {
    val __obj = js.Dynamic.literal(redirects = redirects.asInstanceOf[js.Any], responseUrl = responseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowResponse]
  }
  
  @scala.inline
  implicit class FollowResponseOps[Self <: FollowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRedirectsVarargs(value: Redirect*): Self = this.set("redirects", js.Array(value :_*))
    
    @scala.inline
    def setRedirects(value: js.Array[Redirect]): Self = this.set("redirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUrl(value: String): Self = this.set("responseUrl", value.asInstanceOf[js.Any])
  }
}
