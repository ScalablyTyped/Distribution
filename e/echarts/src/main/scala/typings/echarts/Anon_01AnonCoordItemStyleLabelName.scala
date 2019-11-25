package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01AnonCoordItemStyleLabelName extends js.Object {
  /**
    * Specify the left-top point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.markArea.data.0
    */
  var `0`: js.UndefOr[Anon_CoordItemStyleLabelName] = js.undefined
  /**
    * Specify the right-bottom point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.markArea.data.1
    */
  var `1`: js.UndefOr[Anon_CoordItemStyleLabelName] = js.undefined
}

object Anon_01AnonCoordItemStyleLabelName {
  @scala.inline
  def apply(`0`: Anon_CoordItemStyleLabelName = null, `1`: Anon_CoordItemStyleLabelName = null): Anon_01AnonCoordItemStyleLabelName = {
    val __obj = js.Dynamic.literal()
    if (`0` != null) __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    if (`1` != null) __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_01AnonCoordItemStyleLabelName]
  }
}

