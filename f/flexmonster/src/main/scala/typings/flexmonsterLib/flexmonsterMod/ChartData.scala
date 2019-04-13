package typings
package flexmonsterLib.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartData extends js.Object {
  var columnTuple: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var measure: js.UndefOr[MeasureObject] = js.undefined
  var rawTuple: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object ChartData {
  @scala.inline
  def apply(
    columnTuple: js.Array[scala.Double] = null,
    id: java.lang.String = null,
    label: java.lang.String = null,
    measure: MeasureObject = null,
    rawTuple: js.Array[scala.Double] = null,
    value: scala.Int | scala.Double = null
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

