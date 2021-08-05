package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.eslintMod.LintResult
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLintIssueFactoryMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/eslint-reporter/issue/EsLintIssueFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createIssuesFromEsLintResults(results: js.Array[LintResult]): js.Array[Issue] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIssuesFromEsLintResults")(results.asInstanceOf[js.Any]).asInstanceOf[js.Array[Issue]]
}
