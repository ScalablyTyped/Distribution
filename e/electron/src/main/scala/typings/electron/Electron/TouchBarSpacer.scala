package typings.electron.Electron

import typings.electron.electronStrings.flexible
import typings.electron.electronStrings.large
import typings.electron.electronStrings.small
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarSpacer extends EventEmitter {
  
  /**
    * A `string` representing the size of the spacer.  Can be `small`, `large` or
    * `flexible`.
    */
  var size: small | large | flexible = js.native
}
