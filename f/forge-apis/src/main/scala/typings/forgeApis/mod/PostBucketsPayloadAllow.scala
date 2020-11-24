package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostBucketsPayloadAllow extends js.Object {
  
  var access: String = js.native
  
  var authId: String = js.native
}
object PostBucketsPayloadAllow {
  
  @scala.inline
  def apply(access: String, authId: String): PostBucketsPayloadAllow = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], authId = authId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostBucketsPayloadAllow]
  }
  
  @scala.inline
  implicit class PostBucketsPayloadAllowOps[Self <: PostBucketsPayloadAllow] (val x: Self) extends AnyVal {
    
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
    def setAccess(value: String): Self = this.set("access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthId(value: String): Self = this.set("authId", value.asInstanceOf[js.Any])
  }
}
