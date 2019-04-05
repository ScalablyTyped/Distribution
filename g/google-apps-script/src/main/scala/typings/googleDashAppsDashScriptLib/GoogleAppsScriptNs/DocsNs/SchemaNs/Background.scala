package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Background extends js.Object {
  var color: js.UndefOr[OptionalColor] = js.undefined
}

object Background {
  @scala.inline
  def apply(color: OptionalColor = null): Background = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[Background]
  }
}

