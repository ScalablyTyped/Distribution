package typings
package atFirebaseDatabaseLib.distSrcApiDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/api/Database", "Database")
@js.native
class Database protected ()
  extends atFirebaseAppDashTypesLib.privateMod.FirebaseService {
  /**
    * The constructor should not be called by users of our public API.
    * @param {!Repo} repo_
    */
  def this(`repo_`: atFirebaseDatabaseLib.distSrcCoreRepoMod.Repo) = this()
  @JSName("INTERNAL")
  var INTERNAL_Database: DatabaseInternals = js.native
  /* CompleteClass */
  override var app: atFirebaseAppDashTypesLib.appDashTypesMod.FirebaseApp = js.native
  var `repo_`: js.Any = js.native
  var `root_`: js.Any = js.native
  /**
    * @param {string} apiName
    */
  /* private */ def `checkDeleted_`(apiName: js.Any): js.Any = js.native
  def goOffline(): scala.Unit = js.native
  def goOnline(): scala.Unit = js.native
  /**
    * Returns a reference to the root or to the path specified in the provided
    * argument.
    
    * @param {string|Reference=} path The relative string path or an existing
    * Reference to a database location.
    * @throws If a Reference is provided, throws if it does not belong to the
    * same project.
    * @return {!Reference} Firebase reference.
    **/
  def ref(): atFirebaseDatabaseLib.distSrcApiReferenceMod.Reference = js.native
  def ref(path: atFirebaseDatabaseLib.distSrcApiReferenceMod.Reference): atFirebaseDatabaseLib.distSrcApiReferenceMod.Reference = js.native
  def ref(path: java.lang.String): atFirebaseDatabaseLib.distSrcApiReferenceMod.Reference = js.native
  /**
    * Returns a reference to the root or the path specified in url.
    * We throw a exception if the url is not in the same domain as the
    * current repo.
    * @param {string} url
    * @return {!Reference} Firebase reference.
    */
  def refFromURL(url: java.lang.String): atFirebaseDatabaseLib.distSrcApiReferenceMod.Reference = js.native
}

@JSImport("@firebase/database/dist/src/api/Database", "Database")
@js.native
object Database extends js.Object {
  val ServerValue: atFirebaseDatabaseLib.Anon_TIMESTAMP = js.native
}

