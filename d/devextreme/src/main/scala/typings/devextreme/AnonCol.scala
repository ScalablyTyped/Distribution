package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCol extends js.Object {
  var col: js.UndefOr[Double] = js.undefined
  var colspan: js.UndefOr[Double] = js.undefined
  var row: js.UndefOr[Double] = js.undefined
  var rowspan: js.UndefOr[Double] = js.undefined
  var screen: js.UndefOr[String] = js.undefined
}

object AnonCol {
  @scala.inline
  def apply(
    col: Int | Double = null,
    colspan: Int | Double = null,
    row: Int | Double = null,
    rowspan: Int | Double = null,
    screen: String = null
  ): AnonCol = {
    val __obj = js.Dynamic.literal()
    if (col != null) __obj.updateDynamic("col")(col.asInstanceOf[js.Any])
    if (colspan != null) __obj.updateDynamic("colspan")(colspan.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (rowspan != null) __obj.updateDynamic("rowspan")(rowspan.asInstanceOf[js.Any])
    if (screen != null) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCol]
  }
}

