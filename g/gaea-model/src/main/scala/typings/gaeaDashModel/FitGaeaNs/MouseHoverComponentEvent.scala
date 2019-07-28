package typings.gaeaDashModel.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseHoverComponentEvent extends js.Object {
  var mapUniqueKey: String
  var `type`: String
}

object MouseHoverComponentEvent {
  @scala.inline
  def apply(mapUniqueKey: String, `type`: String): MouseHoverComponentEvent = {
    val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MouseHoverComponentEvent]
  }
}

