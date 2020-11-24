package typings.doubleclickGpt.googletag

import typings.doubleclickGpt.doubleclickGptStrings.slotRenderEnded
import typings.doubleclickGpt.doubleclickGptStrings.slotRequested
import typings.doubleclickGpt.doubleclickGptStrings.slotResponseReceived
import typings.doubleclickGpt.doubleclickGptStrings.slotVisibilityChanged
import typings.doubleclickGpt.googletag.events.Event
import typings.doubleclickGpt.googletag.events.SlotRenderEndedEvent
import typings.doubleclickGpt.googletag.events.SlotRequestedEvent
import typings.doubleclickGpt.googletag.events.SlotResponseReceived
import typings.doubleclickGpt.googletag.events.SlotVisibilityChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Service extends js.Object {
  
  def addEventListener(eventType: String, listener: js.Function1[/* event */ Event, Unit]): Service = js.native
  @JSName("addEventListener")
  def addEventListener_slotRenderEnded(eventType: slotRenderEnded, listener: js.Function1[/* event */ SlotRenderEndedEvent, Unit]): Service = js.native
  @JSName("addEventListener")
  def addEventListener_slotRequested(eventType: slotRequested, listener: js.Function1[/* event */ SlotRequestedEvent, Unit]): Service = js.native
  @JSName("addEventListener")
  def addEventListener_slotResponseReceived(eventType: slotResponseReceived, listener: js.Function1[/* event */ SlotResponseReceived, Unit]): Service = js.native
  @JSName("addEventListener")
  def addEventListener_slotVisibilityChanged(
    eventType: slotVisibilityChanged,
    listener: js.Function1[/* event */ SlotVisibilityChangedEvent, Unit]
  ): Service = js.native
  
  def getSlots(): js.Array[Slot] = js.native
}
