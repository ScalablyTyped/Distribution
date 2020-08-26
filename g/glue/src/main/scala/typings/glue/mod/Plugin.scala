package typings.glue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  var options: js.UndefOr[js.Any] = js.native
  var plugin: String | typings.glue.anon.Options = js.native
  var routes: js.UndefOr[js.Any] = js.native
}

object Plugin {
  @scala.inline
  def apply(plugin: String | typings.glue.anon.Options): Plugin = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
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
    def setPlugin(value: String | typings.glue.anon.Options): Self = this.set("plugin", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setRoutes(value: js.Any): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
  }
  
}

