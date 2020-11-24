package typings.electron.mod.remote

import typings.electron.Electron.NativeImage_
import typings.electron.Electron.Tray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron", "remote.Tray")
@js.native
class TrayCls protected () extends Tray {
  def this(image: String) = this()
  /**
    * Tray
    */
  def this(image: NativeImage_) = this()
  def this(image: String, guid: String) = this()
  def this(image: NativeImage_, guid: String) = this()
}
