package typings.electron.electronMod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "WebContents")
@js.native
class WebContents ()
  extends typings.electron.ElectronNs.WebContents

@JSImport("electron", "webContents")
@js.native
class webContentsCls ()
  extends typings.electron.ElectronNs.WebContents

/* static members */
@JSImport("electron", "WebContents")
@js.native
object WebContents extends js.Object {
  // Docs: http://electronjs.org/docs/api/web-contents
  def fromId(id: Double): typings.electron.ElectronNs.WebContents = js.native
  def getAllWebContents(): js.Array[typings.electron.ElectronNs.WebContents] = js.native
  def getFocusedWebContents(): typings.electron.ElectronNs.WebContents = js.native
}

@JSImport("electron", "webContents")
@js.native
object webContents
  extends Instantiable0[typings.electron.ElectronNs.WebContents] {
  // Docs: http://electronjs.org/docs/api/web-contents
  def fromId(id: Double): typings.electron.ElectronNs.WebContents = js.native
  def getAllWebContents(): js.Array[typings.electron.ElectronNs.WebContents] = js.native
  def getFocusedWebContents(): typings.electron.ElectronNs.WebContents = js.native
}

