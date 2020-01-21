package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTriggerEvent extends js.Object {
  var listen: js.UndefOr[String] = js.undefined
}

object EventTriggerEvent {
  @scala.inline
  def apply(listen: String = null): EventTriggerEvent = {
    val __obj = js.Dynamic.literal()
    if (listen != null) __obj.updateDynamic("listen")(listen.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTriggerEvent]
  }
}

