package typings.electron.Electron

import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBarColorPicker")
@js.native
class TouchBarColorPicker protected () extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/touch-bar-color-picker
  /**
    * TouchBarColorPicker
    */
  def this(options: TouchBarColorPickerConstructorOptions) = this()
  var availableColors: js.Array[String] = js.native
  var selectedColor: String = js.native
}

