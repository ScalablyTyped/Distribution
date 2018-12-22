package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBarButton")
@js.native
class TouchBarButton protected () extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/touch-bar-button
  def this(options: TouchBarButtonConstructorOptions) = this()
  var backgroundColor: java.lang.String = js.native
  var icon: NativeImage = js.native
  var label: java.lang.String = js.native
}

