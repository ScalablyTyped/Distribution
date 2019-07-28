package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsoleMessageEvent extends Event {
  var level: Double = js.native
  var line: Double = js.native
  var message: String = js.native
  var sourceId: String = js.native
}

