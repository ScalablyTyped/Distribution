package typings.electron.global.Electron

import org.scalablytyped.runtime.Instantiable1
import typings.electron.Electron.TouchBarButtonConstructorOptions
import typings.electron.Electron.TouchBarColorPickerConstructorOptions
import typings.electron.Electron.TouchBarConstructorOptions
import typings.electron.Electron.TouchBarGroupConstructorOptions
import typings.electron.Electron.TouchBarLabelConstructorOptions
import typings.electron.Electron.TouchBarPopoverConstructorOptions
import typings.electron.Electron.TouchBarScrubberConstructorOptions
import typings.electron.Electron.TouchBarSegmentedControlConstructorOptions
import typings.electron.Electron.TouchBarSliderConstructorOptions
import typings.electron.Electron.TouchBarSpacerConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBar")
@js.native
class TouchBar protected ()
  extends typings.electron.Electron.TouchBar {
  // Docs: http://electronjs.org/docs/api/touch-bar
  /**
    * TouchBar
    */
  def this(options: TouchBarConstructorOptions) = this()
}

/* static members */
@JSGlobal("Electron.TouchBar")
@js.native
object TouchBar extends js.Object {
  var TouchBarButton: Instantiable1[
    /* options */ TouchBarButtonConstructorOptions, 
    typings.electron.Electron.TouchBarButton
  ] = js.native
  var TouchBarColorPicker: Instantiable1[
    /* options */ TouchBarColorPickerConstructorOptions, 
    typings.electron.Electron.TouchBarColorPicker
  ] = js.native
  var TouchBarGroup: Instantiable1[
    /* options */ TouchBarGroupConstructorOptions, 
    typings.electron.Electron.TouchBarGroup
  ] = js.native
  var TouchBarLabel: Instantiable1[
    /* options */ TouchBarLabelConstructorOptions, 
    typings.electron.Electron.TouchBarLabel
  ] = js.native
  var TouchBarPopover: Instantiable1[
    /* options */ TouchBarPopoverConstructorOptions, 
    typings.electron.Electron.TouchBarPopover
  ] = js.native
  var TouchBarScrubber: Instantiable1[
    /* options */ TouchBarScrubberConstructorOptions, 
    typings.electron.Electron.TouchBarScrubber
  ] = js.native
  var TouchBarSegmentedControl: Instantiable1[
    /* options */ TouchBarSegmentedControlConstructorOptions, 
    typings.electron.Electron.TouchBarSegmentedControl
  ] = js.native
  var TouchBarSlider: Instantiable1[
    /* options */ TouchBarSliderConstructorOptions, 
    typings.electron.Electron.TouchBarSlider
  ] = js.native
  var TouchBarSpacer: Instantiable1[
    /* options */ TouchBarSpacerConstructorOptions, 
    typings.electron.Electron.TouchBarSpacer
  ] = js.native
}

