package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesRange extends js.Object {
  /** Specify backgroundColor for the ranges of circular gauge
    * @Default {#32b3c6}
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specify border for ranges of circular gauge
    * @Default {Object}
    */
  var border: js.UndefOr[ScalesRangesBorder] = js.undefined
  /** Specify distanceFromScale value for ranges of circular gauge
    * @Default {25}
    */
  var distanceFromScale: js.UndefOr[scala.Double] = js.undefined
  /** Specify endValue for ranges of circular gauge
    * @Default {null}
    */
  var endValue: js.UndefOr[scala.Double] = js.undefined
  /** Specify endWidth for ranges of circular gauge
    * @Default {10}
    */
  var endWidth: js.UndefOr[scala.Double] = js.undefined
  /** Specify range gradients of circular gauge
    * @Default {null}
    */
  var gradients: js.UndefOr[js.Any] = js.undefined
  /** Specify text for the ranges of circular gauge
    * @Default {null}
    */
  var legendText: js.UndefOr[java.lang.String] = js.undefined
  /** Specify opacity value for ranges of circular gauge
    * @Default {null}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specify placement of circular gauge. See RangePlacement
    * @Default {Near}
    */
  var placement: js.UndefOr[Placement | java.lang.String] = js.undefined
  /** Specify size of the range value of circular gauge
    * @Default {5}
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /** Specify startValue for ranges of circular gauge
    * @Default {null}
    */
  var startValue: js.UndefOr[scala.Double] = js.undefined
  /** Specify startWidth of circular gauge
    * @Default {[Array.number] scale.ranges.startWidth = 10}
    */
  var startWidth: js.UndefOr[scala.Double] = js.undefined
}

