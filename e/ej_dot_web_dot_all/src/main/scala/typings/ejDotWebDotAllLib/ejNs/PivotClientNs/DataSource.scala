package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  /** In connection with an OLAP database, this property contains the database name as string to fetch the data from the given connection string.
    * @Default {â€œâ€}
    */
  var catalog: js.UndefOr[java.lang.String] = js.undefined
  /** Lists out the items to be arranged in the columns section of the pivot client.
    * @Default {[]}
    */
  var columns: js.UndefOr[js.Array[DataSourceColumn]] = js.undefined
  /** Contains the respective cube name from the OLAP database as string type.
    * @Default {â€œâ€}
    */
  var cube: js.UndefOr[java.lang.String] = js.undefined
  /** Provides the raw data source for the pivot client.
    * @Default {null}
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Allows you to filter the members (by its name and values) through the advanced filtering (e.g., Microsoft Excel) option in the client-mode.
    * @Default {false}
    */
  var enableAdvancedFilter: js.UndefOr[scala.Boolean] = js.undefined
  /** Lists out the items which supports filtering of values without displaying the members in UI of the pivot client.
    * @Default {[]}
    */
  var filters: js.UndefOr[js.Array[DataSourceFilter]] = js.undefined
  /** Allows to set the page size and current page number for each axis on applying the paging.
    * @Default {{}}
    */
  var pagerOptions: js.UndefOr[DataSourcePagerOptions] = js.undefined
  /** Sets the provider name for the pivot client to identify whether the provider is SSAS or Mondrian.
    * @Default {ssas}
    */
  var providerName: js.UndefOr[java.lang.String] = js.undefined
  /** Sets a name to the report bound to the control.
    */
  var reportName: js.UndefOr[java.lang.String] = js.undefined
  /** Lists out the items to be arranged in the rows section of the pivot client.
    * @Default {[]}
    */
  var rows: js.UndefOr[js.Array[DataSourceRow]] = js.undefined
  /** Allows to set the data source name to fetch the data from that.
    * @Default {â€œâ€}
    */
  var sourceInfo: js.UndefOr[java.lang.String] = js.undefined
  /** Lists out the items which supports calculation in the pivot client.
    * @Default {[]}
    */
  var values: js.UndefOr[js.Array[DataSourceValue]] = js.undefined
}

