package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleOnAllWorkspacesOptions extends StObject {
  
  /**
    * Calling setVisibleOnAllWorkspaces will by default transform the process type
    * between UIElementApplication and ForegroundApplication to ensure the correct
    * behavior. However, this will hide the window and dock for a short time every
    * time it is called. If your window is already of type UIElementApplication, you
    * can bypass this transformation by passing true to skipTransformProcessType.
    *
    * @platform darwin
    */
  var skipTransformProcessType: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets whether the window should be visible above fullscreen windows.
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
    
    inline def setSkipTransformProcessType(value: Boolean): Self = StObject.set(x, "skipTransformProcessType", value.asInstanceOf[js.Any])
    
    inline def setSkipTransformProcessTypeUndefined: Self = StObject.set(x, "skipTransformProcessType", js.undefined)
    
    inline def setVisibleOnFullScreen(value: Boolean): Self = StObject.set(x, "visibleOnFullScreen", value.asInstanceOf[js.Any])
    
    inline def setVisibleOnFullScreenUndefined: Self = StObject.set(x, "visibleOnFullScreen", js.undefined)
  }
}
