package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request sent to the ClearOrgPolicy method.
  */
@js.native
trait SchemaClearOrgPolicyRequest extends js.Object {
  /**
    * Name of the `Constraint` of the `Policy` to clear.
    */
  var constraint: js.UndefOr[String] = js.native
  /**
    * The current version, for concurrency control. Not sending an `etag` will
    * cause the `Policy` to be cleared blindly.
    */
  var etag: js.UndefOr[String] = js.native
}

object SchemaClearOrgPolicyRequest {
  @scala.inline
  def apply(): SchemaClearOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClearOrgPolicyRequest]
  }
  @scala.inline
  implicit class SchemaClearOrgPolicyRequestOps[Self <: SchemaClearOrgPolicyRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
  }
  
}

