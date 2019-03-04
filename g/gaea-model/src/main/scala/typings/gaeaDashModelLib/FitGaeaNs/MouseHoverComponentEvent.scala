package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseHoverComponentEvent extends js.Object {
  var mapUniqueKey: java.lang.String
  var `type`: java.lang.String
}

object MouseHoverComponentEvent {
  @scala.inline
  def apply(mapUniqueKey: java.lang.String, `type`: java.lang.String): MouseHoverComponentEvent = {
    val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MouseHoverComponentEvent]
  }
}

