package typings.glue.mod

import typings.glue.AnonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var options: js.UndefOr[js.Any] = js.undefined
  var plugin: String | AnonOptions
  var routes: js.UndefOr[js.Any] = js.undefined
}

object Plugin {
  @scala.inline
  def apply(plugin: String | AnonOptions, options: js.Any = null, routes: js.Any = null): Plugin = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
}

