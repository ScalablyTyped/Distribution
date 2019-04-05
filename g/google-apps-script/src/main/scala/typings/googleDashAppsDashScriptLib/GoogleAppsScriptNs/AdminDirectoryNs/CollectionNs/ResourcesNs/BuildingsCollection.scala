package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.ResourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildingsCollection extends js.Object {
  // Retrieves a building.
  def get(customer: java.lang.String, buildingId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Building = js.native
  // Inserts a building.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Building,
    customer: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Building = js.native
  // Inserts a building.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Building,
    customer: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Building = js.native
  // Retrieves a list of buildings for an account.
  def list(customer: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Buildings = js.native
  // Retrieves a list of buildings for an account.
  def list(customer: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Buildings = js.native
  // Updates a building. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Building,
    customer: java.lang.String,
    buildingId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Building = js.native
  // Updates a building. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Building,
    customer: java.lang.String,
    buildingId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Building = js.native
  // Deletes a building.
  def remove(customer: java.lang.String, buildingId: java.lang.String): scala.Unit = js.native
  // Updates a building.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Building,
    customer: java.lang.String,
    buildingId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Building = js.native
  // Updates a building.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Building,
    customer: java.lang.String,
    buildingId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Building = js.native
}

