package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DidNavigateInPageEvent extends Event {
  
  var isMainFrame: Boolean = js.native
  
  var url: String = js.native
}
