package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.issueLocationMod.IssueLocation
import typings.forkTsCheckerWebpackPlugin.issueSeverityMod.IssueSeverity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/issue", JSImport.Namespace)
@js.native
object issueMod extends js.Object {
  def compareIssueLocations(): Double = js.native
  def compareIssueLocations(locationA: js.UndefOr[scala.Nothing], locationB: IssueLocation): Double = js.native
  def compareIssueLocations(locationA: IssueLocation): Double = js.native
  def compareIssueLocations(locationA: IssueLocation, locationB: IssueLocation): Double = js.native
  def compareIssueSeverities(severityA: IssueSeverity, severityB: IssueSeverity): Double = js.native
  def deduplicateAndSortIssues(issues: js.Array[Issue]): js.Array[Issue] = js.native
  def formatIssueLocation(location: IssueLocation): String = js.native
  def isIssue(value: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/Issue.Issue */ Boolean = js.native
  def isIssueSeverity(value: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/IssueSeverity.IssueSeverity */ Boolean = js.native
}

