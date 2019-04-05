package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelSectionsCollection extends js.Object {
  // Adds a channelSection for the authenticated user's channel.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.ChannelSection,
    part: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.ChannelSection = js.native
  // Adds a channelSection for the authenticated user's channel.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.ChannelSection,
    part: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.ChannelSection = js.native
  // Returns channelSection resources that match the API request criteria.
  def list(part: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.ChannelSectionListResponse = js.native
  // Returns channelSection resources that match the API request criteria.
  def list(part: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.ChannelSectionListResponse = js.native
  // Deletes a channelSection.
  def remove(id: java.lang.String): scala.Unit = js.native
  // Deletes a channelSection.
  def remove(id: java.lang.String, optionalArgs: js.Object): scala.Unit = js.native
  // Update a channelSection.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.ChannelSection,
    part: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.ChannelSection = js.native
  // Update a channelSection.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.ChannelSection,
    part: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.ChannelSection = js.native
}

