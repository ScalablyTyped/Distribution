package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssueWebpackError", JSImport.Namespace)
@js.native
object issueWebpackErrorMod extends js.Object {
  @js.native
  class IssueWebpackError protected () extends Error {
    def this(message: String, context: String, issue: Issue) = this()
    val file: js.UndefOr[String] = js.native
    val hideStack: /* true */ Boolean = js.native
    val issue: Issue = js.native
  }
  
}

