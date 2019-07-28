package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CreativeFieldValue
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CreativeFieldValuesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeFieldValuesCollection extends js.Object {
  // Gets one creative field value by ID.
  def get(profileId: String, creativeFieldId: String, id: String): CreativeFieldValue = js.native
  // Inserts a new creative field value.
  def insert(resource: CreativeFieldValue, profileId: String, creativeFieldId: String): CreativeFieldValue = js.native
  // Retrieves a list of creative field values, possibly filtered. This method supports paging.
  def list(profileId: String, creativeFieldId: String): CreativeFieldValuesListResponse = js.native
  // Retrieves a list of creative field values, possibly filtered. This method supports paging.
  def list(profileId: String, creativeFieldId: String, optionalArgs: js.Object): CreativeFieldValuesListResponse = js.native
  // Updates an existing creative field value. This method supports patch semantics.
  def patch(resource: CreativeFieldValue, profileId: String, creativeFieldId: String, id: String): CreativeFieldValue = js.native
  // Deletes an existing creative field value.
  def remove(profileId: String, creativeFieldId: String, id: String): Unit = js.native
  // Updates an existing creative field value.
  def update(resource: CreativeFieldValue, profileId: String, creativeFieldId: String): CreativeFieldValue = js.native
}

