package typings.electron.global.Electron

import typings.electron.Electron.TouchBarGroupConstructorOptions
import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBarGroup")
@js.native
class TouchBarGroup protected () extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/touch-bar-group
  /**
    * TouchBarGroup
    */
  def this(options: TouchBarGroupConstructorOptions) = this()
}

