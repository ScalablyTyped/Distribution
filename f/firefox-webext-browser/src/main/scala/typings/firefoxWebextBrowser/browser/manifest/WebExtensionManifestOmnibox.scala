package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestOmnibox extends StObject {
  
  var keyword: String
}
object WebExtensionManifestOmnibox {
  
  inline def apply(keyword: String): WebExtensionManifestOmnibox = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestOmnibox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebExtensionManifestOmnibox] (val x: Self) extends AnyVal {
    
    inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
  }
}
