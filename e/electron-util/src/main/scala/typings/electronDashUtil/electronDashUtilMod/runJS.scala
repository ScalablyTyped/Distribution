package typings.electronDashUtil.electronDashUtilMod

import typings.electron.electronMod.BrowserWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-util", "runJS")
@js.native
object runJS extends js.Object {
  def apply(code: String): js.Promise[_] = js.native
  def apply(code: String, window: BrowserWindow): js.Promise[_] = js.native
}

