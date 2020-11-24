package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request sent to the GetEffectiveOrgPolicy method.
  */
@js.native
trait SchemaGetEffectiveOrgPolicyRequest extends js.Object {
  
  /**
    * The name of the `Constraint` to compute the effective `Policy`.
    */
  var constraint: js.UndefOr[String] = js.native
}
object SchemaGetEffectiveOrgPolicyRequest {
  
  @scala.inline
  def apply(): SchemaGetEffectiveOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetEffectiveOrgPolicyRequest]
  }
  
  @scala.inline
  implicit class SchemaGetEffectiveOrgPolicyRequestOps[Self <: SchemaGetEffectiveOrgPolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setConstraint(value: String): Self = this.set("constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraint: Self = this.set("constraint", js.undefined)
  }
}
