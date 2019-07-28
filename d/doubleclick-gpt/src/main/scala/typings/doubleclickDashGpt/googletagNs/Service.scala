package typings.doubleclickDashGpt.googletagNs

import typings.doubleclickDashGpt.doubleclickDashGptStrings.slotRenderEnded
import typings.doubleclickDashGpt.doubleclickDashGptStrings.slotRequested
import typings.doubleclickDashGpt.doubleclickDashGptStrings.slotResponseReceived
import typings.doubleclickDashGpt.doubleclickDashGptStrings.slotVisibilityChanged
import typings.doubleclickDashGpt.googletagNs.eventsNs.Event
import typings.doubleclickDashGpt.googletagNs.eventsNs.SlotRenderEndedEvent
import typings.doubleclickDashGpt.googletagNs.eventsNs.SlotRequestedEvent
import typings.doubleclickDashGpt.googletagNs.eventsNs.SlotResponseReceived
import typings.doubleclickDashGpt.googletagNs.eventsNs.SlotVisibilityChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

