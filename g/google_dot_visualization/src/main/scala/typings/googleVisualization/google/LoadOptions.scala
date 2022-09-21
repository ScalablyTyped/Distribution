package typings.googleVisualization.google

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadOptions extends StObject {
  
  var callback: js.UndefOr[js.Function] = js.undefined
  
  /** not documented */
  var debug: js.UndefOr[Boolean] = js.undefined
  
  /** not documented, looks for charts-version in url query params */
  var enableUrlSettings: js.UndefOr[Boolean] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var mapsApiKey: js.UndefOr[String] = js.undefined
  
  var packages: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** not documented */
  var pseudo: js.UndefOr[Boolean] = js.undefined
  
  var safeMode: js.UndefOr[Boolean] = js.undefined
}
object LoadOptions {
  
  inline def apply(): LoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOptions]
  }
  
  extension [Self <: LoadOptions](x: Self) {
    
    inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setEnableUrlSettings(value: Boolean): Self = StObject.set(x, "enableUrlSettings", value.asInstanceOf[js.Any])
    
    inline def setEnableUrlSettingsUndefined: Self = StObject.set(x, "enableUrlSettings", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setMapsApiKey(value: String): Self = StObject.set(x, "mapsApiKey", value.asInstanceOf[js.Any])
    
    inline def setMapsApiKeyUndefined: Self = StObject.set(x, "mapsApiKey", js.undefined)
    
    inline def setPackages(value: String | js.Array[String]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    inline def setPackagesVarargs(value: String*): Self = StObject.set(x, "packages", js.Array(value*))
    
    inline def setPseudo(value: Boolean): Self = StObject.set(x, "pseudo", value.asInstanceOf[js.Any])
    
    inline def setPseudoUndefined: Self = StObject.set(x, "pseudo", js.undefined)
    
    inline def setSafeMode(value: Boolean): Self = StObject.set(x, "safeMode", value.asInstanceOf[js.Any])
    
    inline def setSafeModeUndefined: Self = StObject.set(x, "safeMode", js.undefined)
  }
}
