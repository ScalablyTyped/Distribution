package typings.easySession.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("express-session", JSImport.Namespace)
@js.native
object expressSessionAugmentingMod extends js.Object {
  
  @js.native
  trait Session extends js.Object {
    
    def getRole(): String = js.native
    
    def hasRole(role: String): Boolean = js.native
    
    def isFresh(): Boolean = js.native
    
    def isGuest(): Boolean = js.native
    
    def isLoggedIn(): Boolean = js.native
    def isLoggedIn(role: String): Boolean = js.native
    
    def login(callback: js.Function): Unit = js.native
    def login(extend: js.Object, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
    def login(role: String, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
    def login(role: String, extend: js.Object, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    def logout(callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    def setRole(role: String): Session = js.native
  }
}
