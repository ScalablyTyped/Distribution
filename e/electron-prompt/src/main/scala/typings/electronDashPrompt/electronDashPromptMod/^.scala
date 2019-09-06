package typings.electronDashPrompt.electronDashPromptMod

import typings.electron.electronMod.BrowserWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-prompt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[String | Null] = js.native
  def apply(options: Options): js.Promise[String | Null] = js.native
  def apply(options: Options, parentBrowserWindow: BrowserWindow): js.Promise[String | Null] = js.native
}

