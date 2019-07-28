package typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsMapping extends js.Object {
  /** Specifies the property and display value of the column.
    * @Default {null}
    */
  var column: js.UndefOr[ItemsMappingColumn] = js.undefined
  /** Specifies the property and display value of the collection of column.
    * @Default {[]}
    */
  var columnMapping: js.UndefOr[js.Array[_]] = js.undefined
  /** Column settings for the individual heat map column.
    * @Default {null}
    */
  var columnStyle: js.UndefOr[ItemsMappingColumnStyle] = js.undefined
  /** Specifies the property and display value of the header.
    * @Default {null}
    */
  var headerMapping: js.UndefOr[ItemsMappingHeaderMapping] = js.undefined
  /** Specifies the row property and display value of the heat map.
    * @Default {null}
    */
  var row: js.UndefOr[ItemsMappingRow] = js.undefined
  /** Specifies the property and display value of the column value.
    * @Default {null}
    */
  var value: js.UndefOr[ItemsMappingValue] = js.undefined
}

object ItemsMapping {
  @scala.inline
  def apply(
    column: ItemsMappingColumn = null,
    columnMapping: js.Array[_] = null,
    columnStyle: ItemsMappingColumnStyle = null,
    headerMapping: ItemsMappingHeaderMapping = null,
    row: ItemsMappingRow = null,
    value: ItemsMappingValue = null
  ): ItemsMapping = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column)
    if (columnMapping != null) __obj.updateDynamic("columnMapping")(columnMapping)
    if (columnStyle != null) __obj.updateDynamic("columnStyle")(columnStyle)
    if (headerMapping != null) __obj.updateDynamic("headerMapping")(headerMapping)
    if (row != null) __obj.updateDynamic("row")(row)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ItemsMapping]
  }
}

