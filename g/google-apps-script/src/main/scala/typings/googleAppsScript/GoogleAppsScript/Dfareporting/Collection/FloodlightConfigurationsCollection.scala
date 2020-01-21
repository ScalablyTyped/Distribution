package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.FloodlightConfiguration
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.FloodlightConfigurationsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightConfigurationsCollection extends js.Object {
  // Gets one floodlight configuration by ID.
  def get(profileId: String, id: String): FloodlightConfiguration = js.native
  // Retrieves a list of floodlight configurations, possibly filtered.
  def list(profileId: String): FloodlightConfigurationsListResponse = js.native
  // Retrieves a list of floodlight configurations, possibly filtered.
  def list(profileId: String, optionalArgs: js.Object): FloodlightConfigurationsListResponse = js.native
  // Updates an existing floodlight configuration. This method supports patch semantics.
  def patch(resource: FloodlightConfiguration, profileId: String, id: String): FloodlightConfiguration = js.native
  // Updates an existing floodlight configuration.
  def update(resource: FloodlightConfiguration, profileId: String): FloodlightConfiguration = js.native
}

