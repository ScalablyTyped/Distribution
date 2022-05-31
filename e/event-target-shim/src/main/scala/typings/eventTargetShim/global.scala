package typings.eventTargetShim

import typings.eventTargetShim.anon.EventTargetloose
import typings.eventTargetShim.mod.EventTarget.EventDefinition
import typings.eventTargetShim.mod.EventTarget.Mode
import typings.eventTargetShim.mod.EventTargetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* Inlined event-target-shim.event-target-shim.EventTargetConstructor<{}, {}, 'loose'> & {new <TEvents extends event-target-shim.event-target-shim.EventTarget.EventDefinition, TEventAttributes extends event-target-shim.event-target-shim.EventTarget.EventDefinition, TMode extends event-target-shim.event-target-shim.EventTarget.Mode = 'loose'>(): event-target-shim.event-target-shim.EventTarget<TEvents, TEventAttributes, TMode>, None <TEvents extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TEventAttributes extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TMode extends event-target-shim.event-target-shim.EventTarget.Mode = 'loose'>(events : std.Array<string>): event-target-shim.event-target-shim.EventTargetConstructor<TEvents, TEventAttributes, TMode>, None <TEvents extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TEventAttributes extends event-target-shim.event-target-shim.EventTarget.EventDefinition = {}, TMode extends event-target-shim.event-target-shim.EventTarget.Mode = 'loose'>(event0 : string, events : ...string): event-target-shim.event-target-shim.EventTargetConstructor<TEvents, TEventAttributes, TMode>} */
  object EventTargetShim {
    
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
    @JSGlobal("EventTargetShim")
    @js.native
    class ^ ()
      extends StObject
         with EventTargetloose
    
    @JSGlobal("EventTargetShim")
    @js.native
    val ^ : js.Any = js.native
  }
}
