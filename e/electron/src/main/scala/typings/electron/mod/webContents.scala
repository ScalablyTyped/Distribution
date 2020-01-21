package typings.electron.mod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "webContents")
@js.native
object webContents
  extends Instantiable0[typings.electron.Electron.WebContents_] {
  // Docs: http://electronjs.org/docs/api/web-contents
  def fromId(id: Double): typings.electron.Electron.WebContents_ = js.native
  def getAllWebContents(): js.Array[typings.electron.Electron.WebContents_] = js.native
  def getFocusedWebContents(): typings.electron.Electron.WebContents_ = js.native
}

