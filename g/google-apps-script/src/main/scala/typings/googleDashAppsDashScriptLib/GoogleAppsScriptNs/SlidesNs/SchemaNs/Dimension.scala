package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension extends js.Object {
  var magnitude: js.UndefOr[stdLib.Number] = js.undefined
  var unit: js.UndefOr[java.lang.String] = js.undefined
}

object Dimension {
  @scala.inline
  def apply(magnitude: stdLib.Number = null, unit: java.lang.String = null): Dimension = {
    val __obj = js.Dynamic.literal()
    if (magnitude != null) __obj.updateDynamic("magnitude")(magnitude)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[Dimension]
  }
}

