package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Col extends js.Object {
  var col: js.UndefOr[Double] = js.undefined
  var colspan: js.UndefOr[Double] = js.undefined
  var row: js.UndefOr[Double] = js.undefined
  var rowspan: js.UndefOr[Double] = js.undefined
  var screen: js.UndefOr[String] = js.undefined
}

object Col {
  @scala.inline
  def apply(
    col: js.UndefOr[Double] = js.undefined,
    colspan: js.UndefOr[Double] = js.undefined,
    row: js.UndefOr[Double] = js.undefined,
    rowspan: js.UndefOr[Double] = js.undefined,
    screen: String = null
  ): Col = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(col)) __obj.updateDynamic("col")(col.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colspan)) __obj.updateDynamic("colspan")(colspan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowspan)) __obj.updateDynamic("rowspan")(rowspan.get.asInstanceOf[js.Any])
    if (screen != null) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Col]
  }
}

