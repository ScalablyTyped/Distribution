package typings.firefoxWebextBrowser.browser.geckoProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.geckoProfiler.getSymbols")
@js.native
object getSymbols extends js.Object {
  /**
    * Gets the debug symbols for a particular library.
    * @param debugName The name of the library's debug file. For example, 'xul.pdb
    * @param breakpadId The Breakpad ID of the library
    */
  def apply(debugName: String, breakpadId: String): js.Promise[_] = js.native
}

