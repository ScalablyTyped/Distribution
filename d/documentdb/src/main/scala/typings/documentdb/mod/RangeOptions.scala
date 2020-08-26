package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeOptions extends js.Object {
  /** The high value in the range. */
  var high: js.Any = js.native
  /** The low value in the range. */
  var low: js.Any = js.native
}

object RangeOptions {
  @scala.inline
  def apply(high: js.Any, low: js.Any): RangeOptions = {
    val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeOptions]
  }
  @scala.inline
  implicit class RangeOptionsOps[Self <: RangeOptions] (val x: Self) extends AnyVal {
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
    def setHigh(value: js.Any): Self = this.set("high", value.asInstanceOf[js.Any])
    @scala.inline
    def setLow(value: js.Any): Self = this.set("low", value.asInstanceOf[js.Any])
  }
  
}

