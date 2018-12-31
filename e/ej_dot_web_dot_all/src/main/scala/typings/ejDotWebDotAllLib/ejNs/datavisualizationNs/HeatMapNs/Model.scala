package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggered when the mouse over on the cell.
    */
  var cellMouseEnter: js.UndefOr[js.Function1[/* e */ CellMouseEnterEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the mouse over on the cell.
    */
  var cellMouseLeave: js.UndefOr[js.Function1[/* e */ CellMouseLeaveEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the mouse over on the cell.
    */
  var cellMouseOver: js.UndefOr[js.Function1[/* e */ CellMouseOverEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the mouse over on the cell.
    */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, scala.Unit]] = js.undefined
  /** Specifies the color values of the heat map column data.
    * @Default {[]}
    */
  var colorMappingCollection: js.UndefOr[js.Array[ColorMappingCollection]] = js.undefined
  /** Specifies the default column properties for all the column style not specified in column properties.
    * @Default {[]}
    */
  var defaultColumnStyle: js.UndefOr[DefaultColumnStyle] = js.undefined
  /** Specifies whether the virtualization can be enable or not.
    * @Default {false}
    */
  var enableVirtualization: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the property of the heat map cell.
    * @Default {Null}
    */
  var heatMapCell: js.UndefOr[HeatMapCell] = js.undefined
  /** Specifies the width of the heat map.
    * @Default {null}
    */
  var height: js.UndefOr[js.Any] = js.undefined
  /** Specifies the name of the heat map.
    * @Default {null}
    */
  var id: js.UndefOr[scala.Double] = js.undefined
  /** Specifies can enable responsive mode or not for heat map.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the property and display value of the heat map column.
    * @Default {[]}
    */
  var itemsMapping: js.UndefOr[ItemsMapping] = js.undefined
  /** Specifies the source data of the heat map.
    * @Default {[]}
    */
  var itemsSource: js.UndefOr[js.Any] = js.undefined
  /** Specifies the no of legends can sync with heat map.
    * @Default {[]}
    */
  var legendCollection: js.UndefOr[js.Array[_]] = js.undefined
  /** Enables or disables tooltip of heatmap
    * @Default {true}
    */
  var showTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the tooltip that should be shown when the mouse hovers over rows/columns.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.undefined
  /** Specifies the width of the heat map.
    * @Default {null}
    */
  var width: js.UndefOr[js.Any] = js.undefined
}

