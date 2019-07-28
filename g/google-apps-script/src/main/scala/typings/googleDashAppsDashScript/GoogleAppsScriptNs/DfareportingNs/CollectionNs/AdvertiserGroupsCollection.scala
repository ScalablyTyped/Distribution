package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.AdvertiserGroup
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.AdvertiserGroupsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvertiserGroupsCollection extends js.Object {
  // Gets one advertiser group by ID.
  def get(profileId: String, id: String): AdvertiserGroup = js.native
  // Inserts a new advertiser group.
  def insert(resource: AdvertiserGroup, profileId: String): AdvertiserGroup = js.native
  // Retrieves a list of advertiser groups, possibly filtered. This method supports paging.
  def list(profileId: String): AdvertiserGroupsListResponse = js.native
  // Retrieves a list of advertiser groups, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): AdvertiserGroupsListResponse = js.native
  // Updates an existing advertiser group. This method supports patch semantics.
  def patch(resource: AdvertiserGroup, profileId: String, id: String): AdvertiserGroup = js.native
  // Deletes an existing advertiser group.
  def remove(profileId: String, id: String): Unit = js.native
  // Updates an existing advertiser group.
  def update(resource: AdvertiserGroup, profileId: String): AdvertiserGroup = js.native
}

