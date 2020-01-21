package typings.easyXapi.mod

import typings.easyXapi.AnonPartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitConfig extends js.Object {
  var jSend: js.UndefOr[AnonPartial] = js.undefined
}

object InitConfig {
  @scala.inline
  def apply(jSend: AnonPartial = null): InitConfig = {
    val __obj = js.Dynamic.literal()
    if (jSend != null) __obj.updateDynamic("jSend")(jSend.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitConfig]
  }
}

