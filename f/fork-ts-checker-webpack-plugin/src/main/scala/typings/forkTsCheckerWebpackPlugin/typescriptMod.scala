package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.typescript.mod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/issue/typescript", JSImport.Namespace)
@js.native
object typescriptMod extends js.Object {
  def createIssueFromTsDiagnostic(diagnostic: Diagnostic, typescript: Typeofts): Issue = js.native
  def createIssuesFromTsDiagnostics(diagnostics: js.Array[Diagnostic], typescript: Typeofts): js.Array[Issue] = js.native
}

