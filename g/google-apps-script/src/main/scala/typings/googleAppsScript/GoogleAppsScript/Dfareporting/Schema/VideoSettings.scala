package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSettings extends js.Object {
  var companionSettings: js.UndefOr[CompanionSetting] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var skippableSettings: js.UndefOr[SkippableSetting] = js.undefined
  var transcodeSettings: js.UndefOr[TranscodeSetting] = js.undefined
}

object VideoSettings {
  @scala.inline
  def apply(
    companionSettings: CompanionSetting = null,
    kind: String = null,
    orientation: String = null,
    skippableSettings: SkippableSetting = null,
    transcodeSettings: TranscodeSetting = null
  ): VideoSettings = {
    val __obj = js.Dynamic.literal()
    if (companionSettings != null) __obj.updateDynamic("companionSettings")(companionSettings.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (skippableSettings != null) __obj.updateDynamic("skippableSettings")(skippableSettings.asInstanceOf[js.Any])
    if (transcodeSettings != null) __obj.updateDynamic("transcodeSettings")(transcodeSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoSettings]
  }
}

