package typings.eventTargetShim

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.eventTargetShim.es5Mod.Event
import typings.eventTargetShim.es5Mod.Event.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Abort extends StObject {
    
    var abort: Event[String]
  }
  object Abort {
    
    inline def apply(abort: Event[String]): Abort = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any])
      __obj.asInstanceOf[Abort]
    }
    
    extension [Self <: Abort](x: Self) {
      
      inline def setAbort(value: Event[String]): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    }
  }
  
  trait AbortEvent extends StObject {
    
    var abort: typings.eventTargetShim.mod.Event[String]
  }
  object AbortEvent {
    
    inline def apply(abort: typings.eventTargetShim.mod.Event[String]): AbortEvent = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbortEvent]
    }
    
    extension [Self <: AbortEvent](x: Self) {
      
      inline def setAbort(value: typings.eventTargetShim.mod.Event[String]): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofEvent
    extends StObject
       with Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam TEventType */ /* type */ Any, 
          Event[String]
        ]
       with Instantiable2[
          /* import warning: RewrittenClass.unapply cls was tparam TEventType */ /* type */ Any, 
          /* eventInitDict */ EventInit, 
          Event[String]
        ] {
    
    /**
    	 * @see https://dom.spec.whatwg.org/#dom-event-at_target
    	 */
    def AT_TARGET: Double = js.native
    
    /**
    	 * @see https://dom.spec.whatwg.org/#dom-event-bubbling_phase
    	 */
    def BUBBLING_PHASE: Double = js.native
    
    /**
    	 * @see https://dom.spec.whatwg.org/#dom-event-capturing_phase
    	 */
    def CAPTURING_PHASE: Double = js.native
    
    /**
    	 * @see https://dom.spec.whatwg.org/#dom-event-none
    	 */
    def NONE: Double = js.native
  }
  
  @js.native
  trait TypeofEventInstantiable
    extends StObject
       with Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam TEventType */ /* type */ Any, 
          typings.eventTargetShim.mod.Event[String]
        ]
       with Instantiable2[
          /* import warning: RewrittenClass.unapply cls was tparam TEventType */ /* type */ Any, 
          /* eventInitDict */ typings.eventTargetShim.mod.Event.EventInit, 
          typings.eventTargetShim.mod.Event[String]
        ] {
    
    /**
    	 * @see https://dom.spec.whatwg.org/#dom-event-at_target
    	 */
    def AT_TARGET: Double = js.native
    
    /**
    	 * @see https://dom.spec.whatwg.org/#dom-event-bubbling_phase
    	 */
    def BUBBLING_PHASE: Double = js.native
    
    /**
    	 * @see https://dom.spec.whatwg.org/#dom-event-capturing_phase
    	 */
    def CAPTURING_PHASE: Double = js.native
    
    /**
    	 * @see https://dom.spec.whatwg.org/#dom-event-none
    	 */
    def NONE: Double = js.native
  }
}
