package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.CreativeField
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.CreativeFieldsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeFieldsCollection extends js.Object {
  
  // Gets one creative field by ID.
  def get(profileId: String, id: String): CreativeField = js.native
  
  // Inserts a new creative field.
  def insert(resource: CreativeField, profileId: String): CreativeField = js.native
  
  // Retrieves a list of creative fields, possibly filtered. This method supports paging.
  def list(profileId: String): CreativeFieldsListResponse = js.native
  // Retrieves a list of creative fields, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): CreativeFieldsListResponse = js.native
  
  // Updates an existing creative field. This method supports patch semantics.
  def patch(resource: CreativeField, profileId: String, id: String): CreativeField = js.native
  
  // Deletes an existing creative field.
  def remove(profileId: String, id: String): Unit = js.native
  
  // Updates an existing creative field.
  def update(resource: CreativeField, profileId: String): CreativeField = js.native
}
