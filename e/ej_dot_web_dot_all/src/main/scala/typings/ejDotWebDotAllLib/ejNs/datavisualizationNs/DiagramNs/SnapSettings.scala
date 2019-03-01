package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapSettings extends js.Object {
  /** Enables or disables snapping nodes/connectors to objects
    * @Default {true}
    */
  var enableSnapToObject: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the appearance of horizontal gridlines
    */
  var horizontalGridLines: js.UndefOr[SnapSettingsHorizontalGridLines] = js.undefined
  /** Defines the angle by which the object needs to be snapped
    * @Default {5}
    */
  var snapAngle: js.UndefOr[scala.Double] = js.undefined
  /** Defines and sets the snapConstraints
    */
  var snapConstraints: js.UndefOr[SnapConstraints | java.lang.String] = js.undefined
  /** Defines the minimum distance between the selected object and the nearest object
    * @Default {5}
    */
  var snapObjectDistance: js.UndefOr[scala.Double] = js.undefined
  /** Defines the appearance of horizontal gridlines
    */
  var verticalGridLines: js.UndefOr[SnapSettingsVerticalGridLines] = js.undefined
}

object SnapSettings {
  @scala.inline
  def apply(
    enableSnapToObject: js.UndefOr[scala.Boolean] = js.undefined,
    horizontalGridLines: SnapSettingsHorizontalGridLines = null,
    snapAngle: scala.Int | scala.Double = null,
    snapConstraints: SnapConstraints | java.lang.String = null,
    snapObjectDistance: scala.Int | scala.Double = null,
    verticalGridLines: SnapSettingsVerticalGridLines = null
  ): SnapSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableSnapToObject)) __obj.updateDynamic("enableSnapToObject")(enableSnapToObject)
    if (horizontalGridLines != null) __obj.updateDynamic("horizontalGridLines")(horizontalGridLines)
    if (snapAngle != null) __obj.updateDynamic("snapAngle")(snapAngle.asInstanceOf[js.Any])
    if (snapConstraints != null) __obj.updateDynamic("snapConstraints")(snapConstraints.asInstanceOf[js.Any])
    if (snapObjectDistance != null) __obj.updateDynamic("snapObjectDistance")(snapObjectDistance.asInstanceOf[js.Any])
    if (verticalGridLines != null) __obj.updateDynamic("verticalGridLines")(verticalGridLines)
    __obj.asInstanceOf[SnapSettings]
  }
}

