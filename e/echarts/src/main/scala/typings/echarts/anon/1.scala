package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  /**
    * Specify the left-top point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.0
    */
  var `0`: js.UndefOr[Name] = js.undefined
  /**
    * Specify the right-bottom point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1
    */
  var `1`: js.UndefOr[Name] = js.undefined
}

object `1` {
  @scala.inline
  def apply(`0`: Name = null, `1`: Name = null): `1` = {
    val __obj = js.Dynamic.literal()
    if (`0` != null) __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    if (`1` != null) __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

