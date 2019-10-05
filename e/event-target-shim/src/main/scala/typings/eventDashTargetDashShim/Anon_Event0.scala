package typings.eventDashTargetDashShim

import org.scalablytyped.runtime.Instantiable0
import typings.eventDashTargetDashShim.eventDashTargetDashShimMod.EventTarget
import typings.eventDashTargetDashShim.eventDashTargetDashShimMod.EventTarget.EventDefinition
import typings.eventDashTargetDashShim.eventDashTargetDashShimMod.EventTarget.Mode
import typings.eventDashTargetDashShim.eventDashTargetDashShimMod.EventTargetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Event0
  extends /**
  * Create an `EventTarget` instance with detailed event definition.
  *
  * The detailed event definition requires to use `defineEventAttribute()`
  * function later.
  *
  * Unfortunately, the second type parameter `TEventAttributes` was needed
  * because we cannot compute string literal types.
  *
  * @example
  * const signal = new EventTarget<{ abort: Event }, { onabort: Event }>()
  * defineEventAttribute(signal, "abort")
  */
Instantiable0[EventTarget[EventDefinition, EventDefinition, Mode]] {
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
  def apply[TEvents /* <: EventDefinition */, TEventAttributes /* <: EventDefinition */, TMode /* <: Mode */](event0: String, events: String*): EventTargetConstructor[TEvents, TEventAttributes, TMode] = js.native
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
  def apply[TEvents /* <: EventDefinition */, TEventAttributes /* <: EventDefinition */, TMode /* <: Mode */](events: js.Array[String]): EventTargetConstructor[TEvents, TEventAttributes, TMode] = js.native
}

