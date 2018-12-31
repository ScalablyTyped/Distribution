package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesIndicator extends js.Object {
  /** Specifies the backgroundColor in bar indicators
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the border in bar indicators
    * @Default {null}
    */
  var border: js.UndefOr[ScalesIndicatorsBorder] = js.undefined
  /** Specifies the font of bar indicators
    * @Default {null}
    */
  var font: js.UndefOr[ScalesIndicatorsFont] = js.undefined
  /** Specifies the indicator Height of bar indicators
    * @Default {30}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the opacity in bar indicators
    * @Default {null}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the position in bar indicators
    * @Default {null}
    */
  var position: js.UndefOr[ScalesIndicatorsPosition] = js.undefined
  /** Specifies the state ranges in bar indicators
    * @Default {Array}
    */
  var stateRanges: js.UndefOr[js.Array[ScalesIndicatorsStateRange]] = js.undefined
  /** Specifies the textLocation in bar indicators
    * @Default {null}
    */
  var textLocation: js.UndefOr[ScalesIndicatorsTextLocation] = js.undefined
  /** Specifies the indicator Style of font in bar indicators
    * @Default {ej.datavisualization.LinearGauge.IndicatorType.Rectangle}
    */
  var `type`: js.UndefOr[IndicatorTypes | java.lang.String] = js.undefined
  /** Specifies the indicator Width in bar indicators
    * @Default {30}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

