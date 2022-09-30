package typings.electron.Electron

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarColorPicker extends EventEmitter {
  
  /**
    * A `string[]` array representing the color picker's available colors to select.
    * Changing this value immediately updates the color picker in the touch bar.
    */
  var availableColors: js.Array[String] = js.native
  
  /**
    * A `string` hex code representing the color picker's currently selected color.
    * Changing this value immediately updates the color picker in the touch bar.
    */
  var selectedColor: String = js.native
}
