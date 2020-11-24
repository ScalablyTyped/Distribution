package typings.gitBranchIs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git-branch-is", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(branchNameOrTest: BranchNameOrTest): js.Promise[Boolean] = js.native
  def apply(branchNameOrTest: BranchNameOrTest, callback: Callback): Unit = js.native
  def apply(branchNameOrTest: BranchNameOrTest, options: Options): Unit = js.native
  def apply(branchNameOrTest: BranchNameOrTest, options: Options, callback: Callback): Unit = js.native
}
