package typings.glue.glueMod

import typings.glue.Anon_Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var options: js.UndefOr[js.Any] = js.undefined
  var plugin: String | Anon_Options
  var routes: js.UndefOr[js.Any] = js.undefined
}

object Plugin {
  @scala.inline
  def apply(plugin: String | Anon_Options, options: js.Any = null, routes: js.Any = null): Plugin = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    if (routes != null) __obj.updateDynamic("routes")(routes)
    __obj.asInstanceOf[Plugin]
  }
}

