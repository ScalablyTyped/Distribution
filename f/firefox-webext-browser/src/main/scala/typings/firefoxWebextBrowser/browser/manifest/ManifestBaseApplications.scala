package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestBaseApplications extends StObject {
  
  var gecko: js.UndefOr[FirefoxSpecificProperties] = js.undefined
}
object ManifestBaseApplications {
  
  inline def apply(): ManifestBaseApplications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestBaseApplications]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManifestBaseApplications] (val x: Self) extends AnyVal {
    
    inline def setGecko(value: FirefoxSpecificProperties): Self = StObject.set(x, "gecko", value.asInstanceOf[js.Any])
    
    inline def setGeckoUndefined: Self = StObject.set(x, "gecko", js.undefined)
  }
}
