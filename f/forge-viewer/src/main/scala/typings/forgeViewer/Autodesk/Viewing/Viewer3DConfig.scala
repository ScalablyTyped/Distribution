package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StringDictionary
import typings.forgeViewer.forgeViewerStrings.`dark-theme`
import typings.forgeViewer.forgeViewerStrings.`light-theme`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewer3DConfig
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var startOnInitialize: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[`dark-theme` | `light-theme` | String] = js.undefined
}
object Viewer3DConfig {
  
  inline def apply(): Viewer3DConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Viewer3DConfig]
  }
  
  extension [Self <: Viewer3DConfig](x: Self) {
    
    inline def setStartOnInitialize(value: Boolean): Self = StObject.set(x, "startOnInitialize", value.asInstanceOf[js.Any])
    
    inline def setStartOnInitializeUndefined: Self = StObject.set(x, "startOnInitialize", js.undefined)
    
    inline def setTheme(value: `dark-theme` | `light-theme` | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
