package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulerSettingsHorizontalRuler extends js.Object {
  /** Defines the method which used to position and arrange the tick elements of the horizontal ruler.
    * @Default {null}
    */
  var arrangeTick: js.UndefOr[js.Any] = js.undefined
  /** Defines the number of intervals to be present on the each segment of the horizontal ruler.
    * @Default {5}
    */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /** Defines the width of the horizontal ruler.
    * @Default {null}
    */
  var length: js.UndefOr[scala.Double] = js.undefined
  /** Defines the color of the horizontal marker brush.
    * @Default {red}
    */
  var markerColor: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the textual description of the ruler segment, and the appearance of the ruler ticks of the horizontal ruler.
    * @Default {100}
    */
  var segmentWidth: js.UndefOr[scala.Double] = js.undefined
  /** Defines the height of the horizontal ruler.
    * @Default {25}
    */
  var thickness: js.UndefOr[scala.Double] = js.undefined
  /** Defines and sets the tick alignment of the ruler scale.
    * @Default {ej.datavisualization.Diagram.TickAlignment.RightOrBottom}
    */
  var tickAlignment: js.UndefOr[TickAlignment | java.lang.String] = js.undefined
}

object RulerSettingsHorizontalRuler {
  @scala.inline
  def apply(
    arrangeTick: js.Any = null,
    interval: scala.Int | scala.Double = null,
    length: scala.Int | scala.Double = null,
    markerColor: java.lang.String = null,
    segmentWidth: scala.Int | scala.Double = null,
    thickness: scala.Int | scala.Double = null,
    tickAlignment: TickAlignment | java.lang.String = null
  ): RulerSettingsHorizontalRuler = {
    val __obj = js.Dynamic.literal()
    if (arrangeTick != null) __obj.updateDynamic("arrangeTick")(arrangeTick)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor)
    if (segmentWidth != null) __obj.updateDynamic("segmentWidth")(segmentWidth.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (tickAlignment != null) __obj.updateDynamic("tickAlignment")(tickAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulerSettingsHorizontalRuler]
  }
}

