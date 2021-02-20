package typings.devtoolsProtocol.mod.Protocol.Emulation

import typings.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetVirtualTimePolicyRequest extends StObject {
  
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
  implicit class SetVirtualTimePolicyRequestMutableBuilder[Self <: SetVirtualTimePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBudget(value: Double): Self = StObject.set(x, "budget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetUndefined: Self = StObject.set(x, "budget", js.undefined)
    
    @scala.inline
    def setInitialVirtualTime(value: TimeSinceEpoch): Self = StObject.set(x, "initialVirtualTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialVirtualTimeUndefined: Self = StObject.set(x, "initialVirtualTime", js.undefined)
    
    @scala.inline
    def setMaxVirtualTimeTaskStarvationCount(value: integer): Self = StObject.set(x, "maxVirtualTimeTaskStarvationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVirtualTimeTaskStarvationCountUndefined: Self = StObject.set(x, "maxVirtualTimeTaskStarvationCount", js.undefined)
    
    @scala.inline
    def setPolicy(value: VirtualTimePolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForNavigation(value: Boolean): Self = StObject.set(x, "waitForNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForNavigationUndefined: Self = StObject.set(x, "waitForNavigation", js.undefined)
  }
}
