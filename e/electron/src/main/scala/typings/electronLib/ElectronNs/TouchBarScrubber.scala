package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBarScrubber")
@js.native
class TouchBarScrubber protected () extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/touch-bar-scrubber
  def this(options: TouchBarScrubberConstructorOptions) = this()
  var continuous: scala.Boolean = js.native
  var items: js.Array[ScrubberItem] = js.native
  var mode: java.lang.String = js.native
  var overlayStyle: java.lang.String = js.native
  var selectedStyle: java.lang.String = js.native
  var showArrowButtons: scala.Boolean = js.native
}

