package typings.electron.Electron

import typings.electron.electronStrings.bottom
import typings.electron.electronStrings.detach
import typings.electron.electronStrings.right
import typings.electron.electronStrings.undocked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenDevToolsOptions extends StObject {
  
  /**
    * Whether to bring the opened devtools window to the foreground. The default is
    * `true`.
    */
  var activate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Opens the devtools with specified dock state, can be `right`, `bottom`,
    * `undocked`, `detach`. Defaults to last used dock state. In `undocked` mode it's
    * possible to dock back. In `detach` mode it's not.
    */
  var mode: right | bottom | undocked | detach
}
object OpenDevToolsOptions {
  
  @scala.inline
  def apply(mode: right | bottom | undocked | detach): OpenDevToolsOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenDevToolsOptions]
  }
  
  @scala.inline
  implicit class OpenDevToolsOptionsMutableBuilder[Self <: OpenDevToolsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: Boolean): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    @scala.inline
    def setMode(value: right | bottom | undocked | detach): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
