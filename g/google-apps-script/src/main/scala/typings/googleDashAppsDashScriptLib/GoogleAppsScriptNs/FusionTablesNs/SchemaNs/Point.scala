package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var coordinates: js.UndefOr[js.Array[stdLib.Number]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Point {
  @scala.inline
  def apply(coordinates: js.Array[stdLib.Number] = null, `type`: java.lang.String = null): Point = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Point]
  }
}

