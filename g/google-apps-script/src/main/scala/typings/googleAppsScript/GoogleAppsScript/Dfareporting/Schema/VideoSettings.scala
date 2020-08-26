package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoSettings extends js.Object {
  var companionSettings: js.UndefOr[CompanionSetting] = js.native
  var kind: js.UndefOr[String] = js.native
  var orientation: js.UndefOr[String] = js.native
  var skippableSettings: js.UndefOr[SkippableSetting] = js.native
  var transcodeSettings: js.UndefOr[TranscodeSetting] = js.native
}

object VideoSettings {
  @scala.inline
  def apply(): VideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSettings]
  }
  @scala.inline
  implicit class VideoSettingsOps[Self <: VideoSettings] (val x: Self) extends AnyVal {
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
    def setCompanionSettings(value: CompanionSetting): Self = this.set("companionSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanionSettings: Self = this.set("companionSettings", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setSkippableSettings(value: SkippableSetting): Self = this.set("skippableSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkippableSettings: Self = this.set("skippableSettings", js.undefined)
    @scala.inline
    def setTranscodeSettings(value: TranscodeSetting): Self = this.set("transcodeSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranscodeSettings: Self = this.set("transcodeSettings", js.undefined)
  }
  
}

