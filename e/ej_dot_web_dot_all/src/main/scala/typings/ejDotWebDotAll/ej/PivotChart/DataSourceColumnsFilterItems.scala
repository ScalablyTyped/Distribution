package typings.ejDotWebDotAll.ej.PivotChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceColumnsFilterItems extends js.Object {
  /** Sets the type of filter whether to include/exclude the mentioned values.
    * @Default {ej.PivotAnalysis.FilterType.Exclude}
    */
  var filterType: js.UndefOr[typings.ejDotWebDotAll.ej.PivotAnalysis.FilterType | String] = js.undefined
  /** Contains the collection of items to be included/excluded among the field members.
    * @Default {[]}
    */
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object DataSourceColumnsFilterItems {
  @scala.inline
  def apply(
    filterType: typings.ejDotWebDotAll.ej.PivotAnalysis.FilterType | String = null,
    values: js.Array[_] = null
  ): DataSourceColumnsFilterItems = {
    val __obj = js.Dynamic.literal()
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceColumnsFilterItems]
  }
}

