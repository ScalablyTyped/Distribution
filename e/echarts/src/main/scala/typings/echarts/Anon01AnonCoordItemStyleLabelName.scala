package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon01AnonCoordItemStyleLabelName extends js.Object {
  /**
    * Specify the left-top point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.markArea.data.0
    */
  var `0`: js.UndefOr[AnonCoordItemStyleLabelName] = js.undefined
  /**
    * Specify the right-bottom point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.markArea.data.1
    */
  var `1`: js.UndefOr[AnonCoordItemStyleLabelName] = js.undefined
}

object Anon01AnonCoordItemStyleLabelName {
  @scala.inline
  def apply(`0`: AnonCoordItemStyleLabelName = null, `1`: AnonCoordItemStyleLabelName = null): Anon01AnonCoordItemStyleLabelName = {
    val __obj = js.Dynamic.literal()
    if (`0` != null) __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    if (`1` != null) __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon01AnonCoordItemStyleLabelName]
  }
}

