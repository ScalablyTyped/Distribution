package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentSelectStatusEvent extends js.Object {
  var mapUniqueKey: String
  var selected: Boolean
}

object ComponentSelectStatusEvent {
  @scala.inline
  def apply(mapUniqueKey: String, selected: Boolean): ComponentSelectStatusEvent = {
    val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentSelectStatusEvent]
  }
}

