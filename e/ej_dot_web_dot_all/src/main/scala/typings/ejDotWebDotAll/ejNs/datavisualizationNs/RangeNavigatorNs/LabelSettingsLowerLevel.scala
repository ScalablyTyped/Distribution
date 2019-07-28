package typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelSettingsLowerLevel extends js.Object {
  /** Options for customizing the border of grid lines in lower level.
    */
  var border: js.UndefOr[LabelSettingsLowerLevelBorder] = js.undefined
  /** Specifies the fill color of labels in lower level.
    * @Default {transparent}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Options for customizing the grid lines in lower level.
    */
  var gridLineStyle: js.UndefOr[LabelSettingsLowerLevelGridLineStyle] = js.undefined
  /** Specifies the intervalType of the labels in lower level.See IntervalType
    * @Default {auto}
    */
  var intervalType: js.UndefOr[IntervalType | String] = js.undefined
  /** Specifies to hide the labels when it intersects with each other.
    * @Default {none}
    */
  var labelIntersectAction: js.UndefOr[LabelIntersectAction | String] = js.undefined
  /** Specifies the position of the labels to render either inside or outside of plot area. See LabelPlacement
    * @Default {outside}
    */
  var labelPlacement: js.UndefOr[LabelPlacement | String] = js.undefined
  /** Specifies the position of the labels in lower level.See Position
    * @Default {bottom}
    */
  var position: js.UndefOr[Position | String] = js.undefined
  /** Options for customizing the style of labels.
    */
  var style: js.UndefOr[LabelSettingsLowerLevelStyle] = js.undefined
  /** Toggles the visibility of labels in lower level.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object LabelSettingsLowerLevel {
  @scala.inline
  def apply(
    border: LabelSettingsLowerLevelBorder = null,
    fill: String = null,
    gridLineStyle: LabelSettingsLowerLevelGridLineStyle = null,
    intervalType: IntervalType | String = null,
    labelIntersectAction: LabelIntersectAction | String = null,
    labelPlacement: LabelPlacement | String = null,
    position: Position | String = null,
    style: LabelSettingsLowerLevelStyle = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): LabelSettingsLowerLevel = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (gridLineStyle != null) __obj.updateDynamic("gridLineStyle")(gridLineStyle)
    if (intervalType != null) __obj.updateDynamic("intervalType")(intervalType.asInstanceOf[js.Any])
    if (labelIntersectAction != null) __obj.updateDynamic("labelIntersectAction")(labelIntersectAction.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[LabelSettingsLowerLevel]
  }
}

