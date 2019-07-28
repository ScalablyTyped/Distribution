package typings.easyDashXapi.easyDashXapiMod

import typings.easyDashXapi.Anon_Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitConfig extends js.Object {
  var jSend: js.UndefOr[Anon_Partial] = js.undefined
}

object InitConfig {
  @scala.inline
  def apply(jSend: Anon_Partial = null): InitConfig = {
    val __obj = js.Dynamic.literal()
    if (jSend != null) __obj.updateDynamic("jSend")(jSend)
    __obj.asInstanceOf[InitConfig]
  }
}

