package typings
package flexmonsterLib.flexmonsterMod.FlexmonsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnSize extends js.Object {
  var idx: js.UndefOr[scala.Double] = js.undefined
  var measure: js.UndefOr[MeasureObject] = js.undefined
  var tuple: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ColumnSize {
  @scala.inline
  def apply(
    idx: scala.Int | scala.Double = null,
    measure: MeasureObject = null,
    tuple: js.Array[java.lang.String] = null,
    width: scala.Int | scala.Double = null
  ): ColumnSize = {
    val __obj = js.Dynamic.literal()
    if (idx != null) __obj.updateDynamic("idx")(idx.asInstanceOf[js.Any])
    if (measure != null) __obj.updateDynamic("measure")(measure)
    if (tuple != null) __obj.updateDynamic("tuple")(tuple)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSize]
  }
}

