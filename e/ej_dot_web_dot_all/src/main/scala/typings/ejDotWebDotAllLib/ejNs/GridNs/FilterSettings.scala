package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSettings extends js.Object {
  /** Gets or sets a value that indicates to perform the filter operation with case sensitive in excel styled filter menu mode
    * @Default {false}
    */
  var enableCaseSensitivity: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates to define the interDeterminateState of checkbox in excel filter dialog.
    * @Default {true}
    */
  var enableInterDeterminateState: js.UndefOr[scala.Boolean] = js.undefined
  /** This specifies the grid to starts the filter action while typing in the filterBar or after pressing the enter key. based on the filterBarMode. See filterBarMode.
    * @Default {ej.Grid.FilterBarMode.Immediate}
    */
  var filterBarMode: js.UndefOr[FilterBarMode | java.lang.String] = js.undefined
  /** This specifies the grid to show the filterBar or filterMenu to the grid records. See filterType
    * @Default {ej.Grid.FilterType.FilterBar}
    */
  var filterType: js.UndefOr[FilterType | java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to define the filtered columns details programmatically at initial load
    * @Default {[]}
    */
  var filteredColumns: js.UndefOr[js.Array[FilterSettingsFilteredColumn]] = js.undefined
  /** This specifies the grid to delay the filter action while typing in the filterBar.
    * @Default {1500}
    */
  var immediateModeDelay: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets a value that indicates the maximum number of filter choices that can be showed in the excel styled filter menu.
    * @Default {1000}
    */
  var maxFilterChoices: js.UndefOr[scala.Double] = js.undefined
  /** This specifies the grid to show the filter text within the grid pager itself.
    * @Default {true}
    */
  var showFilterBarStatus: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the predicate options in the filtering menu
    * @Default {false}
    */
  var showPredicate: js.UndefOr[scala.Boolean] = js.undefined
}

