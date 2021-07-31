package typings.electron.Electron

import typings.electron.electronStrings.buttons
import typings.electron.electronStrings.multiple
import typings.electron.electronStrings.single
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarSegmentedControl extends EventEmitter {
  
  var mode: single | multiple | buttons = js.native
  
  var segmentStyle: String = js.native
  
  var segments: js.Array[SegmentedControlSegment] = js.native
  
  var selectedIndex: Double = js.native
}
