package typings.ejDotWebDotAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  /** In connection with an OLAP database, this property contains the database name as string to fetch the data from the given connection string.
    * @Default {â€œâ€}
    */
  var catalog: js.UndefOr[String] = js.undefined
  /** Lists out the items to be arranged in the columns section of the PivotGrid.
    * @Default {[]}
    */
  var columns: js.UndefOr[js.Array[DataSourceColumn]] = js.undefined
  /** Contains the respective cube name as string type in the OLAP database.
    * @Default {â€œâ€}
    */
  var cube: js.UndefOr[String] = js.undefined
  /** Provides the raw data source for the PivotGrid.
    * @Default {null}
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Allows you to filter the members (by its name and values) through advanced filtering (e.g., Microsoft Excel) option at OLAP data source in client-mode.
    * @Default {false}
    */
  var enableAdvancedFilter: js.UndefOr[Boolean] = js.undefined
  /** Lists out the items which supports filtering of values without displaying the members in UI of the PivotGrid.
    * @Default {[]}
    */
  var filters: js.UndefOr[js.Array[DataSourceFilter]] = js.undefined
  /** Allows to set the page size and current page number for each axis on applying the paging.
    * @Default {{}}
    */
  var pagerOptions: js.UndefOr[DataSourcePagerOptions] = js.undefined
  /** Sets the provider name for PivotGrid to identify whether the provider is SSAS or Mondrian.
    * @Default {ssas}
    */
  var providerName: js.UndefOr[String] = js.undefined
  /** Sets a name to the report that is bound to the control.
    */
  var reportName: js.UndefOr[String] = js.undefined
  /** Lists out the items to be arranged in the rows section of PivotGrid.
    * @Default {[]}
    */
  var rows: js.UndefOr[js.Array[DataSourceRow]] = js.undefined
  /** To set the data source name to fetch the data.
    * @Default {â€œâ€}
    */
  var sourceInfo: js.UndefOr[String] = js.undefined
  /** Lists out the items that support calculation in the PivotGrid.
    * @Default {[]}
    */
  var values: js.UndefOr[js.Array[DataSourceValue]] = js.undefined
}

object DataSource {
  @scala.inline
  def apply(
    catalog: String = null,
    columns: js.Array[DataSourceColumn] = null,
    cube: String = null,
    data: js.Any = null,
    enableAdvancedFilter: js.UndefOr[Boolean] = js.undefined,
    filters: js.Array[DataSourceFilter] = null,
    pagerOptions: DataSourcePagerOptions = null,
    providerName: String = null,
    reportName: String = null,
    rows: js.Array[DataSourceRow] = null,
    sourceInfo: String = null,
    values: js.Array[DataSourceValue] = null
  ): DataSource = {
    val __obj = js.Dynamic.literal()
    if (catalog != null) __obj.updateDynamic("catalog")(catalog)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (cube != null) __obj.updateDynamic("cube")(cube)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(enableAdvancedFilter)) __obj.updateDynamic("enableAdvancedFilter")(enableAdvancedFilter)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (pagerOptions != null) __obj.updateDynamic("pagerOptions")(pagerOptions)
    if (providerName != null) __obj.updateDynamic("providerName")(providerName)
    if (reportName != null) __obj.updateDynamic("reportName")(reportName)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (sourceInfo != null) __obj.updateDynamic("sourceInfo")(sourceInfo)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[DataSource]
  }
}

