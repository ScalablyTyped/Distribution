package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimaryYAxisAlternateGridBandEven extends js.Object {
  /** Fill color for the even grid bands.
    * @Default {transparent}
    */
  var fill: js.UndefOr[String] = js.native
  /** Opacity of the even grid band.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
}

object PrimaryYAxisAlternateGridBandEven {
  @scala.inline
  def apply(): PrimaryYAxisAlternateGridBandEven = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryYAxisAlternateGridBandEven]
  }
  @scala.inline
  implicit class PrimaryYAxisAlternateGridBandEvenOps[Self <: PrimaryYAxisAlternateGridBandEven] (val x: Self) extends AnyVal {
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
  
}

