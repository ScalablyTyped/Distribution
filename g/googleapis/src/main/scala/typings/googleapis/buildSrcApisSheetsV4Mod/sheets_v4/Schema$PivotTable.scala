package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pivot table.
  */
@js.native
trait Schema$PivotTable extends js.Object {
  /**
    * Each column grouping in the pivot table.
    */
  var columns: js.UndefOr[js.Array[Schema$PivotGroup]] = js.native
  /**
    * An optional mapping of filters per source column offset.  The filters are
    * applied before aggregating data into the pivot table. The map&#39;s key
    * is the column offset of the source range that you want to filter, and the
    * value is the criteria for that column.  For example, if the source was
    * `C10:E15`, a key of `0` will have the filter for column `C`, whereas the
    * key `1` is for column `D`.
    */
  var criteria: js.UndefOr[StringDictionary[Schema$PivotFilterCriteria]] = js.native
  /**
    * Each row grouping in the pivot table.
    */
  var rows: js.UndefOr[js.Array[Schema$PivotGroup]] = js.native
  /**
    * The range the pivot table is reading data from.
    */
  var source: js.UndefOr[Schema$GridRange] = js.native
  /**
    * Whether values should be listed horizontally (as columns) or vertically
    * (as rows).
    */
  var valueLayout: js.UndefOr[String] = js.native
  /**
    * A list of values to include in the pivot table.
    */
  var values: js.UndefOr[js.Array[Schema$PivotValue]] = js.native
}

object Schema$PivotTable {
  @scala.inline
  def apply(
    columns: js.Array[Schema$PivotGroup] = null,
    criteria: StringDictionary[Schema$PivotFilterCriteria] = null,
    rows: js.Array[Schema$PivotGroup] = null,
    source: Schema$GridRange = null,
    valueLayout: String = null,
    values: js.Array[Schema$PivotValue] = null
  ): Schema$PivotTable = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (valueLayout != null) __obj.updateDynamic("valueLayout")(valueLayout.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PivotTable]
  }
}

