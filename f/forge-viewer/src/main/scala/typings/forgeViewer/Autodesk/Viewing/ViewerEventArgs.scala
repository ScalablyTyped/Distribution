package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewerEventArgs
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var model: js.UndefOr[ViewerItem] = js.undefined
  
  var target: js.UndefOr[Viewer3D] = js.undefined
  
  var `type`: String
}
object ViewerEventArgs {
  
  inline def apply(`type`: String): ViewerEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewerEventArgs]
  }
  
  extension [Self <: ViewerEventArgs](x: Self) {
    
    inline def setModel(value: ViewerItem): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setTarget(value: Viewer3D): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
