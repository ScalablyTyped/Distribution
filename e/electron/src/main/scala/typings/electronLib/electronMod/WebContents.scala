package typings
package electronLib.electronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "WebContents")
@js.native
class WebContents ()
  extends electronLib.ElectronNs.WebContents

@JSImport("electron", "webContents")
@js.native
class webContentsCls ()
  extends electronLib.ElectronNs.WebContents

/* static members */
@JSImport("electron", "WebContents")
@js.native
object WebContents extends js.Object {
  // Docs: http://electronjs.org/docs/api/web-contents
  def fromId(id: scala.Double): electronLib.ElectronNs.WebContents = js.native
  def getAllWebContents(): js.Array[electronLib.ElectronNs.WebContents] = js.native
  def getFocusedWebContents(): electronLib.ElectronNs.WebContents = js.native
}

@JSImport("electron", "webContents")
@js.native
object webContents
  extends org.scalablytyped.runtime.Instantiable0[electronLib.ElectronNs.WebContents] {
  // Docs: http://electronjs.org/docs/api/web-contents
  def fromId(id: scala.Double): electronLib.ElectronNs.WebContents = js.native
  def getAllWebContents(): js.Array[electronLib.ElectronNs.WebContents] = js.native
  def getFocusedWebContents(): electronLib.ElectronNs.WebContents = js.native
}

