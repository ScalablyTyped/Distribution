package typings.electron.global.Electron

import typings.electron.Electron.TouchBarGroupConstructorOptions
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.TouchBarGroup")
@js.native
class TouchBarGroup protected () extends EventEmitter {
  // Docs: https://electronjs.org/docs/api/touch-bar-group
  /**
    * TouchBarGroup
    */
  def this(options: TouchBarGroupConstructorOptions) = this()
}
