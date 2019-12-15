package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01AnonCoordLabelLineStyleName extends js.Object {
  /**
    * Data of the starting point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.markLine.data.0
    */
  var `0`: js.UndefOr[Anon_CoordLabelLineStyleName] = js.undefined
  /**
    * Data of the ending point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.markLine.data.1
    */
  var `1`: js.UndefOr[Anon_CoordLabelLineStyleName] = js.undefined
}

object Anon_01AnonCoordLabelLineStyleName {
  @scala.inline
  def apply(`0`: Anon_CoordLabelLineStyleName = null, `1`: Anon_CoordLabelLineStyleName = null): Anon_01AnonCoordLabelLineStyleName = {
    val __obj = js.Dynamic.literal()
    if (`0` != null) __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    if (`1` != null) __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_01AnonCoordLabelLineStyleName]
  }
}

