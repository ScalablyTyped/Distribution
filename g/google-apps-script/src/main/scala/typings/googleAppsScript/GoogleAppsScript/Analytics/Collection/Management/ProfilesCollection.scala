package typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management

import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.Profile
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.Profiles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfilesCollection extends js.Object {
  
  // Gets a view (profile) to which the user has access.
  def get(accountId: String, webPropertyId: String, profileId: String): Profile = js.native
  
  // Create a new view (profile).
  def insert(resource: Profile, accountId: String, webPropertyId: String): Profile = js.native
  
  // Lists views (profiles) to which the user has access.
  def list(accountId: String, webPropertyId: String): Profiles = js.native
  // Lists views (profiles) to which the user has access.
  def list(accountId: String, webPropertyId: String, optionalArgs: js.Object): Profiles = js.native
  
  // Updates an existing view (profile). This method supports patch semantics.
  def patch(resource: Profile, accountId: String, webPropertyId: String, profileId: String): Profile = js.native
  
  // Deletes a view (profile).
  def remove(accountId: String, webPropertyId: String, profileId: String): Unit = js.native
  
  // Updates an existing view (profile).
  def update(resource: Profile, accountId: String, webPropertyId: String, profileId: String): Profile = js.native
}
