package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveBroadcastsCollection extends js.Object {
  // Binds a YouTube broadcast to a stream or removes an existing binding between a broadcast and a stream. A broadcast can only be bound to one video stream, though a video stream may be bound to more than one broadcast.
  def bind(id: java.lang.String, part: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveBroadcast = js.native
  // Binds a YouTube broadcast to a stream or removes an existing binding between a broadcast and a stream. A broadcast can only be bound to one video stream, though a video stream may be bound to more than one broadcast.
  def bind(id: java.lang.String, part: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveBroadcast = js.native
  // Controls the settings for a slate that can be displayed in the broadcast stream.
  def control(id: java.lang.String, part: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveBroadcast = js.native
  // Controls the settings for a slate that can be displayed in the broadcast stream.
  def control(id: java.lang.String, part: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveBroadcast = js.native
  // Creates a broadcast.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveBroadcast,
    part: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveBroadcast = js.native
  // Creates a broadcast.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveBroadcast,
    part: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveBroadcast = js.native
  // Returns a list of YouTube broadcasts that match the API request parameters.
  def list(part: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveBroadcastListResponse = js.native
  // Returns a list of YouTube broadcasts that match the API request parameters.
  def list(part: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveBroadcastListResponse = js.native
  // Deletes a broadcast.
  def remove(id: java.lang.String): scala.Unit = js.native
  // Deletes a broadcast.
  def remove(id: java.lang.String, optionalArgs: js.Object): scala.Unit = js.native
  // Changes the status of a YouTube live broadcast and initiates any processes associated with the new status. For example, when you transition a broadcast's status to testing, YouTube starts to transmit video to that broadcast's monitor stream. Before calling this method, you should confirm that the value of the status.streamStatus property for the stream bound to your broadcast is active.
  def transition(broadcastStatus: java.lang.String, id: java.lang.String, part: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveBroadcast = js.native
  // Changes the status of a YouTube live broadcast and initiates any processes associated with the new status. For example, when you transition a broadcast's status to testing, YouTube starts to transmit video to that broadcast's monitor stream. Before calling this method, you should confirm that the value of the status.streamStatus property for the stream bound to your broadcast is active.
  def transition(
    broadcastStatus: java.lang.String,
    id: java.lang.String,
    part: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveBroadcast = js.native
  // Updates a broadcast. For example, you could modify the broadcast settings defined in the liveBroadcast resource's contentDetails object.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveBroadcast,
    part: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveBroadcast = js.native
  // Updates a broadcast. For example, you could modify the broadcast settings defined in the liveBroadcast resource's contentDetails object.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveBroadcast,
    part: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveBroadcast = js.native
}

