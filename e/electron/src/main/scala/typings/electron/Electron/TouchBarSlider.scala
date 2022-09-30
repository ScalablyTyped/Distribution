package typings.electron.Electron

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarSlider extends EventEmitter {
  
  /**
    * A `string` representing the slider's current text. Changing this value
    * immediately updates the slider in the touch bar.
    */
  var label: String = js.native
  
  /**
    * A `number` representing the slider's current maximum value. Changing this value
    * immediately updates the slider in the touch bar.
    */
  var maxValue: Double = js.native
  
  /**
    * A `number` representing the slider's current minimum value. Changing this value
    * immediately updates the slider in the touch bar.
    */
  var minValue: Double = js.native
  
  /**
    * A `number` representing the slider's current value. Changing this value
    * immediately updates the slider in the touch bar.
    */
  var value: Double = js.native
}
