package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeFieldValuesCollection extends js.Object {
  // Gets one creative field value by ID.
  def get(profileId: java.lang.String, creativeFieldId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CreativeFieldValue = js.native
  // Inserts a new creative field value.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CreativeFieldValue,
    profileId: java.lang.String,
    creativeFieldId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CreativeFieldValue = js.native
  // Retrieves a list of creative field values, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String, creativeFieldId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CreativeFieldValuesListResponse = js.native
  // Retrieves a list of creative field values, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String, creativeFieldId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CreativeFieldValuesListResponse = js.native
  // Updates an existing creative field value. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CreativeFieldValue,
    profileId: java.lang.String,
    creativeFieldId: java.lang.String,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CreativeFieldValue = js.native
  // Deletes an existing creative field value.
  def remove(profileId: java.lang.String, creativeFieldId: java.lang.String, id: java.lang.String): scala.Unit = js.native
  // Updates an existing creative field value.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CreativeFieldValue,
    profileId: java.lang.String,
    creativeFieldId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CreativeFieldValue = js.native
}

