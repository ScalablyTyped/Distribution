package typings.eventTargetShim

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.eventTargetShim.es5Mod.Event
import typings.eventTargetShim.es5Mod.Event.EventInit
import typings.eventTargetShim.es5Mod.EventTarget
import typings.eventTargetShim.eventTargetShimStrings.standard
import typings.std.Record
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
  
  /* Inlined std.Partial<std.Omit<event-target-shim.event-target-shim/es5.Event<string>, 'type'>> */
  trait PartialOmitEventstringtyp extends StObject {
    
    var AT_TARGET: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var BUBBLING_PHASE: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var CAPTURING_PHASE: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var NONE: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var bubbles: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var cancelBubble: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var cancelable: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var composed: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var composedPath: js.UndefOr[js.Function0[js.Array[EventTarget[Record[String, Event[String]], standard]]]] = js.undefined
    
    var constructor: js.UndefOr[js.Function2[/* type */ String, /* eventInitDict */ js.UndefOr[EventInit], Any]] = js.undefined
    
    var currentTarget: js.UndefOr[js.Function0[(EventTarget[Record[String, Event[String]], standard]) | Null]] = js.undefined
    
    var defaultPrevented: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var eventPhase: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var initEvent: js.UndefOr[
        js.Function3[
          /* type */ String, 
          /* bubbles */ js.UndefOr[Boolean], 
          /* cancelable */ js.UndefOr[Boolean], 
          Unit
        ]
      ] = js.undefined
    
    var isTrusted: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var preventDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var returnValue: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var srcElement: js.UndefOr[js.Function0[(EventTarget[Record[String, Event[String]], standard]) | Null]] = js.undefined
    
    var stopImmediatePropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var target: js.UndefOr[js.Function0[(EventTarget[Record[String, Event[String]], standard]) | Null]] = js.undefined
    
    var timeStamp: js.UndefOr[js.Function0[Double]] = js.undefined
  }
  object PartialOmitEventstringtyp {
    
    inline def apply(): PartialOmitEventstringtyp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOmitEventstringtyp]
    }
    
    extension [Self <: PartialOmitEventstringtyp](x: Self) {
      
      inline def setAT_TARGET(value: () => Double): Self = StObject.set(x, "AT_TARGET", js.Any.fromFunction0(value))
      
      inline def setAT_TARGETUndefined: Self = StObject.set(x, "AT_TARGET", js.undefined)
      
      inline def setBUBBLING_PHASE(value: () => Double): Self = StObject.set(x, "BUBBLING_PHASE", js.Any.fromFunction0(value))
      
      inline def setBUBBLING_PHASEUndefined: Self = StObject.set(x, "BUBBLING_PHASE", js.undefined)
      
      inline def setBubbles(value: () => Boolean): Self = StObject.set(x, "bubbles", js.Any.fromFunction0(value))
      
      inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
      
      inline def setCAPTURING_PHASE(value: () => Double): Self = StObject.set(x, "CAPTURING_PHASE", js.Any.fromFunction0(value))
      
      inline def setCAPTURING_PHASEUndefined: Self = StObject.set(x, "CAPTURING_PHASE", js.undefined)
      
      inline def setCancelBubble(value: () => Boolean): Self = StObject.set(x, "cancelBubble", js.Any.fromFunction0(value))
      
      inline def setCancelBubbleUndefined: Self = StObject.set(x, "cancelBubble", js.undefined)
      
      inline def setCancelable(value: () => Boolean): Self = StObject.set(x, "cancelable", js.Any.fromFunction0(value))
      
      inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      inline def setComposed(value: () => Boolean): Self = StObject.set(x, "composed", js.Any.fromFunction0(value))
      
      inline def setComposedPath(value: () => js.Array[EventTarget[Record[String, Event[String]], standard]]): Self = StObject.set(x, "composedPath", js.Any.fromFunction0(value))
      
      inline def setComposedPathUndefined: Self = StObject.set(x, "composedPath", js.undefined)
      
      inline def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
      
      inline def setConstructor(value: (/* type */ String, /* eventInitDict */ js.UndefOr[EventInit]) => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction2(value))
      
      inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      inline def setCurrentTarget(value: () => (EventTarget[Record[String, Event[String]], standard]) | Null): Self = StObject.set(x, "currentTarget", js.Any.fromFunction0(value))
      
      inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      inline def setDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "defaultPrevented", js.Any.fromFunction0(value))
      
      inline def setDefaultPreventedUndefined: Self = StObject.set(x, "defaultPrevented", js.undefined)
      
      inline def setEventPhase(value: () => Double): Self = StObject.set(x, "eventPhase", js.Any.fromFunction0(value))
      
      inline def setEventPhaseUndefined: Self = StObject.set(x, "eventPhase", js.undefined)
      
      inline def setInitEvent(
        value: (/* type */ String, /* bubbles */ js.UndefOr[Boolean], /* cancelable */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "initEvent", js.Any.fromFunction3(value))
      
      inline def setInitEventUndefined: Self = StObject.set(x, "initEvent", js.undefined)
      
      inline def setIsTrusted(value: () => Boolean): Self = StObject.set(x, "isTrusted", js.Any.fromFunction0(value))
      
      inline def setIsTrustedUndefined: Self = StObject.set(x, "isTrusted", js.undefined)
      
      inline def setNONE(value: () => Double): Self = StObject.set(x, "NONE", js.Any.fromFunction0(value))
      
      inline def setNONEUndefined: Self = StObject.set(x, "NONE", js.undefined)
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setReturnValue(value: () => Boolean): Self = StObject.set(x, "returnValue", js.Any.fromFunction0(value))
      
      inline def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
      
      inline def setSrcElement(value: () => (EventTarget[Record[String, Event[String]], standard]) | Null): Self = StObject.set(x, "srcElement", js.Any.fromFunction0(value))
      
      inline def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
      
      inline def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
      
      inline def setStopImmediatePropagationUndefined: Self = StObject.set(x, "stopImmediatePropagation", js.undefined)
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      
      inline def setTarget(value: () => (EventTarget[Record[String, Event[String]], standard]) | Null): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTimeStamp(value: () => Double): Self = StObject.set(x, "timeStamp", js.Any.fromFunction0(value))
      
      inline def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Omit<event-target-shim.event-target-shim.Event<string>, 'type'>> */
  trait PartialOmitEventstringtypATTARGET extends StObject {
    
    var AT_TARGET: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var BUBBLING_PHASE: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var CAPTURING_PHASE: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var NONE: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var bubbles: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var cancelBubble: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var cancelable: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var composed: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var composedPath: js.UndefOr[
        js.Function0[
          js.Array[
            typings.eventTargetShim.mod.EventTarget[Record[String, typings.eventTargetShim.mod.Event[String]], standard]
          ]
        ]
      ] = js.undefined
    
    var constructor: js.UndefOr[
        js.Function2[
          /* type */ String, 
          /* eventInitDict */ js.UndefOr[typings.eventTargetShim.mod.Event.EventInit], 
          Any
        ]
      ] = js.undefined
    
    var currentTarget: js.UndefOr[
        js.Function0[
          (typings.eventTargetShim.mod.EventTarget[Record[String, typings.eventTargetShim.mod.Event[String]], standard]) | Null
        ]
      ] = js.undefined
    
    var defaultPrevented: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var eventPhase: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var initEvent: js.UndefOr[
        js.Function3[
          /* type */ String, 
          /* bubbles */ js.UndefOr[Boolean], 
          /* cancelable */ js.UndefOr[Boolean], 
          Unit
        ]
      ] = js.undefined
    
    var isTrusted: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var preventDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var returnValue: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var srcElement: js.UndefOr[
        js.Function0[
          (typings.eventTargetShim.mod.EventTarget[Record[String, typings.eventTargetShim.mod.Event[String]], standard]) | Null
        ]
      ] = js.undefined
    
    var stopImmediatePropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var target: js.UndefOr[
        js.Function0[
          (typings.eventTargetShim.mod.EventTarget[Record[String, typings.eventTargetShim.mod.Event[String]], standard]) | Null
        ]
      ] = js.undefined
    
    var timeStamp: js.UndefOr[js.Function0[Double]] = js.undefined
  }
  object PartialOmitEventstringtypATTARGET {
    
    inline def apply(): PartialOmitEventstringtypATTARGET = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOmitEventstringtypATTARGET]
    }
    
    extension [Self <: PartialOmitEventstringtypATTARGET](x: Self) {
      
      inline def setAT_TARGET(value: () => Double): Self = StObject.set(x, "AT_TARGET", js.Any.fromFunction0(value))
      
      inline def setAT_TARGETUndefined: Self = StObject.set(x, "AT_TARGET", js.undefined)
      
      inline def setBUBBLING_PHASE(value: () => Double): Self = StObject.set(x, "BUBBLING_PHASE", js.Any.fromFunction0(value))
      
      inline def setBUBBLING_PHASEUndefined: Self = StObject.set(x, "BUBBLING_PHASE", js.undefined)
      
      inline def setBubbles(value: () => Boolean): Self = StObject.set(x, "bubbles", js.Any.fromFunction0(value))
      
      inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
      
      inline def setCAPTURING_PHASE(value: () => Double): Self = StObject.set(x, "CAPTURING_PHASE", js.Any.fromFunction0(value))
      
      inline def setCAPTURING_PHASEUndefined: Self = StObject.set(x, "CAPTURING_PHASE", js.undefined)
      
      inline def setCancelBubble(value: () => Boolean): Self = StObject.set(x, "cancelBubble", js.Any.fromFunction0(value))
      
      inline def setCancelBubbleUndefined: Self = StObject.set(x, "cancelBubble", js.undefined)
      
      inline def setCancelable(value: () => Boolean): Self = StObject.set(x, "cancelable", js.Any.fromFunction0(value))
      
      inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      inline def setComposed(value: () => Boolean): Self = StObject.set(x, "composed", js.Any.fromFunction0(value))
      
      inline def setComposedPath(
        value: () => js.Array[
              typings.eventTargetShim.mod.EventTarget[Record[String, typings.eventTargetShim.mod.Event[String]], standard]
            ]
      ): Self = StObject.set(x, "composedPath", js.Any.fromFunction0(value))
      
      inline def setComposedPathUndefined: Self = StObject.set(x, "composedPath", js.undefined)
      
      inline def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
      
      inline def setConstructor(
        value: (/* type */ String, /* eventInitDict */ js.UndefOr[typings.eventTargetShim.mod.Event.EventInit]) => Any
      ): Self = StObject.set(x, "constructor", js.Any.fromFunction2(value))
      
      inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      inline def setCurrentTarget(
        value: () => (typings.eventTargetShim.mod.EventTarget[Record[String, typings.eventTargetShim.mod.Event[String]], standard]) | Null
      ): Self = StObject.set(x, "currentTarget", js.Any.fromFunction0(value))
      
      inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      inline def setDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "defaultPrevented", js.Any.fromFunction0(value))
      
      inline def setDefaultPreventedUndefined: Self = StObject.set(x, "defaultPrevented", js.undefined)
      
      inline def setEventPhase(value: () => Double): Self = StObject.set(x, "eventPhase", js.Any.fromFunction0(value))
      
      inline def setEventPhaseUndefined: Self = StObject.set(x, "eventPhase", js.undefined)
      
      inline def setInitEvent(
        value: (/* type */ String, /* bubbles */ js.UndefOr[Boolean], /* cancelable */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "initEvent", js.Any.fromFunction3(value))
      
      inline def setInitEventUndefined: Self = StObject.set(x, "initEvent", js.undefined)
      
      inline def setIsTrusted(value: () => Boolean): Self = StObject.set(x, "isTrusted", js.Any.fromFunction0(value))
      
      inline def setIsTrustedUndefined: Self = StObject.set(x, "isTrusted", js.undefined)
      
      inline def setNONE(value: () => Double): Self = StObject.set(x, "NONE", js.Any.fromFunction0(value))
      
      inline def setNONEUndefined: Self = StObject.set(x, "NONE", js.undefined)
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setReturnValue(value: () => Boolean): Self = StObject.set(x, "returnValue", js.Any.fromFunction0(value))
      
      inline def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
      
      inline def setSrcElement(
        value: () => (typings.eventTargetShim.mod.EventTarget[Record[String, typings.eventTargetShim.mod.Event[String]], standard]) | Null
      ): Self = StObject.set(x, "srcElement", js.Any.fromFunction0(value))
      
      inline def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
      
      inline def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
      
      inline def setStopImmediatePropagationUndefined: Self = StObject.set(x, "stopImmediatePropagation", js.undefined)
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      
      inline def setTarget(
        value: () => (typings.eventTargetShim.mod.EventTarget[Record[String, typings.eventTargetShim.mod.Event[String]], standard]) | Null
      ): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTimeStamp(value: () => Double): Self = StObject.set(x, "timeStamp", js.Any.fromFunction0(value))
      
      inline def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
    }
  }
  
  trait Type[T /* <: String */] extends StObject {
    
    val `type`: T
  }
  object Type {
    
    inline def apply[T /* <: String */](`type`: T): Type[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type[T]]
    }
    
    extension [Self <: Type[?], T /* <: String */](x: Self & Type[T]) {
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
