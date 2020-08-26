package typings.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource extends js.Object {
  /** In connection with an OLAP database, this property contains the database name as string to fetch the data from the given connection string.
    * @Default {â€œâ€}
    */
  var catalog: js.UndefOr[String] = js.native
  /** Lists out the items to be arranged in the columns section of the pivot client.
    * @Default {[]}
    */
  var columns: js.UndefOr[js.Array[DataSourceColumn]] = js.native
  /** Contains the respective cube name from the OLAP database as string type.
    * @Default {â€œâ€}
    */
  var cube: js.UndefOr[String] = js.native
  /** Provides the raw data source for the pivot client.
    * @Default {null}
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Allows you to filter the members (by its name and values) through the advanced filtering (e.g., Microsoft Excel) option in the client-mode.
    * @Default {false}
    */
  var enableAdvancedFilter: js.UndefOr[Boolean] = js.native
  /** Lists out the items which supports filtering of values without displaying the members in UI of the pivot client.
    * @Default {[]}
    */
  var filters: js.UndefOr[js.Array[DataSourceFilter]] = js.native
  /** Allows to set the page size and current page number for each axis on applying the paging.
    * @Default {{}}
    */
  var pagerOptions: js.UndefOr[DataSourcePagerOptions] = js.native
  /** Sets the provider name for the pivot client to identify whether the provider is SSAS or Mondrian.
    * @Default {ssas}
    */
  var providerName: js.UndefOr[String] = js.native
  /** Sets a name to the report bound to the control.
    */
  var reportName: js.UndefOr[String] = js.native
  /** Lists out the items to be arranged in the rows section of the pivot client.
    * @Default {[]}
    */
  var rows: js.UndefOr[js.Array[DataSourceRow]] = js.native
  /** Allows to set the data source name to fetch the data from that.
    * @Default {â€œâ€}
    */
  var sourceInfo: js.UndefOr[String] = js.native
  /** Lists out the items which supports calculation in the pivot client.
    * @Default {[]}
    */
  var values: js.UndefOr[js.Array[DataSourceValue]] = js.native
}

object DataSource {
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  @scala.inline
  implicit class DataSourceOps[Self <: DataSource] (val x: Self) extends AnyVal {
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
    def setCatalog(value: String): Self = this.set("catalog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalog: Self = this.set("catalog", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: DataSourceColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[DataSourceColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setCube(value: String): Self = this.set("cube", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCube: Self = this.set("cube", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setEnableAdvancedFilter(value: Boolean): Self = this.set("enableAdvancedFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAdvancedFilter: Self = this.set("enableAdvancedFilter", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: DataSourceFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[DataSourceFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setPagerOptions(value: DataSourcePagerOptions): Self = this.set("pagerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagerOptions: Self = this.set("pagerOptions", js.undefined)
    @scala.inline
    def setProviderName(value: String): Self = this.set("providerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderName: Self = this.set("providerName", js.undefined)
    @scala.inline
    def setReportName(value: String): Self = this.set("reportName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportName: Self = this.set("reportName", js.undefined)
    @scala.inline
    def setRowsVarargs(value: DataSourceRow*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[DataSourceRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setSourceInfo(value: String): Self = this.set("sourceInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceInfo: Self = this.set("sourceInfo", js.undefined)
    @scala.inline
    def setValuesVarargs(value: DataSourceValue*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[DataSourceValue]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

