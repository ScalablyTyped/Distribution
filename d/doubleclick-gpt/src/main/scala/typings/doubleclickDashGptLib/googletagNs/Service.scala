package typings
package doubleclickDashGptLib.googletagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  def addEventListener(
    eventType: java.lang.String,
    listener: js.Function1[/* event */ doubleclickDashGptLib.googletagNs.eventsNs.Event, scala.Unit]
  ): Service = js.native
  @JSName("addEventListener")
  def addEventListener_slotRenderEnded(
    eventType: doubleclickDashGptLib.doubleclickDashGptLibStrings.slotRenderEnded,
    listener: js.Function1[
      /* event */ doubleclickDashGptLib.googletagNs.eventsNs.SlotRenderEndedEvent, 
      scala.Unit
    ]
  ): Service = js.native
  @JSName("addEventListener")
  def addEventListener_slotRequested(
    eventType: doubleclickDashGptLib.doubleclickDashGptLibStrings.slotRequested,
    listener: js.Function1[
      /* event */ doubleclickDashGptLib.googletagNs.eventsNs.SlotRequestedEvent, 
      scala.Unit
    ]
  ): Service = js.native
  @JSName("addEventListener")
  def addEventListener_slotResponseReceived(
    eventType: doubleclickDashGptLib.doubleclickDashGptLibStrings.slotResponseReceived,
    listener: js.Function1[
      /* event */ doubleclickDashGptLib.googletagNs.eventsNs.SlotResponseReceived, 
      scala.Unit
    ]
  ): Service = js.native
  @JSName("addEventListener")
  def addEventListener_slotVisibilityChanged(
    eventType: doubleclickDashGptLib.doubleclickDashGptLibStrings.slotVisibilityChanged,
    listener: js.Function1[
      /* event */ doubleclickDashGptLib.googletagNs.eventsNs.SlotVisibilityChangedEvent, 
      scala.Unit
    ]
  ): Service = js.native
  def getSlots(): js.Array[Slot] = js.native
}

