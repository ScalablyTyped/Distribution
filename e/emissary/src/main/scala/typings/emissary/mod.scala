package typings.emissary

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.mixto.Mixto.IMixinStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("emissary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("emissary", "Behavior")
  @js.native
  def Behavior: js.Function = js.native
  @scala.inline
  def Behavior_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Behavior")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("emissary", "Emitter")
  @js.native
  class Emitter () extends IEmitter
  @JSImport("emissary", "Emitter")
  @js.native
  def Emitter: IEmitterStatic = js.native
  @scala.inline
  def Emitter_=(x: IEmitterStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Emitter")(x.asInstanceOf[js.Any])
  
  @JSImport("emissary", "Signal")
  @js.native
  def Signal: js.Function = js.native
  @scala.inline
  def Signal_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Signal")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("emissary", "Subscriber")
  @js.native
  class Subscriber () extends ISubscriber
  @JSImport("emissary", "Subscriber")
  @js.native
  def Subscriber: ISubscriberStatic = js.native
  @scala.inline
  def Subscriber_=(x: ISubscriberStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Subscriber")(x.asInstanceOf[js.Any])
  
  @JSImport("emissary", "combine")
  @js.native
  def combine: js.Function = js.native
  @scala.inline
  def combine_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("combine")(x.asInstanceOf[js.Any])
  
  @js.native
  trait IEmitter extends StObject {
    
    def behavior(eventName: String, initialValue: js.Any): Unit = js.native
    
    def decrementSubscriptionCount(eventName: String): Double = js.native
    
    def emit(eventName: String, args: js.Any*): Unit = js.native
    
    def getSubscriptionCount(eventName: String): Double = js.native
    
    def hasSubscriptions(eventName: String): Boolean = js.native
    
    def incrementSubscriptionCount(eventName: String): Double = js.native
    
    def off(eventNames: String, handler: js.Function): Unit = js.native
    
    def on(eventNames: String, handler: js.Function): js.Any = js.native
    
    // return value type are Signal
    def once(eventName: String, handler: js.Function): js.Any = js.native
    
    def pauseEvents(eventNames: String): Unit = js.native
    
    def resumeEvents(eventNames: String): Unit = js.native
    
    // return value type are Signal
    def signal(eventName: String): Unit = js.native
  }
  object IEmitter {
    
    @scala.inline
    def apply(
      behavior: (String, js.Any) => Unit,
      decrementSubscriptionCount: String => Double,
      emit: (String, /* repeated */ js.Any) => Unit,
      getSubscriptionCount: String => Double,
      hasSubscriptions: String => Boolean,
      incrementSubscriptionCount: String => Double,
      off: (String, js.Function) => Unit,
      on: (String, js.Function) => js.Any,
      once: (String, js.Function) => js.Any,
      pauseEvents: String => Unit,
      resumeEvents: String => Unit,
      signal: String => Unit
    ): IEmitter = {
      val __obj = js.Dynamic.literal(behavior = js.Any.fromFunction2(behavior), decrementSubscriptionCount = js.Any.fromFunction1(decrementSubscriptionCount), emit = js.Any.fromFunction2(emit), getSubscriptionCount = js.Any.fromFunction1(getSubscriptionCount), hasSubscriptions = js.Any.fromFunction1(hasSubscriptions), incrementSubscriptionCount = js.Any.fromFunction1(incrementSubscriptionCount), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), pauseEvents = js.Any.fromFunction1(pauseEvents), resumeEvents = js.Any.fromFunction1(resumeEvents), signal = js.Any.fromFunction1(signal))
      __obj.asInstanceOf[IEmitter]
    }
    
    @scala.inline
    implicit class IEmitterMutableBuilder[Self <: IEmitter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBehavior(value: (String, js.Any) => Unit): Self = StObject.set(x, "behavior", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDecrementSubscriptionCount(value: String => Double): Self = StObject.set(x, "decrementSubscriptionCount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmit(value: (String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetSubscriptionCount(value: String => Double): Self = StObject.set(x, "getSubscriptionCount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasSubscriptions(value: String => Boolean): Self = StObject.set(x, "hasSubscriptions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIncrementSubscriptionCount(value: String => Double): Self = StObject.set(x, "incrementSubscriptionCount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOff(value: (String, js.Function) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOn(value: (String, js.Function) => js.Any): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnce(value: (String, js.Function) => js.Any): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPauseEvents(value: String => Unit): Self = StObject.set(x, "pauseEvents", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResumeEvents(value: String => Unit): Self = StObject.set(x, "resumeEvents", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSignal(value: String => Unit): Self = StObject.set(x, "signal", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IEmitterStatic
    extends IMixinStatic
       with Instantiable0[IEmitter]
  
  @js.native
  trait ISubscriber extends StObject {
    
    def addSubscription(subscription: js.Any): ISubscription = js.native
    
    def subscribe(eventEmitterOrSubscription: js.Any, args: js.Any*): ISubscription = js.native
    
    def subscribeToCommand(eventEmitter: js.Any, args: js.Any*): ISubscription = js.native
    
    def subscribeWith(eventEmitter: js.Any, methodName: String, args: js.Any): ISubscription = js.native
    
    def unsubscribe(): js.Any = js.native
    def unsubscribe(`object`: js.Any): js.Any = js.native
  }
  
  @js.native
  trait ISubscriberStatic
    extends IMixinStatic
       with Instantiable0[ISubscriber]
  
  @js.native
  trait ISubscription extends IEmitter {
    
    var cancelled: Boolean = js.native
    
    def off(): js.Any = js.native
  }
  object ISubscription {
    
    @scala.inline
    def apply(
      behavior: (String, js.Any) => Unit,
      cancelled: Boolean,
      decrementSubscriptionCount: String => Double,
      emit: (String, /* repeated */ js.Any) => Unit,
      getSubscriptionCount: String => Double,
      hasSubscriptions: String => Boolean,
      incrementSubscriptionCount: String => Double,
      off: () => js.Any,
      on: (String, js.Function) => js.Any,
      once: (String, js.Function) => js.Any,
      pauseEvents: String => Unit,
      resumeEvents: String => Unit,
      signal: String => Unit
    ): ISubscription = {
      val __obj = js.Dynamic.literal(behavior = js.Any.fromFunction2(behavior), cancelled = cancelled.asInstanceOf[js.Any], decrementSubscriptionCount = js.Any.fromFunction1(decrementSubscriptionCount), emit = js.Any.fromFunction2(emit), getSubscriptionCount = js.Any.fromFunction1(getSubscriptionCount), hasSubscriptions = js.Any.fromFunction1(hasSubscriptions), incrementSubscriptionCount = js.Any.fromFunction1(incrementSubscriptionCount), off = js.Any.fromFunction0(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), pauseEvents = js.Any.fromFunction1(pauseEvents), resumeEvents = js.Any.fromFunction1(resumeEvents), signal = js.Any.fromFunction1(signal))
      __obj.asInstanceOf[ISubscription]
    }
    
    @scala.inline
    implicit class ISubscriptionMutableBuilder[Self <: ISubscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOff(value: () => js.Any): Self = StObject.set(x, "off", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ISubscriptionStatic
    extends Instantiable3[
          /* emitter */ js.Any, 
          /* eventNames */ String, 
          /* handler */ js.Function, 
          ISubscription
        ]
}
