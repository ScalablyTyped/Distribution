package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBarLabel")
@js.native
class TouchBarLabel protected () extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/touch-bar-label
  def this(options: TouchBarLabelConstructorOptions) = this()
  var label: String = js.native
  var textColor: String = js.native
}

