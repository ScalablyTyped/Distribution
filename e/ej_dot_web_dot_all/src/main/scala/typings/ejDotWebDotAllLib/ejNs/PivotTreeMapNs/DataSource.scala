package typings
package ejDotWebDotAllLib.ejNs.PivotTreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  /** In connection with an OLAP database, this property contains the database name as string to fetch the data from the given connection string.
    * @Default {â€œâ€}
    */
  var catalog: js.UndefOr[java.lang.String] = js.undefined
  /** Lists out the items to be displayed as series of PivotTreeMap.
    * @Default {[]}
    */
  var columns: js.UndefOr[js.Array[DataSourceColumn]] = js.undefined
  /** Contains the respective cube name from OLAP database as string type.
    * @Default {â€œâ€}
    */
  var cube: js.UndefOr[java.lang.String] = js.undefined
  /** Provides the raw data source for the PivotTreeMap.
    * @Default {null}
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Lists out the items which supports filtering of values without displaying the members in UI in PivotTreeMap.
    * @Default {[]}
    */
  var filters: js.UndefOr[js.Array[DataSourceFilter]] = js.undefined
  /** Set the provider name for PivotTreeMap to identify whether the provider is SSAS or Mondrian.
    * @Default {ssas}
    */
  var providerName: js.UndefOr[java.lang.String] = js.undefined
  /** Lists out the items to be displayed as segments of PivotTreeMap.
    * @Default {[]}
    */
  var rows: js.UndefOr[js.Array[DataSourceRow]] = js.undefined
  /** To set the data source name to fetch data from that.
    * @Default {â€œâ€}
    */
  var sourceInfo: js.UndefOr[java.lang.String] = js.undefined
  /** Lists out the items supports calculation in PivotTreeMap.
    * @Default {[]}
    */
  var values: js.UndefOr[js.Array[DataSourceValue]] = js.undefined
}

object DataSource {
  @scala.inline
  def apply(
    catalog: java.lang.String = null,
    columns: js.Array[DataSourceColumn] = null,
    cube: java.lang.String = null,
    data: js.Any = null,
    filters: js.Array[DataSourceFilter] = null,
    providerName: java.lang.String = null,
    rows: js.Array[DataSourceRow] = null,
    sourceInfo: java.lang.String = null,
    values: js.Array[DataSourceValue] = null
  ): DataSource = {
    val __obj = js.Dynamic.literal()
    if (catalog != null) __obj.updateDynamic("catalog")(catalog)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (cube != null) __obj.updateDynamic("cube")(cube)
    if (data != null) __obj.updateDynamic("data")(data)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (providerName != null) __obj.updateDynamic("providerName")(providerName)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (sourceInfo != null) __obj.updateDynamic("sourceInfo")(sourceInfo)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[DataSource]
  }
}

