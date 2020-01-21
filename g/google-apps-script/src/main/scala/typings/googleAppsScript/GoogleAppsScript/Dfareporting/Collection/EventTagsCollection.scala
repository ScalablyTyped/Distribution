package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.EventTag
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.EventTagsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTagsCollection extends js.Object {
  // Gets one event tag by ID.
  def get(profileId: String, id: String): EventTag = js.native
  // Inserts a new event tag.
  def insert(resource: EventTag, profileId: String): EventTag = js.native
  // Retrieves a list of event tags, possibly filtered.
  def list(profileId: String): EventTagsListResponse = js.native
  // Retrieves a list of event tags, possibly filtered.
  def list(profileId: String, optionalArgs: js.Object): EventTagsListResponse = js.native
  // Updates an existing event tag. This method supports patch semantics.
  def patch(resource: EventTag, profileId: String, id: String): EventTag = js.native
  // Deletes an existing event tag.
  def remove(profileId: String, id: String): Unit = js.native
  // Updates an existing event tag.
  def update(resource: EventTag, profileId: String): EventTag = js.native
}

