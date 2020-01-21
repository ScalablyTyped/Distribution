package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortSpec extends js.Object {
  /**
    * The background fill color to sort by. Mutually exclusive with sorting by
    * text color. Requests to set this field will fail with a 400 error if
    * foreground color is also set.
    */
  var backgroundColor: js.UndefOr[Color] = js.undefined
  /** The dimension the sort should be applied to. */
  var dimensionIndex: js.UndefOr[Double] = js.undefined
  /**
    * The text color to sort by. Mutually exclusive with sorting by background
    * fill color. Requests to set this field will fail with a 400 error if
    * background color is also set.
    */
  var foregroundColor: js.UndefOr[Color] = js.undefined
  /** The order data should be sorted. */
  var sortOrder: js.UndefOr[String] = js.undefined
}

object SortSpec {
  @scala.inline
  def apply(
    backgroundColor: Color = null,
    dimensionIndex: Int | Double = null,
    foregroundColor: Color = null,
    sortOrder: String = null
  ): SortSpec = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (dimensionIndex != null) __obj.updateDynamic("dimensionIndex")(dimensionIndex.asInstanceOf[js.Any])
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortSpec]
  }
}

