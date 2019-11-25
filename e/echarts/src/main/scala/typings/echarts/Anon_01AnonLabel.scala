package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01AnonLabel extends js.Object {
  /**
    * Data of the starting point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.markLine.data.0
    */
  var `0`: js.UndefOr[Anon_Label] = js.undefined
  /**
    * Data of the ending point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.markLine.data.1
    */
  var `1`: js.UndefOr[Anon_Label] = js.undefined
}

object Anon_01AnonLabel {
  @scala.inline
  def apply(`0`: Anon_Label = null, `1`: Anon_Label = null): Anon_01AnonLabel = {
    val __obj = js.Dynamic.literal()
    if (`0` != null) __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    if (`1` != null) __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_01AnonLabel]
  }
}

