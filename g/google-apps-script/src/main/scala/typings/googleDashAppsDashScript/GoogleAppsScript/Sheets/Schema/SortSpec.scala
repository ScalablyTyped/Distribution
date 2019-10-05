package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortSpec extends js.Object {
  var dimensionIndex: js.UndefOr[Double] = js.undefined
  var sortOrder: js.UndefOr[String] = js.undefined
}

object SortSpec {
  @scala.inline
  def apply(dimensionIndex: Int | Double = null, sortOrder: String = null): SortSpec = {
    val __obj = js.Dynamic.literal()
    if (dimensionIndex != null) __obj.updateDynamic("dimensionIndex")(dimensionIndex.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    __obj.asInstanceOf[SortSpec]
  }
}

