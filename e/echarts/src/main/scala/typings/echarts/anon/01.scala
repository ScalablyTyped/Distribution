package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `01` extends js.Object {
  /**
    * Data of the starting point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.0
    */
  var `0`: js.UndefOr[Symbol] = js.undefined
  /**
    * Data of the ending point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.1
    */
  var `1`: js.UndefOr[Symbol] = js.undefined
}

object `01` {
  @scala.inline
  def apply(`0`: Symbol = null, `1`: Symbol = null): `01` = {
    val __obj = js.Dynamic.literal()
    if (`0` != null) __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    if (`1` != null) __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`01`]
  }
}

