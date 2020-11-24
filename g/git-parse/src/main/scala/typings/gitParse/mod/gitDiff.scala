package typings.gitParse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git-parse", "gitDiff")
@js.native
object gitDiff extends js.Object {
  
  def apply(pathToRepo: String, commitHash1: String): js.Promise[String] = js.native
  def apply(pathToRepo: String, commitHash1: String, commitHash2: js.UndefOr[scala.Nothing], file: String): js.Promise[String] = js.native
  def apply(pathToRepo: String, commitHash1: String, commitHash2: String): js.Promise[String] = js.native
  def apply(pathToRepo: String, commitHash1: String, commitHash2: String, file: String): js.Promise[String] = js.native
}
