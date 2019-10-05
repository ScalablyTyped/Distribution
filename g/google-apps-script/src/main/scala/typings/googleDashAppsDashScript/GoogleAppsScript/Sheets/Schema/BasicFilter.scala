package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicFilter extends js.Object {
  var criteria: js.UndefOr[js.Object] = js.undefined
  var range: js.UndefOr[GridRange] = js.undefined
  var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.undefined
}

object BasicFilter {
  @scala.inline
  def apply(criteria: js.Object = null, range: GridRange = null, sortSpecs: js.Array[SortSpec] = null): BasicFilter = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria)
    if (range != null) __obj.updateDynamic("range")(range)
    if (sortSpecs != null) __obj.updateDynamic("sortSpecs")(sortSpecs)
    __obj.asInstanceOf[BasicFilter]
  }
}

