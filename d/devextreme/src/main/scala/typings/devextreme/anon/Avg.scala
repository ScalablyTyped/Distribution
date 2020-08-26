package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Avg extends js.Object {
  var avg: js.UndefOr[String] = js.native
  var avgOtherColumn: js.UndefOr[String] = js.native
  var count: js.UndefOr[String] = js.native
  var max: js.UndefOr[String] = js.native
  var maxOtherColumn: js.UndefOr[String] = js.native
  var min: js.UndefOr[String] = js.native
  var minOtherColumn: js.UndefOr[String] = js.native
  var sum: js.UndefOr[String] = js.native
  var sumOtherColumn: js.UndefOr[String] = js.native
}

object Avg {
  @scala.inline
  def apply(): Avg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Avg]
  }
  @scala.inline
  implicit class AvgOps[Self <: Avg] (val x: Self) extends AnyVal {
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
    def setAvg(value: String): Self = this.set("avg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvg: Self = this.set("avg", js.undefined)
    @scala.inline
    def setAvgOtherColumn(value: String): Self = this.set("avgOtherColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvgOtherColumn: Self = this.set("avgOtherColumn", js.undefined)
    @scala.inline
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxOtherColumn(value: String): Self = this.set("maxOtherColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxOtherColumn: Self = this.set("maxOtherColumn", js.undefined)
    @scala.inline
    def setMin(value: String): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinOtherColumn(value: String): Self = this.set("minOtherColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinOtherColumn: Self = this.set("minOtherColumn", js.undefined)
    @scala.inline
    def setSum(value: String): Self = this.set("sum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSum: Self = this.set("sum", js.undefined)
    @scala.inline
    def setSumOtherColumn(value: String): Self = this.set("sumOtherColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSumOtherColumn: Self = this.set("sumOtherColumn", js.undefined)
  }
  
}

