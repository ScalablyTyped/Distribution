package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSettings extends js.Object {
  /** Gets or sets a value that indicates to perform the filter operation with case sensitive in excel styled filter menu mode.
    * @Default {false}
    */
  var enableCaseSensitivity: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the ability to filter the columns with empty, null and undefined values.
    * @Default {true}
    */
  var enableComplexBlankFilter: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the mode on which column filtering should start
    * @Default {immediate}
    */
  var filterBarMode: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mode of filtering to filter the record with or without hierarchy.
    * @Default {ej.TreeGrid.FilterHierarchyMode.Parent}
    */
  var filterHierarchyMode: js.UndefOr[FilterHierarchyMode | java.lang.String] = js.undefined
  /** Specifies the type of column filtering.
    * @Default {ej.TreeGrid.FilterType.FilterBar}
    */
  var filterType: js.UndefOr[FilterType | java.lang.String] = js.undefined
  /** Specifies the column collection for filtering the TreeGrid content on initial load
    * @Default {[]}
    */
  var filteredColumns: js.UndefOr[js.Array[FilterSettingsFilteredColumn]] = js.undefined
  /** Gets or sets a value that indicates the maximum number of filter choices that can be showed in the excel styled filter menu.
    * @Default {1000}
    */
  var maxFilterChoices: js.UndefOr[scala.Double] = js.undefined
}

