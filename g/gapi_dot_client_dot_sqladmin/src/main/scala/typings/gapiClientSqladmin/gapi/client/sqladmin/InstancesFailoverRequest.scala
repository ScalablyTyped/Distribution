package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesFailoverRequest extends js.Object {
  /** Failover Context. */
  var failoverContext: js.UndefOr[FailoverContext] = js.native
}

object InstancesFailoverRequest {
  @scala.inline
  def apply(): InstancesFailoverRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesFailoverRequest]
  }
  @scala.inline
  implicit class InstancesFailoverRequestOps[Self <: InstancesFailoverRequest] (val x: Self) extends AnyVal {
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
    def setFailoverContext(value: FailoverContext): Self = this.set("failoverContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailoverContext: Self = this.set("failoverContext", js.undefined)
  }
  
}

