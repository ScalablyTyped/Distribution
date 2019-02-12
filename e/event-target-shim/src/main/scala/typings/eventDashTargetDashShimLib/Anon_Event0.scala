package typings
package eventDashTargetDashShimLib

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
org.scalablytyped.runtime.Instantiable0[
      eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTarget[
        eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventDefinition, 
        eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventDefinition, 
        eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.Mode
      ]
    ] {
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
  def apply[TEvents /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventDefinition */, TEventAttributes /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventDefinition */, TMode /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.Mode */](event0: java.lang.String, events: java.lang.String*): eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetConstructor[TEvents, TEventAttributes, TMode] = js.native
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
  def apply[TEvents /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventDefinition */, TEventAttributes /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.EventDefinition */, TMode /* <: eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs.Mode */](events: js.Array[java.lang.String]): eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetConstructor[TEvents, TEventAttributes, TMode] = js.native
}

