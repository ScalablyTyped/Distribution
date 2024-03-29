package typings.firebaseAdmin

import typings.firebaseAdmin.anon.DispatchDeadlineSeconds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFunctionsFunctionsApiMod {
  
  trait AbsoluteDelivery
    extends StObject
       with DeliverySchedule {
    
    /** @alpha */
    var scheduleDelaySeconds: js.UndefOr[scala.Nothing] = js.undefined
    
    /**
      * The time when the task is scheduled to be attempted or retried.
      */
    var scheduleTime: js.UndefOr[js.Date] = js.undefined
  }
  object AbsoluteDelivery {
    
    inline def apply(): AbsoluteDelivery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbsoluteDelivery]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbsoluteDelivery] (val x: Self) extends AnyVal {
      
      inline def setScheduleTime(value: js.Date): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
      
      inline def setScheduleTimeUndefined: Self = StObject.set(x, "scheduleTime", js.undefined)
    }
  }
  
  trait DelayDelivery
    extends StObject
       with DeliverySchedule {
    
    /**
      * The duration of delay of the time when the task is scheduled to be attempted or retried.
      * This delay is added to the current time.
      */
    var scheduleDelaySeconds: js.UndefOr[Double] = js.undefined
    
    /** @alpha */
    var scheduleTime: js.UndefOr[scala.Nothing] = js.undefined
  }
  object DelayDelivery {
    
    inline def apply(): DelayDelivery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DelayDelivery]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DelayDelivery] (val x: Self) extends AnyVal {
      
      inline def setScheduleDelaySeconds(value: Double): Self = StObject.set(x, "scheduleDelaySeconds", value.asInstanceOf[js.Any])
      
      inline def setScheduleDelaySecondsUndefined: Self = StObject.set(x, "scheduleDelaySeconds", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAdmin.libFunctionsFunctionsApiMod.DelayDelivery
    - typings.firebaseAdmin.libFunctionsFunctionsApiMod.AbsoluteDelivery
  */
  trait DeliverySchedule extends StObject
  object DeliverySchedule {
    
    inline def AbsoluteDelivery(): typings.firebaseAdmin.libFunctionsFunctionsApiMod.AbsoluteDelivery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.firebaseAdmin.libFunctionsFunctionsApiMod.AbsoluteDelivery]
    }
    
    inline def DelayDelivery(): typings.firebaseAdmin.libFunctionsFunctionsApiMod.DelayDelivery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.firebaseAdmin.libFunctionsFunctionsApiMod.DelayDelivery]
    }
  }
  
  type TaskOptions = DeliverySchedule & TaskOptionsExperimental & DispatchDeadlineSeconds
  
  trait TaskOptionsExperimental extends StObject {
    
    /**
      * The full URL path that the request will be sent to. Must be a valid URL.
      * @beta
      */
    var uri: js.UndefOr[String] = js.undefined
  }
  object TaskOptionsExperimental {
    
    inline def apply(): TaskOptionsExperimental = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskOptionsExperimental]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskOptionsExperimental] (val x: Self) extends AnyVal {
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
