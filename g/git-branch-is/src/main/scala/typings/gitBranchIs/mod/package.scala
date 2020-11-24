package typings.gitBranchIs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Expected name of current branch
    * or a test function to apply to the branch name
    */
  type BranchNameOrTest = java.lang.String | typings.gitBranchIs.mod.BranchNameTest
  
  /**
    * test function to apply to the branch name
    */
  type BranchNameTest = js.Function1[/* branchName */ java.lang.String, scala.Boolean | js.Promise[scala.Boolean]]
  
  /**
    * function called with the return value of <code>branchNameOrTest</code> if it is a function,
    * or the result of identity checking <code>branchNameOrTest</code> to the
    * current branch name
    */
  type Callback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* result */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
}
