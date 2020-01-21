package typings.fusioncharts.mod

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
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], detachHandler = js.Any.fromFunction0(detachHandler), detached = detached.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), prevented = prevented.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObject]
  }
}

