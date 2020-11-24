package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.AdvertiserGroup
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.AdvertiserGroupsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
