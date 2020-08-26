package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
import typings.firefoxWebextBrowser.browser.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  /** The type of param can be either "purpose" or "pref". */
  var condition: js.UndefOr[WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition] = js.native
  /** A url parameter name */
  var name: String = js.native
  /** The preference to retrieve the value from. */
  var pref: js.UndefOr[String] = js.native
  /** The context that initiates a search, required if condition is "purpose". */
  var purpose: js.UndefOr[WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose] = js.native
  /** A url parameter value. */
  var value: js.UndefOr[String] = js.native
}

object Condition {
  @scala.inline
  def apply(name: String): Condition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCondition(value: WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setPref(value: String): Self = this.set("pref", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePref: Self = this.set("pref", js.undefined)
    @scala.inline
    def setPurpose(value: WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose): Self = this.set("purpose", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurpose: Self = this.set("purpose", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

