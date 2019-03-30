package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterView extends js.Object {
  var criteria: js.UndefOr[js.Object] = js.undefined
  var filterViewId: js.UndefOr[scala.Double] = js.undefined
  var namedRangeId: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[GridRange] = js.undefined
  var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object FilterView {
  @scala.inline
  def apply(
    criteria: js.Object = null,
    filterViewId: scala.Int | scala.Double = null,
    namedRangeId: java.lang.String = null,
    range: GridRange = null,
    sortSpecs: js.Array[SortSpec] = null,
    title: java.lang.String = null
  ): FilterView = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria)
    if (filterViewId != null) __obj.updateDynamic("filterViewId")(filterViewId.asInstanceOf[js.Any])
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId)
    if (range != null) __obj.updateDynamic("range")(range)
    if (sortSpecs != null) __obj.updateDynamic("sortSpecs")(sortSpecs)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[FilterView]
  }
}

