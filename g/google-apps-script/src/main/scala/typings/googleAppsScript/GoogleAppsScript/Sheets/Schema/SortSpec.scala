package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortSpec extends js.Object {
  var dimensionIndex: js.UndefOr[Double] = js.undefined
  var sortOrder: js.UndefOr[String] = js.undefined
}

object SortSpec {
  @scala.inline
  def apply(dimensionIndex: js.UndefOr[Double] = js.undefined, sortOrder: String = null): SortSpec = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dimensionIndex)) __obj.updateDynamic("dimensionIndex")(dimensionIndex.get.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortSpec]
  }
}

