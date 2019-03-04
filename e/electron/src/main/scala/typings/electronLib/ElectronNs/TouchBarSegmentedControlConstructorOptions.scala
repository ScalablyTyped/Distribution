package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarSegmentedControlConstructorOptions extends js.Object {
  /**
    * The selection mode of the control:
    */
  var mode: js.UndefOr[
    electronLib.electronLibStrings.single | electronLib.electronLibStrings.multiple | electronLib.electronLibStrings.buttons
  ] = js.undefined
  /**
    * Style of the segments:
    */
  var segmentStyle: js.UndefOr[
    electronLib.electronLibStrings.automatic | electronLib.electronLibStrings.rounded | electronLib.electronLibStrings.`textured-rounded` | electronLib.electronLibStrings.`round-rect` | electronLib.electronLibStrings.`textured-square` | electronLib.electronLibStrings.capsule | electronLib.electronLibStrings.`small-square` | electronLib.electronLibStrings.separated
  ] = js.undefined
  /**
    * An array of segments to place in this control.
    */
  var segments: js.Array[SegmentedControlSegment]
  /**
    * The index of the currently selected segment, will update automatically with user
    * interaction. When the mode is multiple it will be the last selected item.
    */
  var selectedIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Called when the user selects a new segment.
    */
  def change(selectedIndex: scala.Double, isSelected: scala.Boolean): scala.Unit
}

object TouchBarSegmentedControlConstructorOptions {
  @scala.inline
  def apply(
    change: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    segments: js.Array[SegmentedControlSegment],
    mode: electronLib.electronLibStrings.single | electronLib.electronLibStrings.multiple | electronLib.electronLibStrings.buttons = null,
    segmentStyle: electronLib.electronLibStrings.automatic | electronLib.electronLibStrings.rounded | electronLib.electronLibStrings.`textured-rounded` | electronLib.electronLibStrings.`round-rect` | electronLib.electronLibStrings.`textured-square` | electronLib.electronLibStrings.capsule | electronLib.electronLibStrings.`small-square` | electronLib.electronLibStrings.separated = null,
    selectedIndex: scala.Int | scala.Double = null
  ): TouchBarSegmentedControlConstructorOptions = {
    val __obj = js.Dynamic.literal(change = change, segments = segments)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (segmentStyle != null) __obj.updateDynamic("segmentStyle")(segmentStyle.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarSegmentedControlConstructorOptions]
  }
}

