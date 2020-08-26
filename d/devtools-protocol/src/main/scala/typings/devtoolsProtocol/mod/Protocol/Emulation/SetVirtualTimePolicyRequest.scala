package typings.devtoolsProtocol.mod.Protocol.Emulation

import typings.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetVirtualTimePolicyRequest extends js.Object {
  /**
    * If set, after this many virtual milliseconds have elapsed virtual time will be paused and a
    * virtualTimeBudgetExpired event is sent.
    */
  var budget: js.UndefOr[Double] = js.native
  /**
    * If set, base::Time::Now will be overriden to initially return this value.
    */
  var initialVirtualTime: js.UndefOr[TimeSinceEpoch] = js.native
  /**
    * If set this specifies the maximum number of tasks that can be run before virtual is forced
    * forwards to prevent deadlock.
    */
  var maxVirtualTimeTaskStarvationCount: js.UndefOr[integer] = js.native
  var policy: VirtualTimePolicy = js.native
  /**
    * If set the virtual time policy change should be deferred until any frame starts navigating.
    * Note any previous deferred policy change is superseded.
    */
  var waitForNavigation: js.UndefOr[Boolean] = js.native
}

object SetVirtualTimePolicyRequest {
  @scala.inline
  def apply(policy: VirtualTimePolicy): SetVirtualTimePolicyRequest = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVirtualTimePolicyRequest]
  }
  @scala.inline
  implicit class SetVirtualTimePolicyRequestOps[Self <: SetVirtualTimePolicyRequest] (val x: Self) extends AnyVal {
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
    def setPolicy(value: VirtualTimePolicy): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setBudget(value: Double): Self = this.set("budget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBudget: Self = this.set("budget", js.undefined)
    @scala.inline
    def setInitialVirtualTime(value: TimeSinceEpoch): Self = this.set("initialVirtualTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialVirtualTime: Self = this.set("initialVirtualTime", js.undefined)
    @scala.inline
    def setMaxVirtualTimeTaskStarvationCount(value: integer): Self = this.set("maxVirtualTimeTaskStarvationCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxVirtualTimeTaskStarvationCount: Self = this.set("maxVirtualTimeTaskStarvationCount", js.undefined)
    @scala.inline
    def setWaitForNavigation(value: Boolean): Self = this.set("waitForNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForNavigation: Self = this.set("waitForNavigation", js.undefined)
  }
  
}

