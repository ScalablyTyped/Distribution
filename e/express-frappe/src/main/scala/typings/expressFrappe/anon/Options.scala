package typings.expressFrappe.anon

import typings.serveStatic.mod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var options: js.UndefOr[ServeStaticOptions] = js.undefined
  var root: String
}

object Options {
  @scala.inline
  def apply(root: String, options: ServeStaticOptions = null): Options = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

