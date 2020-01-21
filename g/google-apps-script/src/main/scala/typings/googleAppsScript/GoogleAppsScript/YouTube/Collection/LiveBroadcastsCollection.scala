package typings.googleAppsScript.GoogleAppsScript.YouTube.Collection

import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveBroadcast
import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveBroadcastListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveBroadcastsCollection extends js.Object {
  // Binds a YouTube broadcast to a stream or removes an existing binding between a broadcast and a stream. A broadcast can only be bound to one video stream, though a video stream may be bound to more than one broadcast.
  def bind(id: String, part: String): LiveBroadcast = js.native
  // Binds a YouTube broadcast to a stream or removes an existing binding between a broadcast and a stream. A broadcast can only be bound to one video stream, though a video stream may be bound to more than one broadcast.
  def bind(id: String, part: String, optionalArgs: js.Object): LiveBroadcast = js.native
  // Controls the settings for a slate that can be displayed in the broadcast stream.
  def control(id: String, part: String): LiveBroadcast = js.native
  // Controls the settings for a slate that can be displayed in the broadcast stream.
  def control(id: String, part: String, optionalArgs: js.Object): LiveBroadcast = js.native
  // Creates a broadcast.
  def insert(resource: LiveBroadcast, part: String): LiveBroadcast = js.native
  // Creates a broadcast.
  def insert(resource: LiveBroadcast, part: String, optionalArgs: js.Object): LiveBroadcast = js.native
  // Returns a list of YouTube broadcasts that match the API request parameters.
  def list(part: String): LiveBroadcastListResponse = js.native
  // Returns a list of YouTube broadcasts that match the API request parameters.
  def list(part: String, optionalArgs: js.Object): LiveBroadcastListResponse = js.native
  // Deletes a broadcast.
  def remove(id: String): Unit = js.native
  // Deletes a broadcast.
  def remove(id: String, optionalArgs: js.Object): Unit = js.native
  // Changes the status of a YouTube live broadcast and initiates any processes associated with the new status. For example, when you transition a broadcast's status to testing, YouTube starts to transmit video to that broadcast's monitor stream. Before calling this method, you should confirm that the value of the status.streamStatus property for the stream bound to your broadcast is active.
  def transition(broadcastStatus: String, id: String, part: String): LiveBroadcast = js.native
  // Changes the status of a YouTube live broadcast and initiates any processes associated with the new status. For example, when you transition a broadcast's status to testing, YouTube starts to transmit video to that broadcast's monitor stream. Before calling this method, you should confirm that the value of the status.streamStatus property for the stream bound to your broadcast is active.
  def transition(broadcastStatus: String, id: String, part: String, optionalArgs: js.Object): LiveBroadcast = js.native
  // Updates a broadcast. For example, you could modify the broadcast settings defined in the liveBroadcast resource's contentDetails object.
  def update(resource: LiveBroadcast, part: String): LiveBroadcast = js.native
  // Updates a broadcast. For example, you could modify the broadcast settings defined in the liveBroadcast resource's contentDetails object.
  def update(resource: LiveBroadcast, part: String, optionalArgs: js.Object): LiveBroadcast = js.native
}

