package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEvent extends js.Object {
  var cancel: scala.Boolean
  var `type`: java.lang.String
}

object BaseEvent {
  @scala.inline
  def apply(cancel: scala.Boolean, `type`: java.lang.String): BaseEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("cancel")(cancel)
    __obj.asInstanceOf[BaseEvent]
  }
}

