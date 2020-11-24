package typings.electron.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron", "Tray")
@js.native
class Tray protected ()
  extends typings.electron.Electron.Tray {
  def this(image: String) = this()
  /**
    * Tray
    */
  def this(image: typings.electron.Electron.NativeImage_) = this()
  def this(image: String, guid: String) = this()
  def this(image: typings.electron.Electron.NativeImage_, guid: String) = this()
}
