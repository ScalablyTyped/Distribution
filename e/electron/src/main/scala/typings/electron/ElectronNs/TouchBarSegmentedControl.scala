package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBarSegmentedControl")
@js.native
class TouchBarSegmentedControl protected () extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/touch-bar-segmented-control
  def this(options: TouchBarSegmentedControlConstructorOptions) = this()
  var segmentStyle: String = js.native
  var segments: js.Array[SegmentedControlSegment] = js.native
  var selectedIndex: Double = js.native
}

