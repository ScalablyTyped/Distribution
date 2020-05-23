package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersSubLayersLegendSettings extends js.Object {
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
  /** to get type of legend setting
    * @Default {layers}
    */
  var `type`: js.UndefOr[LegendType | String] = js.undefined
  /** width value for legend setting
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object LayersSubLayersLegendSettings {
  @scala.inline
  def apply(
    dockOnMap: js.UndefOr[Boolean] = js.undefined,
    dockPosition: DockPosition | String = null,
    height: js.UndefOr[Double] = js.undefined,
    icon: LegendIcons | String = null,
    iconHeight: js.UndefOr[Double] = js.undefined,
    iconWidth: js.UndefOr[Double] = js.undefined,
    labelOrientation: LabelOrientation | String = null,
    leftLabel: String = null,
    mode: Mode | String = null,
    position: Position | String = null,
    positionX: js.UndefOr[Double] = js.undefined,
    positionY: js.UndefOr[Double] = js.undefined,
    rightLabel: String = null,
    showLabels: js.UndefOr[Boolean] = js.undefined,
    showLegend: js.UndefOr[Boolean] = js.undefined,
    textPath: String = null,
    title: String = null,
    `type`: LegendType | String = null,
    width: js.UndefOr[Double] = js.undefined
  ): LayersSubLayersLegendSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dockOnMap)) __obj.updateDynamic("dockOnMap")(dockOnMap.get.asInstanceOf[js.Any])
    if (dockPosition != null) __obj.updateDynamic("dockPosition")(dockPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(iconHeight)) __obj.updateDynamic("iconHeight")(iconHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iconWidth)) __obj.updateDynamic("iconWidth")(iconWidth.get.asInstanceOf[js.Any])
    if (labelOrientation != null) __obj.updateDynamic("labelOrientation")(labelOrientation.asInstanceOf[js.Any])
    if (leftLabel != null) __obj.updateDynamic("leftLabel")(leftLabel.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(positionX)) __obj.updateDynamic("positionX")(positionX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(positionY)) __obj.updateDynamic("positionY")(positionY.get.asInstanceOf[js.Any])
    if (rightLabel != null) __obj.updateDynamic("rightLabel")(rightLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabels)) __obj.updateDynamic("showLabels")(showLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend.get.asInstanceOf[js.Any])
    if (textPath != null) __obj.updateDynamic("textPath")(textPath.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersSubLayersLegendSettings]
  }
}

