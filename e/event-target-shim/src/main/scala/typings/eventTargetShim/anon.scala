package typings.eventTargetShim

import typings.eventTargetShim.eventTargetShimStrings.loose
import typings.eventTargetShim.eventTargetShimStrings.standard
import typings.eventTargetShim.mod.EventTarget.AddOptions
import typings.eventTargetShim.mod.EventTarget.EventData
import typings.eventTargetShim.mod.EventTarget.EventDefinition
import typings.eventTargetShim.mod.EventTarget.EventType
import typings.eventTargetShim.mod.EventTarget.Listener
import typings.eventTargetShim.mod.EventTarget.Mode
import typings.eventTargetShim.mod.EventTarget.PickEvent
import typings.eventTargetShim.mod.EventTarget.RemoveOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AddEventListener[TEvents /* <: EventDefinition */, TMode /* <: Mode */] extends StObject {
    
    /**
      * Add a given listener to this event target.
      * @param eventName The event name to add.
      * @param listener The listener to add.
      * @param options The options for this listener.
      */
    def addEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType): Unit = js.native
    def addEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Null, options: Boolean): Unit = js.native
    def addEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Null, options: AddOptions): Unit = js.native
    def addEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Listener[PickEvent[TEvents, TEventType]]): Unit = js.native
    def addEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Listener[PickEvent[TEvents, TEventType]], options: Boolean): Unit = js.native
    def addEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Listener[PickEvent[TEvents, TEventType]], options: AddOptions): Unit = js.native
    
    /**
      * Dispatch a given event.
      * @param event The event to dispatch.
      * @returns `false` if canceled.
      */
    def dispatchEvent[TEventType /* <: EventType[TEvents, TMode] */](event: EventData[TEvents, TEventType, TMode]): Boolean = js.native
    
    /**
      * Remove a given listener from this event target.
      * @param eventName The event name to remove.
      * @param listener The listener to remove.
      * @param options The options for this listener.
      */
    def removeEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Null, options: Boolean): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Null, options: RemoveOptions): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Listener[PickEvent[TEvents, TEventType]]): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Listener[PickEvent[TEvents, TEventType]], options: Boolean): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Listener[PickEvent[TEvents, TEventType]], options: RemoveOptions): Unit = js.native
  }
  
  /* Inlined event-target-shim.event-target-shim.EventTarget<{}, {}, 'loose'> */
  @js.native
  trait EventTargetloose extends StObject {
    
    /**
      * Add a given listener to this event target.
      * @param eventName The event name to add.
      * @param listener The listener to add.
      * @param options The options for this listener.
      */
    def addEventListener[TEventType /* <: EventType[js.Object, loose] */](`type`: TEventType): Unit = js.native
    def addEventListener[TEventType /* <: EventType[js.Object, loose] */](`type`: TEventType, listener: Null, options: Boolean): Unit = js.native
    def addEventListener[TEventType /* <: EventType[js.Object, loose] */](`type`: TEventType, listener: Null, options: AddOptions): Unit = js.native
    def addEventListener[TEventType /* <: EventType[js.Object, loose] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]]): Unit = js.native
    def addEventListener[TEventType /* <: EventType[js.Object, loose] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]], options: Boolean): Unit = js.native
    def addEventListener[TEventType /* <: EventType[js.Object, loose] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]], options: AddOptions): Unit = js.native
    
    /**
      * Dispatch a given event.
      * @param event The event to dispatch.
      * @returns `false` if canceled.
      */
    @JSName("dispatchEvent")
    def dispatchEvent_loose[TEventType /* <: EventType[js.Object, loose] */](event: EventData[js.Object, TEventType, loose]): Boolean = js.native
    
    /**
      * Remove a given listener from this event target.
      * @param eventName The event name to remove.
      * @param listener The listener to remove.
      * @param options The options for this listener.
      */
    def removeEventListener[TEventType /* <: EventType[js.Object, loose] */](`type`: TEventType): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[js.Object, loose] */](`type`: TEventType, listener: Null, options: Boolean): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[js.Object, loose] */](`type`: TEventType, listener: Null, options: RemoveOptions): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[js.Object, loose] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]]): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[js.Object, loose] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]], options: Boolean): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[js.Object, loose] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]], options: RemoveOptions): Unit = js.native
  }
  
  /* Inlined event-target-shim.event-target-shim.EventTarget<{}, {}, 'standard'> */
  @js.native
  trait EventTargetstandard extends StObject {
    
    /**
      * Add a given listener to this event target.
      * @param eventName The event name to add.
      * @param listener The listener to add.
      * @param options The options for this listener.
      */
    def addEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType): Unit = js.native
    def addEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Null, options: Boolean): Unit = js.native
    def addEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Null, options: AddOptions): Unit = js.native
    def addEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]]): Unit = js.native
    def addEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]], options: Boolean): Unit = js.native
    def addEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]], options: AddOptions): Unit = js.native
    
    /**
      * Dispatch a given event.
      * @param event The event to dispatch.
      * @returns `false` if canceled.
      */
    @JSName("dispatchEvent")
    def dispatchEvent_standard[TEventType /* <: EventType[js.Object, standard] */](event: EventData[js.Object, TEventType, standard]): Boolean = js.native
    
    /**
      * Remove a given listener from this event target.
      * @param eventName The event name to remove.
      * @param listener The listener to remove.
      * @param options The options for this listener.
      */
    def removeEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Null, options: Boolean): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Null, options: RemoveOptions): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]]): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]], options: Boolean): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]], options: RemoveOptions): Unit = js.native
  }
  
  /* Inlined event-target-shim.event-target-shim.EventTarget<{}, {}, 'standard'> */
  @js.native
  trait EventTargetstandardAddEventListener[TEvents /* <: EventDefinition */] extends StObject {
    
    /**
      * Add a given listener to this event target.
      * @param eventName The event name to add.
      * @param listener The listener to add.
      * @param options The options for this listener.
      */
    def addEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType): Unit = js.native
    def addEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Null, options: Boolean): Unit = js.native
    def addEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Null, options: AddOptions): Unit = js.native
    def addEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]]): Unit = js.native
    def addEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]], options: Boolean): Unit = js.native
    def addEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]], options: AddOptions): Unit = js.native
    
    /**
      * Dispatch a given event.
      * @param event The event to dispatch.
      * @returns `false` if canceled.
      */
    def dispatchEvent[TEventType /* <: EventType[js.Object, standard] */](
      event: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias event-target-shim.event-target-shim.EventTarget.EventData<{}, TEventType, 'standard'> */ js.Object
    ): Boolean = js.native
    
    /**
      * Remove a given listener from this event target.
      * @param eventName The event name to remove.
      * @param listener The listener to remove.
      * @param options The options for this listener.
      */
    def removeEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Null, options: Boolean): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Null, options: RemoveOptions): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]]): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]], options: Boolean): Unit = js.native
    def removeEventListener[TEventType /* <: EventType[js.Object, standard] */](`type`: TEventType, listener: Listener[PickEvent[js.Object, TEventType]], options: RemoveOptions): Unit = js.native
  }
  
  /* Inlined std.Partial<std.Pick<event-target-shim.event-target-shim.Event, event-target-shim.event-target-shim.EventTarget.OmittableEventKeys>> */
  trait PartialPickEventOmittable[TEvents /* <: EventDefinition */] extends StObject {
    
    var AT_TARGET: js.UndefOr[Double] = js.undefined
    
    var BUBBLING_PHASE: js.UndefOr[Double] = js.undefined
    
    var CAPTURING_PHASE: js.UndefOr[Double] = js.undefined
    
    var NONE: js.UndefOr[Double] = js.undefined
    
    var bubbles: js.UndefOr[Boolean] = js.undefined
    
    var cancelBubble: js.UndefOr[Boolean] = js.undefined
    
    var cancelable: js.UndefOr[Boolean] = js.undefined
    
    var composed: js.UndefOr[Boolean] = js.undefined
    
    var composedPath: js.UndefOr[js.Function0[js.Array[EventTargetstandardAddEventListener[TEvents]]]] = js.undefined
    
    var currentTarget: js.UndefOr[EventTargetstandardAddEventListener[TEvents] | Null] = js.undefined
    
    var defaultPrevented: js.UndefOr[Boolean] = js.undefined
    
    var eventPhase: js.UndefOr[Double] = js.undefined
    
    var initEvent: js.UndefOr[
        js.Function3[
          /* type */ String, 
          /* bubbles */ js.UndefOr[Boolean], 
          /* cancelable */ js.UndefOr[Boolean], 
          Unit
        ]
      ] = js.undefined
    
    var isTrusted: js.UndefOr[Boolean] = js.undefined
    
    var preventDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var returnValue: js.UndefOr[Boolean] = js.undefined
    
    var srcElement: js.UndefOr[js.Any | Null] = js.undefined
    
    var stopImmediatePropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var target: js.UndefOr[EventTargetstandardAddEventListener[TEvents] | Null] = js.undefined
    
    var timeStamp: js.UndefOr[Double] = js.undefined
  }
  object PartialPickEventOmittable {
    
    @scala.inline
    def apply[TEvents /* <: EventDefinition */](): PartialPickEventOmittable[TEvents] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPickEventOmittable[TEvents]]
    }
    
    @scala.inline
    implicit class PartialPickEventOmittableMutableBuilder[Self <: PartialPickEventOmittable[?], TEvents /* <: EventDefinition */] (val x: Self & PartialPickEventOmittable[TEvents]) extends AnyVal {
      
      @scala.inline
      def setAT_TARGET(value: Double): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAT_TARGETUndefined: Self = StObject.set(x, "AT_TARGET", js.undefined)
      
      @scala.inline
      def setBUBBLING_PHASE(value: Double): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBUBBLING_PHASEUndefined: Self = StObject.set(x, "BUBBLING_PHASE", js.undefined)
      
      @scala.inline
      def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
      
      @scala.inline
      def setCAPTURING_PHASE(value: Double): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCAPTURING_PHASEUndefined: Self = StObject.set(x, "CAPTURING_PHASE", js.undefined)
      
      @scala.inline
      def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelBubbleUndefined: Self = StObject.set(x, "cancelBubble", js.undefined)
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      @scala.inline
      def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComposedPath(value: () => js.Array[EventTargetstandardAddEventListener[TEvents]]): Self = StObject.set(x, "composedPath", js.Any.fromFunction0(value))
      
      @scala.inline
      def setComposedPathUndefined: Self = StObject.set(x, "composedPath", js.undefined)
      
      @scala.inline
      def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
      
      @scala.inline
      def setCurrentTarget(value: EventTargetstandardAddEventListener[TEvents]): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTargetNull: Self = StObject.set(x, "currentTarget", null)
      
      @scala.inline
      def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      @scala.inline
      def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPreventedUndefined: Self = StObject.set(x, "defaultPrevented", js.undefined)
      
      @scala.inline
      def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPhaseUndefined: Self = StObject.set(x, "eventPhase", js.undefined)
      
      @scala.inline
      def setInitEvent(
        value: (/* type */ String, /* bubbles */ js.UndefOr[Boolean], /* cancelable */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "initEvent", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInitEventUndefined: Self = StObject.set(x, "initEvent", js.undefined)
      
      @scala.inline
      def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTrustedUndefined: Self = StObject.set(x, "isTrusted", js.undefined)
      
      @scala.inline
      def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNONEUndefined: Self = StObject.set(x, "NONE", js.undefined)
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      @scala.inline
      def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
      
      @scala.inline
      def setSrcElement(value: js.Any): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcElementNull: Self = StObject.set(x, "srcElement", null)
      
      @scala.inline
      def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
      
      @scala.inline
      def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopImmediatePropagationUndefined: Self = StObject.set(x, "stopImmediatePropagation", js.undefined)
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      
      @scala.inline
      def setTarget(value: EventTargetstandardAddEventListener[TEvents]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
    }
  }
}
