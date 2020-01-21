package typings.electron.Electron

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.webContents")
@js.native
object webContents extends Instantiable0[WebContents_] {
  // Docs: http://electronjs.org/docs/api/web-contents
  def fromId(id: Double): WebContents_ = js.native
  def getAllWebContents(): js.Array[WebContents_] = js.native
  def getFocusedWebContents(): WebContents_ = js.native
}

