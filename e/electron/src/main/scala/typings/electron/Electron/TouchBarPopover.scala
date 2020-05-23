package typings.electron.Electron

import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchBarPopover extends EventEmitter {
  var icon: NativeImage_ = js.native
  var label: String = js.native
}

