package typings.easyXapi.mod

import typings.easyXapi.AnonLevel
import typings.express.mod.Application_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var log: AnonLevel
  var name: String
  var port: Double
  var root: String
  var xHeaderDefaults: js.UndefOr[js.Object] = js.undefined
  def mount(app: Application_): Unit
}

object Config {
  @scala.inline
  def apply(
    log: AnonLevel,
    mount: Application_ => Unit,
    name: String,
    port: Double,
    root: String,
    xHeaderDefaults: js.Object = null
  ): Config = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any], mount = js.Any.fromFunction1(mount), name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    if (xHeaderDefaults != null) __obj.updateDynamic("xHeaderDefaults")(xHeaderDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

