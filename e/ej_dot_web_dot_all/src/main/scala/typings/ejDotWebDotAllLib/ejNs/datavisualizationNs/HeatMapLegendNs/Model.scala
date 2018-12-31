package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapLegendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Specifies the color values of the column data.
    * @Default {[]}
    */
  var colorMappingCollection: js.UndefOr[js.Array[ColorMappingCollection]] = js.undefined
  /** Specifies the height of the heatmap legend.
    * @Default {null}
    */
  var height: js.UndefOr[js.Any] = js.undefined
  /** Specifies can enable responsive mode or not for heatmap legend.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the legend mode as gradient or list.
    * @Default {ej.HeatMap.LegendMode.Gradient}
    */
  var legendMode: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.LegendMode | java.lang.String
  ] = js.undefined
  /** Specifies the orientation of the heatmap legend
    * @Default {ej.HeatMap.LegendOrientation.Horizontal}
    */
  var orientation: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.LegendOrientation | java.lang.String
  ] = js.undefined
  /** Specifies whether the cell label can be shown or not.
    * @Default {false}
    */
  var showLabel: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the width of the heatmap legend.
    * @Default {null}
    */
  var width: js.UndefOr[js.Any] = js.undefined
}

