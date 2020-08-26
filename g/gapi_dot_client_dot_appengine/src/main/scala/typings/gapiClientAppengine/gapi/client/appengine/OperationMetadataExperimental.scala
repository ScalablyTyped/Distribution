package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationMetadataExperimental extends js.Object {
  /** Time that this operation completed.@OutputOnly */
  var endTime: js.UndefOr[String] = js.native
  /** Time that this operation was created.@OutputOnly */
  var insertTime: js.UndefOr[String] = js.native
  /** API method that initiated this operation. Example: google.appengine.experimental.CustomDomains.CreateCustomDomain.@OutputOnly */
  var method: js.UndefOr[String] = js.native
  /** Name of the resource that this operation is acting on. Example: apps/myapp/customDomains/example.com.@OutputOnly */
  var target: js.UndefOr[String] = js.native
  /** User who requested this operation.@OutputOnly */
  var user: js.UndefOr[String] = js.native
}

object OperationMetadataExperimental {
  @scala.inline
  def apply(): OperationMetadataExperimental = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationMetadataExperimental]
  }
  @scala.inline
  implicit class OperationMetadataExperimentalOps[Self <: OperationMetadataExperimental] (val x: Self) extends AnyVal {
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setInsertTime(value: String): Self = this.set("insertTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertTime: Self = this.set("insertTime", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

