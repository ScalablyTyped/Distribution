package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issuePredicateMod.IssuePredicate
import typings.forkTsCheckerWebpackPlugin.issueSeverityMod.IssueSeverity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueMatchMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/issue-match", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createIssuePredicateFromIssueMatch(context: String, `match`: IssueMatch): IssuePredicate = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssuePredicateFromIssueMatch")(context.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any])).asInstanceOf[IssuePredicate]
  
  /* Inlined std.Partial<std.Pick<fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue.Issue, 'severity' | 'code' | 'file'>> */
  trait IssueMatch extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
    
    var severity: js.UndefOr[IssueSeverity] = js.undefined
  }
  object IssueMatch {
    
    inline def apply(): IssueMatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IssueMatch]
    }
    
    extension [Self <: IssueMatch](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setSeverity(value: IssueSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    }
  }
}
