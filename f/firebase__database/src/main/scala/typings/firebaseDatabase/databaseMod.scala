package typings.firebaseDatabase

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAppTypes.privateMod.FirebaseService
import typings.firebaseDatabase.anon.TIMESTAMP
import typings.firebaseDatabase.referenceMod.Reference
import typings.firebaseDatabase.repoMod.Repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/api/Database", JSImport.Namespace)
@js.native
object databaseMod extends js.Object {
  @js.native
  class Database protected () extends FirebaseService {
    /**
      * The constructor should not be called by users of our public API.
      * @param {!Repo} repo_
      */
    def this(repo_ : Repo) = this()
    @JSName("INTERNAL")
    var INTERNAL_Database: DatabaseInternals = js.native
    /**
      * @param {string} apiName
      */
    var checkDeleted_ : js.Any = js.native
    var repo_ : js.Any = js.native
    var root_ : js.Any = js.native
    @JSName("app")
    def app_MDatabase: FirebaseApp = js.native
    def goOffline(): Unit = js.native
    def goOnline(): Unit = js.native
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
  }
  
  @js.native
  class DatabaseInternals protected () extends js.Object {
    /** @param {!Database} database */
    def this(database: Database) = this()
    var database: Database = js.native
    /** @return {Promise<void>} */
    def delete(): js.Promise[Unit] = js.native
  }
  
  /* static members */
  @js.native
  object Database extends js.Object {
    val ServerValue: TIMESTAMP = js.native
  }
  
}

