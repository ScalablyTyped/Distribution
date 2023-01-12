package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirefoxSpecificProperties extends StObject {
  
  var id: js.UndefOr[ExtensionID] = js.undefined
  
  var strict_max_version: js.UndefOr[String] = js.undefined
  
  var strict_min_version: js.UndefOr[String] = js.undefined
  
  var update_url: js.UndefOr[String] = js.undefined
}
object FirefoxSpecificProperties {
  
  inline def apply(): FirefoxSpecificProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirefoxSpecificProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirefoxSpecificProperties] (val x: Self) extends AnyVal {
    
    inline def setId(value: ExtensionID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setStrict_max_version(value: String): Self = StObject.set(x, "strict_max_version", value.asInstanceOf[js.Any])
    
    inline def setStrict_max_versionUndefined: Self = StObject.set(x, "strict_max_version", js.undefined)
    
    inline def setStrict_min_version(value: String): Self = StObject.set(x, "strict_min_version", value.asInstanceOf[js.Any])
    
    inline def setStrict_min_versionUndefined: Self = StObject.set(x, "strict_min_version", js.undefined)
    
    inline def setUpdate_url(value: String): Self = StObject.set(x, "update_url", value.asInstanceOf[js.Any])
    
    inline def setUpdate_urlUndefined: Self = StObject.set(x, "update_url", js.undefined)
  }
}
