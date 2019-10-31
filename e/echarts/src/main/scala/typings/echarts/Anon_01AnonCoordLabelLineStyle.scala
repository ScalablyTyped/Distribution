package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01AnonCoordLabelLineStyle extends js.Object {
  /**
    * Data of the starting point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.data.0
    */
  var `0`: js.UndefOr[Anon_CoordLabelLineStyle] = js.undefined
  /**
    * Data of the ending point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.data.1
    */
  var `1`: js.UndefOr[Anon_CoordLabelLineStyle] = js.undefined
}

object Anon_01AnonCoordLabelLineStyle {
  @scala.inline
  def apply(`0`: Anon_CoordLabelLineStyle = null, `1`: Anon_CoordLabelLineStyle = null): Anon_01AnonCoordLabelLineStyle = {
    val __obj = js.Dynamic.literal()
    if (`0` != null) __obj.updateDynamic("0")(`0`)
    if (`1` != null) __obj.updateDynamic("1")(`1`)
    __obj.asInstanceOf[Anon_01AnonCoordLabelLineStyle]
  }
}

