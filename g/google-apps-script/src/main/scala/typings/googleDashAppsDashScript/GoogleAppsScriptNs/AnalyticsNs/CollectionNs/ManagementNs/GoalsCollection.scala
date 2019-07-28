package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.ManagementNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Goal
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Goals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoalsCollection extends js.Object {
  // Gets a goal to which the user has access.
  def get(accountId: String, webPropertyId: String, profileId: String, goalId: String): Goal = js.native
  // Create a new goal.
  def insert(resource: Goal, accountId: String, webPropertyId: String, profileId: String): Goal = js.native
  // Lists goals to which the user has access.
  def list(accountId: String, webPropertyId: String, profileId: String): Goals = js.native
  // Lists goals to which the user has access.
  def list(accountId: String, webPropertyId: String, profileId: String, optionalArgs: js.Object): Goals = js.native
  // Updates an existing goal. This method supports patch semantics.
  def patch(resource: Goal, accountId: String, webPropertyId: String, profileId: String, goalId: String): Goal = js.native
  // Updates an existing goal.
  def update(resource: Goal, accountId: String, webPropertyId: String, profileId: String, goalId: String): Goal = js.native
}

