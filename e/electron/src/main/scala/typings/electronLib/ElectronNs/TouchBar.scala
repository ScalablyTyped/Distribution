package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBar")
@js.native
class TouchBar protected () extends EventEmitter {
  // Docs: http://electron.atom.io/docs/api/touch-bar
  def this(options: TouchBarConstructorOptions) = this()
  var escapeItem: TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer | scala.Null = js.native
}

@JSGlobal("Electron.TouchBar")
@js.native
object TouchBar extends js.Object {
  var TouchBarButton: ScalablyTyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarButtonConstructorOptions, 
    electronLib.ElectronNs.TouchBarButton
  ] = js.native
  var TouchBarColorPicker: ScalablyTyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarColorPickerConstructorOptions, 
    electronLib.ElectronNs.TouchBarColorPicker
  ] = js.native
  var TouchBarGroup: ScalablyTyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarGroupConstructorOptions, 
    electronLib.ElectronNs.TouchBarGroup
  ] = js.native
  var TouchBarLabel: ScalablyTyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarLabelConstructorOptions, 
    electronLib.ElectronNs.TouchBarLabel
  ] = js.native
  var TouchBarPopover: ScalablyTyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarPopoverConstructorOptions, 
    electronLib.ElectronNs.TouchBarPopover
  ] = js.native
  var TouchBarScrubber: ScalablyTyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarScrubberConstructorOptions, 
    electronLib.ElectronNs.TouchBarScrubber
  ] = js.native
  var TouchBarSegmentedControl: ScalablyTyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarSegmentedControlConstructorOptions, 
    electronLib.ElectronNs.TouchBarSegmentedControl
  ] = js.native
  var TouchBarSlider: ScalablyTyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarSliderConstructorOptions, 
    electronLib.ElectronNs.TouchBarSlider
  ] = js.native
  var TouchBarSpacer: ScalablyTyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarSpacerConstructorOptions, 
    electronLib.ElectronNs.TouchBarSpacer
  ] = js.native
}

