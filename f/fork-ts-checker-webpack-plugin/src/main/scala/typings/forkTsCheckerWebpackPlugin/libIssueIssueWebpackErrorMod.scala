package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.libFormatterFormatterMod.FormatterPathType
import typings.forkTsCheckerWebpackPlugin.libIssueIssueMod.Issue
import typings.webpack.mod.WebpackError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIssueIssueWebpackErrorMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/issue-webpack-error", "IssueWebpackError")
  @js.native
  open class IssueWebpackError protected () extends WebpackError {
    def this(message: String, pathType: FormatterPathType, issue: Issue) = this()
    
    val issue: Issue = js.native
  }
}
