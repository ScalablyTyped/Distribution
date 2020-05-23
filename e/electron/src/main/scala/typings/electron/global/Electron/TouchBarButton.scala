package typings.electron.global.Electron

import typings.electron.Electron.TouchBarButtonConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBarButton")
@js.native
class TouchBarButton protected ()
  extends typings.electron.Electron.TouchBarButton {
  // Docs: http://electronjs.org/docs/api/touch-bar-button
  /**
    * TouchBarButton
    */
  def this(options: TouchBarButtonConstructorOptions) = this()
  /* CompleteClass */
  override var accessibilityLabel: String = js.native
  /* CompleteClass */
  override var backgroundColor: String = js.native
  /* CompleteClass */
  override var icon: typings.electron.Electron.NativeImage_ = js.native
  /* CompleteClass */
  override var label: String = js.native
}

