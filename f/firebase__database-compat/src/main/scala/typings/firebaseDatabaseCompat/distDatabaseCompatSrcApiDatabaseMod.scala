package typings.firebaseDatabaseCompat

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAppTypes.privateMod.FirebaseService
import typings.firebaseDatabaseCompat.anon.Delete
import typings.firebaseDatabaseCompat.anon.Increment
import typings.firebaseDatabaseCompat.anon.MockUserToken
import typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiReferenceMod.Reference
import typings.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDatabaseCompatSrcApiDatabaseMod {
  
  @JSImport("@firebase/database-compat/dist/database-compat/src/api/Database", "Database")
  @js.native
  open class Database protected ()
    extends StObject
       with FirebaseService
       with Compat[typings.firebaseDatabase.mod.Database] {
    /**
      * The constructor should not be called by users of our public API.
      */
    def this(_delegate: typings.firebaseDatabase.mod.Database, app: FirebaseApp) = this()
    
    @JSName("INTERNAL")
    var INTERNAL_Database: Delete = js.native
    
    /* CompleteClass */
    var _delegate: typings.firebaseDatabase.mod.Database = js.native
    
    /* CompleteClass */
    var app: FirebaseApp = js.native
    
    def goOffline(): Unit = js.native
    
    def goOnline(): Unit = js.native
    
    /**
      * Returns a reference to the root or to the path specified in the provided
      * argument.
      *
      * @param path - The relative string path or an existing Reference to a database
      * location.
      * @throws If a Reference is provided, throws if it does not belong to the
      * same project.
      * @returns Firebase reference.
      */
    def ref(): Reference = js.native
    def ref(path: String): Reference = js.native
    def ref(path: Reference): Reference = js.native
    
    /**
      * Returns a reference to the root or the path specified in url.
      * We throw a exception if the url is not in the same domain as the
      * current repo.
      * @returns Firebase reference.
      */
    def refFromURL(url: String): Reference = js.native
    
    /**
      * Modify this instance to communicate with the Realtime Database emulator.
      *
      * <p>Note: This method must be called before performing any other operation.
      *
      * @param host - the emulator host (ex: localhost)
      * @param port - the emulator port (ex: 8080)
      * @param options.mockUserToken - the mock auth token to use for unit testing Security Rules
      */
    def useEmulator(host: String, port: Double): Unit = js.native
    def useEmulator(host: String, port: Double, options: MockUserToken): Unit = js.native
  }
  /* static members */
  object Database {
    
    @JSImport("@firebase/database-compat/dist/database-compat/src/api/Database", "Database.ServerValue")
    @js.native
    val ServerValue: Increment = js.native
  }
}
