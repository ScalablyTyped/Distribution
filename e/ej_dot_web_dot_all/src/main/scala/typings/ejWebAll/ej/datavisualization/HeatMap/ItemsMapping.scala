package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsMapping extends js.Object {
  /** Specifies the property and display value of the column.
    * @Default {null}
    */
  var column: js.UndefOr[ItemsMappingColumn] = js.native
  /** Specifies the property and display value of the collection of column.
    * @Default {[]}
    */
  var columnMapping: js.UndefOr[js.Array[_]] = js.native
  /** Column settings for the individual heat map column.
    * @Default {null}
    */
  var columnStyle: js.UndefOr[ItemsMappingColumnStyle] = js.native
  /** Specifies the property and display value of the header.
    * @Default {null}
    */
  var headerMapping: js.UndefOr[ItemsMappingHeaderMapping] = js.native
  /** Specifies the row property and display value of the heat map.
    * @Default {null}
    */
  var row: js.UndefOr[ItemsMappingRow] = js.native
  /** Specifies the property and display value of the column value.
    * @Default {null}
    */
  var value: js.UndefOr[ItemsMappingValue] = js.native
}

object ItemsMapping {
  @scala.inline
  def apply(): ItemsMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsMapping]
  }
  @scala.inline
  implicit class ItemsMappingOps[Self <: ItemsMapping] (val x: Self) extends AnyVal {
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
    def setColumn(value: ItemsMappingColumn): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setColumnMappingVarargs(value: js.Any*): Self = this.set("columnMapping", js.Array(value :_*))
    @scala.inline
    def setColumnMapping(value: js.Array[_]): Self = this.set("columnMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnMapping: Self = this.set("columnMapping", js.undefined)
    @scala.inline
    def setColumnStyle(value: ItemsMappingColumnStyle): Self = this.set("columnStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnStyle: Self = this.set("columnStyle", js.undefined)
    @scala.inline
    def setHeaderMapping(value: ItemsMappingHeaderMapping): Self = this.set("headerMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderMapping: Self = this.set("headerMapping", js.undefined)
    @scala.inline
    def setRow(value: ItemsMappingRow): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    @scala.inline
    def setValue(value: ItemsMappingValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

