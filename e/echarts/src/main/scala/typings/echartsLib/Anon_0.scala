package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  /**
    * Data of the starting point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data.0
    */
  var `0`: js.UndefOr[Anon_CoordLabel] = js.undefined
  /**
    * Data of the ending point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine.data.1
    */
  var `1`: js.UndefOr[Anon_CoordLabel] = js.undefined
}

object Anon_0 {
  @scala.inline
  def apply(`0`: Anon_CoordLabel = null, `1`: Anon_CoordLabel = null): Anon_0 = {
    val __obj = js.Dynamic.literal()
    if (`0` != null) __obj.updateDynamic("0")(`0`)
    if (`1` != null) __obj.updateDynamic("1")(`1`)
    __obj.asInstanceOf[Anon_0]
  }
}

