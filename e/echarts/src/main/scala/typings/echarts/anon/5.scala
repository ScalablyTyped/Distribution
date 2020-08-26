package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `5` extends js.Object {
  /**
    * Data of the starting point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.0
    */
  var `0`: js.UndefOr[SymbolOffset] = js.native
  /**
    * Data of the ending point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine.data.1
    */
  var `1`: js.UndefOr[SymbolOffset] = js.native
}

object `5` {
  @scala.inline
  def apply(): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`]
  }
  @scala.inline
  implicit class `5Ops`[Self <: `5`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set0(value: SymbolOffset): Self = this.set("0", value.asInstanceOf[js.Any])
    @scala.inline
    def delete0: Self = this.set("0", js.undefined)
    @scala.inline
    def set1(value: SymbolOffset): Self = this.set("1", value.asInstanceOf[js.Any])
    @scala.inline
    def delete1: Self = this.set("1", js.undefined)
  }
  
}

