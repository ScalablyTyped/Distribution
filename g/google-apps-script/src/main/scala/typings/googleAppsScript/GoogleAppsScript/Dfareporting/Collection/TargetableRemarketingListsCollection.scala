package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.TargetableRemarketingList
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.TargetableRemarketingListsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetableRemarketingListsCollection extends js.Object {
  // Gets one remarketing list by ID.
  def get(profileId: String, id: String): TargetableRemarketingList = js.native
  // Retrieves a list of targetable remarketing lists, possibly filtered. This method supports paging.
  def list(profileId: String, advertiserId: String): TargetableRemarketingListsListResponse = js.native
  // Retrieves a list of targetable remarketing lists, possibly filtered. This method supports paging.
  def list(profileId: String, advertiserId: String, optionalArgs: js.Object): TargetableRemarketingListsListResponse = js.native
}

