package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSettings extends js.Object {
  /** Settings for the companion creatives of video creatives served to this placement. */
  var companionSettings: js.UndefOr[CompanionSetting] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#videoSettings". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Settings for the skippability of video creatives served to this placement. If this object is provided, the creative-level skippable settings will be
    * overridden.
    */
  var skippableSettings: js.UndefOr[SkippableSetting] = js.undefined
  /**
    * Settings for the transcodes of video creatives served to this placement. If this object is provided, the creative-level transcode settings will be
    * overridden.
    */
  var transcodeSettings: js.UndefOr[TranscodeSetting] = js.undefined
}

object VideoSettings {
  @scala.inline
  def apply(
    companionSettings: CompanionSetting = null,
    kind: String = null,
    skippableSettings: SkippableSetting = null,
    transcodeSettings: TranscodeSetting = null
  ): VideoSettings = {
    val __obj = js.Dynamic.literal()
    if (companionSettings != null) __obj.updateDynamic("companionSettings")(companionSettings.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (skippableSettings != null) __obj.updateDynamic("skippableSettings")(skippableSettings.asInstanceOf[js.Any])
    if (transcodeSettings != null) __obj.updateDynamic("transcodeSettings")(transcodeSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoSettings]
  }
}

