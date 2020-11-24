package typings.googleCloudStorage.fileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignedPostPolicyV4Output extends js.Object {
  
  var fields: PolicyFields = js.native
  
  var url: String = js.native
}
object SignedPostPolicyV4Output {
  
  @scala.inline
  def apply(fields: PolicyFields, url: String): SignedPostPolicyV4Output = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedPostPolicyV4Output]
  }
  
  @scala.inline
  implicit class SignedPostPolicyV4OutputOps[Self <: SignedPostPolicyV4Output] (val x: Self) extends AnyVal {
    
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
    def setFields(value: PolicyFields): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
