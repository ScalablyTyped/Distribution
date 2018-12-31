package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesCustomLabel extends js.Object {
  /** Color of the custom labels.
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specify font for custom labels
    * @Default {Object}
    */
  var font: js.UndefOr[ScalesCustomLabelsFont] = js.undefined
  /** Specify position of custom labels
    * @Default {Object}
    */
  var position: js.UndefOr[ScalesCustomLabelsPosition] = js.undefined
  /** Specifies the position of the  custom labels. See
    * @Default {inner}
    */
  var positionType: js.UndefOr[CustomLabelPositionType | java.lang.String] = js.undefined
  /** Specify angle for the rotation of the custom labels in degrees.
    * @Default {0}
    */
  var textAngle: js.UndefOr[scala.Double] = js.undefined
  /** Value of the custom labels.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

