package typings.googleAnalytics

import typings.googleAnalytics.UniversalAnalytics.HitType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait EventAction extends StObject {
    
    var eventAction: String
    
    var eventCategory: String
    
    var eventLabel: js.UndefOr[String] = js.undefined
    
    var eventValue: js.UndefOr[Double] = js.undefined
    
    var nonInteraction: js.UndefOr[Boolean] = js.undefined
  }
  object EventAction {
    
    inline def apply(eventAction: String, eventCategory: String): EventAction = {
      val __obj = js.Dynamic.literal(eventAction = eventAction.asInstanceOf[js.Any], eventCategory = eventCategory.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventAction] (val x: Self) extends AnyVal {
      
      inline def setEventAction(value: String): Self = StObject.set(x, "eventAction", value.asInstanceOf[js.Any])
      
      inline def setEventCategory(value: String): Self = StObject.set(x, "eventCategory", value.asInstanceOf[js.Any])
      
      inline def setEventLabel(value: String): Self = StObject.set(x, "eventLabel", value.asInstanceOf[js.Any])
      
      inline def setEventLabelUndefined: Self = StObject.set(x, "eventLabel", js.undefined)
      
      inline def setEventValue(value: Double): Self = StObject.set(x, "eventValue", value.asInstanceOf[js.Any])
      
      inline def setEventValueUndefined: Self = StObject.set(x, "eventValue", js.undefined)
      
      inline def setNonInteraction(value: Boolean): Self = StObject.set(x, "nonInteraction", value.asInstanceOf[js.Any])
      
      inline def setNonInteractionUndefined: Self = StObject.set(x, "nonInteraction", js.undefined)
    }
  }
  
  trait EventCategory extends StObject {
    
    var eventAction: String
    
    // 'event'
    var eventCategory: String
    
    var eventLabel: js.UndefOr[String] = js.undefined
    
    var eventValue: js.UndefOr[Double] = js.undefined
    
    var hitType: HitType
    
    var nonInteraction: js.UndefOr[Boolean] = js.undefined
  }
  object EventCategory {
    
    inline def apply(eventAction: String, eventCategory: String, hitType: HitType): EventCategory = {
      val __obj = js.Dynamic.literal(eventAction = eventAction.asInstanceOf[js.Any], eventCategory = eventCategory.asInstanceOf[js.Any], hitType = hitType.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventCategory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventCategory] (val x: Self) extends AnyVal {
      
      inline def setEventAction(value: String): Self = StObject.set(x, "eventAction", value.asInstanceOf[js.Any])
      
      inline def setEventCategory(value: String): Self = StObject.set(x, "eventCategory", value.asInstanceOf[js.Any])
      
      inline def setEventLabel(value: String): Self = StObject.set(x, "eventLabel", value.asInstanceOf[js.Any])
      
      inline def setEventLabelUndefined: Self = StObject.set(x, "eventLabel", js.undefined)
      
      inline def setEventValue(value: Double): Self = StObject.set(x, "eventValue", value.asInstanceOf[js.Any])
      
      inline def setEventValueUndefined: Self = StObject.set(x, "eventValue", js.undefined)
      
      inline def setHitType(value: HitType): Self = StObject.set(x, "hitType", value.asInstanceOf[js.Any])
      
      inline def setNonInteraction(value: Boolean): Self = StObject.set(x, "nonInteraction", value.asInstanceOf[js.Any])
      
      inline def setNonInteractionUndefined: Self = StObject.set(x, "nonInteraction", js.undefined)
    }
  }
  
  trait SocialAction extends StObject {
    
    var socialAction: String
    
    var socialNetwork: String
    
    var socialTarget: String
  }
  object SocialAction {
    
    inline def apply(socialAction: String, socialNetwork: String, socialTarget: String): SocialAction = {
      val __obj = js.Dynamic.literal(socialAction = socialAction.asInstanceOf[js.Any], socialNetwork = socialNetwork.asInstanceOf[js.Any], socialTarget = socialTarget.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocialAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SocialAction] (val x: Self) extends AnyVal {
      
      inline def setSocialAction(value: String): Self = StObject.set(x, "socialAction", value.asInstanceOf[js.Any])
      
      inline def setSocialNetwork(value: String): Self = StObject.set(x, "socialNetwork", value.asInstanceOf[js.Any])
      
      inline def setSocialTarget(value: String): Self = StObject.set(x, "socialTarget", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimingCategory extends StObject {
    
    var timingCategory: String
    
    var timingValue: Double
    
    var timingVar: String
  }
  object TimingCategory {
    
    inline def apply(timingCategory: String, timingValue: Double, timingVar: String): TimingCategory = {
      val __obj = js.Dynamic.literal(timingCategory = timingCategory.asInstanceOf[js.Any], timingValue = timingValue.asInstanceOf[js.Any], timingVar = timingVar.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimingCategory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimingCategory] (val x: Self) extends AnyVal {
      
      inline def setTimingCategory(value: String): Self = StObject.set(x, "timingCategory", value.asInstanceOf[js.Any])
      
      inline def setTimingValue(value: Double): Self = StObject.set(x, "timingValue", value.asInstanceOf[js.Any])
      
      inline def setTimingVar(value: String): Self = StObject.set(x, "timingVar", value.asInstanceOf[js.Any])
    }
  }
}
