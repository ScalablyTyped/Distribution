package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestChromeSettingsOverridesSearchProviderParams extends StObject {
  
  /** The type of param can be either "purpose" or "pref". */
  var condition: js.UndefOr[WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition] = js.undefined
  
  /** A url parameter name */
  var name: String
  
  /** The preference to retrieve the value from. */
  var pref: js.UndefOr[String] = js.undefined
  
  /** The context that initiates a search, required if condition is "purpose". */
  var purpose: js.UndefOr[WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose] = js.undefined
  
  /** A url parameter value. */
  var value: js.UndefOr[String] = js.undefined
}
object WebExtensionManifestChromeSettingsOverridesSearchProviderParams {
  
  inline def apply(name: String): WebExtensionManifestChromeSettingsOverridesSearchProviderParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestChromeSettingsOverridesSearchProviderParams]
  }
  
  extension [Self <: WebExtensionManifestChromeSettingsOverridesSearchProviderParams](x: Self) {
    
    inline def setCondition(value: WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPref(value: String): Self = StObject.set(x, "pref", value.asInstanceOf[js.Any])
    
    inline def setPrefUndefined: Self = StObject.set(x, "pref", js.undefined)
    
    inline def setPurpose(value: WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
