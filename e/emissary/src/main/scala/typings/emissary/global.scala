package typings.emissary

import typings.emissary.mod.IEmitter
import typings.emissary.mod.IEmitterStatic
import typings.emissary.mod.ISubscriber
import typings.emissary.mod.ISubscriberStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Emissary {
    
    @JSGlobal("Emissary")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Emissary.Behavior")
    @js.native
    def Behavior: js.Function = js.native
    inline def Behavior_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Behavior")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Emissary.Emitter")
    @js.native
    class Emitter ()
      extends StObject
         with IEmitter {
      
      /* CompleteClass */
      override def behavior(eventName: String, initialValue: js.Any): Unit = js.native
      
      /* CompleteClass */
      override def decrementSubscriptionCount(eventName: String): Double = js.native
      
      /* CompleteClass */
      override def emit(eventName: String, args: js.Any*): Unit = js.native
      
      /* CompleteClass */
      override def getSubscriptionCount(eventName: String): Double = js.native
      
      /* CompleteClass */
      override def hasSubscriptions(eventName: String): Boolean = js.native
      
      /* CompleteClass */
      override def incrementSubscriptionCount(eventName: String): Double = js.native
      
      /* CompleteClass */
      override def off(eventNames: String, handler: js.Function): Unit = js.native
      
      /* CompleteClass */
      override def on(eventNames: String, handler: js.Function): js.Any = js.native
      
      // return value type are Signal
      /* CompleteClass */
      override def once(eventName: String, handler: js.Function): js.Any = js.native
      
      /* CompleteClass */
      override def pauseEvents(eventNames: String): Unit = js.native
      
      /* CompleteClass */
      override def resumeEvents(eventNames: String): Unit = js.native
      
      // return value type are Signal
      /* CompleteClass */
      override def signal(eventName: String): Unit = js.native
    }
    @JSGlobal("Emissary.Emitter")
    @js.native
    def Emitter: IEmitterStatic = js.native
    inline def Emitter_=(x: IEmitterStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Emitter")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Emissary.Signal")
    @js.native
    def Signal: js.Function = js.native
    inline def Signal_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Signal")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Emissary.Subscriber")
    @js.native
    class Subscriber ()
      extends StObject
         with ISubscriber
    @JSGlobal("Emissary.Subscriber")
    @js.native
    def Subscriber: ISubscriberStatic = js.native
    inline def Subscriber_=(x: ISubscriberStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Subscriber")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Emissary.combine")
    @js.native
    def combine: js.Function = js.native
    inline def combine_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("combine")(x.asInstanceOf[js.Any])
  }
}
