package typings
package easyDashXapiLib.easyDashXapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var log: easyDashXapiLib.Anon_Level
  var name: java.lang.String
  var port: scala.Double
  var root: java.lang.String
  var xHeaderDefaults: js.UndefOr[js.Object] = js.undefined
  def mount(app: expressLib.expressMod.eNs.Application): scala.Unit
}

object Config {
  @scala.inline
  def apply(
    log: easyDashXapiLib.Anon_Level,
    mount: js.Function1[expressLib.expressMod.eNs.Application, scala.Unit],
    name: java.lang.String,
    port: scala.Double,
    root: java.lang.String,
    xHeaderDefaults: js.Object = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("mount")(mount)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("root")(root)
    if (xHeaderDefaults != null) __obj.updateDynamic("xHeaderDefaults")(xHeaderDefaults)
    __obj.asInstanceOf[Config]
  }
}

