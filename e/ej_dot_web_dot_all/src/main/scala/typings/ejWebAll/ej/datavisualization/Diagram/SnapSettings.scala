package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapSettings extends js.Object {
  /** Enables or disables snapping nodes/connectors to objects
    * @Default {true}
    */
  var enableSnapToObject: js.UndefOr[Boolean] = js.undefined
  /** Defines the appearance of horizontal gridlines
    */
  var horizontalGridLines: js.UndefOr[SnapSettingsHorizontalGridLines] = js.undefined
  /** Defines the angle by which the object needs to be snapped
    * @Default {5}
    */
  var snapAngle: js.UndefOr[Double] = js.undefined
  /** Defines and sets the snapConstraints
    */
  var snapConstraints: js.UndefOr[SnapConstraints | String] = js.undefined
  /** Defines the minimum distance between the selected object and the nearest object
    * @Default {5}
    */
  var snapObjectDistance: js.UndefOr[Double] = js.undefined
  /** Defines the appearance of horizontal gridlines
    */
  var verticalGridLines: js.UndefOr[SnapSettingsVerticalGridLines] = js.undefined
}

object SnapSettings {
  @scala.inline
  def apply(
    enableSnapToObject: js.UndefOr[Boolean] = js.undefined,
    horizontalGridLines: SnapSettingsHorizontalGridLines = null,
    snapAngle: Int | Double = null,
    snapConstraints: SnapConstraints | String = null,
    snapObjectDistance: Int | Double = null,
    verticalGridLines: SnapSettingsVerticalGridLines = null
  ): SnapSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableSnapToObject)) __obj.updateDynamic("enableSnapToObject")(enableSnapToObject.asInstanceOf[js.Any])
    if (horizontalGridLines != null) __obj.updateDynamic("horizontalGridLines")(horizontalGridLines.asInstanceOf[js.Any])
    if (snapAngle != null) __obj.updateDynamic("snapAngle")(snapAngle.asInstanceOf[js.Any])
    if (snapConstraints != null) __obj.updateDynamic("snapConstraints")(snapConstraints.asInstanceOf[js.Any])
    if (snapObjectDistance != null) __obj.updateDynamic("snapObjectDistance")(snapObjectDistance.asInstanceOf[js.Any])
    if (verticalGridLines != null) __obj.updateDynamic("verticalGridLines")(verticalGridLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapSettings]
  }
}

