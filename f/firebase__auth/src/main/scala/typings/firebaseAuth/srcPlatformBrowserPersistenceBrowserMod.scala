package typings.firebaseAuth

import typings.firebaseAuth.srcCorePersistenceMod.PersistenceType
import typings.firebaseAuth.srcCorePersistenceMod.PersistenceValue
import typings.std.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPlatformBrowserPersistenceBrowserMod {
  
  @JSImport("@firebase/auth/dist/esm5/src/platform_browser/persistence/browser", "BrowserPersistenceClass")
  @js.native
  abstract class BrowserPersistenceClass protected () extends StObject {
    /* protected */ def this(storageRetriever: js.Function0[Storage], `type`: PersistenceType) = this()
    
    def _get[T /* <: PersistenceValue */](key: String): js.Promise[T | Null] = js.native
    
    def _isAvailable(): js.Promise[Boolean] = js.native
    
    def _remove(key: String): js.Promise[Unit] = js.native
    
    def _set(key: String, value: PersistenceValue): js.Promise[Unit] = js.native
    
    /* protected */ def storage: Storage = js.native
    
    /* protected */ def storageRetriever(): Storage = js.native
    
    val `type`: PersistenceType = js.native
  }
}
