package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request sent to the GetOrgPolicy method.
  */
@js.native
trait SchemaGetOrgPolicyRequest extends js.Object {
  /**
    * Name of the `Constraint` to get the `Policy`.
    */
  var constraint: js.UndefOr[String] = js.native
}

object SchemaGetOrgPolicyRequest {
  @scala.inline
  def apply(): SchemaGetOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOrgPolicyRequest]
  }
  @scala.inline
  implicit class SchemaGetOrgPolicyRequestOps[Self <: SchemaGetOrgPolicyRequest] (val x: Self) extends AnyVal {
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

