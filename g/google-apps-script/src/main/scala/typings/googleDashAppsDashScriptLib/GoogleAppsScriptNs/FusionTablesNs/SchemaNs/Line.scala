package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  var coordinates: js.UndefOr[js.Array[js.Array[stdLib.Number]]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Line {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[stdLib.Number]] = null, `type`: java.lang.String = null): Line = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Line]
  }
}

