package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesTick extends js.Object {
  /** Specify the angle for the ticks of circular gauge
    * @Default {0}
    */
  var angle: js.UndefOr[scala.Double] = js.undefined
  /** Specify tick color of circular gauge
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specify distanceFromScale value for ticks of circular gauge
    * @Default {0}
    */
  var distanceFromScale: js.UndefOr[scala.Double] = js.undefined
  /** Specify tick height of circular gauge
    * @Default {16}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Specify tick placement of circular gauge. See TickPlacement
    * @Default {Near}
    */
  var placement: js.UndefOr[Placement | java.lang.String] = js.undefined
  /** Specify tick Style of circular gauge. See TickType
    * @Default {Major}
    */
  var `type`: js.UndefOr[LabelType | java.lang.String] = js.undefined
  /** Specify tick width of circular gauge
    * @Default {3}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

