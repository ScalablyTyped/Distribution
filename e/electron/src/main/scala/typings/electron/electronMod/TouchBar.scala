package typings.electron.electronMod

import org.scalablytyped.runtime.Instantiable1
import typings.electron.ElectronNs.TouchBarButtonConstructorOptions
import typings.electron.ElectronNs.TouchBarColorPickerConstructorOptions
import typings.electron.ElectronNs.TouchBarConstructorOptions
import typings.electron.ElectronNs.TouchBarGroupConstructorOptions
import typings.electron.ElectronNs.TouchBarLabelConstructorOptions
import typings.electron.ElectronNs.TouchBarPopoverConstructorOptions
import typings.electron.ElectronNs.TouchBarScrubberConstructorOptions
import typings.electron.ElectronNs.TouchBarSegmentedControlConstructorOptions
import typings.electron.ElectronNs.TouchBarSliderConstructorOptions
import typings.electron.ElectronNs.TouchBarSpacerConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "TouchBar")
@js.native
class TouchBar protected ()
  extends typings.electron.ElectronNs.TouchBar {
  // Docs: http://electronjs.org/docs/api/touch-bar
  def this(options: TouchBarConstructorOptions) = this()
}

/* static members */
@JSImport("electron", "TouchBar")
@js.native
object TouchBar extends js.Object {
  var TouchBarButton: Instantiable1[
    /* options */ TouchBarButtonConstructorOptions, 
    typings.electron.ElectronNs.TouchBarButton
  ] = js.native
  var TouchBarColorPicker: Instantiable1[
    /* options */ TouchBarColorPickerConstructorOptions, 
    typings.electron.ElectronNs.TouchBarColorPicker
  ] = js.native
  var TouchBarGroup: Instantiable1[
    /* options */ TouchBarGroupConstructorOptions, 
    typings.electron.ElectronNs.TouchBarGroup
  ] = js.native
  var TouchBarLabel: Instantiable1[
    /* options */ TouchBarLabelConstructorOptions, 
    typings.electron.ElectronNs.TouchBarLabel
  ] = js.native
  var TouchBarPopover: Instantiable1[
    /* options */ TouchBarPopoverConstructorOptions, 
    typings.electron.ElectronNs.TouchBarPopover
  ] = js.native
  var TouchBarScrubber: Instantiable1[
    /* options */ TouchBarScrubberConstructorOptions, 
    typings.electron.ElectronNs.TouchBarScrubber
  ] = js.native
  var TouchBarSegmentedControl: Instantiable1[
    /* options */ TouchBarSegmentedControlConstructorOptions, 
    typings.electron.ElectronNs.TouchBarSegmentedControl
  ] = js.native
  var TouchBarSlider: Instantiable1[
    /* options */ TouchBarSliderConstructorOptions, 
    typings.electron.ElectronNs.TouchBarSlider
  ] = js.native
  var TouchBarSpacer: Instantiable1[
    /* options */ TouchBarSpacerConstructorOptions, 
    typings.electron.ElectronNs.TouchBarSpacer
  ] = js.native
}

