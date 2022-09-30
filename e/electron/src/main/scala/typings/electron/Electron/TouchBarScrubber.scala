package typings.electron.Electron

import typings.electron.electronStrings.background
import typings.electron.electronStrings.fixed
import typings.electron.electronStrings.free
import typings.electron.electronStrings.none
import typings.electron.electronStrings.outline
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarScrubber extends EventEmitter {
  
  /**
    * A `boolean` representing whether this scrubber is continuous or not. Updating
    * this value immediately updates the control in the touch bar.
    */
  var continuous: Boolean = js.native
  
  /**
    * A `ScrubberItem[]` array representing the items in this scrubber. Updating this
    * value immediately updates the control in the touch bar. Updating deep properties
    * inside this array **does not update the touch bar**.
    */
  var items: js.Array[ScrubberItem] = js.native
  
  /**
    * A `string` representing the mode of this scrubber. Updating this value
    * immediately updates the control in the touch bar. Possible values:
    *
    * * `fixed` - Maps to `NSScrubberModeFixed`.
    * * `free` - Maps to `NSScrubberModeFree`.
    */
  var mode: fixed | free = js.native
  
  /**
    * A `string` representing the style that selected items in the scrubber should
    * have. This style is overlayed on top of the scrubber item instead of being
    * placed behind it. Updating this value immediately updates the control in the
    * touch bar. Possible values:
    *
    * * `background` - Maps to `[NSScrubberSelectionStyle roundedBackgroundStyle]`.
    * * `outline` - Maps to `[NSScrubberSelectionStyle outlineOverlayStyle]`.
    * * `none` - Removes all styles.
    */
  var overlayStyle: background | outline | none = js.native
  
  /**
    * A `string` representing the style that selected items in the scrubber should
    * have. Updating this value immediately updates the control in the touch bar.
    * Possible values:
    *
    * * `background` - Maps to `[NSScrubberSelectionStyle roundedBackgroundStyle]`.
    * * `outline` - Maps to `[NSScrubberSelectionStyle outlineOverlayStyle]`.
    * * `none` - Removes all styles.
    */
  var selectedStyle: background | outline | none = js.native
  
  /**
    * A `boolean` representing whether to show the left / right selection arrows in
    * this scrubber. Updating this value immediately updates the control in the touch
    * bar.
    */
  var showArrowButtons: Boolean = js.native
}
