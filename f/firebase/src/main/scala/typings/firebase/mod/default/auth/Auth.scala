package typings.firebase.mod.default.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase", "auth.Auth")
@js.native
object Auth extends js.Object {
  
  /**
    * An enumeration of the possible persistence mechanism types.
    */
  @js.native
  object Persistence extends js.Object {
    
    /**
      * Indicates that the state will be persisted even when the browser window is
      * closed or the activity is destroyed in react-native.
      */
    var LOCAL: typings.firebase.mod.firebase.auth.Auth.Persistence = js.native
    
    /**
      * Indicates that the state will only be stored in memory and will be cleared
      * when the window or activity is refreshed.
      */
    var NONE: typings.firebase.mod.firebase.auth.Auth.Persistence = js.native
    
    /**
      * Indicates that the state will only persist in current session/tab, relevant
      * to web only, and will be cleared when the tab is closed.
      */
    var SESSION: typings.firebase.mod.firebase.auth.Auth.Persistence = js.native
  }
}
