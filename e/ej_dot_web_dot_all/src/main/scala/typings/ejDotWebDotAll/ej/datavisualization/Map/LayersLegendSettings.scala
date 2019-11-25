package typings.ejDotWebDotAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersLegendSettings extends js.Object {
  /** Determines whether the legend should be placed outside or inside the map bounds
    * @Default {false}
    */
  var dockOnMap: js.UndefOr[Boolean] = js.undefined
  /** Determines the legend placement and it is valid only when dockOnMap is true
    * @Default {top}
    */
  var dockPosition: js.UndefOr[DockPosition | String] = js.undefined
  /** height value for legend setting
    * @Default {0}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** to get icon value for legend setting
    * @Default {rectangle}
    */
  var icon: js.UndefOr[LegendIcons | String] = js.undefined
  /** icon height value for legend setting
    * @Default {20}
    */
  var iconHeight: js.UndefOr[Double] = js.undefined
  /** icon Width value for legend setting
    * @Default {20}
    */
  var iconWidth: js.UndefOr[Double] = js.undefined
  /** set the orientation of legend labels
    * @Default {vertical}
    */
  var labelOrientation: js.UndefOr[LabelOrientation | String] = js.undefined
  /** to get leftLabel value for legend setting
    * @Default {null}
    */
  var leftLabel: js.UndefOr[String] = js.undefined
  /** to get mode of legend setting
    * @Default {default}
    */
  var mode: js.UndefOr[Mode | String] = js.undefined
  /** set the position of legend settings
    * @Default {topleft}
    */
  var position: js.UndefOr[Position | String] = js.undefined
  /** x position value for legend setting
    * @Default {0}
    */
  var positionX: js.UndefOr[Double] = js.undefined
  /** y position value for legend setting
    * @Default {0}
    */
  var positionY: js.UndefOr[Double] = js.undefined
  /** to get rightLabel value for legend setting
    * @Default {null}
    */
  var rightLabel: js.UndefOr[String] = js.undefined
  /** Enables or Disables the showLabels
    * @Default {false}
    */
  var showLabels: js.UndefOr[Boolean] = js.undefined
  /** Enables or Disables the showLegend
    * @Default {false}
    */
  var showLegend: js.UndefOr[Boolean] = js.undefined
  /** To get the field name in the datasource for generating legend items.
    * @Default {null}
    */
  var textPath: js.UndefOr[String] = js.undefined
  /** to get title of legend setting
    * @Default {null}
    */
  var title: js.UndefOr[String] = js.undefined
  /** Toggle the visibility of the legend.
    * @Default {false}
    */
  var toggleVisibility: js.UndefOr[Boolean] = js.undefined
  /** to get type of legend setting
    * @Default {layers}
    */
  var `type`: js.UndefOr[LegendType | String] = js.undefined
  /** width value for legend setting
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object LayersLegendSettings {
  @scala.inline
  def apply(
    dockOnMap: js.UndefOr[Boolean] = js.undefined,
    dockPosition: DockPosition | String = null,
    height: Int | Double = null,
    icon: LegendIcons | String = null,
    iconHeight: Int | Double = null,
    iconWidth: Int | Double = null,
    labelOrientation: LabelOrientation | String = null,
    leftLabel: String = null,
    mode: Mode | String = null,
    position: Position | String = null,
    positionX: Int | Double = null,
    positionY: Int | Double = null,
    rightLabel: String = null,
    showLabels: js.UndefOr[Boolean] = js.undefined,
    showLegend: js.UndefOr[Boolean] = js.undefined,
    textPath: String = null,
    title: String = null,
    toggleVisibility: js.UndefOr[Boolean] = js.undefined,
    `type`: LegendType | String = null,
    width: Int | Double = null
  ): LayersLegendSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dockOnMap)) __obj.updateDynamic("dockOnMap")(dockOnMap.asInstanceOf[js.Any])
    if (dockPosition != null) __obj.updateDynamic("dockPosition")(dockPosition.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconHeight != null) __obj.updateDynamic("iconHeight")(iconHeight.asInstanceOf[js.Any])
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth.asInstanceOf[js.Any])
    if (labelOrientation != null) __obj.updateDynamic("labelOrientation")(labelOrientation.asInstanceOf[js.Any])
    if (leftLabel != null) __obj.updateDynamic("leftLabel")(leftLabel.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (positionX != null) __obj.updateDynamic("positionX")(positionX.asInstanceOf[js.Any])
    if (positionY != null) __obj.updateDynamic("positionY")(positionY.asInstanceOf[js.Any])
    if (rightLabel != null) __obj.updateDynamic("rightLabel")(rightLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabels)) __obj.updateDynamic("showLabels")(showLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend.asInstanceOf[js.Any])
    if (textPath != null) __obj.updateDynamic("textPath")(textPath.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleVisibility)) __obj.updateDynamic("toggleVisibility")(toggleVisibility.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersLegendSettings]
  }
}

