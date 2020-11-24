package typings.gitParse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git-parse", "gitToJs")
@js.native
object gitToJs extends js.Object {
  
  def apply(repoPath: String): js.Promise[js.Array[GitCommit]] = js.native
  def apply(repoPath: String, options: GitToJsOptions): js.Promise[js.Array[GitCommit]] = js.native
}
