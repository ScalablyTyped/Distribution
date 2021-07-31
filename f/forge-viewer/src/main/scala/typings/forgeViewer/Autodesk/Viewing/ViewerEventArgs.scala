package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewerEventArgs
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var model: js.UndefOr[ViewerItem] = js.undefined
  
  var target: js.UndefOr[Viewer3D] = js.undefined
  
  var `type`: String
}
object ViewerEventArgs {
  
  @scala.inline
  def apply(`type`: String): ViewerEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewerEventArgs]
  }
  
  @scala.inline
  implicit class ViewerEventArgsMutableBuilder[Self <: ViewerEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: ViewerItem): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setTarget(value: Viewer3D): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
