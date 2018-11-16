package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBarLabel")
@js.native
class TouchBarLabel protected () extends EventEmitter {
  // Docs: http://electron.atom.io/docs/api/touch-bar-label
  def this(options: TouchBarLabelConstructorOptions) = this()
  var label: java.lang.String = js.native
  var textColor: java.lang.String = js.native
}

