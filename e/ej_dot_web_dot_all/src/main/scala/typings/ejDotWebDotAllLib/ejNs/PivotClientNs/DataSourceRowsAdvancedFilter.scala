package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataSourceRowsAdvancedFilter extends js.Object {
  /** Allows you to set the filtering type while performing the advanced filtering.
               */
  var advancedFilterType: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the operator to perform the label filtering.
               * @Default {none}
               */
  var labelFilterOperator: js.UndefOr[java.lang.String] = js.undefined
  /** In value filtering, this property contains the measure name to which the filter is applied.
               */
  var measure: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to provide a level unique name to perform the advanced filtering.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the operator to perform the value filtering.
               * @Default {none}
               */
  var valueFilterOperator: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to hold the filter operand values in the advanced filtering.
               */
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

