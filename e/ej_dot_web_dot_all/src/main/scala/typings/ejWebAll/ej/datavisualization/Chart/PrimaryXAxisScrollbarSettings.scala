package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimaryXAxisScrollbarSettings extends js.Object {
  /** Controls whether scrollbar has to be responsive in the chart.
    * @Default {false}
    */
  var canResize: js.UndefOr[Boolean] = js.native
  /** The maximum number of points to be displayed in the scrollbar.
    * @Default {null}
    */
  var pointsLength: js.UndefOr[Double] = js.native
  /** Options to customize the range for the scrollbar in the axis.
    */
  var range: js.UndefOr[PrimaryXAxisScrollbarSettingsRange] = js.native
  /** Specifies to enables or disables the scroll bar.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object PrimaryXAxisScrollbarSettings {
  @scala.inline
  def apply(): PrimaryXAxisScrollbarSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryXAxisScrollbarSettings]
  }
  @scala.inline
  implicit class PrimaryXAxisScrollbarSettingsOps[Self <: PrimaryXAxisScrollbarSettings] (val x: Self) extends AnyVal {
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
    def setCanResize(value: Boolean): Self = this.set("canResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanResize: Self = this.set("canResize", js.undefined)
    @scala.inline
    def setPointsLength(value: Double): Self = this.set("pointsLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointsLength: Self = this.set("pointsLength", js.undefined)
    @scala.inline
    def setRange(value: PrimaryXAxisScrollbarSettingsRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

