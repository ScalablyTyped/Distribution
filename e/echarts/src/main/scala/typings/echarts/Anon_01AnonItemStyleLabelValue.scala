package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01AnonItemStyleLabelValue extends js.Object {
  /**
    * Specify the left-top point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.markArea.data.0
    */
  var `0`: js.UndefOr[Anon_ItemStyleLabelValue] = js.undefined
  /**
    * Specify the right-bottom point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.markArea.data.1
    */
  var `1`: js.UndefOr[Anon_ItemStyleLabelValue] = js.undefined
}

object Anon_01AnonItemStyleLabelValue {
  @scala.inline
  def apply(`0`: Anon_ItemStyleLabelValue = null, `1`: Anon_ItemStyleLabelValue = null): Anon_01AnonItemStyleLabelValue = {
    val __obj = js.Dynamic.literal()
    if (`0` != null) __obj.updateDynamic("0")(`0`)
    if (`1` != null) __obj.updateDynamic("1")(`1`)
    __obj.asInstanceOf[Anon_01AnonItemStyleLabelValue]
  }
}

