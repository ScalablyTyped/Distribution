package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.typescript.mod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/issue/TypeScriptIssueFactory", JSImport.Namespace)
@js.native
object typeScriptIssueFactoryMod extends js.Object {
  def createIssuesFromTsDiagnostics(diagnostics: js.Array[Diagnostic]): js.Array[Issue] = js.native
}

