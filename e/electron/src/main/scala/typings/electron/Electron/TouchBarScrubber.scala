package typings.electron.Electron

import typings.electron.electronStrings.background
import typings.electron.electronStrings.fixed
import typings.electron.electronStrings.free
import typings.electron.electronStrings.none
import typings.electron.electronStrings.outline
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarScrubber extends EventEmitter {
  
  var continuous: Boolean = js.native
  
  var items: js.Array[ScrubberItem] = js.native
  
  var mode: fixed | free = js.native
  
  var overlayStyle: background | outline | none = js.native
  
  var selectedStyle: background | outline | none = js.native
  
  var showArrowButtons: Boolean = js.native
}
