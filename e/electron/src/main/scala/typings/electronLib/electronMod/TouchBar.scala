package typings
package electronLib.electronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "TouchBar")
@js.native
class TouchBar protected ()
  extends electronLib.ElectronNs.TouchBar {
  // Docs: http://electronjs.org/docs/api/touch-bar
  def this(options: electronLib.ElectronNs.TouchBarConstructorOptions) = this()
}

@JSImport("electron", "TouchBar")
@js.native
object TouchBar extends js.Object {
  var TouchBarButton: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarButtonConstructorOptions, 
    electronLib.ElectronNs.TouchBarButton
  ] = js.native
  var TouchBarColorPicker: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarColorPickerConstructorOptions, 
    electronLib.ElectronNs.TouchBarColorPicker
  ] = js.native
  var TouchBarGroup: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarGroupConstructorOptions, 
    electronLib.ElectronNs.TouchBarGroup
  ] = js.native
  var TouchBarLabel: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarLabelConstructorOptions, 
    electronLib.ElectronNs.TouchBarLabel
  ] = js.native
  var TouchBarPopover: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarPopoverConstructorOptions, 
    electronLib.ElectronNs.TouchBarPopover
  ] = js.native
  var TouchBarScrubber: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarScrubberConstructorOptions, 
    electronLib.ElectronNs.TouchBarScrubber
  ] = js.native
  var TouchBarSegmentedControl: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarSegmentedControlConstructorOptions, 
    electronLib.ElectronNs.TouchBarSegmentedControl
  ] = js.native
  var TouchBarSlider: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarSliderConstructorOptions, 
    electronLib.ElectronNs.TouchBarSlider
  ] = js.native
  var TouchBarSpacer: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.ElectronNs.TouchBarSpacerConstructorOptions, 
    electronLib.ElectronNs.TouchBarSpacer
  ] = js.native
}

