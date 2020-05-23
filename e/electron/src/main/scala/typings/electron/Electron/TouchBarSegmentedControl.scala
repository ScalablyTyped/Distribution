package typings.electron.Electron

import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchBarSegmentedControl extends EventEmitter {
  var segmentStyle: String = js.native
  var segments: js.Array[SegmentedControlSegment] = js.native
  var selectedIndex: Double = js.native
}

