package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Typeofts
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.eslint
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.internal
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.typescript
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.warning
import typings.forkTsCheckerWebpackPlugin.internalIssueFactoryMod.ErrorLike
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.issueOriginMod.IssueOrigin
import typings.forkTsCheckerWebpackPlugin.issueSeverityMod.IssueSeverity
import typings.forkTsCheckerWebpackPlugin.typesEslintMod.LintReport
import typings.typescript.mod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/issue", JSImport.Namespace)
@js.native
object issueMod extends js.Object {
  def compareIssueOrigins(originA: IssueOrigin, originB: IssueOrigin): Double = js.native
  def compareIssueSeverities(severityA: IssueSeverity, severityB: IssueSeverity): Double = js.native
  def createIssueFromInternalError(error: ErrorLike): Issue = js.native
  def createIssueFromTsDiagnostic(diagnostic: Diagnostic, typescript: Typeofts): Issue = js.native
  def createIssuesFromEsLintReports(reports: js.Array[LintReport]): js.Array[Issue] = js.native
  def createIssuesFromTsDiagnostics(diagnostics: js.Array[Diagnostic], typescript: Typeofts): js.Array[Issue] = js.native
  def deduplicateAndSortIssues(issues: js.Array[Issue]): js.Array[Issue] = js.native
  def isIssue(value: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/Issue.Issue */ Boolean = js.native
  def isIssueOrigin(value: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/IssueOrigin.IssueOrigin */ Boolean = js.native
  def isIssueSeverity(value: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/IssueSeverity.IssueSeverity */ Boolean = js.native
  @js.native
  object IssueOrigin extends js.Object {
    val ESLINT: eslint = js.native
    val INTERNAL: internal = js.native
    val TYPESCRIPT: typescript = js.native
  }
  
  @js.native
  object IssueSeverity extends js.Object {
    val ERROR: error = js.native
    val WARNING: warning = js.native
  }
  
}

