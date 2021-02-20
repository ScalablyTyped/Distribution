package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionManifestDeveloper extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object WebExtensionManifestDeveloper {
  
  @scala.inline
  def apply(): WebExtensionManifestDeveloper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestDeveloper]
  }
  
  @scala.inline
  implicit class WebExtensionManifestDeveloperMutableBuilder[Self <: WebExtensionManifestDeveloper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
