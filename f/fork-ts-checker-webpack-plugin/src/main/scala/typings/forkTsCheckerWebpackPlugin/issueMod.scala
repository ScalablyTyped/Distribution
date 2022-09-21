package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.issueLocationMod.IssueLocation
import typings.forkTsCheckerWebpackPlugin.issueSeverityMod.IssueSeverity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareIssueLocations(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIssueLocations")().asInstanceOf[Double]
  inline def compareIssueLocations(locationA: Unit, locationB: IssueLocation): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIssueLocations")(locationA.asInstanceOf[js.Any], locationB.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareIssueLocations(locationA: IssueLocation): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIssueLocations")(locationA.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def compareIssueLocations(locationA: IssueLocation, locationB: IssueLocation): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIssueLocations")(locationA.asInstanceOf[js.Any], locationB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def compareIssueSeverities(severityA: IssueSeverity, severityB: IssueSeverity): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIssueSeverities")(severityA.asInstanceOf[js.Any], severityB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def deduplicateAndSortIssues(issues: js.Array[Issue]): js.Array[Issue] = ^.asInstanceOf[js.Dynamic].applyDynamic("deduplicateAndSortIssues")(issues.asInstanceOf[js.Any]).asInstanceOf[js.Array[Issue]]
  
  inline def formatIssueLocation(location: IssueLocation): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatIssueLocation")(location.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isIssue(value: Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/issue.Issue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIssue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/issue.Issue */ Boolean]
  
  inline def isIssueSeverity(value: Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/issue-severity.IssueSeverity */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIssueSeverity")(value.asInstanceOf[js.Any]).asInstanceOf[/* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/issue-severity.IssueSeverity */ Boolean]
}
