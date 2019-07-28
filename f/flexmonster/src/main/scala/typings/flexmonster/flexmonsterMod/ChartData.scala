package typings.flexmonster.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartData extends js.Object {
  var columnTuple: js.UndefOr[js.Array[Double]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var measure: js.UndefOr[MeasureObject] = js.undefined
  var rawTuple: js.UndefOr[js.Array[Double]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object ChartData {
  @scala.inline
  def apply(
    columnTuple: js.Array[Double] = null,
    id: String = null,
    label: String = null,
    measure: MeasureObject = null,
    rawTuple: js.Array[Double] = null,
    value: Int | Double = null
  ): ChartData = {
    val __obj = js.Dynamic.literal()
    if (columnTuple != null) __obj.updateDynamic("columnTuple")(columnTuple)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (measure != null) __obj.updateDynamic("measure")(measure)
    if (rawTuple != null) __obj.updateDynamic("rawTuple")(rawTuple)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartData]
  }
}

