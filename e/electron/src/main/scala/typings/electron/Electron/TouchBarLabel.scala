package typings.electron.Electron

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarLabel extends EventEmitter {
  
  /**
    * A `string` representing the description of the label to be read by a screen
    * reader.
    */
  var accessibilityLabel: String = js.native
  
  /**
    * A `string` representing the label's current text. Changing this value
    * immediately updates the label in the touch bar.
    */
  var label: String = js.native
  
  /**
    * A `string` hex code representing the label's current text color. Changing this
    * value immediately updates the label in the touch bar.
    */
  var textColor: String = js.native
}
