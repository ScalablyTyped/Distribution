package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Time window specified for hourly operations.
  */
trait SchemaResourcePolicyHourlyCycle extends StObject {
  
  /**
    * [Output only] Duration of the time window, automatically chosen to be
    * smallest possible in the given scenario.
    */
  var duration: js.UndefOr[String] = js.undefined
  
  /**
    * Allows to define schedule that runs every nth hour.
    */
  var hoursInCycle: js.UndefOr[Double] = js.undefined
  
  /**
    * Time within the window to start the operations. It must be in format
    * &quot;HH:MM&quot;, where HH : [00-23] and MM : [00-00] GMT.
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object SchemaResourcePolicyHourlyCycle {
  
  @scala.inline
  def apply(): SchemaResourcePolicyHourlyCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyHourlyCycle]
  }
  
  @scala.inline
  implicit class SchemaResourcePolicyHourlyCycleMutableBuilder[Self <: SchemaResourcePolicyHourlyCycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setHoursInCycle(value: Double): Self = StObject.set(x, "hoursInCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoursInCycleUndefined: Self = StObject.set(x, "hoursInCycle", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
