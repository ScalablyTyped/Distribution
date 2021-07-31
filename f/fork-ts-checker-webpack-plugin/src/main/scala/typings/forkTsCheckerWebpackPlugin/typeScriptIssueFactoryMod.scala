package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Typeofts
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptIssueFactoryMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/issue/TypeScriptIssueFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createIssuesFromTsDiagnostics(typescript: Typeofts, diagnostics: js.Array[Diagnostic]): js.Array[Issue] = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssuesFromTsDiagnostics")(typescript.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[js.Array[Issue]]
}
