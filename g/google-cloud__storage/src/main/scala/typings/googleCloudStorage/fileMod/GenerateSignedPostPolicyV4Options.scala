package typings.googleCloudStorage.fileMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateSignedPostPolicyV4Options extends js.Object {
  
  var bucketBoundHostname: js.UndefOr[String] = js.native
  
  var conditions: js.UndefOr[js.Array[js.Object]] = js.native
  
  var expires: String | Double | Date = js.native
  
  var fields: js.UndefOr[PolicyFields] = js.native
  
  var virtualHostedStyle: js.UndefOr[Boolean] = js.native
}
object GenerateSignedPostPolicyV4Options {
  
  @scala.inline
  def apply(expires: String | Double | Date): GenerateSignedPostPolicyV4Options = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateSignedPostPolicyV4Options]
  }
  
  @scala.inline
  implicit class GenerateSignedPostPolicyV4OptionsOps[Self <: GenerateSignedPostPolicyV4Options] (val x: Self) extends AnyVal {
    
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
    def setBucketBoundHostname(value: String): Self = this.set("bucketBoundHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketBoundHostname: Self = this.set("bucketBoundHostname", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: js.Object*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[js.Object]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setFields(value: PolicyFields): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setVirtualHostedStyle(value: Boolean): Self = this.set("virtualHostedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualHostedStyle: Self = this.set("virtualHostedStyle", js.undefined)
  }
}
