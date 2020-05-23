package typings.firebaseDatabase.mod

import typings.firebaseDatabase.anon.TIMESTAMP
import typings.firebaseDatabase.repoMod.Repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database", "Database")
@js.native
class Database protected ()
  extends typings.firebaseDatabase.databaseMod.Database {
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
  val ServerValue: TIMESTAMP = js.native
}

