package typings.electron.global.Electron

import typings.electron.Electron.TouchBarButtonConstructorOptions
import typings.electron.electronStrings.left
import typings.electron.electronStrings.overlay
import typings.electron.electronStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.TouchBarButton")
@js.native
class TouchBarButton protected ()
  extends StObject
     with typings.electron.Electron.TouchBarButton {
  // Docs: https://electronjs.org/docs/api/touch-bar-button
  /**
    * TouchBarButton
    */
  def this(options: TouchBarButtonConstructorOptions) = this()
  
  /* CompleteClass */
  var accessibilityLabel: String = js.native
  
  /* CompleteClass */
  var backgroundColor: String = js.native
  
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /* CompleteClass */
  var icon: typings.electron.Electron.NativeImage_ = js.native
  
  /* CompleteClass */
  var iconPosition: left | right | overlay = js.native
  
  /* CompleteClass */
  var label: String = js.native
}
