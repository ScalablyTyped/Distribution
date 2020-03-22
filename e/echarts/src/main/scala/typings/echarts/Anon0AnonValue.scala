package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0AnonValue extends js.Object {
  /**
    * Specify the left-top point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markArea.data.0
    */
  var `0`: js.UndefOr[AnonValue] = js.undefined
  /**
    * Specify the right-bottom point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markArea.data.1
    */
  var `1`: js.UndefOr[AnonValue] = js.undefined
}

object Anon0AnonValue {
  @scala.inline
  def apply(`0`: AnonValue = null, `1`: AnonValue = null): Anon0AnonValue = {
    val __obj = js.Dynamic.literal()
    if (`0` != null) __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    if (`1` != null) __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0AnonValue]
  }
}

