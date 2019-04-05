package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaDataDataTableCols extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object GaDataDataTableCols {
  @scala.inline
  def apply(id: java.lang.String = null, label: java.lang.String = null, `type`: java.lang.String = null): GaDataDataTableCols = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GaDataDataTableCols]
  }
}

