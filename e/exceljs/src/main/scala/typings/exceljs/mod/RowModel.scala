package typings.exceljs.mod

import typings.exceljs.anon.PartialStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowModel extends js.Object {
  var cells: js.Array[CellModel] = js.native
  var collapsed: Boolean = js.native
  var height: Double = js.native
  var hidden: Boolean = js.native
  var max: Double = js.native
  var min: Double = js.native
  var number: Double = js.native
  var outlineLevel: Double = js.native
  var style: PartialStyle = js.native
}

object RowModel {
  @scala.inline
  def apply(
    cells: js.Array[CellModel],
    collapsed: Boolean,
    height: Double,
    hidden: Boolean,
    max: Double,
    min: Double,
    number: Double,
    outlineLevel: Double,
    style: PartialStyle
  ): RowModel = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], outlineLevel = outlineLevel.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowModel]
  }
  @scala.inline
  implicit class RowModelOps[Self <: RowModel] (val x: Self) extends AnyVal {
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
    def setCellsVarargs(value: CellModel*): Self = this.set("cells", js.Array(value :_*))
    @scala.inline
    def setCells(value: js.Array[CellModel]): Self = this.set("cells", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlineLevel(value: Double): Self = this.set("outlineLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: PartialStyle): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

