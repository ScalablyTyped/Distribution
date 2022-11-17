package typings.electron.global.Electron

import typings.electron.Electron.TouchBarButtonConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.TouchBarButton")
@js.native
open class TouchBarButton protected ()
  extends StObject
     with typings.electron.Electron.TouchBarButton {
  // Docs: https://electronjs.org/docs/api/touch-bar-button
  /**
    * TouchBarButton
    */
  def this(options: TouchBarButtonConstructorOptions) = this()
  
  /**
    * A `string` representing the description of the button to be read by a screen
    * reader. Will only be read by screen readers if no label is set.
    */
  /* CompleteClass */
  var accessibilityLabel: String = js.native
  
  /**
    * A `string` hex code representing the button's current background color. Changing
    * this value immediately updates the button in the touch bar.
    */
  /* CompleteClass */
  var backgroundColor: String = js.native
  
  /**
    * A `boolean` representing whether the button is in an enabled state.
    */
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /**
    * A `NativeImage` representing the button's current icon. Changing this value
    * immediately updates the button in the touch bar.
    */
  /* CompleteClass */
  var icon: typings.electron.Electron.NativeImage_ = js.native
  
  /**
    * A `string` - Can be `left`, `right` or `overlay`.  Defaults to `overlay`.
    */
  /* CompleteClass */
  var iconPosition: "left" | "right" | "overlay" = js.native
  
  /**
    * A `string` representing the button's current text. Changing this value
    * immediately updates the button in the touch bar.
    */
  /* CompleteClass */
  var label: String = js.native
}
