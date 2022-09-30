package typings.firebaseAuth

import typings.firebaseAuth.firebaseAuthInts.`300000`
import typings.firebaseAuth.firebaseAuthInts.`30000`
import typings.firebaseAuth.firebaseAuthInts.`960000`
import typings.firebaseAuth.userMod.UserInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proactiveRefreshMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/core/user/proactive_refresh", "ProactiveRefresh")
  @js.native
  open class ProactiveRefresh protected () extends StObject {
    def this(user: UserInternal) = this()
    
    def _start(): Unit = js.native
    
    def _stop(): Unit = js.native
    
    /* private */ var errorBackoff: Any = js.native
    
    /* private */ var getInterval: Any = js.native
    
    /* private */ var isRunning: Any = js.native
    
    /* private */ var iteration: Any = js.native
    
    /* private */ var schedule: Any = js.native
    
    /* private */ var timerId: Any = js.native
    
    /* private */ val user: Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAuth.firebaseAuthInts.`300000`
    - typings.firebaseAuth.firebaseAuthInts.`30000`
    - typings.firebaseAuth.firebaseAuthInts.`960000`
  */
  trait Duration extends StObject
  object Duration {
    
    inline def OFFSET: `300000` = 300000.asInstanceOf[`300000`]
    
    inline def RETRY_BACKOFF_MAX: `960000` = 960000.asInstanceOf[`960000`]
    
    inline def RETRY_BACKOFF_MIN: `30000` = 30000.asInstanceOf[`30000`]
  }
}
