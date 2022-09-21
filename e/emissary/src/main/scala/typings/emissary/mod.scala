package typings.emissary

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.mixto.Mixto.IMixinStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("emissary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("emissary", "Behavior")
  @js.native
  def Behavior: js.Function = js.native
  inline def Behavior_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Behavior")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("emissary", "Emitter")
  @js.native
  open class Emitter ()
    extends StObject
       with IEmitter {
    
    /* CompleteClass */
    override def behavior(eventName: String, initialValue: Any): Unit = js.native
    
    /* CompleteClass */
    override def decrementSubscriptionCount(eventName: String): Double = js.native
    
    /* CompleteClass */
    override def emit(eventName: String, args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def getSubscriptionCount(eventName: String): Double = js.native
    
    /* CompleteClass */
    override def hasSubscriptions(eventName: String): Boolean = js.native
    
    /* CompleteClass */
    override def incrementSubscriptionCount(eventName: String): Double = js.native
    
    /* CompleteClass */
    override def off(eventNames: String, handler: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def on(eventNames: String, handler: js.Function): Any = js.native
    
    // return value type are Signal
    /* CompleteClass */
    override def once(eventName: String, handler: js.Function): Any = js.native
    
    /* CompleteClass */
    override def pauseEvents(eventNames: String): Unit = js.native
    
    /* CompleteClass */
    override def resumeEvents(eventNames: String): Unit = js.native
    
    // return value type are Signal
    /* CompleteClass */
    override def signal(eventName: String): Unit = js.native
  }
  @JSImport("emissary", "Emitter")
  @js.native
  def Emitter: IEmitterStatic = js.native
  inline def Emitter_=(x: IEmitterStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Emitter")(x.asInstanceOf[js.Any])
  
  @JSImport("emissary", "Signal")
  @js.native
  def Signal: js.Function = js.native
  inline def Signal_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Signal")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("emissary", "Subscriber")
  @js.native
  open class Subscriber ()
    extends StObject
       with ISubscriber
  @JSImport("emissary", "Subscriber")
  @js.native
  def Subscriber: ISubscriberStatic = js.native
  inline def Subscriber_=(x: ISubscriberStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Subscriber")(x.asInstanceOf[js.Any])
  
  @JSImport("emissary", "combine")
  @js.native
  def combine: js.Function = js.native
  inline def combine_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("combine")(x.asInstanceOf[js.Any])
  
  trait IEmitter extends StObject {
    
    def behavior(eventName: String, initialValue: Any): Unit
    
    def decrementSubscriptionCount(eventName: String): Double
    
    def emit(eventName: String, args: Any*): Unit
    
    def getSubscriptionCount(eventName: String): Double
    
    def hasSubscriptions(eventName: String): Boolean
    
    def incrementSubscriptionCount(eventName: String): Double
    
    def off(eventNames: String, handler: js.Function): Unit
    
    def on(eventNames: String, handler: js.Function): Any
    
    // return value type are Signal
    def once(eventName: String, handler: js.Function): Any
    
    def pauseEvents(eventNames: String): Unit
    
    def resumeEvents(eventNames: String): Unit
    
    // return value type are Signal
    def signal(eventName: String): Unit
  }
  object IEmitter {
    
    inline def apply(
      behavior: (String, Any) => Unit,
      decrementSubscriptionCount: String => Double,
      emit: (String, /* repeated */ Any) => Unit,
      getSubscriptionCount: String => Double,
      hasSubscriptions: String => Boolean,
      incrementSubscriptionCount: String => Double,
      off: (String, js.Function) => Unit,
      on: (String, js.Function) => Any,
      once: (String, js.Function) => Any,
      pauseEvents: String => Unit,
      resumeEvents: String => Unit,
      signal: String => Unit
    ): IEmitter = {
      val __obj = js.Dynamic.literal(behavior = js.Any.fromFunction2(behavior), decrementSubscriptionCount = js.Any.fromFunction1(decrementSubscriptionCount), emit = js.Any.fromFunction2(emit), getSubscriptionCount = js.Any.fromFunction1(getSubscriptionCount), hasSubscriptions = js.Any.fromFunction1(hasSubscriptions), incrementSubscriptionCount = js.Any.fromFunction1(incrementSubscriptionCount), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), pauseEvents = js.Any.fromFunction1(pauseEvents), resumeEvents = js.Any.fromFunction1(resumeEvents), signal = js.Any.fromFunction1(signal))
      __obj.asInstanceOf[IEmitter]
    }
    
    extension [Self <: IEmitter](x: Self) {
      
      inline def setBehavior(value: (String, Any) => Unit): Self = StObject.set(x, "behavior", js.Any.fromFunction2(value))
      
      inline def setDecrementSubscriptionCount(value: String => Double): Self = StObject.set(x, "decrementSubscriptionCount", js.Any.fromFunction1(value))
      
      inline def setEmit(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setGetSubscriptionCount(value: String => Double): Self = StObject.set(x, "getSubscriptionCount", js.Any.fromFunction1(value))
      
      inline def setHasSubscriptions(value: String => Boolean): Self = StObject.set(x, "hasSubscriptions", js.Any.fromFunction1(value))
      
      inline def setIncrementSubscriptionCount(value: String => Double): Self = StObject.set(x, "incrementSubscriptionCount", js.Any.fromFunction1(value))
      
      inline def setOff(value: (String, js.Function) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOn(value: (String, js.Function) => Any): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnce(value: (String, js.Function) => Any): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      inline def setPauseEvents(value: String => Unit): Self = StObject.set(x, "pauseEvents", js.Any.fromFunction1(value))
      
      inline def setResumeEvents(value: String => Unit): Self = StObject.set(x, "resumeEvents", js.Any.fromFunction1(value))
      
      inline def setSignal(value: String => Unit): Self = StObject.set(x, "signal", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IEmitterStatic
    extends StObject
       with IMixinStatic
       with Instantiable0[IEmitter]
  
  @js.native
  trait ISubscriber extends StObject {
    
    def addSubscription(subscription: Any): ISubscription = js.native
    
    def subscribe(eventEmitterOrSubscription: Any, args: Any*): ISubscription = js.native
    
    def subscribeToCommand(eventEmitter: Any, args: Any*): ISubscription = js.native
    
    def subscribeWith(eventEmitter: Any, methodName: String, args: Any): ISubscription = js.native
    
    def unsubscribe(): Any = js.native
    def unsubscribe(`object`: Any): Any = js.native
  }
  
  @js.native
  trait ISubscriberStatic
    extends StObject
       with IMixinStatic
       with Instantiable0[ISubscriber]
  
  trait ISubscription
    extends StObject
       with IEmitter {
    
    var cancelled: Boolean
    
    def off(): Any
  }
  object ISubscription {
    
    inline def apply(
      behavior: (String, Any) => Unit,
      cancelled: Boolean,
      decrementSubscriptionCount: String => Double,
      emit: (String, /* repeated */ Any) => Unit,
      getSubscriptionCount: String => Double,
      hasSubscriptions: String => Boolean,
      incrementSubscriptionCount: String => Double,
      off: () => Any,
      on: (String, js.Function) => Any,
      once: (String, js.Function) => Any,
      pauseEvents: String => Unit,
      resumeEvents: String => Unit,
      signal: String => Unit
    ): ISubscription = {
      val __obj = js.Dynamic.literal(behavior = js.Any.fromFunction2(behavior), cancelled = cancelled.asInstanceOf[js.Any], decrementSubscriptionCount = js.Any.fromFunction1(decrementSubscriptionCount), emit = js.Any.fromFunction2(emit), getSubscriptionCount = js.Any.fromFunction1(getSubscriptionCount), hasSubscriptions = js.Any.fromFunction1(hasSubscriptions), incrementSubscriptionCount = js.Any.fromFunction1(incrementSubscriptionCount), off = js.Any.fromFunction0(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), pauseEvents = js.Any.fromFunction1(pauseEvents), resumeEvents = js.Any.fromFunction1(resumeEvents), signal = js.Any.fromFunction1(signal))
      __obj.asInstanceOf[ISubscription]
    }
    
    extension [Self <: ISubscription](x: Self) {
      
      inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
      
      inline def setOff(value: () => Any): Self = StObject.set(x, "off", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ISubscriptionStatic
    extends StObject
       with Instantiable3[/* emitter */ Any, /* eventNames */ String, /* handler */ js.Function, ISubscription]
}
