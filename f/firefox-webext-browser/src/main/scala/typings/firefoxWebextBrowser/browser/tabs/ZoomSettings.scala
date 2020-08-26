package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines how zoom changes in a tab are handled and at what scope. */
@js.native
trait ZoomSettings extends js.Object {
  /** Used to return the default zoom level for the current tab in calls to tabs.getZoomSettings. */
  var defaultZoomFactor: js.UndefOr[Double] = js.native
  /**
    * Defines how zoom changes are handled, i.e. which entity is responsible for the actual scaling of the page;
    * defaults to `automatic`.
    */
  var mode: js.UndefOr[ZoomSettingsMode] = js.native
  /**
    * Defines whether zoom changes will persist for the page's origin, or only take effect in this tab; defaults
    * to `per-origin` when in `automatic` mode, and `per-tab` otherwise.
    */
  var scope: js.UndefOr[ZoomSettingsScope] = js.native
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
    def setDefaultZoomFactor(value: Double): Self = this.set("defaultZoomFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultZoomFactor: Self = this.set("defaultZoomFactor", js.undefined)
    @scala.inline
    def setMode(value: ZoomSettingsMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setScope(value: ZoomSettingsScope): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

