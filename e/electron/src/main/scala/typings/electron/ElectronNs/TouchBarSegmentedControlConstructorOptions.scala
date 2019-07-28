package typings.electron.ElectronNs

import typings.electron.electronStrings.`round-rect`
import typings.electron.electronStrings.`small-square`
import typings.electron.electronStrings.`textured-rounded`
import typings.electron.electronStrings.`textured-square`
import typings.electron.electronStrings.automatic
import typings.electron.electronStrings.buttons
import typings.electron.electronStrings.capsule
import typings.electron.electronStrings.multiple
import typings.electron.electronStrings.rounded
import typings.electron.electronStrings.separated
import typings.electron.electronStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarSegmentedControlConstructorOptions extends js.Object {
  /**
    * The selection mode of the control:
    */
  var mode: js.UndefOr[single | multiple | buttons] = js.undefined
  /**
    * Style of the segments:
    */
  var segmentStyle: js.UndefOr[
    automatic | rounded | `textured-rounded` | `round-rect` | `textured-square` | capsule | `small-square` | separated
  ] = js.undefined
  /**
    * An array of segments to place in this control.
    */
  var segments: js.Array[SegmentedControlSegment]
  /**
    * The index of the currently selected segment, will update automatically with user
    * interaction. When the mode is multiple it will be the last selected item.
    */
  var selectedIndex: js.UndefOr[Double] = js.undefined
  /**
    * Called when the user selects a new segment.
    */
  def change(selectedIndex: Double, isSelected: Boolean): Unit
}

object TouchBarSegmentedControlConstructorOptions {
  @scala.inline
  def apply(
    change: (Double, Boolean) => Unit,
    segments: js.Array[SegmentedControlSegment],
    mode: single | multiple | buttons = null,
    segmentStyle: automatic | rounded | `textured-rounded` | `round-rect` | `textured-square` | capsule | `small-square` | separated = null,
    selectedIndex: Int | Double = null
  ): TouchBarSegmentedControlConstructorOptions = {
    val __obj = js.Dynamic.literal(change = js.Any.fromFunction2(change), segments = segments)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (segmentStyle != null) __obj.updateDynamic("segmentStyle")(segmentStyle.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarSegmentedControlConstructorOptions]
  }
}

