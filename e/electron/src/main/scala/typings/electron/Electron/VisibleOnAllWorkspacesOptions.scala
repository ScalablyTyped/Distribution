package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleOnAllWorkspacesOptions extends StObject {
  
  /**
    * Sets whether the window should be visible above fullscreen windows
    *
    * @platform darwin
    */
  var visibleOnFullScreen: js.UndefOr[Boolean] = js.undefined
}
object VisibleOnAllWorkspacesOptions {
  
  inline def apply(): VisibleOnAllWorkspacesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisibleOnAllWorkspacesOptions]
  }
  
  extension [Self <: VisibleOnAllWorkspacesOptions](x: Self) {
    
    inline def setVisibleOnFullScreen(value: Boolean): Self = StObject.set(x, "visibleOnFullScreen", value.asInstanceOf[js.Any])
    
    inline def setVisibleOnFullScreenUndefined: Self = StObject.set(x, "visibleOnFullScreen", js.undefined)
  }
}
