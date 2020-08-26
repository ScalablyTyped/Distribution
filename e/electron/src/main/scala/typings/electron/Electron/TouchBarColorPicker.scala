package typings.electron.Electron

import typings.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchBarColorPicker extends EventEmitter {
  var availableColors: js.Array[String] = js.native
  var selectedColor: String = js.native
}

