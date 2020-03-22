package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.internalIssueFactoryMod.ErrorLike
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/issue/internal", JSImport.Namespace)
@js.native
object internalMod extends js.Object {
  def createIssueFromInternalError(error: ErrorLike): Issue = js.native
}

