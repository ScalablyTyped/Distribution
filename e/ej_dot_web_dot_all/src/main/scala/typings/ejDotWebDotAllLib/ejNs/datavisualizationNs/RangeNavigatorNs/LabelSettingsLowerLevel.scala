package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

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
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Options for customizing the grid lines in lower level.
    */
  var gridLineStyle: js.UndefOr[LabelSettingsLowerLevelGridLineStyle] = js.undefined
  /** Specifies the intervalType of the labels in lower level.See IntervalType
    * @Default {auto}
    */
  var intervalType: js.UndefOr[IntervalType | java.lang.String] = js.undefined
  /** Specifies to hide the labels when it intersects with each other.
    * @Default {none}
    */
  var labelIntersectAction: js.UndefOr[LabelIntersectAction | java.lang.String] = js.undefined
  /** Specifies the position of the labels to render either inside or outside of plot area. See LabelPlacement
    * @Default {outside}
    */
  var labelPlacement: js.UndefOr[LabelPlacement | java.lang.String] = js.undefined
  /** Specifies the position of the labels in lower level.See Position
    * @Default {bottom}
    */
  var position: js.UndefOr[Position | java.lang.String] = js.undefined
  /** Options for customizing the style of labels.
    */
  var style: js.UndefOr[LabelSettingsLowerLevelStyle] = js.undefined
  /** Toggles the visibility of labels in lower level.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

