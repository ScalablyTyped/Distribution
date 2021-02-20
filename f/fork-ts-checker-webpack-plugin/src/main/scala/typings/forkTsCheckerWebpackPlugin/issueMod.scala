package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.issueLocationMod.IssueLocation
import typings.forkTsCheckerWebpackPlugin.issueSeverityMod.IssueSeverity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue", "compareIssueLocations")
  @js.native
  def compareIssueLocations(): Double = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue", "compareIssueLocations")
  @js.native
  def compareIssueLocations(locationA: js.UndefOr[scala.Nothing], locationB: IssueLocation): Double = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue", "compareIssueLocations")
  @js.native
  def compareIssueLocations(locationA: IssueLocation): Double = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue", "compareIssueLocations")
  @js.native
  def compareIssueLocations(locationA: IssueLocation, locationB: IssueLocation): Double = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue", "compareIssueSeverities")
  @js.native
  def compareIssueSeverities(severityA: IssueSeverity, severityB: IssueSeverity): Double = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue", "deduplicateAndSortIssues")
  @js.native
  def deduplicateAndSortIssues(issues: js.Array[Issue]): js.Array[Issue] = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue", "formatIssueLocation")
  @js.native
  def formatIssueLocation(location: IssueLocation): String = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue", "isIssue")
  @js.native
  def isIssue(value: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/Issue.Issue */ Boolean = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue", "isIssueSeverity")
  @js.native
  def isIssueSeverity(value: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/IssueSeverity.IssueSeverity */ Boolean = js.native
}
