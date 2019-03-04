package typings
package expressDashFrappeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: js.UndefOr[serveDashStaticLib.serveDashStaticMod.serveStaticNs.ServeStaticOptions] = js.undefined
  var root: java.lang.String
}

object Anon_Options {
  @scala.inline
  def apply(
    root: java.lang.String,
    options: serveDashStaticLib.serveDashStaticMod.serveStaticNs.ServeStaticOptions = null
  ): Anon_Options = {
    val __obj = js.Dynamic.literal(root = root)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Options]
  }
}

