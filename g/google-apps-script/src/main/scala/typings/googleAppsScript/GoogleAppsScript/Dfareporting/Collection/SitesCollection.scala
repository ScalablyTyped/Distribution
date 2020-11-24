package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.Site
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.SitesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SitesCollection extends js.Object {
  
  // Gets one site by ID.
  def get(profileId: String, id: String): Site = js.native
  
  // Inserts a new site.
  def insert(resource: Site, profileId: String): Site = js.native
  
  // Retrieves a list of sites, possibly filtered. This method supports paging.
  def list(profileId: String): SitesListResponse = js.native
  // Retrieves a list of sites, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): SitesListResponse = js.native
  
  // Updates an existing site. This method supports patch semantics.
  def patch(resource: Site, profileId: String, id: String): Site = js.native
  
  // Updates an existing site.
  def update(resource: Site, profileId: String): Site = js.native
}
