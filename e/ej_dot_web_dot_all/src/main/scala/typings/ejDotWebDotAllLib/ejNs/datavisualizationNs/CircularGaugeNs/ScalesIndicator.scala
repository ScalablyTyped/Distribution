package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesIndicator extends js.Object {
  /** Specify indicator height of circular gauge
    * @Default {15}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Specify imageUrl of circular gauge
    * @Default {null}
    */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Specify position of circular gauge
    * @Default {Object}
    */
  var position: js.UndefOr[ScalesIndicatorsPosition] = js.undefined
  /** Specify the various states of circular gauge
    * @Default {Array}
    */
  var stateRanges: js.UndefOr[js.Array[ScalesIndicatorsStateRange]] = js.undefined
  /** Specify indicator style of circular gauge. See
    * @Default {Circle}
    */
  var `type`: js.UndefOr[IndicatorTypes | java.lang.String] = js.undefined
  /** Specify indicator width of circular gauge
    * @Default {15}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

