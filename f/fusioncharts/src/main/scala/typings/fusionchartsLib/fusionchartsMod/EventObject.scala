package typings
package fusionchartsLib.fusionchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventObject extends js.Object {
  var cancelled: scala.Boolean
  var detached: scala.Boolean
  var eventId: scala.Double
  var prevented: scala.Boolean
  var sender: FusionCharts
  var `type`: java.lang.String
  def detachHandler(): scala.Unit
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}

object EventObject {
  @scala.inline
  def apply(
    cancelled: scala.Boolean,
    detachHandler: () => scala.Unit,
    detached: scala.Boolean,
    eventId: scala.Double,
    preventDefault: () => scala.Unit,
    prevented: scala.Boolean,
    sender: FusionCharts,
    stopPropagation: () => scala.Unit,
    `type`: java.lang.String
  ): EventObject = {
    val __obj = js.Dynamic.literal(cancelled = cancelled, detachHandler = js.Any.fromFunction0(detachHandler), detached = detached, eventId = eventId, preventDefault = js.Any.fromFunction0(preventDefault), prevented = prevented, sender = sender, stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EventObject]
  }
}

