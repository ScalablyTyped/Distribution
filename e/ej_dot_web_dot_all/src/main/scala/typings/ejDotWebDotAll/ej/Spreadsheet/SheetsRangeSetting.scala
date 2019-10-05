package typings.ejDotWebDotAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsRangeSetting extends js.Object {
  /** Gets or sets the data to render the Spreadsheet.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Specifies the header styles for the headers in datasource range.
    * @Default {null}
    */
  var headerStyles: js.UndefOr[js.Any] = js.undefined
  /** Specifies the primary key for the datasource in Spreadsheet.
    */
  var primaryKey: js.UndefOr[String] = js.undefined
  /** Specifies the query for the datasource in Spreadsheet.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable the datasource header in Spreadsheet.
    * @Default {true}
    */
  var showHeader: js.UndefOr[Boolean] = js.undefined
  /** Specifies the start cell for the datasource range in Spreadsheet.
    * @Default {A1}
    */
  var startCell: js.UndefOr[String] = js.undefined
}

object SheetsRangeSetting {
  @scala.inline
  def apply(
    dataSource: js.Any = null,
    headerStyles: js.Any = null,
    primaryKey: String = null,
    query: js.Any = null,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    startCell: String = null
  ): SheetsRangeSetting = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (headerStyles != null) __obj.updateDynamic("headerStyles")(headerStyles)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (query != null) __obj.updateDynamic("query")(query)
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader)
    if (startCell != null) __obj.updateDynamic("startCell")(startCell)
    __obj.asInstanceOf[SheetsRangeSetting]
  }
}

