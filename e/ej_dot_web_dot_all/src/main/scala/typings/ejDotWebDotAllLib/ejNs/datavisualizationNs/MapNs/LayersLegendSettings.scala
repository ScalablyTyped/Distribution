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

object LayersLegendSettings {
  @scala.inline
  def apply(
    dockOnMap: js.UndefOr[scala.Boolean] = js.undefined,
    dockPosition: DockPosition | java.lang.String = null,
    height: scala.Int | scala.Double = null,
    icon: LegendIcons | java.lang.String = null,
    iconHeight: scala.Int | scala.Double = null,
    iconWidth: scala.Int | scala.Double = null,
    labelOrientation: LabelOrientation | java.lang.String = null,
    leftLabel: java.lang.String = null,
    mode: Mode | java.lang.String = null,
    position: Position | java.lang.String = null,
    positionX: scala.Int | scala.Double = null,
    positionY: scala.Int | scala.Double = null,
    rightLabel: java.lang.String = null,
    showLabels: js.UndefOr[scala.Boolean] = js.undefined,
    showLegend: js.UndefOr[scala.Boolean] = js.undefined,
    textPath: java.lang.String = null,
    title: java.lang.String = null,
    toggleVisibility: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: LegendType | java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): LayersLegendSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dockOnMap)) __obj.updateDynamic("dockOnMap")(dockOnMap)
    if (dockPosition != null) __obj.updateDynamic("dockPosition")(dockPosition.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconHeight != null) __obj.updateDynamic("iconHeight")(iconHeight.asInstanceOf[js.Any])
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth.asInstanceOf[js.Any])
    if (labelOrientation != null) __obj.updateDynamic("labelOrientation")(labelOrientation.asInstanceOf[js.Any])
    if (leftLabel != null) __obj.updateDynamic("leftLabel")(leftLabel)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (positionX != null) __obj.updateDynamic("positionX")(positionX.asInstanceOf[js.Any])
    if (positionY != null) __obj.updateDynamic("positionY")(positionY.asInstanceOf[js.Any])
    if (rightLabel != null) __obj.updateDynamic("rightLabel")(rightLabel)
    if (!js.isUndefined(showLabels)) __obj.updateDynamic("showLabels")(showLabels)
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend)
    if (textPath != null) __obj.updateDynamic("textPath")(textPath)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(toggleVisibility)) __obj.updateDynamic("toggleVisibility")(toggleVisibility)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersLegendSettings]
  }
}

