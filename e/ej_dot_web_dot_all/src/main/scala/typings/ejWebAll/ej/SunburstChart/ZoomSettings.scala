package typings.ejWebAll.ej.SunburstChart

import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstHorizontalAlignment
import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstVerticalAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomSettings extends js.Object {
  /** Enables or disables zooming.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** Toolbar horizontal alignment
    * @Default {right. See Alignment}
    */
  var toolbarHorizontalAlignment: js.UndefOr[SunburstHorizontalAlignment | String] = js.native
  /** Toolbar vertical alignment
    * @Default {top. See Alignment}
    */
  var toolbarVerticalAlignment: js.UndefOr[SunburstVerticalAlignment | String] = js.native
}

object ZoomSettings {
  @scala.inline
  def apply(): ZoomSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomSettings]
  }
  @scala.inline
  implicit class ZoomSettingsOps[Self <: ZoomSettings] (val x: Self) extends AnyVal {
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setToolbarHorizontalAlignment(value: SunburstHorizontalAlignment | String): Self = this.set("toolbarHorizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbarHorizontalAlignment: Self = this.set("toolbarHorizontalAlignment", js.undefined)
    @scala.inline
    def setToolbarVerticalAlignment(value: SunburstVerticalAlignment | String): Self = this.set("toolbarVerticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbarVerticalAlignment: Self = this.set("toolbarVerticalAlignment", js.undefined)
  }
  
}

