package typings
package flexmonsterLib.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowSize extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var idx: js.UndefOr[scala.Double] = js.undefined
  var measure: js.UndefOr[MeasureObject] = js.undefined
  var tuple: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object RowSize {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    idx: scala.Int | scala.Double = null,
    measure: MeasureObject = null,
    tuple: js.Array[java.lang.String] = null
  ): RowSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (idx != null) __obj.updateDynamic("idx")(idx.asInstanceOf[js.Any])
    if (measure != null) __obj.updateDynamic("measure")(measure)
    if (tuple != null) __obj.updateDynamic("tuple")(tuple)
    __obj.asInstanceOf[RowSize]
  }
}

