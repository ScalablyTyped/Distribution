package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.issueOptionsMod.IssueOptions
import typings.forkTsCheckerWebpackPlugin.issuePredicateMod.IssuePredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueConfigurationMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssueConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createIssueConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): IssueConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createIssueConfiguration")(compiler.asInstanceOf[js.Any]).asInstanceOf[IssueConfiguration]
  @scala.inline
  def createIssueConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    options: IssueOptions
  ): IssueConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssueConfiguration")(compiler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IssueConfiguration]
  
  trait IssueConfiguration extends StObject {
    
    def predicate(issue: Issue): Boolean
    @JSName("predicate")
    var predicate_Original: IssuePredicate
  }
  object IssueConfiguration {
    
    @scala.inline
    def apply(predicate: /* issue */ Issue => Boolean): IssueConfiguration = {
      val __obj = js.Dynamic.literal(predicate = js.Any.fromFunction1(predicate))
      __obj.asInstanceOf[IssueConfiguration]
    }
    
    @scala.inline
    implicit class IssueConfigurationMutableBuilder[Self <: IssueConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPredicate(value: /* issue */ Issue => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
    }
  }
}
