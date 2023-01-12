package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.UndefinedChromeResources
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chromeresources extends StObject {
  
  var chrome_resources: UndefinedChromeResources
  
  var version: String
}
object Chromeresources {
  
  inline def apply(chrome_resources: UndefinedChromeResources, version: String): Chromeresources = {
    val __obj = js.Dynamic.literal(chrome_resources = chrome_resources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chromeresources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Chromeresources] (val x: Self) extends AnyVal {
    
    inline def setChrome_resources(value: UndefinedChromeResources): Self = StObject.set(x, "chrome_resources", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
