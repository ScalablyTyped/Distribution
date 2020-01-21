package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.Creative
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.CreativesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativesCollection extends js.Object {
  // Gets one creative by ID.
  def get(profileId: String, id: String): Creative = js.native
  // Inserts a new creative.
  def insert(resource: Creative, profileId: String): Creative = js.native
  // Retrieves a list of creatives, possibly filtered. This method supports paging.
  def list(profileId: String): CreativesListResponse = js.native
  // Retrieves a list of creatives, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): CreativesListResponse = js.native
  // Updates an existing creative. This method supports patch semantics.
  def patch(resource: Creative, profileId: String, id: String): Creative = js.native
  // Updates an existing creative.
  def update(resource: Creative, profileId: String): Creative = js.native
}

