package typings.electron.mod.Renderer.remote

import typings.electron.Electron.NativeImage_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron", "Renderer.remote.Tray")
@js.native
class Tray protected ()
  extends typings.electron.Electron.Tray {
  def this(image: String) = this()
  /**
    * Tray
    */
  def this(image: NativeImage_) = this()
  def this(image: String, guid: String) = this()
  def this(image: NativeImage_, guid: String) = this()
}
