package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelSettingsHigherLevel extends js.Object {
  /** Options for customizing the border of grid lines in higher level.
    */
  var border: js.UndefOr[LabelSettingsHigherLevelBorder] = js.undefined
  /** Specifies the fill color of higher level labels.
    * @Default {transparent}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Options for customizing the grid line colors, width, dashArray, border.
    */
  var gridLineStyle: js.UndefOr[LabelSettingsHigherLevelGridLineStyle] = js.undefined
  /** Specifies the intervalType for higher level labels. See
    * @Default {auto}
    */
  var intervalType: js.UndefOr[IntervalType | java.lang.String] = js.undefined
  /** Specifies to hide the labels when it intersects with each other.
    * @Default {none}
    */
  var labelIntersectAction: js.UndefOr[LabelIntersectAction | java.lang.String] = js.undefined
  /** Specifies the position of the labels to render either inside or outside of plot area
    * @Default {outside}
    */
  var labelPlacement: js.UndefOr[LabelPlacement | java.lang.String] = js.undefined
  /** Specifies the position of the labels in higher level
    * @Default {top}
    */
  var position: js.UndefOr[Position | java.lang.String] = js.undefined
  /** Options for customizing the style of higher level labels.
    */
  var style: js.UndefOr[LabelSettingsHigherLevelStyle] = js.undefined
  /** Toggles the visibility of higher level labels.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object LabelSettingsHigherLevel {
  @scala.inline
  def apply(
    border: LabelSettingsHigherLevelBorder = null,
    fill: java.lang.String = null,
    gridLineStyle: LabelSettingsHigherLevelGridLineStyle = null,
    intervalType: IntervalType | java.lang.String = null,
    labelIntersectAction: LabelIntersectAction | java.lang.String = null,
    labelPlacement: LabelPlacement | java.lang.String = null,
    position: Position | java.lang.String = null,
    style: LabelSettingsHigherLevelStyle = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): LabelSettingsHigherLevel = {
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
    __obj.asInstanceOf[LabelSettingsHigherLevel]
  }
}

