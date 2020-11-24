package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request sent to the SetOrgPolicyRequest method.
  */
@js.native
trait SchemaSetOrgPolicyRequest extends js.Object {
  
  /**
    * `Policy` to set on the resource.
    */
  var policy: js.UndefOr[SchemaOrgPolicy] = js.native
}
object SchemaSetOrgPolicyRequest {
  
  @scala.inline
  def apply(): SchemaSetOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetOrgPolicyRequest]
  }
  
  @scala.inline
  implicit class SchemaSetOrgPolicyRequestOps[Self <: SchemaSetOrgPolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setPolicy(value: SchemaOrgPolicy): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
}
