package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcLocalLocalStoreMod.LocalStore
import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistenceMod.Persistence
import typings.firebaseFirestore.distLiteFirestoreTestUnitLocalCountingQueryEngineMod.CountingQueryEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreTestUnitLocalLocalStoreDottestMod {
  
  trait LocalStoreComponents extends StObject {
    
    var localStore: LocalStore
    
    var persistence: Persistence
    
    var queryEngine: CountingQueryEngine
  }
  object LocalStoreComponents {
    
    inline def apply(localStore: LocalStore, persistence: Persistence, queryEngine: CountingQueryEngine): LocalStoreComponents = {
      val __obj = js.Dynamic.literal(localStore = localStore.asInstanceOf[js.Any], persistence = persistence.asInstanceOf[js.Any], queryEngine = queryEngine.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalStoreComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocalStoreComponents] (val x: Self) extends AnyVal {
      
      inline def setLocalStore(value: LocalStore): Self = StObject.set(x, "localStore", value.asInstanceOf[js.Any])
      
      inline def setPersistence(value: Persistence): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
      
      inline def setQueryEngine(value: CountingQueryEngine): Self = StObject.set(x, "queryEngine", value.asInstanceOf[js.Any])
    }
  }
}
