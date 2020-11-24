package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestartPolicy extends js.Object {
  
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
  implicit class RestartPolicyOps[Self <: RestartPolicy] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondition(value: String): Self = this.set("Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("Condition", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("Delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("Delay", js.undefined)
    
    @scala.inline
    def setMaxAttempts(value: Double): Self = this.set("MaxAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAttempts: Self = this.set("MaxAttempts", js.undefined)
    
    @scala.inline
    def setMaximumRetryCount(value: Double): Self = this.set("MaximumRetryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumRetryCount: Self = this.set("MaximumRetryCount", js.undefined)
    
    @scala.inline
    def setWindow(value: Double): Self = this.set("Window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindow: Self = this.set("Window", js.undefined)
  }
}
