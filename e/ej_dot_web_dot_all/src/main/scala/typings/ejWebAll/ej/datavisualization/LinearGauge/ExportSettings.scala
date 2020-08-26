package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSettings extends js.Object {
  /** Specifies the name of the action URL
    */
  var action: js.UndefOr[String] = js.native
  /** Specifies the downloading filename
    * @Default {LinearGauge}
    */
  var filename: js.UndefOr[String] = js.native
  /** Specifies the mode of exporting
    * @Default {client}
    */
  var mode: js.UndefOr[ExportingMode | String] = js.native
  /** Specifies the format of the file to export
    * @Default {png}
    */
  var `type`: js.UndefOr[ExportingType | String] = js.native
}

object ExportSettings {
  @scala.inline
  def apply(): ExportSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportSettings]
  }
  @scala.inline
  implicit class ExportSettingsOps[Self <: ExportSettings] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setMode(value: ExportingMode | String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setType(value: ExportingType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

