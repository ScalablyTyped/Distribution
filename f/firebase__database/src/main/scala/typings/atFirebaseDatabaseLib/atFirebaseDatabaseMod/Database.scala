package typings
package atFirebaseDatabaseLib.atFirebaseDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database", "Database")
@js.native
class Database protected ()
  extends atFirebaseDatabaseLib.distSrcApiDatabaseMod.Database {
  /**
    * The constructor should not be called by users of our public API.
    * @param {!Repo} repo_
    */
  def this(repo_ : atFirebaseDatabaseLib.distSrcCoreRepoMod.Repo) = this()
}

/* static members */
@JSImport("@firebase/database", "Database")
@js.native
object Database extends js.Object {
  val ServerValue: atFirebaseDatabaseLib.Anon_TIMESTAMP = js.native
}

