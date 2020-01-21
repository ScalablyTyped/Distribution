package typings.firebaseDatabase.mod

import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.repoMod.Repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database", "OnDisconnect")
@js.native
class OnDisconnect protected ()
  extends typings.firebaseDatabase.onDisconnectMod.OnDisconnect {
  /**
    * @param {!Repo} repo_
    * @param {!Path} path_
    */
  def this(repo_ : Repo, path_ : Path) = this()
}

