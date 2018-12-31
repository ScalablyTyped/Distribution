package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesLabel extends js.Object {
  /** Specify the angle for the labels of circular gauge
    * @Default {0}
    */
  var angle: js.UndefOr[scala.Double] = js.undefined
  /** Specify labels autoAngle value of circular gauge
    * @Default {false}
    */
  var autoAngle: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify label color of circular gauge
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specify distanceFromScale value for labels of circular gauge
    * @Default {0}
    */
  var distanceFromScale: js.UndefOr[scala.Double] = js.undefined
  /** Specify font for labels of circular gauge
    * @Default {Object}
    */
  var font: js.UndefOr[ScalesLabelsFont] = js.undefined
  /** Specify includeFirstValue of circular gauge
    * @Default {true}
    */
  var includeFirstValue: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify opacity value for labels of circular gauge
    * @Default {null}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specify label placement of circular gauge. See
    * @Default {Near}
    */
  var placement: js.UndefOr[Placement | java.lang.String] = js.undefined
  /** Specify label Style of circular gauge. See
    * @Default {Major}
    */
  var `type`: js.UndefOr[LabelType | java.lang.String] = js.undefined
  /** Specify unitText of circular gauge
    */
  var unitText: js.UndefOr[java.lang.String] = js.undefined
  /** Specify unitTextPosition of circular gauge. See UnitTextPosition
    * @Default {Back}
    */
  var unitTextPosition: js.UndefOr[UnitTextPlacement | java.lang.String] = js.undefined
}

