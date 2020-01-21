package typings.electron.mod.remote

import typings.electron.Electron.NativeImage_
import typings.electron.Electron.Tray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "remote.Tray")
@js.native
class TrayCls protected () extends Tray {
  def this(image: String) = this()
  def this(image: NativeImage_) = this()
}

