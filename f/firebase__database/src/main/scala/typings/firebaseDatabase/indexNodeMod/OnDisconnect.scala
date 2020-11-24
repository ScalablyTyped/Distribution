package typings.firebaseDatabase.indexNodeMod

import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.repoMod.Repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/index.node", "OnDisconnect")
@js.native
class OnDisconnect protected ()
  extends typings.firebaseDatabase.onDisconnectMod.OnDisconnect {
  /**
    * @param {!Repo} repo_
    * @param {!Path} path_
    */
  def this(repo_ : Repo, path_ : Path) = this()
}
