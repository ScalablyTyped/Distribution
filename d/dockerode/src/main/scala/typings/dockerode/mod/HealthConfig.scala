package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthConfig extends StObject {
  
  var Interval: js.UndefOr[Double] = js.undefined
  
  var Retries: js.UndefOr[Double] = js.undefined
  
  var StartPeriod: js.UndefOr[Double] = js.undefined
  
  var Test: js.UndefOr[js.Array[String]] = js.undefined
  
  var Timeout: js.UndefOr[Double] = js.undefined
}
object HealthConfig {
  
  @scala.inline
  def apply(): HealthConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthConfig]
  }
  
  @scala.inline
  implicit class HealthConfigMutableBuilder[Self <: HealthConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
    
    @scala.inline
    def setRetries(value: Double): Self = StObject.set(x, "Retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetriesUndefined: Self = StObject.set(x, "Retries", js.undefined)
    
    @scala.inline
    def setStartPeriod(value: Double): Self = StObject.set(x, "StartPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPeriodUndefined: Self = StObject.set(x, "StartPeriod", js.undefined)
    
    @scala.inline
    def setTest(value: js.Array[String]): Self = StObject.set(x, "Test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestUndefined: Self = StObject.set(x, "Test", js.undefined)
    
    @scala.inline
    def setTestVarargs(value: String*): Self = StObject.set(x, "Test", js.Array(value :_*))
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
  }
}
