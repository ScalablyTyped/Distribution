package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0AnonSymbolRotate extends js.Object {
  /**
    * Data of the starting point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.markLine.data.0
    */
  var `0`: js.UndefOr[AnonSymbolRotate] = js.undefined
  /**
    * Data of the ending point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.markLine.data.1
    */
  var `1`: js.UndefOr[AnonSymbolRotate] = js.undefined
}

object Anon0AnonSymbolRotate {
  @scala.inline
  def apply(`0`: AnonSymbolRotate = null, `1`: AnonSymbolRotate = null): Anon0AnonSymbolRotate = {
    val __obj = js.Dynamic.literal()
    if (`0` != null) __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    if (`1` != null) __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0AnonSymbolRotate]
  }
}

