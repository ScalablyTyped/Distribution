package typings.ejWebAll.ej.datavisualization.SunburstChart

import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstHighlightMode
import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstHighlightType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightSettings extends js.Object {
  /** Color of the levels/point on highlight.
    * @Default {red}
    */
  var color: js.UndefOr[String] = js.native
  /** Enables/disables the ability to highlight the levels or point interactively.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** Specifies whether the levels or point has to be highlighted.
    * @Default {point. See Mode}
    */
  var mode: js.UndefOr[SunburstHighlightMode | String] = js.native
  /** Opacity of the levels/point on highlight.
    * @Default {0.5}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specifies whether the levels or data point has to be highlighted.
    * @Default {opacity. See Mode}
    */
  var `type`: js.UndefOr[SunburstHighlightType | String] = js.native
}

object HighlightSettings {
  @scala.inline
  def apply(): HighlightSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightSettings]
  }
  @scala.inline
  implicit class HighlightSettingsOps[Self <: HighlightSettings] (val x: Self) extends AnyVal {
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setMode(value: SunburstHighlightMode | String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setType(value: SunburstHighlightType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

