package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//Grid
trait GridPager extends js.Object {
  var leftControls: js.UndefOr[js.Array[_]] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var rightControls: js.UndefOr[js.Array[_]] = js.undefined
  var sizes: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object GridPager {
  @scala.inline
  def apply(
    leftControls: js.Array[_] = null,
    limit: scala.Int | scala.Double = null,
    rightControls: js.Array[_] = null,
    sizes: js.Array[scala.Double] = null
  ): GridPager = {
    val __obj = js.Dynamic.literal()
    if (leftControls != null) __obj.updateDynamic("leftControls")(leftControls)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (rightControls != null) __obj.updateDynamic("rightControls")(rightControls)
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    __obj.asInstanceOf[GridPager]
  }
}

