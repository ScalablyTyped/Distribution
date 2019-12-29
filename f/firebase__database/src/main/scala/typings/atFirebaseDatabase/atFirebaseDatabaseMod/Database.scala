package typings.atFirebaseDatabase.atFirebaseDatabaseMod

import typings.atFirebaseDatabase.Anon_IncrementTIMESTAMP
import typings.atFirebaseDatabase.distSrcCoreRepoMod.Repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database", "Database")
@js.native
class Database protected ()
  extends typings.atFirebaseDatabase.distSrcApiDatabaseMod.Database {
  /**
    * The constructor should not be called by users of our public API.
    * @param {!Repo} repo_
    */
  def this(repo_ : Repo) = this()
}

/* static members */
@JSImport("@firebase/database", "Database")
@js.native
object Database extends js.Object {
  val ServerValue: Anon_IncrementTIMESTAMP = js.native
}

