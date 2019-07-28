package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteSettings extends js.Object {
  var activeViewOptOut: js.UndefOr[Boolean] = js.undefined
  var adBlockingOptOut: js.UndefOr[Boolean] = js.undefined
  var disableNewCookie: js.UndefOr[Boolean] = js.undefined
  var tagSetting: js.UndefOr[TagSetting] = js.undefined
  var videoActiveViewOptOutTemplate: js.UndefOr[Boolean] = js.undefined
  var vpaidAdapterChoiceTemplate: js.UndefOr[String] = js.undefined
}

object SiteSettings {
  @scala.inline
  def apply(
    activeViewOptOut: js.UndefOr[Boolean] = js.undefined,
    adBlockingOptOut: js.UndefOr[Boolean] = js.undefined,
    disableNewCookie: js.UndefOr[Boolean] = js.undefined,
    tagSetting: TagSetting = null,
    videoActiveViewOptOutTemplate: js.UndefOr[Boolean] = js.undefined,
    vpaidAdapterChoiceTemplate: String = null
  ): SiteSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeViewOptOut)) __obj.updateDynamic("activeViewOptOut")(activeViewOptOut)
    if (!js.isUndefined(adBlockingOptOut)) __obj.updateDynamic("adBlockingOptOut")(adBlockingOptOut)
    if (!js.isUndefined(disableNewCookie)) __obj.updateDynamic("disableNewCookie")(disableNewCookie)
    if (tagSetting != null) __obj.updateDynamic("tagSetting")(tagSetting)
    if (!js.isUndefined(videoActiveViewOptOutTemplate)) __obj.updateDynamic("videoActiveViewOptOutTemplate")(videoActiveViewOptOutTemplate)
    if (vpaidAdapterChoiceTemplate != null) __obj.updateDynamic("vpaidAdapterChoiceTemplate")(vpaidAdapterChoiceTemplate)
    __obj.asInstanceOf[SiteSettings]
  }
}

