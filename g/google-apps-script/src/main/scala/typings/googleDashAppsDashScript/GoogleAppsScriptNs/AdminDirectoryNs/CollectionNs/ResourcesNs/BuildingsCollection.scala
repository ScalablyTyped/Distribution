package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.ResourcesNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Building
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Buildings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildingsCollection extends js.Object {
  // Retrieves a building.
  def get(customer: String, buildingId: String): Building = js.native
  // Inserts a building.
  def insert(resource: Building, customer: String): Building = js.native
  // Inserts a building.
  def insert(resource: Building, customer: String, optionalArgs: js.Object): Building = js.native
  // Retrieves a list of buildings for an account.
  def list(customer: String): Buildings = js.native
  // Retrieves a list of buildings for an account.
  def list(customer: String, optionalArgs: js.Object): Buildings = js.native
  // Updates a building. This method supports patch semantics.
  def patch(resource: Building, customer: String, buildingId: String): Building = js.native
  // Updates a building. This method supports patch semantics.
  def patch(resource: Building, customer: String, buildingId: String, optionalArgs: js.Object): Building = js.native
  // Deletes a building.
  def remove(customer: String, buildingId: String): Unit = js.native
  // Updates a building.
  def update(resource: Building, customer: String, buildingId: String): Building = js.native
  // Updates a building.
  def update(resource: Building, customer: String, buildingId: String, optionalArgs: js.Object): Building = js.native
}

