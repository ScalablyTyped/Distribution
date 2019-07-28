package typings.atFirebaseDatabase.distSrcApiDatabaseMod

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebaseAppDashTypes.privateMod.FirebaseService
import typings.atFirebaseDatabase.Anon_TIMESTAMP
import typings.atFirebaseDatabase.distSrcApiReferenceMod.Reference
import typings.atFirebaseDatabase.distSrcCoreRepoMod.Repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/api/Database", "Database")
@js.native
class Database protected () extends FirebaseService {
  /**
    * The constructor should not be called by users of our public API.
    * @param {!Repo} repo_
    */
  def this(repo_ : Repo) = this()
  @JSName("INTERNAL")
  var INTERNAL_Database: DatabaseInternals = js.native
  /* CompleteClass */
  override var app: FirebaseApp = js.native
  /**
    * @param {string} apiName
    */
  var checkDeleted_ : js.Any = js.native
  var repo_ : js.Any = js.native
  var root_ : js.Any = js.native
  def goOffline(): Unit = js.native
  def goOnline(): Unit = js.native
  /**
    * Returns a reference to the root or to the path specified in the provided
    * argument.
    
    * @param {string|Reference=} path The relative string path or an existing
    * Reference to a database location.
    * @throws If a Reference is provided, throws if it does not belong to the
    * same project.
    * @return {!Reference} Firebase reference.
    **/
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

/* static members */
@JSImport("@firebase/database/dist/src/api/Database", "Database")
@js.native
object Database extends js.Object {
  val ServerValue: Anon_TIMESTAMP = js.native
}

