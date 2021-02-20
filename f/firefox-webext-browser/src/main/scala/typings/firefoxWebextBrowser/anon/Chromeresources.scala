package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.UndefinedChromeResources
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chromeresources extends StObject {
  
  var chrome_resources: UndefinedChromeResources = js.native
  
  var version: String = js.native
}
object Chromeresources {
  
  @scala.inline
  def apply(chrome_resources: UndefinedChromeResources, version: String): Chromeresources = {
    val __obj = js.Dynamic.literal(chrome_resources = chrome_resources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chromeresources]
  }
  
  @scala.inline
  implicit class ChromeresourcesMutableBuilder[Self <: Chromeresources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChrome_resources(value: UndefinedChromeResources): Self = StObject.set(x, "chrome_resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
