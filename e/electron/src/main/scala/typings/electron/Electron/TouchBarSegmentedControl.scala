package typings.electron.Electron

import typings.electron.electronStrings.buttons
import typings.electron.electronStrings.multiple
import typings.electron.electronStrings.single
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarSegmentedControl extends EventEmitter {
  
  /**
    * A `string` representing the current selection mode of the control.  Can be
    * `single`, `multiple` or `buttons`.
    */
  var mode: single | multiple | buttons = js.native
  
  /**
    * A `string` representing the controls current segment style. Updating this value
    * immediately updates the control in the touch bar.
    */
  var segmentStyle: String = js.native
  
  /**
    * A `SegmentedControlSegment[]` array representing the segments in this control.
    * Updating this value immediately updates the control in the touch bar. Updating
    * deep properties inside this array **does not update the touch bar**.
    */
  var segments: js.Array[SegmentedControlSegment] = js.native
  
  /**
    * An `Integer` representing the currently selected segment. Changing this value
    * immediately updates the control in the touch bar. User interaction with the
    * touch bar will update this value automatically.
    */
  var selectedIndex: Double = js.native
}
