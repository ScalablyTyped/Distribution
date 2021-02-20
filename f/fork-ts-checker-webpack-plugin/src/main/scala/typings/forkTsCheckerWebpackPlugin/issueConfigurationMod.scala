package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.issueOptionsMod.IssueOptions
import typings.forkTsCheckerWebpackPlugin.issuePredicateMod.IssuePredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueConfigurationMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssueConfiguration", "createIssueConfiguration")
  @js.native
  def createIssueConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): IssueConfiguration = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssueConfiguration", "createIssueConfiguration")
  @js.native
  def createIssueConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    options: IssueOptions
  ): IssueConfiguration = js.native
  
  @js.native
  trait IssueConfiguration extends StObject {
    
    def predicate(issue: Issue): Boolean = js.native
    @JSName("predicate")
    var predicate_Original: IssuePredicate = js.native
  }
}
