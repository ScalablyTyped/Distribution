package typings.electron.Electron.remote

import typings.electron.Electron.NativeImage
import typings.electron.Electron.Tray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.remote.Tray")
@js.native
class TrayCls protected () extends Tray {
  def this(image: String) = this()
  def this(image: NativeImage) = this()
}

