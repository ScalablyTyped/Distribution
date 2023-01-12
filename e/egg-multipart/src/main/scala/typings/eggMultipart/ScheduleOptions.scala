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
  
  inline def apply(): ScheduleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduleOptions] (val x: Self) extends AnyVal {
    
    inline def setCron(value: String): Self = StObject.set(x, "cron", value.asInstanceOf[js.Any])
    
    inline def setCronOptions(value: CurrentDate): Self = StObject.set(x, "cronOptions", value.asInstanceOf[js.Any])
    
    inline def setCronOptionsUndefined: Self = StObject.set(x, "cronOptions", js.undefined)
    
    inline def setCronUndefined: Self = StObject.set(x, "cron", js.undefined)
    
    inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setEnv(value: js.Array[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setEnvVarargs(value: String*): Self = StObject.set(x, "env", js.Array(value*))
    
    inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    
    inline def setInterval(value: Double | String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
