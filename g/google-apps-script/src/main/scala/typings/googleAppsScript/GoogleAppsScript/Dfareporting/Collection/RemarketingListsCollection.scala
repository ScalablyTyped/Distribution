package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.RemarketingList
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.RemarketingListsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarketingListsCollection extends js.Object {
  // Gets one remarketing list by ID.
  def get(profileId: String, id: String): RemarketingList = js.native
  // Inserts a new remarketing list.
  def insert(resource: RemarketingList, profileId: String): RemarketingList = js.native
  // Retrieves a list of remarketing lists, possibly filtered. This method supports paging.
  def list(profileId: String, advertiserId: String): RemarketingListsListResponse = js.native
  // Retrieves a list of remarketing lists, possibly filtered. This method supports paging.
  def list(profileId: String, advertiserId: String, optionalArgs: js.Object): RemarketingListsListResponse = js.native
  // Updates an existing remarketing list. This method supports patch semantics.
  def patch(resource: RemarketingList, profileId: String, id: String): RemarketingList = js.native
  // Updates an existing remarketing list.
  def update(resource: RemarketingList, profileId: String): RemarketingList = js.native
}

