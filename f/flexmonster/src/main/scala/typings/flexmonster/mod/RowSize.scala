package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowSize extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var idx: js.UndefOr[Double] = js.undefined
  var measure: js.UndefOr[MeasureObject] = js.undefined
  var tuple: js.UndefOr[js.Array[String]] = js.undefined
}

object RowSize {
  @scala.inline
  def apply(
    height: Int | Double = null,
    idx: Int | Double = null,
    measure: MeasureObject = null,
    tuple: js.Array[String] = null
  ): RowSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (idx != null) __obj.updateDynamic("idx")(idx.asInstanceOf[js.Any])
    if (measure != null) __obj.updateDynamic("measure")(measure.asInstanceOf[js.Any])
    if (tuple != null) __obj.updateDynamic("tuple")(tuple.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSize]
  }
}

