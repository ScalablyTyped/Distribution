package typings.forgeViewer.Autodesk.Viewing

import typings.forgeViewer.forgeViewerStrings.`2d`
import typings.forgeViewer.forgeViewerStrings.`3d`
import typings.forgeViewer.forgeViewerStrings.geometry
import typings.forgeViewer.forgeViewerStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BubbleNodeSearchProps extends StObject {
  
  var mime: js.UndefOr[String] = js.undefined
  
  var role: js.UndefOr[`3d` | `2d` | String] = js.undefined
  
  var `type`: js.UndefOr[view | geometry | String] = js.undefined
}
object BubbleNodeSearchProps {
  
  inline def apply(): BubbleNodeSearchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BubbleNodeSearchProps]
  }
  
  extension [Self <: BubbleNodeSearchProps](x: Self) {
    
    inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    inline def setRole(value: `3d` | `2d` | String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setType(value: view | geometry | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
