package typings.electronUtil.mod

import typings.electron.mod.BrowserWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron-util", "runJS")
@js.native
object runJS extends js.Object {
  
  def apply(code: String): js.Promise[_] = js.native
  def apply(code: String, window: BrowserWindow): js.Promise[_] = js.native
}
