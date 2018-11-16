package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataSourceColumn extends js.Object {
  /** Allows you to filter the report by default using the advanced filtering (e.g., Microsoft Excel) option for the OLAP data source in the client-mode.
               * @Default {[]}
               */
  var advancedFilter: js.UndefOr[js.Array[DataSourceColumnsAdvancedFilter]] = js.undefined
  /** Allows you to set the custom theme for the column headers.
               */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Contains the list of members need to be drilled down by default in the field.
               * @Default {[]}
               */
  var drilledItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Allows you to set the display caption for an item.
               */
  var fieldCaption: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to bind the item by using its unique name as field name.
               */
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  /** Applies the filter to field members.
               * @Default {null}
               */
  var filterItems: js.UndefOr[DataSourceColumnsFilterItems] = js.undefined
  /** Allows to set the format for the column headers.
               */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** This property is set to display the formatted values with format types in the pivot grid.
               */
  var formatString: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to indicate whether the added item is a named set or not.
               * @Default {false}
               */
  var isNamedSets: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows/hides the sub-total of the field in the pivot grid.
               * @Default {true}
               */
  var showSubTotal: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to set the sorting order of members of the field.
               * @Default {ej.PivotAnalysis.SortOrder.Ascending}
               */
  var sortOrder: js.UndefOr[ejDotWebDotAllLib.ejNs.PivotAnalysisNs.SortOrder | java.lang.String] = js.undefined
}

