package typings.firebaseAuth

import typings.firebaseAuth.inMemoryMod.InMemoryPersistence_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redirectPersistenceMod {
  
  @JSImport("@firebase/auth/dist/cordova/test/helpers/redirect_persistence", "RedirectPersistence")
  @js.native
  open class RedirectPersistence () extends InMemoryPersistence_ {
    
    var hasPendingRedirect: Boolean = js.native
    
    var redirectUser: js.Object | Null = js.native
  }
}
