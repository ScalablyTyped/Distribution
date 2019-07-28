package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteVideoSettings extends js.Object {
  var companionSettings: js.UndefOr[SiteCompanionSetting] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var skippableSettings: js.UndefOr[SiteSkippableSetting] = js.undefined
  var transcodeSettings: js.UndefOr[SiteTranscodeSetting] = js.undefined
}

object SiteVideoSettings {
  @scala.inline
  def apply(
    companionSettings: SiteCompanionSetting = null,
    kind: String = null,
    orientation: String = null,
    skippableSettings: SiteSkippableSetting = null,
    transcodeSettings: SiteTranscodeSetting = null
  ): SiteVideoSettings = {
    val __obj = js.Dynamic.literal()
    if (companionSettings != null) __obj.updateDynamic("companionSettings")(companionSettings)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (skippableSettings != null) __obj.updateDynamic("skippableSettings")(skippableSettings)
    if (transcodeSettings != null) __obj.updateDynamic("transcodeSettings")(transcodeSettings)
    __obj.asInstanceOf[SiteVideoSettings]
  }
}

