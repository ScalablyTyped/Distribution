package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ContentCategoriesListResponse
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ContentCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentCategoriesCollection extends js.Object {
  
  // Gets one content category by ID.
  def get(profileId: String, id: String): ContentCategory = js.native
  
  // Inserts a new content category.
  def insert(resource: ContentCategory, profileId: String): ContentCategory = js.native
  
  // Retrieves a list of content categories, possibly filtered. This method supports paging.
  def list(profileId: String): ContentCategoriesListResponse = js.native
  // Retrieves a list of content categories, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): ContentCategoriesListResponse = js.native
  
  // Updates an existing content category. This method supports patch semantics.
  def patch(resource: ContentCategory, profileId: String, id: String): ContentCategory = js.native
  
  // Deletes an existing content category.
  def remove(profileId: String, id: String): Unit = js.native
  
  // Updates an existing content category.
  def update(resource: ContentCategory, profileId: String): ContentCategory = js.native
}
