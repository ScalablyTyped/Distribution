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

