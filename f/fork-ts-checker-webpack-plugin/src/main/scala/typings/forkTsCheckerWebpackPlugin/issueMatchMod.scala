package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issuePredicateMod.IssuePredicate
import typings.forkTsCheckerWebpackPlugin.issueSeverityMod.IssueSeverity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueMatchMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssueMatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createIssuePredicateFromIssueMatch(context: String, `match`: IssueMatch): IssuePredicate = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssuePredicateFromIssueMatch")(context.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any])).asInstanceOf[IssuePredicate]
  
  /* Inlined std.Partial<std.Pick<fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue.Issue, 'origin' | 'severity' | 'code' | 'file'>> */
  trait IssueMatch extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
    
    var severity: js.UndefOr[IssueSeverity] = js.undefined
  }
  object IssueMatch {
    
    @scala.inline
    def apply(): IssueMatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IssueMatch]
    }
    
    @scala.inline
    implicit class IssueMatchMutableBuilder[Self <: IssueMatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setSeverity(value: IssueSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    }
  }
}
