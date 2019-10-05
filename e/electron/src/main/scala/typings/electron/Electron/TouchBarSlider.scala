package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBarSlider")
@js.native
class TouchBarSlider protected () extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/touch-bar-slider
  def this(options: TouchBarSliderConstructorOptions) = this()
  var label: String = js.native
  var maxValue: Double = js.native
  var minValue: Double = js.native
  var value: Double = js.native
}

