package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrosshairTrackballTooltipSettings extends js.Object {
  /** Options for customizing the trackball tooltip border.
    */
  var border: js.UndefOr[CrosshairTrackballTooltipSettingsBorder] = js.native
  /** Background color of the trackball tooltip.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.native
  /** Specifies the mode of the trackball tooltip.
    * @Default {float. See CrosshairMode}
    */
  var mode: js.UndefOr[CrosshairMode | String] = js.native
  /** Opacity value of the trackball tooltip.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Rounded corner x value of the trackball tooltip.
    * @Default {3}
    */
  var rx: js.UndefOr[Double] = js.native
  /** Rounded corner y value of the trackball tooltip.
    * @Default {3}
    */
  var ry: js.UndefOr[Double] = js.native
}

object CrosshairTrackballTooltipSettings {
  @scala.inline
  def apply(): CrosshairTrackballTooltipSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrosshairTrackballTooltipSettings]
  }
  @scala.inline
  implicit class CrosshairTrackballTooltipSettingsOps[Self <: CrosshairTrackballTooltipSettings] (val x: Self) extends AnyVal {
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
    def setBorder(value: CrosshairTrackballTooltipSettingsBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setMode(value: CrosshairMode | String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setRx(value: Double): Self = this.set("rx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRx: Self = this.set("rx", js.undefined)
    @scala.inline
    def setRy(value: Double): Self = this.set("ry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRy: Self = this.set("ry", js.undefined)
  }
  
}

