package typings.gaeaDashModel.FitGaeaNs

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
    val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey, selected = selected)
  
    __obj.asInstanceOf[ComponentSelectStatusEvent]
  }
}

