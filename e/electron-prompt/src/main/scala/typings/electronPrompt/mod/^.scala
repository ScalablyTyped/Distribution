package typings.electronPrompt.mod

import typings.electron.mod.BrowserWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-prompt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[String | Null] = js.native
  def apply(options: js.UndefOr[scala.Nothing], parentBrowserWindow: BrowserWindow): js.Promise[String | Null] = js.native
  def apply(options: Options): js.Promise[String | Null] = js.native
  def apply(options: Options, parentBrowserWindow: BrowserWindow): js.Promise[String | Null] = js.native
}

