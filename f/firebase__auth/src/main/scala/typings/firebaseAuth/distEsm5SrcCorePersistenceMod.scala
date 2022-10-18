package typings.firebaseAuth

import typings.firebaseAuth.distEsm5SrcModelPublicTypesMod.Persistence
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm5SrcCorePersistenceMod {
  
  @JSImport("@firebase/auth/dist/esm5/src/core/persistence", "STORAGE_AVAILABLE_KEY")
  @js.native
  val STORAGE_AVAILABLE_KEY: /* "__sak" */ String = js.native
  
  type Instantiator[T] = js.Function1[/* blob */ PersistedBlob, T]
  
  type PersistedBlob = Record[String, Any]
  
  trait PersistenceInternal
    extends StObject
       with Persistence {
    
    def _addListener(key: String, listener: StorageEventListener): Unit
    
    def _get[T /* <: PersistenceValue */](key: String): js.Promise[T | Null]
    
    def _isAvailable(): js.Promise[Boolean]
    
    def _remove(key: String): js.Promise[Unit]
    
    def _removeListener(key: String, listener: StorageEventListener): Unit
    
    def _set(key: String, value: PersistenceValue): js.Promise[Unit]
    
    var _shouldAllowMigration: js.UndefOr[Boolean] = js.undefined
    
    @JSName("type")
    var type_PersistenceInternal: PersistenceType
  }
  object PersistenceInternal {
    
    inline def apply(
      _addListener: (String, StorageEventListener) => Unit,
      _get: String => js.Promise[Any | Null],
      _isAvailable: () => js.Promise[Boolean],
      _remove: String => js.Promise[Unit],
      _removeListener: (String, StorageEventListener) => Unit,
      _set: (String, PersistenceValue) => js.Promise[Unit],
      `type`: PersistenceType
    ): PersistenceInternal = {
      val __obj = js.Dynamic.literal(_addListener = js.Any.fromFunction2(_addListener), _get = js.Any.fromFunction1(_get), _isAvailable = js.Any.fromFunction0(_isAvailable), _remove = js.Any.fromFunction1(_remove), _removeListener = js.Any.fromFunction2(_removeListener), _set = js.Any.fromFunction2(_set))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistenceInternal]
    }
    
    extension [Self <: PersistenceInternal](x: Self) {
      
      inline def setType(value: PersistenceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def set_addListener(value: (String, StorageEventListener) => Unit): Self = StObject.set(x, "_addListener", js.Any.fromFunction2(value))
      
      inline def set_get(value: String => js.Promise[Any | Null]): Self = StObject.set(x, "_get", js.Any.fromFunction1(value))
      
      inline def set_isAvailable(value: () => js.Promise[Boolean]): Self = StObject.set(x, "_isAvailable", js.Any.fromFunction0(value))
      
      inline def set_remove(value: String => js.Promise[Unit]): Self = StObject.set(x, "_remove", js.Any.fromFunction1(value))
      
      inline def set_removeListener(value: (String, StorageEventListener) => Unit): Self = StObject.set(x, "_removeListener", js.Any.fromFunction2(value))
      
      inline def set_set(value: (String, PersistenceValue) => js.Promise[Unit]): Self = StObject.set(x, "_set", js.Any.fromFunction2(value))
      
      inline def set_shouldAllowMigration(value: Boolean): Self = StObject.set(x, "_shouldAllowMigration", value.asInstanceOf[js.Any])
      
      inline def set_shouldAllowMigrationUndefined: Self = StObject.set(x, "_shouldAllowMigration", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAuth.firebaseAuthStrings.SESSION
    - typings.firebaseAuth.firebaseAuthStrings.LOCAL
    - typings.firebaseAuth.firebaseAuthStrings.NONE
  */
  trait PersistenceType extends StObject
  object PersistenceType {
    
    inline def LOCAL: typings.firebaseAuth.firebaseAuthStrings.LOCAL = "LOCAL".asInstanceOf[typings.firebaseAuth.firebaseAuthStrings.LOCAL]
    
    inline def NONE: typings.firebaseAuth.firebaseAuthStrings.NONE = "NONE".asInstanceOf[typings.firebaseAuth.firebaseAuthStrings.NONE]
    
    inline def SESSION: typings.firebaseAuth.firebaseAuthStrings.SESSION = "SESSION".asInstanceOf[typings.firebaseAuth.firebaseAuthStrings.SESSION]
  }
  
  type PersistenceValue = PersistedBlob | String
  
  type StorageEventListener = js.Function1[/* value */ PersistenceValue | Null, Unit]
}
