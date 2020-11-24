package typings.firebase.mod.default

import typings.firebase.anon.Args
import typings.firebase.anon.Level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase", "onLog")
@js.native
object onLog extends js.Object {
  
  /**
    * Sets log handler for all Firebase packages.
    * @param logCallback An optional custom log handler that executes user code whenever
    * the Firebase SDK makes a logging call.
    */
  def apply(logCallback: js.Function1[/* callbackParams */ Args, Unit]): Unit = js.native
  def apply(logCallback: js.Function1[/* callbackParams */ Args, Unit], options: Level): Unit = js.native
}
