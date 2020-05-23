package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnSize extends js.Object {
  var idx: js.UndefOr[Double] = js.undefined
  var measure: js.UndefOr[MeasureObject] = js.undefined
  var tuple: js.UndefOr[js.Array[String]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ColumnSize {
  @scala.inline
  def apply(
    idx: js.UndefOr[Double] = js.undefined,
    measure: MeasureObject = null,
    tuple: js.Array[String] = null,
    width: js.UndefOr[Double] = js.undefined
  ): ColumnSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(idx)) __obj.updateDynamic("idx")(idx.get.asInstanceOf[js.Any])
    if (measure != null) __obj.updateDynamic("measure")(measure.asInstanceOf[js.Any])
    if (tuple != null) __obj.updateDynamic("tuple")(tuple.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSize]
  }
}

