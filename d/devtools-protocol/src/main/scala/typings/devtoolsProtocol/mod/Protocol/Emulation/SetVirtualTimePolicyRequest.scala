package typings.devtoolsProtocol.mod.Protocol.Emulation

import typings.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetVirtualTimePolicyRequest extends StObject {
  
  /**
    * If set, after this many virtual milliseconds have elapsed virtual time will be paused and a
    * virtualTimeBudgetExpired event is sent.
    */
  var budget: js.UndefOr[Double] = js.undefined
  
  /**
    * If set, base::Time::Now will be overridden to initially return this value.
    */
  var initialVirtualTime: js.UndefOr[TimeSinceEpoch] = js.undefined
  
  /**
    * If set this specifies the maximum number of tasks that can be run before virtual is forced
    * forwards to prevent deadlock.
    */
  var maxVirtualTimeTaskStarvationCount: js.UndefOr[integer] = js.undefined
  
  var policy: VirtualTimePolicy
}
object SetVirtualTimePolicyRequest {
  
  inline def apply(policy: VirtualTimePolicy): SetVirtualTimePolicyRequest = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVirtualTimePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetVirtualTimePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setBudget(value: Double): Self = StObject.set(x, "budget", value.asInstanceOf[js.Any])
    
    inline def setBudgetUndefined: Self = StObject.set(x, "budget", js.undefined)
    
    inline def setInitialVirtualTime(value: TimeSinceEpoch): Self = StObject.set(x, "initialVirtualTime", value.asInstanceOf[js.Any])
    
    inline def setInitialVirtualTimeUndefined: Self = StObject.set(x, "initialVirtualTime", js.undefined)
    
    inline def setMaxVirtualTimeTaskStarvationCount(value: integer): Self = StObject.set(x, "maxVirtualTimeTaskStarvationCount", value.asInstanceOf[js.Any])
    
    inline def setMaxVirtualTimeTaskStarvationCountUndefined: Self = StObject.set(x, "maxVirtualTimeTaskStarvationCount", js.undefined)
    
    inline def setPolicy(value: VirtualTimePolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
  }
}
