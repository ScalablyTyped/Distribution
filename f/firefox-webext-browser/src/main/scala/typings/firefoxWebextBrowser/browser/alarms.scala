package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Permissions: `alarms`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object alarms {
  
  /* alarms types */
  trait Alarm extends StObject {
    
    /** Name of this alarm. */
    var name: String
    
    /** When present, signals that the alarm triggers periodically after so many minutes. */
    var periodInMinutes: js.UndefOr[Double] = js.undefined
    
    /** Time when the alarm is scheduled to fire, in milliseconds past the epoch. */
    var scheduledTime: Double
  }
  object Alarm {
    
    inline def apply(name: String, scheduledTime: Double): Alarm = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scheduledTime = scheduledTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alarm]
    }
    
    extension [Self <: Alarm](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPeriodInMinutes(value: Double): Self = StObject.set(x, "periodInMinutes", value.asInstanceOf[js.Any])
      
      inline def setPeriodInMinutesUndefined: Self = StObject.set(x, "periodInMinutes", js.undefined)
      
      inline def setScheduledTime(value: Double): Self = StObject.set(x, "scheduledTime", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Details about the alarm. The alarm first fires either at 'when' milliseconds past the epoch (if 'when' is provided), after 'delayInMinutes' minutes from the current time (if 'delayInMinutes' is provided instead), or after 'periodInMinutes' minutes from the current time (if only 'periodInMinutes' is provided). Users should never provide both 'when' and 'delayInMinutes'. If 'periodInMinutes' is provided, then the alarm recurs repeatedly after that many minutes.
    */
  trait CreateAlarmInfo extends StObject {
    
    /** Number of minutes from the current time after which the alarm should first fire. */
    var delayInMinutes: js.UndefOr[Double] = js.undefined
    
    /** Number of minutes after which the alarm should recur repeatedly. */
    var periodInMinutes: js.UndefOr[Double] = js.undefined
    
    /** Time when the alarm is scheduled to first fire, in milliseconds past the epoch. */
    var when: js.UndefOr[Double] = js.undefined
  }
  object CreateAlarmInfo {
    
    inline def apply(): CreateAlarmInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateAlarmInfo]
    }
    
    extension [Self <: CreateAlarmInfo](x: Self) {
      
      inline def setDelayInMinutes(value: Double): Self = StObject.set(x, "delayInMinutes", value.asInstanceOf[js.Any])
      
      inline def setDelayInMinutesUndefined: Self = StObject.set(x, "delayInMinutes", js.undefined)
      
      inline def setPeriodInMinutes(value: Double): Self = StObject.set(x, "periodInMinutes", value.asInstanceOf[js.Any])
      
      inline def setPeriodInMinutesUndefined: Self = StObject.set(x, "periodInMinutes", js.undefined)
      
      inline def setWhen(value: Double): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
}
