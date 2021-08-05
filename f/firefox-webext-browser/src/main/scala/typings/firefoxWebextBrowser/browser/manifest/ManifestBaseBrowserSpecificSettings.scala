package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestBaseBrowserSpecificSettings extends StObject {
  
  var edge: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var gecko: js.UndefOr[FirefoxSpecificProperties] = js.undefined
}
object ManifestBaseBrowserSpecificSettings {
  
  inline def apply(): ManifestBaseBrowserSpecificSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestBaseBrowserSpecificSettings]
  }
  
  extension [Self <: ManifestBaseBrowserSpecificSettings](x: Self) {
    
    inline def setEdge(value: StringDictionary[js.Any]): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    
    inline def setGecko(value: FirefoxSpecificProperties): Self = StObject.set(x, "gecko", value.asInstanceOf[js.Any])
    
    inline def setGeckoUndefined: Self = StObject.set(x, "gecko", js.undefined)
  }
}
