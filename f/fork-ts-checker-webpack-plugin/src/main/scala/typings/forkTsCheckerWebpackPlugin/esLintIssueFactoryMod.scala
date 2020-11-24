package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.eslintMod.LintResult
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/eslint-reporter/issue/EsLintIssueFactory", JSImport.Namespace)
@js.native
object esLintIssueFactoryMod extends js.Object {
  
  def createIssuesFromEsLintResults(results: js.Array[LintResult]): js.Array[Issue] = js.native
}
