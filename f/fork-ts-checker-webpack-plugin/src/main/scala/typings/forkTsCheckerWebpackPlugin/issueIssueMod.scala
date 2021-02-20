package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issueLocationMod.IssueLocation
import typings.forkTsCheckerWebpackPlugin.issueSeverityMod.IssueSeverity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueIssueMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/Issue", "deduplicateAndSortIssues")
  @js.native
  def deduplicateAndSortIssues(issues: js.Array[Issue]): js.Array[Issue] = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/Issue", "isIssue")
  @js.native
  def isIssue(value: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/Issue.Issue */ Boolean = js.native
  
  @js.native
  trait Issue extends StObject {
    
    var code: String = js.native
    
    var file: js.UndefOr[String] = js.native
    
    var location: js.UndefOr[IssueLocation] = js.native
    
    var message: String = js.native
    
    var origin: String = js.native
    
    var severity: IssueSeverity = js.native
  }
  object Issue {
    
    @scala.inline
    def apply(code: String, message: String, origin: String, severity: IssueSeverity): Issue = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
      __obj.asInstanceOf[Issue]
    }
    
    @scala.inline
    implicit class IssueMutableBuilder[Self <: Issue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setLocation(value: IssueLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeverity(value: IssueSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    }
  }
}
