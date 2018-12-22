package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBarSlider")
@js.native
class TouchBarSlider protected () extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/touch-bar-slider
  def this(options: TouchBarSliderConstructorOptions) = this()
  var label: java.lang.String = js.native
  var maxValue: scala.Double = js.native
  var minValue: scala.Double = js.native
  var value: scala.Double = js.native
}

