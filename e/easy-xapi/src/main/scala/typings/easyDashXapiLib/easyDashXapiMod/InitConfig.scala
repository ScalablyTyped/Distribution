package typings
package easyDashXapiLib.easyDashXapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitConfig extends js.Object {
  var jSend: js.UndefOr[easyDashXapiLib.Anon_Partial] = js.undefined
}

object InitConfig {
  @scala.inline
  def apply(jSend: easyDashXapiLib.Anon_Partial = null): InitConfig = {
    val __obj = js.Dynamic.literal()
    if (jSend != null) __obj.updateDynamic("jSend")(jSend)
    __obj.asInstanceOf[InitConfig]
  }
}

