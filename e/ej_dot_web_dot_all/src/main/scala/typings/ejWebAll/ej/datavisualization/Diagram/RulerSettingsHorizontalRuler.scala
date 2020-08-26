package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulerSettingsHorizontalRuler extends js.Object {
  /** Defines the method which used to position and arrange the tick elements of the horizontal ruler.
    * @Default {null}
    */
  var arrangeTick: js.UndefOr[js.Any] = js.native
  /** Defines the number of intervals to be present on the each segment of the horizontal ruler.
    * @Default {5}
    */
  var interval: js.UndefOr[Double] = js.native
  /** Defines the width of the horizontal ruler.
    * @Default {null}
    */
  var length: js.UndefOr[Double] = js.native
  /** Defines the color of the horizontal marker brush.
    * @Default {red}
    */
  var markerColor: js.UndefOr[String] = js.native
  /** Defines the textual description of the ruler segment, and the appearance of the ruler ticks of the horizontal ruler.
    * @Default {100}
    */
  var segmentWidth: js.UndefOr[Double] = js.native
  /** Defines the height of the horizontal ruler.
    * @Default {25}
    */
  var thickness: js.UndefOr[Double] = js.native
  /** Defines and sets the tick alignment of the ruler scale.
    * @Default {ej.datavisualization.Diagram.TickAlignment.RightOrBottom}
    */
  var tickAlignment: js.UndefOr[TickAlignment | String] = js.native
}

object RulerSettingsHorizontalRuler {
  @scala.inline
  def apply(): RulerSettingsHorizontalRuler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RulerSettingsHorizontalRuler]
  }
  @scala.inline
  implicit class RulerSettingsHorizontalRulerOps[Self <: RulerSettingsHorizontalRuler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArrangeTick(value: js.Any): Self = this.set("arrangeTick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrangeTick: Self = this.set("arrangeTick", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setMarkerColor(value: String): Self = this.set("markerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerColor: Self = this.set("markerColor", js.undefined)
    @scala.inline
    def setSegmentWidth(value: Double): Self = this.set("segmentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentWidth: Self = this.set("segmentWidth", js.undefined)
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    @scala.inline
    def setTickAlignment(value: TickAlignment | String): Self = this.set("tickAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickAlignment: Self = this.set("tickAlignment", js.undefined)
  }
  
}

