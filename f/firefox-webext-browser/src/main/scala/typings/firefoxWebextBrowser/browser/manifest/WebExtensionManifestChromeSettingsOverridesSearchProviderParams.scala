package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionManifestChromeSettingsOverridesSearchProviderParams extends StObject {
  
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
object WebExtensionManifestChromeSettingsOverridesSearchProviderParams {
  
  @scala.inline
  def apply(name: String): WebExtensionManifestChromeSettingsOverridesSearchProviderParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestChromeSettingsOverridesSearchProviderParams]
  }
  
  @scala.inline
  implicit class WebExtensionManifestChromeSettingsOverridesSearchProviderParamsMutableBuilder[Self <: WebExtensionManifestChromeSettingsOverridesSearchProviderParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPref(value: String): Self = StObject.set(x, "pref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefUndefined: Self = StObject.set(x, "pref", js.undefined)
    
    @scala.inline
    def setPurpose(value: WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
