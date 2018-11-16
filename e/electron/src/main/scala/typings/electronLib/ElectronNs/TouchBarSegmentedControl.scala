package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBarSegmentedControl")
@js.native
class TouchBarSegmentedControl protected () extends EventEmitter {
  // Docs: http://electron.atom.io/docs/api/touch-bar-segmented-control
  def this(options: TouchBarSegmentedControlConstructorOptions) = this()
  var segmentStyle: java.lang.String = js.native
  var segments: js.Array[SegmentedControlSegment] = js.native
  var selectedIndex: scala.Double = js.native
}

