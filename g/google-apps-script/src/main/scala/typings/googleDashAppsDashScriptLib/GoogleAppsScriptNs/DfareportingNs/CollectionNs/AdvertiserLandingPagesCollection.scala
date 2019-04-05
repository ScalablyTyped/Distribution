package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvertiserLandingPagesCollection extends js.Object {
  // Gets one landing page by ID.
  def get(profileId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.LandingPage = js.native
  // Inserts a new landing page.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.LandingPage,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.LandingPage = js.native
  // Retrieves a list of landing pages.
  def list(profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.AdvertiserLandingPagesListResponse = js.native
  // Retrieves a list of landing pages.
  def list(profileId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.AdvertiserLandingPagesListResponse = js.native
  // Updates an existing landing page. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.LandingPage,
    profileId: java.lang.String,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.LandingPage = js.native
  // Updates an existing landing page.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.LandingPage,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.LandingPage = js.native
}

