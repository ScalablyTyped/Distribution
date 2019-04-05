package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry extends js.Object {
  var geometries: js.UndefOr[js.Array[js.Object]] = js.undefined
  var geometry: js.UndefOr[js.Object] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Geometry {
  @scala.inline
  def apply(
    geometries: js.Array[js.Object] = null,
    geometry: js.Object = null,
    `type`: java.lang.String = null
  ): Geometry = {
    val __obj = js.Dynamic.literal()
    if (geometries != null) __obj.updateDynamic("geometries")(geometries)
    if (geometry != null) __obj.updateDynamic("geometry")(geometry)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Geometry]
  }
}

