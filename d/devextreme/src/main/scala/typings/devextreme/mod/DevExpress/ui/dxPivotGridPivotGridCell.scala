package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.D
import typings.devextreme.devextremeStrings.GT
import typings.devextreme.devextremeStrings.T
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPivotGridPivotGridCell extends js.Object {
  /** @name dxPivotGridPivotGridCell.columnPath */
  var columnPath: js.UndefOr[js.Array[String | Double | Date]] = js.native
  /** @name dxPivotGridPivotGridCell.columnType */
  var columnType: js.UndefOr[D | T | GT] = js.native
  /** @name dxPivotGridPivotGridCell.dataIndex */
  var dataIndex: js.UndefOr[Double] = js.native
  /** @name dxPivotGridPivotGridCell.expanded */
  var expanded: js.UndefOr[Boolean] = js.native
  /** @name dxPivotGridPivotGridCell.path */
  var path: js.UndefOr[js.Array[String | Double | Date]] = js.native
  /** @name dxPivotGridPivotGridCell.rowPath */
  var rowPath: js.UndefOr[js.Array[String | Double | Date]] = js.native
  /** @name dxPivotGridPivotGridCell.rowType */
  var rowType: js.UndefOr[D | T | GT] = js.native
  /** @name dxPivotGridPivotGridCell.text */
  var text: js.UndefOr[String] = js.native
  /** @name dxPivotGridPivotGridCell.type */
  var `type`: js.UndefOr[D | T | GT] = js.native
  /** @name dxPivotGridPivotGridCell.value */
  var value: js.UndefOr[js.Any] = js.native
}

object dxPivotGridPivotGridCell {
  @scala.inline
  def apply(): dxPivotGridPivotGridCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPivotGridPivotGridCell]
  }
  @scala.inline
  implicit class dxPivotGridPivotGridCellOps[Self <: dxPivotGridPivotGridCell] (val x: Self) extends AnyVal {
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
    def setColumnPathVarargs(value: (String | Double | Date)*): Self = this.set("columnPath", js.Array(value :_*))
    @scala.inline
    def setColumnPath(value: js.Array[String | Double | Date]): Self = this.set("columnPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnPath: Self = this.set("columnPath", js.undefined)
    @scala.inline
    def setColumnType(value: D | T | GT): Self = this.set("columnType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnType: Self = this.set("columnType", js.undefined)
    @scala.inline
    def setDataIndex(value: Double): Self = this.set("dataIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataIndex: Self = this.set("dataIndex", js.undefined)
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setPathVarargs(value: (String | Double | Date)*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[String | Double | Date]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setRowPathVarargs(value: (String | Double | Date)*): Self = this.set("rowPath", js.Array(value :_*))
    @scala.inline
    def setRowPath(value: js.Array[String | Double | Date]): Self = this.set("rowPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowPath: Self = this.set("rowPath", js.undefined)
    @scala.inline
    def setRowType(value: D | T | GT): Self = this.set("rowType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowType: Self = this.set("rowType", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setType(value: D | T | GT): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

