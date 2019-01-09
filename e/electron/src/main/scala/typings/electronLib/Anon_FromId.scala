package typings
package electronLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FromId
  extends org.scalablytyped.runtime.Instantiable0[electronLib.ElectronNs.BrowserView]
     with org.scalablytyped.runtime.Instantiable1[
      /* options */ electronLib.ElectronNs.BrowserViewConstructorOptions, 
      electronLib.ElectronNs.BrowserView
    ] {
  def fromId(id: scala.Double): electronLib.ElectronNs.BrowserView = js.native
  def fromWebContents(webContents: electronLib.ElectronNs.WebContents): electronLib.ElectronNs.BrowserView | scala.Null = js.native
  def getAllViews(): js.Array[electronLib.ElectronNs.BrowserView] = js.native
}

