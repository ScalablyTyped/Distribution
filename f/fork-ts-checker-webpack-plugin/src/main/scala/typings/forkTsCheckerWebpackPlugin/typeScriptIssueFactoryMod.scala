package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Typeofts
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptIssueFactoryMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/issue/TypeScriptIssueFactory", "createIssuesFromTsDiagnostics")
  @js.native
  def createIssuesFromTsDiagnostics(typescript: Typeofts, diagnostics: js.Array[Diagnostic]): js.Array[Issue] = js.native
}
