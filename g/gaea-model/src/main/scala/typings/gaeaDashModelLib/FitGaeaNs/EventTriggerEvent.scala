package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTriggerEvent extends js.Object {
  var listen: js.UndefOr[java.lang.String] = js.undefined
}

object EventTriggerEvent {
  @scala.inline
  def apply(listen: java.lang.String = null): EventTriggerEvent = {
    val __obj = js.Dynamic.literal()
    if (listen != null) __obj.updateDynamic("listen")(listen)
    __obj.asInstanceOf[EventTriggerEvent]
  }
}

