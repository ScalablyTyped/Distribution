package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortSpec extends js.Object {
  var dimensionIndex: js.UndefOr[scala.Double] = js.undefined
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
}

object SortSpec {
  @scala.inline
  def apply(dimensionIndex: scala.Int | scala.Double = null, sortOrder: java.lang.String = null): SortSpec = {
    val __obj = js.Dynamic.literal()
    if (dimensionIndex != null) __obj.updateDynamic("dimensionIndex")(dimensionIndex.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    __obj.asInstanceOf[SortSpec]
  }
}

