package typings.electron.Electron

import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBarPopover")
@js.native
class TouchBarPopover protected () extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/touch-bar-popover
  /**
    * TouchBarPopover
    */
  def this(options: TouchBarPopoverConstructorOptions) = this()
  var icon: NativeImage_ = js.native
  var label: String = js.native
}

