package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.libIssueIssueLocationMod.IssueLocation
import typings.forkTsCheckerWebpackPlugin.libIssueIssueSeverityMod.IssueSeverity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIssueIssueMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/issue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deduplicateAndSortIssues(issues: js.Array[Issue]): js.Array[Issue] = ^.asInstanceOf[js.Dynamic].applyDynamic("deduplicateAndSortIssues")(issues.asInstanceOf[js.Any]).asInstanceOf[js.Array[Issue]]
  
  inline def isIssue(value: Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/issue.Issue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIssue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/issue.Issue */ Boolean]
  
  trait Issue extends StObject {
    
    var code: String
    
    var file: js.UndefOr[String] = js.undefined
    
    var location: js.UndefOr[IssueLocation] = js.undefined
    
    var message: String
    
    var severity: IssueSeverity
  }
  object Issue {
    
    inline def apply(code: String, message: String, severity: IssueSeverity): Issue = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
      __obj.asInstanceOf[Issue]
    }
    
    extension [Self <: Issue](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setLocation(value: IssueLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSeverity(value: IssueSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    }
  }
}
