package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirefoxSpecificProperties extends StObject {
  
  var id: js.UndefOr[ExtensionID] = js.native
  
  var strict_max_version: js.UndefOr[String] = js.native
  
  var strict_min_version: js.UndefOr[String] = js.native
  
  var update_url: js.UndefOr[String] = js.native
}
object FirefoxSpecificProperties {
  
  @scala.inline
  def apply(): FirefoxSpecificProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirefoxSpecificProperties]
  }
  
  @scala.inline
  implicit class FirefoxSpecificPropertiesMutableBuilder[Self <: FirefoxSpecificProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ExtensionID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setStrict_max_version(value: String): Self = StObject.set(x, "strict_max_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrict_max_versionUndefined: Self = StObject.set(x, "strict_max_version", js.undefined)
    
    @scala.inline
    def setStrict_min_version(value: String): Self = StObject.set(x, "strict_min_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrict_min_versionUndefined: Self = StObject.set(x, "strict_min_version", js.undefined)
    
    @scala.inline
    def setUpdate_url(value: String): Self = StObject.set(x, "update_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate_urlUndefined: Self = StObject.set(x, "update_url", js.undefined)
  }
}
