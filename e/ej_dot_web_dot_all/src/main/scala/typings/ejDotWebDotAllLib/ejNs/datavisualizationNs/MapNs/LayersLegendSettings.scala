package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersLegendSettings extends js.Object {
  /** Determines whether the legend should be placed outside or inside the map bounds
    * @Default {false}
    */
  var dockOnMap: js.UndefOr[scala.Boolean] = js.undefined
  /** Determines the legend placement and it is valid only when dockOnMap is true
    * @Default {top}
    */
  var dockPosition: js.UndefOr[DockPosition | java.lang.String] = js.undefined
  /** height value for legend setting
    * @Default {0}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** to get icon value for legend setting
    * @Default {rectangle}
    */
  var icon: js.UndefOr[LegendIcons | java.lang.String] = js.undefined
  /** icon height value for legend setting
    * @Default {20}
    */
  var iconHeight: js.UndefOr[scala.Double] = js.undefined
  /** icon Width value for legend setting
    * @Default {20}
    */
  var iconWidth: js.UndefOr[scala.Double] = js.undefined
  /** set the orientation of legend labels
    * @Default {vertical}
    */
  var labelOrientation: js.UndefOr[LabelOrientation | java.lang.String] = js.undefined
  /** to get leftLabel value for legend setting
    * @Default {null}
    */
  var leftLabel: js.UndefOr[java.lang.String] = js.undefined
  /** to get mode of legend setting
    * @Default {default}
    */
  var mode: js.UndefOr[Mode | java.lang.String] = js.undefined
  /** set the position of legend settings
    * @Default {topleft}
    */
  var position: js.UndefOr[Position | java.lang.String] = js.undefined
  /** x position value for legend setting
    * @Default {0}
    */
  var positionX: js.UndefOr[scala.Double] = js.undefined
  /** y position value for legend setting
    * @Default {0}
    */
  var positionY: js.UndefOr[scala.Double] = js.undefined
  /** to get rightLabel value for legend setting
    * @Default {null}
    */
  var rightLabel: js.UndefOr[java.lang.String] = js.undefined
  /** Enables or Disables the showLabels
    * @Default {false}
    */
  var showLabels: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or Disables the showLegend
    * @Default {false}
    */
  var showLegend: js.UndefOr[scala.Boolean] = js.undefined
  /** To get the field name in the datasource for generating legend items.
    * @Default {null}
    */
  var textPath: js.UndefOr[java.lang.String] = js.undefined
  /** to get title of legend setting
    * @Default {null}
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Toggle the visibility of the legend.
    * @Default {false}
    */
  var toggleVisibility: js.UndefOr[scala.Boolean] = js.undefined
  /** to get type of legend setting
    * @Default {layers}
    */
  var `type`: js.UndefOr[LegendType | java.lang.String] = js.undefined
  /** width value for legend setting
    * @Default {0}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

