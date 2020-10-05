package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsoleMessageEvent extends Event {
  var level: Double = js.native
  var line: Double = js.native
  var message: String = js.native
  var sourceId: String = js.native
}

