package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.webpack.mod.WebpackError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueWebpackErrorMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/issue-webpack-error", "IssueWebpackError")
  @js.native
  open class IssueWebpackError protected () extends WebpackError {
    def this(message: String, issue: Issue) = this()
    
    val issue: Issue = js.native
  }
}
