package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Col extends js.Object {
  var col: js.UndefOr[Double] = js.native
  var colspan: js.UndefOr[Double] = js.native
  var row: js.UndefOr[Double] = js.native
  var rowspan: js.UndefOr[Double] = js.native
  var screen: js.UndefOr[String] = js.native
}

object Col {
  @scala.inline
  def apply(): Col = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Col]
  }
  @scala.inline
  implicit class ColOps[Self <: Col] (val x: Self) extends AnyVal {
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
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCol: Self = this.set("col", js.undefined)
    @scala.inline
    def setColspan(value: Double): Self = this.set("colspan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColspan: Self = this.set("colspan", js.undefined)
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    @scala.inline
    def setRowspan(value: Double): Self = this.set("rowspan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowspan: Self = this.set("rowspan", js.undefined)
    @scala.inline
    def setScreen(value: String): Self = this.set("screen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreen: Self = this.set("screen", js.undefined)
  }
  
}

