package typings.googleCloudKms.mod.v1.KeyManagementServiceClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCryptoKeysRequest extends js.Object {
  
  var page_size: js.UndefOr[Double] = js.native
  
  var page_token: js.UndefOr[String] = js.native
  
  var parent: String = js.native
}
object ListCryptoKeysRequest {
  
  @scala.inline
  def apply(parent: String): ListCryptoKeysRequest = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCryptoKeysRequest]
  }
  
  @scala.inline
  implicit class ListCryptoKeysRequestOps[Self <: ListCryptoKeysRequest] (val x: Self) extends AnyVal {
    
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
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_size(value: Double): Self = this.set("page_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage_size: Self = this.set("page_size", js.undefined)
    
    @scala.inline
    def setPage_token(value: String): Self = this.set("page_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage_token: Self = this.set("page_token", js.undefined)
  }
}
