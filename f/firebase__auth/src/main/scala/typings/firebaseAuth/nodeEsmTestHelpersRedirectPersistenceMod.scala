package typings.firebaseAuth

import typings.firebaseAuth.srcCorePersistenceInMemoryMod.InMemoryPersistence_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeEsmTestHelpersRedirectPersistenceMod {
  
  @JSImport("@firebase/auth/dist/node-esm/test/helpers/redirect_persistence", "RedirectPersistence")
  @js.native
  open class RedirectPersistence () extends InMemoryPersistence_ {
    
    var hasPendingRedirect: Boolean = js.native
    
    var redirectUser: js.Object | Null = js.native
  }
}
