package typings.electron.Electron

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarColorPicker extends EventEmitter {
  
  var availableColors: js.Array[String] = js.native
  
  var selectedColor: String = js.native
}
