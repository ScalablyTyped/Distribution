package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorMapLegendItem extends BaseLegendItem {
  /** @name VectorMapLegendItem.color */
  var color: js.UndefOr[String] = js.native
  /** @name VectorMapLegendItem.end */
  var end: js.UndefOr[Double] = js.native
  /** @name VectorMapLegendItem.size */
  var size: js.UndefOr[Double] = js.native
  /** @name VectorMapLegendItem.start */
  var start: js.UndefOr[Double] = js.native
}

object VectorMapLegendItem {
  @scala.inline
  def apply(): VectorMapLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorMapLegendItem]
  }
  @scala.inline
  implicit class VectorMapLegendItemOps[Self <: VectorMapLegendItem] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

