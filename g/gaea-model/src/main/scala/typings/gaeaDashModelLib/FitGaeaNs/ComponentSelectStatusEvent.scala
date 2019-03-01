package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentSelectStatusEvent extends js.Object {
  var mapUniqueKey: java.lang.String
  var selected: scala.Boolean
}

object ComponentSelectStatusEvent {
  @scala.inline
  def apply(mapUniqueKey: java.lang.String, selected: scala.Boolean): ComponentSelectStatusEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mapUniqueKey")(mapUniqueKey)
    __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[ComponentSelectStatusEvent]
  }
}

