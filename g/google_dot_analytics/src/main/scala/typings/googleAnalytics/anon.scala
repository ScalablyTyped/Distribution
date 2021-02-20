package typings.googleAnalytics

import typings.googleAnalytics.UniversalAnalytics.HitType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait EventAction extends StObject {
    
    var eventAction: String = js.native
    
    var eventCategory: String = js.native
    
    var eventLabel: js.UndefOr[String] = js.native
    
    var eventValue: js.UndefOr[Double] = js.native
    
    var nonInteraction: js.UndefOr[Boolean] = js.native
  }
  object EventAction {
    
    @scala.inline
    def apply(eventAction: String, eventCategory: String): EventAction = {
      val __obj = js.Dynamic.literal(eventAction = eventAction.asInstanceOf[js.Any], eventCategory = eventCategory.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventAction]
    }
    
    @scala.inline
    implicit class EventActionMutableBuilder[Self <: EventAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventAction(value: String): Self = StObject.set(x, "eventAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventCategory(value: String): Self = StObject.set(x, "eventCategory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventLabel(value: String): Self = StObject.set(x, "eventLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventLabelUndefined: Self = StObject.set(x, "eventLabel", js.undefined)
      
      @scala.inline
      def setEventValue(value: Double): Self = StObject.set(x, "eventValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventValueUndefined: Self = StObject.set(x, "eventValue", js.undefined)
      
      @scala.inline
      def setNonInteraction(value: Boolean): Self = StObject.set(x, "nonInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonInteractionUndefined: Self = StObject.set(x, "nonInteraction", js.undefined)
    }
  }
  
  @js.native
  trait EventCategory extends StObject {
    
    var eventAction: String = js.native
    
    // 'event'
    var eventCategory: String = js.native
    
    var eventLabel: js.UndefOr[String] = js.native
    
    var eventValue: js.UndefOr[Double] = js.native
    
    var hitType: HitType = js.native
    
    var nonInteraction: js.UndefOr[Boolean] = js.native
  }
  object EventCategory {
    
    @scala.inline
    def apply(eventAction: String, eventCategory: String, hitType: HitType): EventCategory = {
      val __obj = js.Dynamic.literal(eventAction = eventAction.asInstanceOf[js.Any], eventCategory = eventCategory.asInstanceOf[js.Any], hitType = hitType.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventCategory]
    }
    
    @scala.inline
    implicit class EventCategoryMutableBuilder[Self <: EventCategory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventAction(value: String): Self = StObject.set(x, "eventAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventCategory(value: String): Self = StObject.set(x, "eventCategory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventLabel(value: String): Self = StObject.set(x, "eventLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventLabelUndefined: Self = StObject.set(x, "eventLabel", js.undefined)
      
      @scala.inline
      def setEventValue(value: Double): Self = StObject.set(x, "eventValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventValueUndefined: Self = StObject.set(x, "eventValue", js.undefined)
      
      @scala.inline
      def setHitType(value: HitType): Self = StObject.set(x, "hitType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonInteraction(value: Boolean): Self = StObject.set(x, "nonInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonInteractionUndefined: Self = StObject.set(x, "nonInteraction", js.undefined)
    }
  }
  
  @js.native
  trait SocialAction extends StObject {
    
    var socialAction: String = js.native
    
    var socialNetwork: String = js.native
    
    var socialTarget: String = js.native
  }
  object SocialAction {
    
    @scala.inline
    def apply(socialAction: String, socialNetwork: String, socialTarget: String): SocialAction = {
      val __obj = js.Dynamic.literal(socialAction = socialAction.asInstanceOf[js.Any], socialNetwork = socialNetwork.asInstanceOf[js.Any], socialTarget = socialTarget.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocialAction]
    }
    
    @scala.inline
    implicit class SocialActionMutableBuilder[Self <: SocialAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSocialAction(value: String): Self = StObject.set(x, "socialAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocialNetwork(value: String): Self = StObject.set(x, "socialNetwork", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocialTarget(value: String): Self = StObject.set(x, "socialTarget", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TimingCategory extends StObject {
    
    var timingCategory: String = js.native
    
    var timingValue: Double = js.native
    
    var timingVar: String = js.native
  }
  object TimingCategory {
    
    @scala.inline
    def apply(timingCategory: String, timingValue: Double, timingVar: String): TimingCategory = {
      val __obj = js.Dynamic.literal(timingCategory = timingCategory.asInstanceOf[js.Any], timingValue = timingValue.asInstanceOf[js.Any], timingVar = timingVar.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimingCategory]
    }
    
    @scala.inline
    implicit class TimingCategoryMutableBuilder[Self <: TimingCategory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimingCategory(value: String): Self = StObject.set(x, "timingCategory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimingValue(value: Double): Self = StObject.set(x, "timingValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimingVar(value: String): Self = StObject.set(x, "timingVar", value.asInstanceOf[js.Any])
    }
  }
}
