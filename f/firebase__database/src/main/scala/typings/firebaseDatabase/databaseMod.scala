package typings.firebaseDatabase

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAppTypes.privateMod.FirebaseService
import typings.firebaseDatabase.anon.Delete
import typings.firebaseDatabase.anon.TIMESTAMP
import typings.firebaseDatabase.referenceMod.Reference
import typings.firebaseDatabase.repoMod.Repo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseMod {
  
  @JSImport("@firebase/database/dist/src/api/Database", "Database")
  @js.native
  class Database protected () extends FirebaseService {
    /**
      * The constructor should not be called by users of our public API.
      * @param {!Repo} repoInternal_
      */
    def this(repoInternal_ : Repo) = this()
    
    @JSName("INTERNAL")
    var INTERNAL_Database: Delete = js.native
    
    @JSName("app")
    def app_MDatabase: FirebaseApp = js.native
    
    /**
      * @param {string} apiName
      */
    var checkDeleted_ : js.Any = js.native
    
    def goOffline(): Unit = js.native
    
    def goOnline(): Unit = js.native
    
    /** Track if the instance has been used (root or repo accessed) */
    var instanceStarted_ : js.Any = js.native
    
    /**
      * Returns a reference to the root or to the path specified in the provided
      * argument.
      *
      * @param {string|Reference=} path The relative string path or an existing
      * Reference to a database location.
      * @throws If a Reference is provided, throws if it does not belong to the
      * same project.
      * @return {!Reference} Firebase reference.
      */
    def ref(): Reference = js.native
    def ref(path: String): Reference = js.native
    def ref(path: Reference): Reference = js.native
    
    /**
      * Returns a reference to the root or the path specified in url.
      * We throw a exception if the url is not in the same domain as the
      * current repo.
      * @param {string} url
      * @return {!Reference} Firebase reference.
      */
    def refFromURL(url: String): Reference = js.native
    
    var repoInternal_ : js.Any = js.native
    
    /* private */ def repo_ : js.Any = js.native
    
    /** Backing state for root_ */
    var rootInternal_ : js.Any = js.native
    
    def root_ : Reference = js.native
    
    /**
      * Modify this instance to communicate with the Realtime Database emulator.
      *
      * <p>Note: This method must be called before performing any other operation.
      *
      * @param host the emulator host (ex: localhost)
      * @param port the emulator port (ex: 8080)
      */
    def useEmulator(host: String, port: Double): Unit = js.native
  }
  /* static members */
  object Database {
    
    @JSImport("@firebase/database/dist/src/api/Database", "Database.ServerValue")
    @js.native
    val ServerValue: TIMESTAMP = js.native
  }
}
