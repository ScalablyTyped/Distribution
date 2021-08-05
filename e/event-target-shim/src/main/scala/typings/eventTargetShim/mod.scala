package typings.eventTargetShim

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.eventTargetShim.anon.AddEventListener
import typings.eventTargetShim.anon.EventTargetloose
import typings.eventTargetShim.anon.EventTargetstandard
import typings.eventTargetShim.anon.PartialPickEventOmittable
import typings.eventTargetShim.mod.EventTarget.EventAttributes
import typings.eventTargetShim.mod.EventTarget.EventDefinition
import typings.eventTargetShim.mod.EventTarget.Mode
import typings.eventTargetShim.mod.EventTarget._EventData
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("event-target-shim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined event-target-shim.event-target-shim.EventTargetConstructor<{}, {}, 'loose'> & {new <TEvents extends event-target-shim.event-target-shim.EventTarget.EventDefinition, TEventAttributes extends event-target-shim.event-target-shim.EventTarget.EventDefinition, TMode extends event-target-shim.event-target-shim.EventTarget.Mode = 'loose'>(): event-target-shim.event-target-shim.EventTarget<TEvents, TEventAttributes, TMode>, None <TEvents extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TEventAttributes extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TMode extends event-target-shim.event-target-shim.EventTarget.Mode = 'loose'>(events : std.Array<string>): event-target-shim.event-target-shim.EventTargetConstructor<TEvents, TEventAttributes, TMode>, None <TEvents extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TEventAttributes extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TMode extends event-target-shim.event-target-shim.EventTarget.Mode = 'loose'>(event0 : string, events : ...string): event-target-shim.event-target-shim.EventTargetConstructor<TEvents, TEventAttributes, TMode>} */
  object default {
    
    /**
      * Define an `EventTarget` constructor with attribute events and detailed event definition.
      *
      * Unfortunately, the second type parameter `TEventAttributes` was needed
      * because we cannot compute string literal types.
      *
      * @example
      * class AbortSignal extends EventTarget<{ abort: Event }, { onabort: Event }>("abort") {
      *      abort(): void {}
      * }
      *
      * @param events Optional event attributes (e.g. passing in `"click"` adds `onclick` to prototype).
      */
    inline def apply[TEvents /* <: EventDefinition */, TEventAttributes /* <: EventDefinition */, TMode /* <: Mode */](event0: String, events: String*): EventTargetConstructor[TEvents, TEventAttributes, TMode] = (^.asInstanceOf[js.Dynamic].apply(event0.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[EventTargetConstructor[TEvents, TEventAttributes, TMode]]
    /**
      * Define an `EventTarget` constructor with attribute events and detailed event definition.
      *
      * Unfortunately, the second type parameter `TEventAttributes` was needed
      * because we cannot compute string literal types.
      *
      * @example
      * class AbortSignal extends EventTarget<{ abort: Event }, { onabort: Event }>("abort") {
      *      abort(): void {}
      * }
      *
      * @param events Optional event attributes (e.g. passing in `"click"` adds `onclick` to prototype).
      */
    inline def apply[TEvents /* <: EventDefinition */, TEventAttributes /* <: EventDefinition */, TMode /* <: Mode */](events: js.Array[String]): EventTargetConstructor[TEvents, TEventAttributes, TMode] = ^.asInstanceOf[js.Dynamic].apply(events.asInstanceOf[js.Any]).asInstanceOf[EventTargetConstructor[TEvents, TEventAttributes, TMode]]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("event-target-shim", JSImport.Default)
    @js.native
    class ^ ()
      extends StObject
         with EventTargetloose
    
    @JSImport("event-target-shim", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  /* Inlined event-target-shim.event-target-shim.EventTargetConstructor<{}, {}, 'loose'> & {new <TEvents extends event-target-shim.event-target-shim.EventTarget.EventDefinition, TEventAttributes extends event-target-shim.event-target-shim.EventTarget.EventDefinition, TMode extends event-target-shim.event-target-shim.EventTarget.Mode = 'loose'>(): event-target-shim.event-target-shim.EventTarget<TEvents, TEventAttributes, TMode>, None <TEvents extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TEventAttributes extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TMode extends event-target-shim.event-target-shim.EventTarget.Mode = 'loose'>(events : std.Array<string>): event-target-shim.event-target-shim.EventTargetConstructor<TEvents, TEventAttributes, TMode>, None <TEvents extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TEventAttributes extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TMode extends event-target-shim.event-target-shim.EventTarget.Mode = 'loose'>(event0 : string, events : ...string): event-target-shim.event-target-shim.EventTargetConstructor<TEvents, TEventAttributes, TMode>} */
  object EventTarget {
    
    /**
      * Define an `EventTarget` constructor with attribute events and detailed event definition.
      *
      * Unfortunately, the second type parameter `TEventAttributes` was needed
      * because we cannot compute string literal types.
      *
      * @example
      * class AbortSignal extends EventTarget<{ abort: Event }, { onabort: Event }>("abort") {
      *      abort(): void {}
      * }
      *
      * @param events Optional event attributes (e.g. passing in `"click"` adds `onclick` to prototype).
      */
    inline def apply[TEvents /* <: EventDefinition */, TEventAttributes /* <: EventDefinition */, TMode /* <: Mode */](event0: String, events: String*): EventTargetConstructor[TEvents, TEventAttributes, TMode] = (^.asInstanceOf[js.Dynamic].apply(event0.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[EventTargetConstructor[TEvents, TEventAttributes, TMode]]
    /**
      * Define an `EventTarget` constructor with attribute events and detailed event definition.
      *
      * Unfortunately, the second type parameter `TEventAttributes` was needed
      * because we cannot compute string literal types.
      *
      * @example
      * class AbortSignal extends EventTarget<{ abort: Event }, { onabort: Event }>("abort") {
      *      abort(): void {}
      * }
      *
      * @param events Optional event attributes (e.g. passing in `"click"` adds `onclick` to prototype).
      */
    inline def apply[TEvents /* <: EventDefinition */, TEventAttributes /* <: EventDefinition */, TMode /* <: Mode */](events: js.Array[String]): EventTargetConstructor[TEvents, TEventAttributes, TMode] = ^.asInstanceOf[js.Dynamic].apply(events.asInstanceOf[js.Any]).asInstanceOf[EventTargetConstructor[TEvents, TEventAttributes, TMode]]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("event-target-shim", "EventTarget")
    @js.native
    class ^ ()
      extends StObject
         with EventTargetloose
    
    @JSImport("event-target-shim", "EventTarget")
    @js.native
    val ^ : js.Any = js.native
    
    trait AddOptions
      extends StObject
         with RemoveOptions {
      
      /**
        * The flag to indicate that the listener will be removed on the first
        * event.
        */
      var once: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The flag to indicate that the listener doesn't support
        * `event.preventDefault()` operation.
        */
      var passive: js.UndefOr[Boolean] = js.undefined
    }
    object AddOptions {
      
      inline def apply(): AddOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddOptions]
      }
      
      extension [Self <: AddOptions](x: Self) {
        
        inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
        
        inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
        
        inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
        
        inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
      }
    }
    
    type EventAttributes[TEventAttributes /* <: EventDefinition */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof TEventAttributes ]: event-target-shim.event-target-shim.EventTarget.FunctionListener<TEventAttributes[P]> | null}
      */ typings.eventTargetShim.eventTargetShimStrings.EventAttributes & TopLevel[TEventAttributes]
    
    /* Rewritten from type alias, can be one of: 
      - typings.eventTargetShim.mod.Event
      - typings.eventTargetShim.mod.EventTarget.NonStandardEvent
      - (typings.std.Pick[
    / * import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] * / js.Any, 
    typings.std.Exclude[
      / * import warning: importer.ImportType#apply Failed type conversion: keyof TEvents[TEventType] * / js.Any, 
      typings.eventTargetShim.mod.EventTarget.OmittableEventKeys
    ]]) & typings.eventTargetShim.anon.PartialPickEventOmittable[TEvents]
    */
    type EventData[TEvents /* <: EventDefinition */, TEventType /* <: /* keyof TEvents */ String */, TMode /* <: Mode */] = (_EventData[TEvents, TEventType, TMode]) | ((Pick[
        /* import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] */ js.Any, 
        Exclude[
          /* import warning: importer.ImportType#apply Failed type conversion: keyof TEvents[TEventType] */ js.Any, 
          OmittableEventKeys
        ]
      ]) & PartialPickEventOmittable[TEvents])
    
    type EventDefinition = StringDictionary[Event]
    
    type EventType[TEvents /* <: EventDefinition */, TMode /* <: Mode */] = /* keyof TEvents */ String
    
    type FunctionListener[TEvent] = js.Function1[/* event */ TEvent, Unit]
    
    type Listener[TEvent] = FunctionListener[TEvent] | ObjectListener[TEvent]
    
    /* Rewritten from type alias, can be one of: 
      - typings.eventTargetShim.eventTargetShimStrings.strict
      - typings.eventTargetShim.eventTargetShimStrings.standard
      - typings.eventTargetShim.eventTargetShimStrings.loose
    */
    trait Mode extends StObject
    object Mode {
      
      inline def loose: typings.eventTargetShim.eventTargetShimStrings.loose = "loose".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.loose]
      
      inline def standard: typings.eventTargetShim.eventTargetShimStrings.standard = "standard".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.standard]
      
      inline def strict: typings.eventTargetShim.eventTargetShimStrings.strict = "strict".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.strict]
    }
    
    trait NonStandardEvent
      extends StObject
         with /* key */ StringDictionary[js.Any]
         with _EventData[js.Any, js.Any, js.Any] {
      
      var `type`: String
    }
    object NonStandardEvent {
      
      inline def apply(`type`: String): NonStandardEvent = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NonStandardEvent]
      }
      
      extension [Self <: NonStandardEvent](x: Self) {
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait ObjectListener[TEvent] extends StObject {
      
      def handleEvent(event: TEvent): Unit
    }
    object ObjectListener {
      
      inline def apply[TEvent](handleEvent: TEvent => Unit): ObjectListener[TEvent] = {
        val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
        __obj.asInstanceOf[ObjectListener[TEvent]]
      }
      
      extension [Self <: ObjectListener[?], TEvent](x: Self & ObjectListener[TEvent]) {
        
        inline def setHandleEvent(value: TEvent => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
      }
    }
    
    /* Inlined std.Exclude<keyof event-target-shim.event-target-shim.Event, 'type'> */
    /* Rewritten from type alias, can be one of: 
      - typings.eventTargetShim.eventTargetShimStrings.target
      - typings.eventTargetShim.eventTargetShimStrings.eventPhase
      - typings.eventTargetShim.eventTargetShimStrings.composed
      - typings.eventTargetShim.eventTargetShimStrings.CAPTURING_PHASE
      - typings.eventTargetShim.eventTargetShimStrings.stopImmediatePropagation
      - typings.eventTargetShim.eventTargetShimStrings.timeStamp
      - typings.eventTargetShim.eventTargetShimStrings.stopPropagation
      - typings.eventTargetShim.eventTargetShimStrings.defaultPrevented
      - typings.eventTargetShim.eventTargetShimStrings.AT_TARGET
      - typings.eventTargetShim.eventTargetShimStrings.NONE
      - typings.eventTargetShim.eventTargetShimStrings.cancelable
      - typings.eventTargetShim.eventTargetShimStrings.returnValue
      - typings.eventTargetShim.eventTargetShimStrings.isTrusted
      - typings.eventTargetShim.eventTargetShimStrings.bubbles
      - typings.eventTargetShim.eventTargetShimStrings.initEvent
      - typings.eventTargetShim.eventTargetShimStrings.srcElement
      - typings.eventTargetShim.eventTargetShimStrings.preventDefault
      - typings.eventTargetShim.eventTargetShimStrings.cancelBubble
      - typings.eventTargetShim.eventTargetShimStrings.composedPath
      - typings.eventTargetShim.eventTargetShimStrings.currentTarget
      - typings.eventTargetShim.eventTargetShimStrings.BUBBLING_PHASE
    */
    trait OmittableEventKeys extends StObject
    object OmittableEventKeys {
      
      inline def AT_TARGET: typings.eventTargetShim.eventTargetShimStrings.AT_TARGET = "AT_TARGET".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.AT_TARGET]
      
      inline def BUBBLING_PHASE: typings.eventTargetShim.eventTargetShimStrings.BUBBLING_PHASE = "BUBBLING_PHASE".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.BUBBLING_PHASE]
      
      inline def CAPTURING_PHASE: typings.eventTargetShim.eventTargetShimStrings.CAPTURING_PHASE = "CAPTURING_PHASE".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.CAPTURING_PHASE]
      
      inline def NONE: typings.eventTargetShim.eventTargetShimStrings.NONE = "NONE".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.NONE]
      
      inline def bubbles: typings.eventTargetShim.eventTargetShimStrings.bubbles = "bubbles".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.bubbles]
      
      inline def cancelBubble: typings.eventTargetShim.eventTargetShimStrings.cancelBubble = "cancelBubble".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.cancelBubble]
      
      inline def cancelable: typings.eventTargetShim.eventTargetShimStrings.cancelable = "cancelable".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.cancelable]
      
      inline def composed: typings.eventTargetShim.eventTargetShimStrings.composed = "composed".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.composed]
      
      inline def composedPath: typings.eventTargetShim.eventTargetShimStrings.composedPath = "composedPath".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.composedPath]
      
      inline def currentTarget: typings.eventTargetShim.eventTargetShimStrings.currentTarget = "currentTarget".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.currentTarget]
      
      inline def defaultPrevented: typings.eventTargetShim.eventTargetShimStrings.defaultPrevented = "defaultPrevented".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.defaultPrevented]
      
      inline def eventPhase: typings.eventTargetShim.eventTargetShimStrings.eventPhase = "eventPhase".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.eventPhase]
      
      inline def initEvent: typings.eventTargetShim.eventTargetShimStrings.initEvent = "initEvent".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.initEvent]
      
      inline def isTrusted: typings.eventTargetShim.eventTargetShimStrings.isTrusted = "isTrusted".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.isTrusted]
      
      inline def preventDefault: typings.eventTargetShim.eventTargetShimStrings.preventDefault = "preventDefault".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.preventDefault]
      
      inline def returnValue: typings.eventTargetShim.eventTargetShimStrings.returnValue = "returnValue".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.returnValue]
      
      inline def srcElement: typings.eventTargetShim.eventTargetShimStrings.srcElement = "srcElement".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.srcElement]
      
      inline def stopImmediatePropagation: typings.eventTargetShim.eventTargetShimStrings.stopImmediatePropagation = "stopImmediatePropagation".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.stopImmediatePropagation]
      
      inline def stopPropagation: typings.eventTargetShim.eventTargetShimStrings.stopPropagation = "stopPropagation".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.stopPropagation]
      
      inline def target: typings.eventTargetShim.eventTargetShimStrings.target = "target".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.target]
      
      inline def timeStamp: typings.eventTargetShim.eventTargetShimStrings.timeStamp = "timeStamp".asInstanceOf[typings.eventTargetShim.eventTargetShimStrings.timeStamp]
    }
    
    type PickEvent[TEvents /* <: EventDefinition */, TEventType /* <: /* keyof TEvents */ String */] = Event | (/* import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] */ js.Any)
    
    trait RemoveOptions extends StObject {
      
      /**
        * The flag to indicate that the listener is for the capturing phase.
        */
      var capture: js.UndefOr[Boolean] = js.undefined
    }
    object RemoveOptions {
      
      inline def apply(): RemoveOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RemoveOptions]
      }
      
      extension [Self <: RemoveOptions](x: Self) {
        
        inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
        
        inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      }
    }
    
    trait _EventData[TEvents /* <: EventDefinition */, TEventType /* <: /* keyof TEvents */ String */, TMode /* <: Mode */] extends StObject
  }
  type EventTarget[TEvents /* <: EventDefinition */, TEventAttributes /* <: EventDefinition */, TMode /* <: Mode */] = EventAttributes[TEventAttributes] & (AddEventListener[TEvents, TMode])
  
  inline def defineEventAttribute(prototype: EventTargetloose, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineEventAttribute")(prototype.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Event
    extends StObject
       with _EventData[js.Any, js.Any, js.Any] {
    
    /**
      * Constant of AT_TARGET.
      */
    val AT_TARGET: Double = js.native
    
    /**
      * Constant of BUBBLING_PHASE.
      */
    val BUBBLING_PHASE: Double = js.native
    
    /**
      * Constant of CAPTURING_PHASE.
      */
    val CAPTURING_PHASE: Double = js.native
    
    /**
      * Constant of NONE.
      */
    val NONE: Double = js.native
    
    /**
      * The flag indicating bubbling.
      */
    val bubbles: Boolean = js.native
    
    /**
      * Stop event bubbling.
      * @deprecated
      */
    var cancelBubble: Boolean = js.native
    
    /**
      * The flag indicating whether the event can be canceled.
      */
    val cancelable: Boolean = js.native
    
    /**
      * The flag to indicating if event is composed.
      */
    val composed: Boolean = js.native
    
    /**
      * The composed path of this event.
      */
    def composedPath(): js.Array[EventTargetstandard] = js.native
    
    /**
      * The current target of this event.
      */
    val currentTarget: EventTargetstandard | Null = js.native
    
    /**
      * The flag to indicating whether the event was canceled.
      */
    val defaultPrevented: Boolean = js.native
    
    /**
      * Indicates which phase of the event flow is currently being evaluated.
      */
    val eventPhase: Double = js.native
    
    /**
      * Initialize event.
      * @deprecated
      */
    def initEvent(`type`: String): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Unit, cancelable: Boolean): Unit = js.native
    
    /**
      * Indicates whether the event was dispatched by the user agent.
      */
    val isTrusted: Boolean = js.native
    
    /**
      * Cancel this event.
      */
    def preventDefault(): Unit = js.native
    
    /**
      * Set or get cancellation flag.
      * @deprecated
      */
    var returnValue: Boolean = js.native
    
    /**
      * The target of this event.
      * @deprecated
      */
    val srcElement: js.Any | Null = js.native
    
    /**
      * Stop event bubbling.
      */
    def stopImmediatePropagation(): Unit = js.native
    
    /**
      * Stop event bubbling.
      */
    def stopPropagation(): Unit = js.native
    
    /**
      * The target of this event.
      */
    val target: EventTargetstandard | Null = js.native
    
    /**
      * The unix time of this event.
      */
    val timeStamp: Double = js.native
    
    /**
      * The type of this event.
      */
    val `type`: String = js.native
  }
  
  @js.native
  trait EventTargetConstructor[TEvents /* <: EventDefinition */, TEventAttributes /* <: EventDefinition */, TMode /* <: Mode */]
    extends StObject
       with Instantiable0[EventTarget[TEvents, TEventAttributes, TMode]]
  
  trait Type[T /* <: String */] extends StObject {
    
    var `type`: T
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
}
