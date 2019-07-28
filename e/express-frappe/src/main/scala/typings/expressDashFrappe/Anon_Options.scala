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
    val __obj = js.Dynamic.literal(root = root)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Options]
  }
}

