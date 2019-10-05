package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpcMessageEvent extends Event {
  var args: js.Array[_] = js.native
  var channel: String = js.native
}

