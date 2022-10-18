package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIssueIssueSeverityMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/issue-severity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareIssueSeverities(severityA: IssueSeverity, severityB: IssueSeverity): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIssueSeverities")(severityA.asInstanceOf[js.Any], severityB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isIssueSeverity(value: Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/issue-severity.IssueSeverity */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIssueSeverity")(value.asInstanceOf[js.Any]).asInstanceOf[/* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/issue-severity.IssueSeverity */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.warning
  */
  trait IssueSeverity extends StObject
  object IssueSeverity {
    
    inline def error: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error = "error".asInstanceOf[typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error]
    
    inline def warning: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.warning = "warning".asInstanceOf[typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.warning]
  }
}
