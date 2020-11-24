package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.Ad
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.AdsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdsCollection extends js.Object {
  
  // Gets one ad by ID.
  def get(profileId: String, id: String): Ad = js.native
  
  // Inserts a new ad.
  def insert(resource: Ad, profileId: String): Ad = js.native
  
  // Retrieves a list of ads, possibly filtered. This method supports paging.
  def list(profileId: String): AdsListResponse = js.native
  // Retrieves a list of ads, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): AdsListResponse = js.native
  
  // Updates an existing ad. This method supports patch semantics.
  def patch(resource: Ad, profileId: String, id: String): Ad = js.native
  
  // Updates an existing ad.
  def update(resource: Ad, profileId: String): Ad = js.native
}
