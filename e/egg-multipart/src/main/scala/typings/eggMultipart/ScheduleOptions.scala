package typings.eggMultipart

import typings.eggMultipart.anon.CurrentDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleOptions extends StObject {
  
  var cron: js.UndefOr[String] = js.undefined
  
  var cronOptions: js.UndefOr[CurrentDate] = js.undefined
  
  var disable: js.UndefOr[Boolean] = js.undefined
  
  var env: js.UndefOr[js.Array[String]] = js.undefined
  
  var immediate: js.UndefOr[Boolean] = js.undefined
  
  var interval: js.UndefOr[Double | String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ScheduleOptions {
  
  @scala.inline
  def apply(): ScheduleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleOptions]
  }
  
  @scala.inline
  implicit class ScheduleOptionsMutableBuilder[Self <: ScheduleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCron(value: String): Self = StObject.set(x, "cron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCronOptions(value: CurrentDate): Self = StObject.set(x, "cronOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCronOptionsUndefined: Self = StObject.set(x, "cronOptions", js.undefined)
    
    @scala.inline
    def setCronUndefined: Self = StObject.set(x, "cron", js.undefined)
    
    @scala.inline
    def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    @scala.inline
    def setEnv(value: js.Array[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: String*): Self = StObject.set(x, "env", js.Array(value :_*))
    
    @scala.inline
    def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    
    @scala.inline
    def setInterval(value: Double | String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
