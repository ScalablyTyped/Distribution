package typings.electron.Electron

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

@js.native
trait TouchBarSegmentedControlConstructorOptions extends js.Object {
  /**
    * Called when the user selects a new segment.
    */
  var change: js.UndefOr[js.Function2[/* selectedIndex */ Double, /* isSelected */ Boolean, Unit]] = js.native
  /**
    * The selection mode of the control:
    */
  var mode: js.UndefOr[single | multiple | buttons] = js.native
  /**
    * Style of the segments:
    */
  var segmentStyle: js.UndefOr[
    automatic | rounded | `textured-rounded` | `round-rect` | `textured-square` | capsule | `small-square` | separated
  ] = js.native
  /**
    * An array of segments to place in this control.
    */
  var segments: js.Array[SegmentedControlSegment] = js.native
  /**
    * The index of the currently selected segment, will update automatically with user
    * interaction. When the mode is `multiple` it will be the last selected item.
    */
  var selectedIndex: js.UndefOr[Double] = js.native
}

object TouchBarSegmentedControlConstructorOptions {
  @scala.inline
  def apply(segments: js.Array[SegmentedControlSegment]): TouchBarSegmentedControlConstructorOptions = {
    val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarSegmentedControlConstructorOptions]
  }
  @scala.inline
  implicit class TouchBarSegmentedControlConstructorOptionsOps[Self <: TouchBarSegmentedControlConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSegmentsVarargs(value: SegmentedControlSegment*): Self = this.set("segments", js.Array(value :_*))
    @scala.inline
    def setSegments(value: js.Array[SegmentedControlSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    @scala.inline
    def setChange(value: (/* selectedIndex */ Double, /* isSelected */ Boolean) => Unit): Self = this.set("change", js.Any.fromFunction2(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setMode(value: single | multiple | buttons): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setSegmentStyle(
      value: automatic | rounded | `textured-rounded` | `round-rect` | `textured-square` | capsule | `small-square` | separated
    ): Self = this.set("segmentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentStyle: Self = this.set("segmentStyle", js.undefined)
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedIndex: Self = this.set("selectedIndex", js.undefined)
  }
  
}

