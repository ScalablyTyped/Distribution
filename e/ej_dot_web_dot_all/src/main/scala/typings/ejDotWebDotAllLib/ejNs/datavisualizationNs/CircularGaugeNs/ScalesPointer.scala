package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesPointer extends js.Object {
  /** Specify backNeedleLength of circular gauge
    * @Default {10}
    */
  var backNeedleLength: js.UndefOr[scala.Double] = js.undefined
  /** Specify backgroundColor for the pointer of circular gauge
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specify the border for pointers of circular gauge
    * @Default {Object}
    */
  var border: js.UndefOr[ScalesPointersBorder] = js.undefined
  /** Specify distanceFromScale value for pointers of circular gauge
    * @Default {0}
    */
  var distanceFromScale: js.UndefOr[scala.Double] = js.undefined
  /** Specify pointer gradients of circular gauge
    * @Default {null}
    */
  var gradients: js.UndefOr[js.Any] = js.undefined
  /** Specify pointer image of circular gauge.It is applicable for both marker as well as needle type pointers.
    * @Default {NULL}
    */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Specify pointer length of circular gauge
    * @Default {150}
    */
  var length: js.UndefOr[scala.Double] = js.undefined
  /** Specify marker Style value of circular gauge. See
    * @Default {Rectangle}
    */
  var markerType: js.UndefOr[MarkerType | java.lang.String] = js.undefined
  /** Specify needle Style value of circular gauge. See
    * @Default {Triangle}
    */
  var needleType: js.UndefOr[NeedleType | java.lang.String] = js.undefined
  /** Specify opacity value for pointer of circular gauge
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specify pointer Placement value of circular gauge. See PointerPlacement
    * @Default {Near}
    */
  var placement: js.UndefOr[Placement | java.lang.String] = js.undefined
  /** Specify pointer value text of circular gauge.
    * @Default {Object}
    */
  var pointerValueText: js.UndefOr[ScalesPointersPointerValueText] = js.undefined
  /** Specify radius value for pointer of circular gauge
    * @Default {null}
    */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /** Specify showBackNeedle value of circular gauge
    * @Default {false}
    */
  var showBackNeedle: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify pointer type value of circular gauge. See
    * @Default {Needle}
    */
  var `type`: js.UndefOr[PointerType | java.lang.String] = js.undefined
  /** Specify value of the pointer of circular gauge
    * @Default {null}
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /** Specify pointer width of circular gauge
    * @Default {7}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

