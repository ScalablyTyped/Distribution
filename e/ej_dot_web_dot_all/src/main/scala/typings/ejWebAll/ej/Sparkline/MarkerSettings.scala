package typings.ejWebAll.ej.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerSettings extends js.Object {
  /** Options for customizing the border of the marker shape.
    */
  var border: js.UndefOr[MarkerSettingsBorder] = js.native
  /** Color of the marker shape.
    * @Default {white}
    */
  var fill: js.UndefOr[String] = js.native
  /** Controls the opacity of the marker.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Controls the visibility of the marker shape.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
  /** width of the marker shape.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.native
}

object MarkerSettings {
  @scala.inline
  def apply(): MarkerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerSettings]
  }
  @scala.inline
  implicit class MarkerSettingsOps[Self <: MarkerSettings] (val x: Self) extends AnyVal {
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
    def setBorder(value: MarkerSettingsBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

