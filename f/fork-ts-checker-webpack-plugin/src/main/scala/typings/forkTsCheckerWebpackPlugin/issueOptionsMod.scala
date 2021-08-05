package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.issueMatchMod.IssueMatch
import typings.forkTsCheckerWebpackPlugin.issuePredicateMod.IssuePredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueOptionsMod {
  
  trait IssueOptions extends StObject {
    
    var exclude: js.UndefOr[IssuePredicateOption] = js.undefined
    
    var include: js.UndefOr[IssuePredicateOption] = js.undefined
  }
  object IssueOptions {
    
    inline def apply(): IssueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IssueOptions]
    }
    
    extension [Self <: IssueOptions](x: Self) {
      
      inline def setExclude(value: IssuePredicateOption): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeFunction1(value: /* issue */ Issue => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (IssuePredicate | IssueMatch)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setInclude(value: IssuePredicateOption): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeFunction1(value: /* issue */ Issue => Boolean): Self = StObject.set(x, "include", js.Any.fromFunction1(value))
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (IssuePredicate | IssueMatch)*): Self = StObject.set(x, "include", js.Array(value :_*))
    }
  }
  
  type IssuePredicateOption = IssuePredicate | IssueMatch | (js.Array[IssuePredicate | IssueMatch])
}
