package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisibleOnAllWorkspacesOptions extends StObject {
  
  /**
    * Sets whether the window should be visible above fullscreen windows
    *
    * @platform darwin
    */
  var visibleOnFullScreen: js.UndefOr[Boolean] = js.native
}
object VisibleOnAllWorkspacesOptions {
  
  @scala.inline
  def apply(): VisibleOnAllWorkspacesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisibleOnAllWorkspacesOptions]
  }
  
  @scala.inline
  implicit class VisibleOnAllWorkspacesOptionsMutableBuilder[Self <: VisibleOnAllWorkspacesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisibleOnFullScreen(value: Boolean): Self = StObject.set(x, "visibleOnFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleOnFullScreenUndefined: Self = StObject.set(x, "visibleOnFullScreen", js.undefined)
  }
}
