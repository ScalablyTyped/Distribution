package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonSeriesOptionsEmptyPointSettings extends js.Object {
  /** Specifies the mode of empty point.
    * @Default {gap}
    */
  var displayMode: js.UndefOr[EmptyPointMode | String] = js.native
  /** Options for customizing the color and border of the empty point in the series.
    */
  var style: js.UndefOr[CommonSeriesOptionsEmptyPointSettingsStyle] = js.native
  /** Controls the visibility of the empty point.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object CommonSeriesOptionsEmptyPointSettings {
  @scala.inline
  def apply(): CommonSeriesOptionsEmptyPointSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonSeriesOptionsEmptyPointSettings]
  }
  @scala.inline
  implicit class CommonSeriesOptionsEmptyPointSettingsOps[Self <: CommonSeriesOptionsEmptyPointSettings] (val x: Self) extends AnyVal {
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
    def setDisplayMode(value: EmptyPointMode | String): Self = this.set("displayMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayMode: Self = this.set("displayMode", js.undefined)
    @scala.inline
    def setStyle(value: CommonSeriesOptionsEmptyPointSettingsStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

