package typings.expressDashFrappe

import typings.serveDashStatic.serveDashStaticMod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: js.UndefOr[ServeStaticOptions] = js.undefined
  var root: String
}

object Anon_Options {
  @scala.inline
  def apply(root: String, options: ServeStaticOptions = null): Anon_Options = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Options]
  }
}

