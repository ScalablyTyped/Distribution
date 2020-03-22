package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.typesEslintMod.LintReport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/issue/eslint", JSImport.Namespace)
@js.native
object eslintMod extends js.Object {
  def createIssuesFromEsLintReports(reports: js.Array[LintReport]): js.Array[Issue] = js.native
}

