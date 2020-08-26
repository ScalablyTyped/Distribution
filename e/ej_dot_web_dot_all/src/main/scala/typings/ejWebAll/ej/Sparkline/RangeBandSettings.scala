package typings.ejWebAll.ej.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeBandSettings extends js.Object {
  /** Range band color of the series.
    * @Default {transparent}
    */
  var color: js.UndefOr[String] = js.native
  /** End value of the range band.
    * @Default {null}
    */
  var endRange: js.UndefOr[Double] = js.native
  /** Range band opacity of the series.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Start value of the range band.
    * @Default {null}
    */
  var startRange: js.UndefOr[Double] = js.native
}

object RangeBandSettings {
  @scala.inline
  def apply(): RangeBandSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeBandSettings]
  }
  @scala.inline
  implicit class RangeBandSettingsOps[Self <: RangeBandSettings] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setEndRange(value: Double): Self = this.set("endRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndRange: Self = this.set("endRange", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setStartRange(value: Double): Self = this.set("startRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartRange: Self = this.set("startRange", js.undefined)
  }
  
}

