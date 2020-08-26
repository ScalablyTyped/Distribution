package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crosshair extends js.Object {
  /** Options for customizing the crosshair line.
    */
  var line: js.UndefOr[CrosshairLine] = js.native
  /** Options for customizing the marker in crosshair.
    */
  var marker: js.UndefOr[CrosshairMarker] = js.native
  /** Options for customizing the trackball tooltip.
    */
  var trackballTooltipSettings: js.UndefOr[CrosshairTrackballTooltipSettings] = js.native
  /** Specifies the type of the crosshair. It can be trackball or crosshair
    * @Default {crosshair. See CrosshairType}
    */
  var `type`: js.UndefOr[CrosshairType | String] = js.native
  /** Show/hides the crosshair/trackball visibility.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object Crosshair {
  @scala.inline
  def apply(): Crosshair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Crosshair]
  }
  @scala.inline
  implicit class CrosshairOps[Self <: Crosshair] (val x: Self) extends AnyVal {
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
    def setLine(value: CrosshairLine): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setMarker(value: CrosshairMarker): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setTrackballTooltipSettings(value: CrosshairTrackballTooltipSettings): Self = this.set("trackballTooltipSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackballTooltipSettings: Self = this.set("trackballTooltipSettings", js.undefined)
    @scala.inline
    def setType(value: CrosshairType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

