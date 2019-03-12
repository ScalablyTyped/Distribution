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
    mount: expressLib.expressMod.eNs.Application => scala.Unit,
    name: java.lang.String,
    port: scala.Double,
    root: java.lang.String,
    xHeaderDefaults: js.Object = null
  ): Config = {
    val __obj = js.Dynamic.literal(log = log, mount = js.Any.fromFunction1(mount), name = name, port = port, root = root)
    if (xHeaderDefaults != null) __obj.updateDynamic("xHeaderDefaults")(xHeaderDefaults)
    __obj.asInstanceOf[Config]
  }
}

