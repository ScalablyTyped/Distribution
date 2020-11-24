package typings.electronDebug.mod

import typings.electronDebug.electronDebugStrings.bottom
import typings.electronDebug.electronDebugStrings.detach
import typings.electronDebug.electronDebugStrings.previous
import typings.electronDebug.electronDebugStrings.right
import typings.electronDebug.electronDebugStrings.undocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
  		The dock state to open DevTools in.
  		@default 'previous'
  		*/
  val devToolsMode: js.UndefOr[undocked | right | bottom | previous | detach] = js.native
  
  /**
  		Default: [Only in development](https://github.com/sindresorhus/electron-is-dev)
  		*/
  val isEnabled: js.UndefOr[Boolean] = js.native
  
  /**
  		Show DevTools on each created `BrowserWindow`.
  		@default true
  		*/
  val showDevTools: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDevToolsMode(value: undocked | right | bottom | previous | detach): Self = this.set("devToolsMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevToolsMode: Self = this.set("devToolsMode", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    
    @scala.inline
    def setShowDevTools(value: Boolean): Self = this.set("showDevTools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDevTools: Self = this.set("showDevTools", js.undefined)
  }
}
