package typings.firebaseAuth.distEsm5TestIntegrationWebdriverUtilFunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PersistenceFunction extends StObject
@JSImport("@firebase/auth/dist/esm5/test/integration/webdriver/util/functions", "PersistenceFunction")
@js.native
object PersistenceFunction extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PersistenceFunction & String] = js.native
  
  @js.native
  sealed trait CLEAR_PERSISTENCE
    extends StObject
       with PersistenceFunction
  /* "persistence.clearPersistence" */ val CLEAR_PERSISTENCE: typings.firebaseAuth.distEsm5TestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.CLEAR_PERSISTENCE & String = js.native
  
  @js.native
  sealed trait INDEXED_DB_SNAP
    extends StObject
       with PersistenceFunction
  /* "persistence.indexedDBSnap" */ val INDEXED_DB_SNAP: typings.firebaseAuth.distEsm5TestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.INDEXED_DB_SNAP & String = js.native
  
  @js.native
  sealed trait LOCAL_STORAGE_SET
    extends StObject
       with PersistenceFunction
  /* "persistence.localStorageSet" */ val LOCAL_STORAGE_SET: typings.firebaseAuth.distEsm5TestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.LOCAL_STORAGE_SET & String = js.native
  
  @js.native
  sealed trait LOCAL_STORAGE_SNAP
    extends StObject
       with PersistenceFunction
  /* "persistence.localStorageSnap" */ val LOCAL_STORAGE_SNAP: typings.firebaseAuth.distEsm5TestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.LOCAL_STORAGE_SNAP & String = js.native
  
  @js.native
  sealed trait MAKE_INDEXED_DB_READONLY
    extends StObject
       with PersistenceFunction
  /* "persistence.makeIndexedDBReadonly" */ val MAKE_INDEXED_DB_READONLY: typings.firebaseAuth.distEsm5TestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.MAKE_INDEXED_DB_READONLY & String = js.native
  
  @js.native
  sealed trait SESSION_STORAGE_SET
    extends StObject
       with PersistenceFunction
  /* "persistence.sessionStorageSet" */ val SESSION_STORAGE_SET: typings.firebaseAuth.distEsm5TestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.SESSION_STORAGE_SET & String = js.native
  
  @js.native
  sealed trait SESSION_STORAGE_SNAP
    extends StObject
       with PersistenceFunction
  /* "persistence.sessionStorageSnap" */ val SESSION_STORAGE_SNAP: typings.firebaseAuth.distEsm5TestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.SESSION_STORAGE_SNAP & String = js.native
  
  @js.native
  sealed trait SET_PERSISTENCE_INDEXED_DB
    extends StObject
       with PersistenceFunction
  /* "persistence.setPersistenceIndexedDB" */ val SET_PERSISTENCE_INDEXED_DB: typings.firebaseAuth.distEsm5TestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.SET_PERSISTENCE_INDEXED_DB & String = js.native
  
  @js.native
  sealed trait SET_PERSISTENCE_LOCAL_STORAGE
    extends StObject
       with PersistenceFunction
  /* "persistence.setPersistenceLocalStorage" */ val SET_PERSISTENCE_LOCAL_STORAGE: typings.firebaseAuth.distEsm5TestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.SET_PERSISTENCE_LOCAL_STORAGE & String = js.native
  
  @js.native
  sealed trait SET_PERSISTENCE_MEMORY
    extends StObject
       with PersistenceFunction
  /* "persistence.setPersistenceMemory" */ val SET_PERSISTENCE_MEMORY: typings.firebaseAuth.distEsm5TestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.SET_PERSISTENCE_MEMORY & String = js.native
  
  @js.native
  sealed trait SET_PERSISTENCE_SESSION
    extends StObject
       with PersistenceFunction
  /* "persistence.setPersistenceSession" */ val SET_PERSISTENCE_SESSION: typings.firebaseAuth.distEsm5TestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.SET_PERSISTENCE_SESSION & String = js.native
}
