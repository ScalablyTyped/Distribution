package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.issueOptionsMod.IssueOptions
import typings.forkTsCheckerWebpackPlugin.issuePredicateMod.IssuePredicate
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueConfigMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/issue-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createIssueConfig(compiler: Compiler): IssueConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createIssueConfig")(compiler.asInstanceOf[js.Any]).asInstanceOf[IssueConfig]
  inline def createIssueConfig(compiler: Compiler, options: IssueOptions): IssueConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssueConfig")(compiler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IssueConfig]
  
  trait IssueConfig extends StObject {
    
    def predicate(issue: Issue): Boolean
    @JSName("predicate")
    var predicate_Original: IssuePredicate
  }
  object IssueConfig {
    
    inline def apply(predicate: /* issue */ Issue => Boolean): IssueConfig = {
      val __obj = js.Dynamic.literal(predicate = js.Any.fromFunction1(predicate))
      __obj.asInstanceOf[IssueConfig]
    }
    
    extension [Self <: IssueConfig](x: Self) {
      
      inline def setPredicate(value: /* issue */ Issue => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
    }
  }
}
