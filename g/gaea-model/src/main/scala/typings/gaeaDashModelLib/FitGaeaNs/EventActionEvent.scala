package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventActionEvent extends js.Object {
  var emit: js.UndefOr[java.lang.String] = js.undefined
}

object EventActionEvent {
  @scala.inline
  def apply(emit: java.lang.String = null): EventActionEvent = {
    val __obj = js.Dynamic.literal()
    if (emit != null) __obj.updateDynamic("emit")(emit)
    __obj.asInstanceOf[EventActionEvent]
  }
}

