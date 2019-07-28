package typings.fusioncharts.fusionchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventObject extends js.Object {
  var cancelled: Boolean
  var detached: Boolean
  var eventId: Double
  var prevented: Boolean
  var sender: FusionCharts
  var `type`: String
  def detachHandler(): Unit
  def preventDefault(): Unit
  def stopPropagation(): Unit
}

object EventObject {
  @scala.inline
  def apply(
    cancelled: Boolean,
    detachHandler: () => Unit,
    detached: Boolean,
    eventId: Double,
    preventDefault: () => Unit,
    prevented: Boolean,
    sender: FusionCharts,
    stopPropagation: () => Unit,
    `type`: String
  ): EventObject = {
    val __obj = js.Dynamic.literal(cancelled = cancelled, detachHandler = js.Any.fromFunction0(detachHandler), detached = detached, eventId = eventId, preventDefault = js.Any.fromFunction0(preventDefault), prevented = prevented, sender = sender, stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EventObject]
  }
}

