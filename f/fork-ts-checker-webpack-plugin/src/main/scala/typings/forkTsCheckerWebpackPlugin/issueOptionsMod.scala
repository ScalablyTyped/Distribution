package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.issueMatchMod.IssueMatch
import typings.forkTsCheckerWebpackPlugin.issuePredicateMod.IssuePredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueOptionsMod {
  
  @js.native
  trait IssueOptions extends StObject {
    
    var exclude: js.UndefOr[IssuePredicateOption] = js.native
    
    var include: js.UndefOr[IssuePredicateOption] = js.native
  }
  object IssueOptions {
    
    @scala.inline
    def apply(): IssueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IssueOptions]
    }
    
    @scala.inline
    implicit class IssueOptionsMutableBuilder[Self <: IssueOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclude(value: IssuePredicateOption): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeFunction1(value: /* issue */ Issue => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: (IssuePredicate | IssueMatch)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: IssuePredicateOption): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeFunction1(value: /* issue */ Issue => Boolean): Self = StObject.set(x, "include", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: (IssuePredicate | IssueMatch)*): Self = StObject.set(x, "include", js.Array(value :_*))
    }
  }
  
  type IssuePredicateOption = IssuePredicate | IssueMatch | (js.Array[IssuePredicate | IssueMatch])
}
