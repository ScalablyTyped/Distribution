package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.MobileApp
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.MobileAppsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileAppsCollection extends js.Object {
  // Gets one mobile app by ID.
  def get(profileId: String, id: String): MobileApp = js.native
  // Retrieves list of available mobile apps.
  def list(profileId: String): MobileAppsListResponse = js.native
  // Retrieves list of available mobile apps.
  def list(profileId: String, optionalArgs: js.Object): MobileAppsListResponse = js.native
}

