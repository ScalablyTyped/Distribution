package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataCollection extends js.Object {
  var Columns: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs.MetadataNs.ColumnsCollection
  ] = js.undefined
}

object MetadataCollection {
  @scala.inline
  def apply(
    Columns: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs.MetadataNs.ColumnsCollection = null
  ): MetadataCollection = {
    val __obj = js.Dynamic.literal()
    if (Columns != null) __obj.updateDynamic("Columns")(Columns)
    __obj.asInstanceOf[MetadataCollection]
  }
}

