package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  /**
    * Specify the left-top point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.0
    */
  var `0`: js.UndefOr[AnonName] = js.undefined
  /**
    * Specify the right-bottom point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1
    */
  var `1`: js.UndefOr[AnonName] = js.undefined
}

object Anon1 {
  @scala.inline
  def apply(`0`: AnonName = null, `1`: AnonName = null): Anon1 = {
    val __obj = js.Dynamic.literal()
    if (`0` != null) __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    if (`1` != null) __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

