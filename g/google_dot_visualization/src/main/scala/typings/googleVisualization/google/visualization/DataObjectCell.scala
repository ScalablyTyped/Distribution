package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataObjectCell extends js.Object {
  var f: js.UndefOr[String] = js.native
  var p: js.UndefOr[js.Any] = js.native
  var v: js.UndefOr[js.Any] = js.native
}

object DataObjectCell {
  @scala.inline
  def apply(): DataObjectCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataObjectCell]
  }
  @scala.inline
  implicit class DataObjectCellOps[Self <: DataObjectCell] (val x: Self) extends AnyVal {
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
    def setF(value: String): Self = this.set("f", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteF: Self = this.set("f", js.undefined)
    @scala.inline
    def setP(value: js.Any): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
    @scala.inline
    def setV(value: js.Any): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV: Self = this.set("v", js.undefined)
  }
  
}

