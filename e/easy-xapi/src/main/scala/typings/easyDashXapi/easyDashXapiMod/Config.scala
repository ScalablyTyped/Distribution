package typings.easyDashXapi.easyDashXapiMod

import typings.easyDashXapi.Anon_Level
import typings.express.expressMod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var log: Anon_Level
  var name: String
  var port: Double
  var root: String
  var xHeaderDefaults: js.UndefOr[js.Object] = js.undefined
  def mount(app: Application): Unit
}

object Config {
  @scala.inline
  def apply(
    log: Anon_Level,
    mount: Application => Unit,
    name: String,
    port: Double,
    root: String,
    xHeaderDefaults: js.Object = null
  ): Config = {
    val __obj = js.Dynamic.literal(log = log, mount = js.Any.fromFunction1(mount), name = name, port = port, root = root)
    if (xHeaderDefaults != null) __obj.updateDynamic("xHeaderDefaults")(xHeaderDefaults)
    __obj.asInstanceOf[Config]
  }
}

