package typings.flexmonster.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartData extends js.Object {
  var columns: js.UndefOr[js.Array[js.Object]] = js.undefined
  var element: js.Any
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var measure: js.UndefOr[MeasureObject] = js.undefined
  var rows: js.UndefOr[js.Array[js.Object]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object ChartData {
  @scala.inline
  def apply(
    element: js.Any,
    columns: js.Array[js.Object] = null,
    id: String = null,
    label: String = null,
    measure: MeasureObject = null,
    rows: js.Array[js.Object] = null,
    value: Int | Double = null
  ): ChartData = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (measure != null) __obj.updateDynamic("measure")(measure.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartData]
  }
}

