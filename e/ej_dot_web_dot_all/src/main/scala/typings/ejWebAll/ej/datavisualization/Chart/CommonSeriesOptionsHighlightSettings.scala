package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonSeriesOptionsHighlightSettings extends js.Object {
  /** Options for customizing the border of series on highlight.
    */
  var border: js.UndefOr[CommonSeriesOptionsHighlightSettingsBorder] = js.native
  /** Color of the series/point on highlight.
    */
  var color: js.UndefOr[String] = js.native
  /** Custom pattern for the series on highlight.
    */
  var customPattern: js.UndefOr[String] = js.native
  /** Enables/disables the ability to highlight the series or data point interactively.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** Specifies whether the series or data point has to be highlighted.
    * @Default {series. See Mode}
    */
  var mode: js.UndefOr[Mode | String] = js.native
  /** Opacity of the series/point on highlight.
    * @Default {0.6}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specifies the pattern for the series/point on highlight.
    * @Default {none. See Pattern}
    */
  var pattern: js.UndefOr[String] = js.native
}

object CommonSeriesOptionsHighlightSettings {
  @scala.inline
  def apply(): CommonSeriesOptionsHighlightSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonSeriesOptionsHighlightSettings]
  }
  @scala.inline
  implicit class CommonSeriesOptionsHighlightSettingsOps[Self <: CommonSeriesOptionsHighlightSettings] (val x: Self) extends AnyVal {
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
    def setBorder(value: CommonSeriesOptionsHighlightSettingsBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCustomPattern(value: String): Self = this.set("customPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomPattern: Self = this.set("customPattern", js.undefined)
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setMode(value: Mode | String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
  }
  
}

