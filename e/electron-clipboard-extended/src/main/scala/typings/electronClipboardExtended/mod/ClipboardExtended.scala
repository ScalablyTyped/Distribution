package typings.electronClipboardExtended.mod

import typings.electron.Electron.Clipboard_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClipboardExtended extends Clipboard_ {
  def off(event: String): Unit = js.native
  def off(event: String, listener: js.Function0[Unit]): Unit = js.native
  def startWatching(): Unit = js.native
  def stopWatching(): Unit = js.native
}

