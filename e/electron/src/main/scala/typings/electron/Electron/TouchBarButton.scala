package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBarButton")
@js.native
class TouchBarButton protected () extends js.Object {
  // Docs: http://electronjs.org/docs/api/touch-bar-button
  /**
    * TouchBarButton
    */
  def this(options: TouchBarButtonConstructorOptions) = this()
  var accessibilityLabel: String = js.native
  var backgroundColor: String = js.native
  var icon: NativeImage_ = js.native
  var label: String = js.native
}

