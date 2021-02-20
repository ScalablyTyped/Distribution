package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestartPolicy extends StObject {
  
  var Condition: js.UndefOr[String] = js.native
  
  var Delay: js.UndefOr[Double] = js.native
  
  var MaxAttempts: js.UndefOr[Double] = js.native
  
  var MaximumRetryCount: js.UndefOr[Double] = js.native
  
  var Name: String = js.native
  
  var Window: js.UndefOr[Double] = js.native
}
object RestartPolicy {
  
  @scala.inline
  def apply(Name: String): RestartPolicy = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestartPolicy]
  }
  
  @scala.inline
  implicit class RestartPolicyMutableBuilder[Self <: RestartPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "Delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "Delay", js.undefined)
    
    @scala.inline
    def setMaxAttempts(value: Double): Self = StObject.set(x, "MaxAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAttemptsUndefined: Self = StObject.set(x, "MaxAttempts", js.undefined)
    
    @scala.inline
    def setMaximumRetryCount(value: Double): Self = StObject.set(x, "MaximumRetryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumRetryCountUndefined: Self = StObject.set(x, "MaximumRetryCount", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: Double): Self = StObject.set(x, "Window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowUndefined: Self = StObject.set(x, "Window", js.undefined)
  }
}
