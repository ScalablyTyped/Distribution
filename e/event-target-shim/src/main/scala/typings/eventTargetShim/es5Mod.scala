package typings.eventTargetShim

import org.scalablytyped.runtime.Instantiable0
import typings.eventTargetShim.anon.Abort
import typings.eventTargetShim.anon.TypeofEvent
import typings.eventTargetShim.es5Mod.Event.EventInit
import typings.eventTargetShim.es5Mod.EventTarget.AddOptions
import typings.eventTargetShim.es5Mod.EventTarget.CallbackFunction
import typings.eventTargetShim.es5Mod.EventTarget.EventData
import typings.eventTargetShim.es5Mod.EventTarget.EventListener
import typings.eventTargetShim.es5Mod.EventTarget.FallbackEvent
import typings.eventTargetShim.es5Mod.EventTarget.FallbackEventListener
import typings.eventTargetShim.es5Mod.EventTarget.Options
import typings.eventTargetShim.es5Mod.defineEventAttribute.EventAttributes
import typings.eventTargetShim.eventTargetShimStrings.standard
import typings.eventTargetShim.eventTargetShimStrings.strict
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es5Mod {
  
  @JSImport("event-target-shim/es5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("event-target-shim/es5", JSImport.Default)
  @js.native
  /**
  	 * Initialize this instance.
  	 */
  open class default[TEventMap /* <: Record[String, Event[String]] */, TMode /* <: standard | strict */] () extends EventTarget[TEventMap, TMode]
  
  @JSImport("event-target-shim/es5", "Event")
  @js.native
  open class Event[TEventType /* <: String */] protected () extends StObject {
    /**
    	 * Initialize this event instance.
    	 * @param type The type of this event.
    	 * @param eventInitDict Options to initialize.
    	 * @see https://dom.spec.whatwg.org/#dom-event-event
    	 */
    def this(`type`: TEventType) = this()
    def this(`type`: TEventType, eventInitDict: EventInit) = this()
    
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
    
    /**
    	 * `true` if this event will bubble.
    	 * @see https://dom.spec.whatwg.org/#dom-event-bubbles
    	 */
    def bubbles: Boolean = js.native
    
    /**
    	 * `true` if event bubbling was stopped.
    	 * @deprecated
    	 * @see https://dom.spec.whatwg.org/#dom-event-cancelbubble
    	 */
    def cancelBubble: Boolean = js.native
    /**
    	 * Stop event bubbling if `true` is set.
    	 * @deprecated Use the `stopPropagation()` method instead.
    	 * @see https://dom.spec.whatwg.org/#dom-event-cancelbubble
    	 */
    def cancelBubble_=(value: Boolean): Unit = js.native
    
    /**
    	 * `true` if this event can be canceled by the `preventDefault()` method.
    	 * @see https://dom.spec.whatwg.org/#dom-event-cancelable
    	 */
    def cancelable: Boolean = js.native
    
    /**
    	 * @see https://dom.spec.whatwg.org/#dom-event-composed
    	 */
    def composed: Boolean = js.native
    
    /**
    	 * The event target of the current dispatching.
    	 * This doesn't support node tree.
    	 * @see https://dom.spec.whatwg.org/#dom-event-composedpath
    	 */
    def composedPath(): js.Array[EventTarget[Record[String, Event[String]], standard]] = js.native
    
    /**
    	 * The event target of the current dispatching.
    	 * @see https://dom.spec.whatwg.org/#dom-event-currenttarget
    	 */
    def currentTarget: (EventTarget[Record[String, Event[String]], standard]) | Null = js.native
    
    /**
    	 * `true` if the default behavior was canceled.
    	 * @see https://dom.spec.whatwg.org/#dom-event-defaultprevented
    	 */
    def defaultPrevented: Boolean = js.native
    
    /**
    	 * The current event phase.
    	 * @see https://dom.spec.whatwg.org/#dom-event-eventphase
    	 */
    def eventPhase: Double = js.native
    
    /**
    	 * @deprecated Don't use this method. The constructor did initialization.
    	 */
    def initEvent(`type`: String): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Unit, cancelable: Boolean): Unit = js.native
    
    /**
    	 * @see https://dom.spec.whatwg.org/#dom-event-istrusted
    	 */
    def isTrusted: Boolean = js.native
    
    /**
    	 * Cancel the default behavior.
    	 * @see https://dom.spec.whatwg.org/#dom-event-preventdefault
    	 */
    def preventDefault(): Unit = js.native
    
    /**
    	 * `true` if the default behavior will act.
    	 * @deprecated Use the `defaultPrevented` proeprty instead.
    	 * @see https://dom.spec.whatwg.org/#dom-event-returnvalue
    	 */
    def returnValue: Boolean = js.native
    /**
    	 * Cancel the default behavior if `false` is set.
    	 * @deprecated Use the `preventDefault()` method instead.
    	 * @see https://dom.spec.whatwg.org/#dom-event-returnvalue
    	 */
    def returnValue_=(value: Boolean): Unit = js.native
    
    /**
    	 * The event target of the current dispatching.
    	 * @deprecated Use the `target` property instead.
    	 * @see https://dom.spec.whatwg.org/#dom-event-srcelement
    	 */
    def srcElement: (EventTarget[Record[String, Event[String]], standard]) | Null = js.native
    
    /**
    	 * Stop event bubbling and subsequent event listener callings.
    	 * @see https://dom.spec.whatwg.org/#dom-event-stopimmediatepropagation
    	 */
    def stopImmediatePropagation(): Unit = js.native
    
    /**
    	 * Stop event bubbling.
    	 * Because this shim doesn't support node tree, this merely changes the `cancelBubble` property value.
    	 * @see https://dom.spec.whatwg.org/#dom-event-stoppropagation
    	 */
    def stopPropagation(): Unit = js.native
    
    /**
    	 * The event target of the current dispatching.
    	 * @see https://dom.spec.whatwg.org/#dom-event-target
    	 */
    def target: (EventTarget[Record[String, Event[String]], standard]) | Null = js.native
    
    /**
    	 * @see https://dom.spec.whatwg.org/#dom-event-timestamp
    	 */
    def timeStamp: Double = js.native
    
    /**
    	 * The type of this event.
    	 * @see https://dom.spec.whatwg.org/#dom-event-type
    	 */
    def `type`: TEventType = js.native
  }
  object Event {
    
    /**
    	 * The options of the `Event` constructor.
    	 * @see https://dom.spec.whatwg.org/#dictdef-eventinit
    	 */
    trait EventInit extends StObject {
      
      var bubbles: js.UndefOr[Boolean] = js.undefined
      
      var cancelable: js.UndefOr[Boolean] = js.undefined
      
      var composed: js.UndefOr[Boolean] = js.undefined
    }
    object EventInit {
      
      inline def apply(): EventInit = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventInit]
      }
      
      extension [Self <: EventInit](x: Self) {
        
        inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
        
        inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
        
        inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
        
        inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
        
        inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
        
        inline def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
      }
    }
  }
  
  @JSImport("event-target-shim/es5", "EventTarget")
  @js.native
  /**
  	 * Initialize this instance.
  	 */
  open class EventTarget[TEventMap /* <: Record[String, Event[String]] */, TMode /* <: standard | strict */] () extends StObject {
    
    /**
    	 * Add an event listener.
    	 * @param type The event type.
    	 * @param callback The event listener.
    	 * @param options Options.
    	 */
    def addEventListener(`type`: String): Unit = js.native
    def addEventListener(`type`: String, callback: Unit, options: AddOptions): Unit = js.native
    def addEventListener(`type`: String, callback: FallbackEventListener[this.type, TMode]): Unit = js.native
    /**
    	 * Add an event listener.
    	 * @param type The event type.
    	 * @param callback The event listener.
    	 * @param capture The capture flag.
    	 * @deprecated Use `{capture: boolean}` object instead of a boolean value.
    	 */
    def addEventListener(`type`: String, callback: FallbackEventListener[this.type, TMode], capture: Boolean): Unit = js.native
    def addEventListener(`type`: String, callback: FallbackEventListener[this.type, TMode], options: AddOptions): Unit = js.native
    /**
    	 * Add an event listener.
    	 * @param type The event type.
    	 * @param callback The event listener.
    	 * @param options Options.
    	 */
    def addEventListener[T /* <: String */](`type`: T): Unit = js.native
    def addEventListener[T /* <: String */](`type`: T, callback: Null, capture: Boolean): Unit = js.native
    def addEventListener[T /* <: String */](`type`: T, callback: Null, options: AddOptions): Unit = js.native
    def addEventListener[T /* <: String */](`type`: T, callback: Unit, capture: Boolean): Unit = js.native
    def addEventListener[T /* <: String */](`type`: T, callback: Unit, options: AddOptions): Unit = js.native
    def addEventListener[T /* <: String */](
      `type`: T,
      callback: EventListener[
          this.type, 
          /* import warning: importer.ImportType#apply Failed type conversion: TEventMap[T] */ js.Any
        ]
    ): Unit = js.native
    /**
    	 * Add an event listener.
    	 * @param type The event type.
    	 * @param callback The event listener.
    	 * @param capture The capture flag.
    	 * @deprecated Use `{capture: boolean}` object instead of a boolean value.
    	 */
    def addEventListener[T /* <: String */](
      `type`: T,
      callback: EventListener[
          this.type, 
          /* import warning: importer.ImportType#apply Failed type conversion: TEventMap[T] */ js.Any
        ],
      capture: Boolean
    ): Unit = js.native
    def addEventListener[T /* <: String */](
      `type`: T,
      callback: EventListener[
          this.type, 
          /* import warning: importer.ImportType#apply Failed type conversion: TEventMap[T] */ js.Any
        ],
      options: AddOptions
    ): Unit = js.native
    
    /**
    	 * Dispatch an event.
    	 * @param event The `Event` object to dispatch.
    	 */
    def dispatchEvent(event: FallbackEvent[TMode]): Boolean = js.native
    /**
    	 * Dispatch an event.
    	 * @param event The `Event` object to dispatch.
    	 */
    def dispatchEvent[T /* <: String */](event: EventData[TEventMap, TMode, T]): Boolean = js.native
    
    /**
    	 * Remove an added event listener.
    	 * @param type The event type.
    	 * @param callback The event listener.
    	 * @param options Options.
    	 */
    def removeEventListener(`type`: String): Unit = js.native
    def removeEventListener(`type`: String, callback: Unit, options: Options): Unit = js.native
    def removeEventListener(`type`: String, callback: FallbackEventListener[this.type, TMode]): Unit = js.native
    /**
    	 * Remove an added event listener.
    	 * @param type The event type.
    	 * @param callback The event listener.
    	 * @param capture The capture flag.
    	 * @deprecated Use `{capture: boolean}` object instead of a boolean value.
    	 */
    def removeEventListener(`type`: String, callback: FallbackEventListener[this.type, TMode], capture: Boolean): Unit = js.native
    def removeEventListener(`type`: String, callback: FallbackEventListener[this.type, TMode], options: Options): Unit = js.native
    /**
    	 * Remove an added event listener.
    	 * @param type The event type.
    	 * @param callback The event listener.
    	 * @param options Options.
    	 */
    def removeEventListener[T /* <: String */](`type`: T): Unit = js.native
    def removeEventListener[T /* <: String */](`type`: T, callback: Null, capture: Boolean): Unit = js.native
    def removeEventListener[T /* <: String */](`type`: T, callback: Null, options: Options): Unit = js.native
    def removeEventListener[T /* <: String */](`type`: T, callback: Unit, capture: Boolean): Unit = js.native
    def removeEventListener[T /* <: String */](`type`: T, callback: Unit, options: Options): Unit = js.native
    def removeEventListener[T /* <: String */](
      `type`: T,
      callback: EventListener[
          this.type, 
          /* import warning: importer.ImportType#apply Failed type conversion: TEventMap[T] */ js.Any
        ]
    ): Unit = js.native
    /**
    	 * Remove an added event listener.
    	 * @param type The event type.
    	 * @param callback The event listener.
    	 * @param capture The capture flag.
    	 * @deprecated Use `{capture: boolean}` object instead of a boolean value.
    	 */
    def removeEventListener[T /* <: String */](
      `type`: T,
      callback: EventListener[
          this.type, 
          /* import warning: importer.ImportType#apply Failed type conversion: TEventMap[T] */ js.Any
        ],
      capture: Boolean
    ): Unit = js.native
    def removeEventListener[T /* <: String */](
      `type`: T,
      callback: EventListener[
          this.type, 
          /* import warning: importer.ImportType#apply Failed type conversion: TEventMap[T] */ js.Any
        ],
      options: Options
    ): Unit = js.native
  }
  object EventTarget {
    
    /**
    	 * The abort signal.
    	 * @see https://dom.spec.whatwg.org/#abortsignal
    	 */
    @js.native
    trait AbortSignal extends EventTarget[Abort, standard] {
      
      val aborted: Boolean = js.native
      
      var onabort: (CallbackFunction[this.type, Event[String]]) | Null = js.native
    }
    
    /**
    	 * The options for the `addEventListener` methods.
    	 * @see https://dom.spec.whatwg.org/#dictdef-addeventlisteneroptions
    	 */
    trait AddOptions
      extends StObject
         with Options {
      
      var once: js.UndefOr[Boolean] = js.undefined
      
      var passive: js.UndefOr[Boolean] = js.undefined
      
      var signal: js.UndefOr[AbortSignal | Null] = js.undefined
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
        
        inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
        
        inline def setSignalNull: Self = StObject.set(x, "signal", null)
        
        inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      }
    }
    
    /**
    	 * The event listener function.
    	 */
    type CallbackFunction[TEventTarget /* <: EventTarget[Any, Any] */, TEvent /* <: Event[String] */] = js.ThisFunction1[/* this */ TEventTarget, /* event */ TEvent, Unit]
    
    /**
    	 * The event listener object.
    	 * @see https://dom.spec.whatwg.org/#callbackdef-eventlistener
    	 */
    trait CallbackObject[TEvent /* <: Event[String] */] extends StObject {
      
      def handleEvent(event: TEvent): Unit
    }
    object CallbackObject {
      
      inline def apply[TEvent /* <: Event[String] */](handleEvent: TEvent => Unit): CallbackObject[TEvent] = {
        val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
        __obj.asInstanceOf[CallbackObject[TEvent]]
      }
      
      extension [Self <: CallbackObject[?], TEvent /* <: Event[String] */](x: Self & CallbackObject[TEvent]) {
        
        inline def setHandleEvent(value: TEvent => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
      }
    }
    
    /**
    	 * The event data to dispatch in strict mode.
    	 */
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      TMode extends 'strict' ? event-target-shim.event-target-shim/es5.EventTarget.IsValidEventMap<TEventMap> extends true ? event-target-shim.event-target-shim/es5.EventTarget.ExplicitType<TEventType> & std.Omit<TEventMap[TEventType], keyof event-target-shim.event-target-shim/es5.Event<string>> & / * Inlined std.Partial<std.Omit<event-target-shim.event-target-shim/es5.Event<string>, 'type'>> * /
    {  target :(): event-target-shim.event-target-shim/es5.EventTarget<std.Record<string, event-target-shim.event-target-shim/es5.Event<string>>, 'standard'> | null | undefined,   eventPhase :(): number | undefined,   composed :(): boolean | undefined,   CAPTURING_PHASE :(): number | undefined,   stopImmediatePropagation :(): void | undefined,   timeStamp :(): number | undefined,   stopPropagation :(): void | undefined,   defaultPrevented :(): boolean | undefined,   AT_TARGET :(): number | undefined,   NONE :(): number | undefined,   cancelable :(): boolean | undefined,   returnValue :(): boolean | undefined,   isTrusted :(): boolean | undefined,   constructor :(type : string, eventInitDict : event-target-shim.event-target-shim/es5.Event.EventInit | undefined) | undefined,   bubbles :(): boolean | undefined,   initEvent :(type : string, bubbles : boolean | undefined, cancelable : boolean | undefined): void | undefined,   srcElement :(): event-target-shim.event-target-shim/es5.EventTarget<std.Record<string, event-target-shim.event-target-shim/es5.Event<string>>, 'standard'> | null | undefined,   preventDefault :(): void | undefined,   cancelBubble :(): boolean | undefined,   composedPath :(): std.Array<event-target-shim.event-target-shim/es5.EventTarget<std.Record<string, event-target-shim.event-target-shim/es5.Event<string>>, 'standard'>> | undefined,   currentTarget :(): event-target-shim.event-target-shim/es5.EventTarget<std.Record<string, event-target-shim.event-target-shim/es5.Event<string>>, 'standard'> | null | undefined,   BUBBLING_PHASE :(): number | undefined} : never : never
      }}}
      */
    @js.native
    trait EventData[TEventMap /* <: Record[String, Event[String]] */, TMode /* <: standard | strict */, TEventType /* <: String */] extends StObject
    
    /**
    	 * The event listener.
    	 */
    type EventListener[TEventTarget /* <: EventTarget[Any, Any] */, TEvent /* <: Event[String] */] = (CallbackFunction[TEventTarget, TEvent]) | CallbackObject[TEvent]
    
    /**
    	 * Define explicit `type` property if `T` is a string literal.
    	 * Otherwise, never.
    	 */
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      string extends T ? never : { readonly type :T}
      }}}
      */
    @js.native
    trait ExplicitType[T /* <: String */] extends StObject
    
    /**
    	 * The event type in standard mode.
    	 * Otherwise, never.
    	 */
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      TMode extends 'standard' ? event-target-shim.event-target-shim/es5.Event<string> : never
      }}}
      */
    @js.native
    trait FallbackEvent[TMode /* <: standard | strict */] extends StObject
    
    /**
    	 * The event listener type in standard mode.
    	 * Otherwise, never.
    	 */
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      TMode extends 'standard' ? event-target-shim.event-target-shim/es5.EventTarget.EventListener<TEventTarget, event-target-shim.event-target-shim/es5.Event<string>> | null | undefined : never
      }}}
      */
    @js.native
    trait FallbackEventListener[TEventTarget /* <: EventTarget[Any, Any] */, TMode /* <: standard | strict */] extends StObject
    
    /**
    	 * Check if given event map is valid.
    	 * It's valid if the keys of the event map are narrower than `string`.
    	 */
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      string extends keyof T ? false : true
      }}}
      */
    @js.native
    trait IsValidEventMap[T] extends StObject
    
    /**
    	 * The common options for both `addEventListener` and `removeEventListener` methods.
    	 * @see https://dom.spec.whatwg.org/#dictdef-eventlisteneroptions
    	 */
    trait Options extends StObject {
      
      var capture: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
        
        inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      }
    }
  }
  
  object defineCustomEventTarget {
    
    inline def apply[TEventMap /* <: Record[String, Event[String]] */, TMode /* <: standard | strict */](types: String*): CustomEventTargetConstructor[TEventMap, TMode] = ^.asInstanceOf[js.Dynamic].apply(types.asInstanceOf[Seq[js.Any]]*).asInstanceOf[CustomEventTargetConstructor[TEventMap, TMode]]
    
    @JSImport("event-target-shim/es5", "defineCustomEventTarget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	 * The interface of CustomEventTarget.
    	 */
    type CustomEventTarget[TEventMap /* <: Record[String, Event[String]] */, TMode /* <: standard | strict */] = (EventTarget[TEventMap, TMode]) & (EventAttributes[Any, TEventMap])
    
    /**
    	 * The interface of CustomEventTarget constructor.
    	 */
    @js.native
    trait CustomEventTargetConstructor[TEventMap /* <: Record[String, Event[String]] */, TMode /* <: standard | strict */]
      extends StObject
         with /**
    		 * Create a new instance.
    		 */
    Instantiable0[CustomEventTarget[TEventMap, TMode]]
  }
  
  object defineEventAttribute {
    
    inline def apply[TEventTarget /* <: EventTarget[Record[String, Event[String]], standard] */, TEventType /* <: String */, TEventConstrucor /* <: TypeofEvent */](target: TEventTarget, `type`: TEventType): /* asserts target is TsTypeIntersect(IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(TEventTarget))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(event-target-shim), TsIdentModule(None,List(event-target-shim, es5)), TsIdentSimple(defineEventAttribute), TsIdentSimple(EventAttributes))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(TEventTarget))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Record))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(TEventType))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(InstanceType))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(TEventConstrucor))),IArray())))))))))*/ Boolean = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* asserts target is TsTypeIntersect(IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(TEventTarget))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(event-target-shim), TsIdentModule(None,List(event-target-shim, es5)), TsIdentSimple(defineEventAttribute), TsIdentSimple(EventAttributes))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(TEventTarget))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Record))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(TEventType))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(InstanceType))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(TEventConstrucor))),IArray())))))))))*/ Boolean]
    inline def apply[TEventTarget /* <: EventTarget[Record[String, Event[String]], standard] */, TEventType /* <: String */, TEventConstrucor /* <: TypeofEvent */](target: TEventTarget, `type`: TEventType, _eventClass: TEventConstrucor): /* asserts target is TsTypeIntersect(IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(TEventTarget))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(event-target-shim), TsIdentModule(None,List(event-target-shim, es5)), TsIdentSimple(defineEventAttribute), TsIdentSimple(EventAttributes))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(TEventTarget))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Record))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(TEventType))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(InstanceType))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(TEventConstrucor))),IArray())))))))))*/ Boolean = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], _eventClass.asInstanceOf[js.Any])).asInstanceOf[/* asserts target is TsTypeIntersect(IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(TEventTarget))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(event-target-shim), TsIdentModule(None,List(event-target-shim, es5)), TsIdentSimple(defineEventAttribute), TsIdentSimple(EventAttributes))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(TEventTarget))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Record))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(TEventType))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(InstanceType))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(TEventConstrucor))),IArray())))))))))*/ Boolean]
    
    @JSImport("event-target-shim/es5", "defineEventAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	 * Definition of event attributes.
    	 */
    /** NOTE: Mapped type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      {[ P in string & keyof TEventMap as / * template literal string: on${P} * / string ]: event-target-shim.event-target-shim/es5.EventTarget.CallbackFunction<TEventTarget, TEventMap[P]> | null}
      }}}
      */
    @js.native
    trait EventAttributes[TEventTarget /* <: EventTarget[Any, Any] */, TEventMap /* <: Record[String, Event[String]] */] extends StObject
  }
  
  inline def getEventAttributeValue[TEventTarget /* <: EventTarget[Any, Any] */, TEvent /* <: Event[String] */](target: TEventTarget, `type`: String): (CallbackFunction[TEventTarget, TEvent]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventAttributeValue")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[(CallbackFunction[TEventTarget, TEvent]) | Null]
  
  object setErrorHandler {
    
    inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
    inline def apply(value: ErrorHandler): Unit = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("event-target-shim/es5", "setErrorHandler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	 * The error handler.
    	 * @param error The thrown error object.
    	 */
    type ErrorHandler = js.Function1[/* error */ js.Error, Unit]
  }
  
  inline def setEventAttributeValue(target: EventTarget[Any, Any], `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEventAttributeValue")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setEventAttributeValue(target: EventTarget[Any, Any], `type`: String, callback: CallbackFunction[Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEventAttributeValue")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object setWarningHandler {
    
    inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
    inline def apply(value: WarningHandler): Unit = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("event-target-shim/es5", "setWarningHandler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	 * The warning information.
    	 */
    trait Warning extends StObject {
      
      /**
      		 * The arguments for replacing placeholders in the text.
      		 */
      var args: js.Array[Any]
      
      /**
      		 * The code of this warning.
      		 */
      var code: String
      
      /**
      		 * The message in English.
      		 */
      var message: String
    }
    object Warning {
      
      inline def apply(args: js.Array[Any], code: String, message: String): Warning = {
        val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
        __obj.asInstanceOf[Warning]
      }
      
      extension [Self <: Warning](x: Self) {
        
        inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
        
        inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      }
    }
    
    /**
    	 * The warning handler.
    	 * @param warning The warning.
    	 */
    type WarningHandler = js.Function1[/* warning */ Warning, Unit]
  }
}
