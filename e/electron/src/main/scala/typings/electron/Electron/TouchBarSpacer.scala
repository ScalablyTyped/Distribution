package typings.electron.Electron

import typings.electron.electronStrings.flexible
import typings.electron.electronStrings.large
import typings.electron.electronStrings.small
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarSpacer extends EventEmitter {
  
  var size: small | large | flexible = js.native
}
