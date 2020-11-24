package typings.electron.anon

import org.scalablytyped.runtime.Instantiable0
import typings.electron.Electron.ContextBridge
import typings.electron.Electron.IpcRenderer
import typings.electron.Electron.Remote
import typings.electron.Electron.Renderer.BrowserWindowProxy
import typings.electron.Electron.WebFrame
import typings.electron.Electron.WebviewTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRenderer extends js.Object {
  
  var BrowserWindowProxy: Instantiable0[typings.electron.Electron.Renderer.BrowserWindowProxy] = js.native
  
  val contextBridge: ContextBridge = js.native
  
  val ipcRenderer: IpcRenderer = js.native
  
  val remote: Remote = js.native
  
  val webFrame: WebFrame = js.native
  
  val webviewTag: WebviewTag = js.native
}
object TypeofRenderer {
  
  @scala.inline
  def apply(
    BrowserWindowProxy: Instantiable0[BrowserWindowProxy],
    contextBridge: ContextBridge,
    ipcRenderer: IpcRenderer,
    remote: Remote,
    webFrame: WebFrame,
    webviewTag: WebviewTag
  ): TypeofRenderer = {
    val __obj = js.Dynamic.literal(BrowserWindowProxy = BrowserWindowProxy.asInstanceOf[js.Any], contextBridge = contextBridge.asInstanceOf[js.Any], ipcRenderer = ipcRenderer.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], webFrame = webFrame.asInstanceOf[js.Any], webviewTag = webviewTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRenderer]
  }
  
  @scala.inline
  implicit class TypeofRendererOps[Self <: TypeofRenderer] (val x: Self) extends AnyVal {
    
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
    def setBrowserWindowProxy(value: Instantiable0[BrowserWindowProxy]): Self = this.set("BrowserWindowProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextBridge(value: ContextBridge): Self = this.set("contextBridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpcRenderer(value: IpcRenderer): Self = this.set("ipcRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemote(value: Remote): Self = this.set("remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebFrame(value: WebFrame): Self = this.set("webFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebviewTag(value: WebviewTag): Self = this.set("webviewTag", value.asInstanceOf[js.Any])
  }
}
