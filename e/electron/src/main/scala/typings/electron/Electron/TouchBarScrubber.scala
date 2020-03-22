package typings.electron.Electron

import typings.electron.electronStrings.background
import typings.electron.electronStrings.fixed
import typings.electron.electronStrings.free
import typings.electron.electronStrings.none
import typings.electron.electronStrings.outline
import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBarScrubber")
@js.native
class TouchBarScrubber protected () extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/touch-bar-scrubber
  /**
    * TouchBarScrubber
    */
  def this(options: TouchBarScrubberConstructorOptions) = this()
  var continuous: Boolean = js.native
  var items: js.Array[ScrubberItem] = js.native
  var mode: fixed | free = js.native
  var overlayStyle: background | outline | none = js.native
  var selectedStyle: background | outline | none = js.native
  var showArrowButtons: Boolean = js.native
}

