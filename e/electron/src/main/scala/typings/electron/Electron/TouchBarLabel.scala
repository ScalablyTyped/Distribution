package typings.electron.Electron

import typings.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchBarLabel extends EventEmitter {
  var accessibilityLabel: String = js.native
  var label: String = js.native
  var textColor: String = js.native
}

