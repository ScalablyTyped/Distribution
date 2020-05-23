package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulerSettingsVerticalRuler extends js.Object {
  /** Defines the method which used to position and arrange the tick elements of the vertical ruler.
    * @Default {null}
    */
  var arrangeTick: js.UndefOr[js.Any] = js.undefined
  /** Defines the number of intervals to be present on the each segment of the vertical ruler.
    * @Default {5}
    */
  var interval: js.UndefOr[Double] = js.undefined
  /** Defines the height of the vertical ruler.
    * @Default {null}
    */
  var length: js.UndefOr[Double] = js.undefined
  /** Defines the color of the vertical marker brush.
    * @Default {red}
    */
  var markerColor: js.UndefOr[String] = js.undefined
  /** Defines the textual description of the ruler segment, and the appearance of the ruler ticks of the vertical ruler.
    * @Default {100}
    */
  var segmentWidth: js.UndefOr[Double] = js.undefined
  /** Defines the width of the vertical ruler.
    * @Default {25}
    */
  var thickness: js.UndefOr[Double] = js.undefined
  /** Defines and sets the tick alignment of the ruler scale.
    * @Default {ej.datavisualization.Diagram.TickAlignment.RightOrBottom}
    */
  var tickAlignment: js.UndefOr[TickAlignment | String] = js.undefined
}

object RulerSettingsVerticalRuler {
  @scala.inline
  def apply(
    arrangeTick: js.Any = null,
    interval: js.UndefOr[Double] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    markerColor: String = null,
    segmentWidth: js.UndefOr[Double] = js.undefined,
    thickness: js.UndefOr[Double] = js.undefined,
    tickAlignment: TickAlignment | String = null
  ): RulerSettingsVerticalRuler = {
    val __obj = js.Dynamic.literal()
    if (arrangeTick != null) __obj.updateDynamic("arrangeTick")(arrangeTick.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor.asInstanceOf[js.Any])
    if (!js.isUndefined(segmentWidth)) __obj.updateDynamic("segmentWidth")(segmentWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(thickness)) __obj.updateDynamic("thickness")(thickness.get.asInstanceOf[js.Any])
    if (tickAlignment != null) __obj.updateDynamic("tickAlignment")(tickAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulerSettingsVerticalRuler]
  }
}

