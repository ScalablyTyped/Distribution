package typings.easyXapi.mod

import typings.easyXapi.anon.Level
import typings.express.mod.Application_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var log: Level = js.native
  var name: String = js.native
  var port: Double = js.native
  var root: String = js.native
  var xHeaderDefaults: js.UndefOr[js.Object] = js.native
  def mount(app: Application_): Unit = js.native
}

object Config {
  @scala.inline
  def apply(log: Level, mount: Application_ => Unit, name: String, port: Double, root: String): Config = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any], mount = js.Any.fromFunction1(mount), name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLog(value: Level): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def setMount(value: Application_ => Unit): Self = this.set("mount", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setXHeaderDefaults(value: js.Object): Self = this.set("xHeaderDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXHeaderDefaults: Self = this.set("xHeaderDefaults", js.undefined)
  }
  
}

