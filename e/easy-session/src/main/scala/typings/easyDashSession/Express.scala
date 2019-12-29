package typings.easyDashSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Express")
@js.native
object Express extends js.Object {
  @js.native
  trait Session extends js.Object {
    def getRole(): String = js.native
    def hasRole(role: String): Boolean = js.native
    def isFresh(): Boolean = js.native
    def isGuest(): Boolean = js.native
    def isLoggedIn(): Boolean = js.native
    def isLoggedIn(role: String): Boolean = js.native
    def login(callback: js.Function): Unit = js.native
    def login(extend: js.Object, callback: ErrorCallback): Unit = js.native
    def login(role: String, callback: ErrorCallback): Unit = js.native
    def login(role: String, extend: js.Object, callback: ErrorCallback): Unit = js.native
    def logout(callback: ErrorCallback): Unit = js.native
    def setRole(role: String): Session = js.native
  }
  
  type ErrorCallback = js.Function1[/* err */ js.UndefOr[js.Any], Unit]
}

