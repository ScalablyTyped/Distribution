package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSettings extends js.Object {
  var companionSettings: js.UndefOr[CompanionSetting] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  var skippableSettings: js.UndefOr[SkippableSetting] = js.undefined
  var transcodeSettings: js.UndefOr[TranscodeSetting] = js.undefined
}

object VideoSettings {
  @scala.inline
  def apply(
    companionSettings: CompanionSetting = null,
    kind: java.lang.String = null,
    orientation: java.lang.String = null,
    skippableSettings: SkippableSetting = null,
    transcodeSettings: TranscodeSetting = null
  ): VideoSettings = {
    val __obj = js.Dynamic.literal()
    if (companionSettings != null) __obj.updateDynamic("companionSettings")(companionSettings)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (skippableSettings != null) __obj.updateDynamic("skippableSettings")(skippableSettings)
    if (transcodeSettings != null) __obj.updateDynamic("transcodeSettings")(transcodeSettings)
    __obj.asInstanceOf[VideoSettings]
  }
}

