package typings.electron.Electron

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarPopover extends EventEmitter {
  
  /**
    * A `NativeImage` representing the popover's current button icon. Changing this
    * value immediately updates the popover in the touch bar.
    */
  var icon: NativeImage_ = js.native
  
  /**
    * A `string` representing the popover's current button text. Changing this value
    * immediately updates the popover in the touch bar.
    */
  var label: String = js.native
}
