package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightActivitiesCollection extends js.Object {
  // Generates a tag for a floodlight activity.
  def generatetag(profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FloodlightActivitiesGenerateTagResponse = js.native
  // Generates a tag for a floodlight activity.
  def generatetag(profileId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FloodlightActivitiesGenerateTagResponse = js.native
  // Gets one floodlight activity by ID.
  def get(profileId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FloodlightActivity = js.native
  // Inserts a new floodlight activity.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FloodlightActivity,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FloodlightActivity = js.native
  // Retrieves a list of floodlight activities, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FloodlightActivitiesListResponse = js.native
  // Retrieves a list of floodlight activities, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FloodlightActivitiesListResponse = js.native
  // Updates an existing floodlight activity. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FloodlightActivity,
    profileId: java.lang.String,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FloodlightActivity = js.native
  // Deletes an existing floodlight activity.
  def remove(profileId: java.lang.String, id: java.lang.String): scala.Unit = js.native
  // Updates an existing floodlight activity.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FloodlightActivity,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FloodlightActivity = js.native
}

