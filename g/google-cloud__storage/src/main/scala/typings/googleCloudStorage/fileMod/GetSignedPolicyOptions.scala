package typings.googleCloudStorage.fileMod

import typings.googleCloudStorage.anon.Max
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSignedPolicyOptions extends js.Object {
  
  var acl: js.UndefOr[String] = js.native
  
  var contentLengthRange: js.UndefOr[Max] = js.native
  
  @JSName("equals")
  var equals_FGetSignedPolicyOptions: js.UndefOr[js.Array[js.Array[String] | String]] = js.native
  
  var expires: String | Double | Date = js.native
  
  var startsWith: js.UndefOr[js.Array[js.Array[String] | String]] = js.native
  
  var successRedirect: js.UndefOr[String] = js.native
  
  var successStatus: js.UndefOr[String] = js.native
}
object GetSignedPolicyOptions {
  
  @scala.inline
  def apply(expires: String | Double | Date): GetSignedPolicyOptions = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSignedPolicyOptions]
  }
  
  @scala.inline
  implicit class GetSignedPolicyOptionsOps[Self <: GetSignedPolicyOptions] (val x: Self) extends AnyVal {
    
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
    def setExpires(value: String | Double | Date): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcl(value: String): Self = this.set("acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
    
    @scala.inline
    def setContentLengthRange(value: Max): Self = this.set("contentLengthRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLengthRange: Self = this.set("contentLengthRange", js.undefined)
    
    @scala.inline
    def setEqualsVarargs(value: (js.Array[String] | String)*): Self = this.set("equals", js.Array(value :_*))
    
    @scala.inline
    def setEquals(value: js.Array[js.Array[String] | String]): Self = this.set("equals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    
    @scala.inline
    def setStartsWithVarargs(value: (js.Array[String] | String)*): Self = this.set("startsWith", js.Array(value :_*))
    
    @scala.inline
    def setStartsWith(value: js.Array[js.Array[String] | String]): Self = this.set("startsWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartsWith: Self = this.set("startsWith", js.undefined)
    
    @scala.inline
    def setSuccessRedirect(value: String): Self = this.set("successRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessRedirect: Self = this.set("successRedirect", js.undefined)
    
    @scala.inline
    def setSuccessStatus(value: String): Self = this.set("successStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessStatus: Self = this.set("successStatus", js.undefined)
  }
}
