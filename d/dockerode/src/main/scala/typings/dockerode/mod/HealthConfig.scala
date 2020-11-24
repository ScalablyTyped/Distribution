package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthConfig extends js.Object {
  
  var Interval: js.UndefOr[Double] = js.native
  
  var Retries: js.UndefOr[Double] = js.native
  
  var StartPeriod: js.UndefOr[Double] = js.native
  
  var Test: js.UndefOr[js.Array[String]] = js.native
  
  var Timeout: js.UndefOr[Double] = js.native
}
object HealthConfig {
  
  @scala.inline
  def apply(): HealthConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthConfig]
  }
  
  @scala.inline
  implicit class HealthConfigOps[Self <: HealthConfig] (val x: Self) extends AnyVal {
    
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
    def setInterval(value: Double): Self = this.set("Interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("Interval", js.undefined)
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("Retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetries: Self = this.set("Retries", js.undefined)
    
    @scala.inline
    def setStartPeriod(value: Double): Self = this.set("StartPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPeriod: Self = this.set("StartPeriod", js.undefined)
    
    @scala.inline
    def setTestVarargs(value: String*): Self = this.set("Test", js.Array(value :_*))
    
    @scala.inline
    def setTest(value: js.Array[String]): Self = this.set("Test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("Test", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("Timeout", js.undefined)
  }
}
