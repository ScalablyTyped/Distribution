package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBarPopover")
@js.native
class TouchBarPopover protected () extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/touch-bar-popover
  def this(options: TouchBarPopoverConstructorOptions) = this()
  var icon: NativeImage = js.native
  var label: String = js.native
}

