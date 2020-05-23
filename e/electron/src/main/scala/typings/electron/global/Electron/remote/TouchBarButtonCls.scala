package typings.electron.global.Electron.remote

import typings.electron.Electron.NativeImage_
import typings.electron.Electron.TouchBarButton
import typings.electron.Electron.TouchBarButtonConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.remote.TouchBarButton")
@js.native
class TouchBarButtonCls protected () extends TouchBarButton {
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
  override var icon: NativeImage_ = js.native
  /* CompleteClass */
  override var label: String = js.native
}

