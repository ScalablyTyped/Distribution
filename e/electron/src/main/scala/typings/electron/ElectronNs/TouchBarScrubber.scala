package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBarScrubber")
@js.native
class TouchBarScrubber protected () extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/touch-bar-scrubber
  def this(options: TouchBarScrubberConstructorOptions) = this()
  var continuous: Boolean = js.native
  var items: js.Array[ScrubberItem] = js.native
  var mode: String = js.native
  var overlayStyle: String = js.native
  var selectedStyle: String = js.native
  var showArrowButtons: Boolean = js.native
}

