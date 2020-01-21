package typings.googleAppsScript.GoogleAppsScript.YouTube.Collection

import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveStream
import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveStreamListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveStreamsCollection extends js.Object {
  // Creates a video stream. The stream enables you to send your video to YouTube, which can then broadcast the video to your audience.
  def insert(resource: LiveStream, part: String): LiveStream = js.native
  // Creates a video stream. The stream enables you to send your video to YouTube, which can then broadcast the video to your audience.
  def insert(resource: LiveStream, part: String, optionalArgs: js.Object): LiveStream = js.native
  // Returns a list of video streams that match the API request parameters.
  def list(part: String): LiveStreamListResponse = js.native
  // Returns a list of video streams that match the API request parameters.
  def list(part: String, optionalArgs: js.Object): LiveStreamListResponse = js.native
  // Deletes a video stream.
  def remove(id: String): Unit = js.native
  // Deletes a video stream.
  def remove(id: String, optionalArgs: js.Object): Unit = js.native
  // Updates a video stream. If the properties that you want to change cannot be updated, then you need to create a new stream with the proper settings.
  def update(resource: LiveStream, part: String): LiveStream = js.native
  // Updates a video stream. If the properties that you want to change cannot be updated, then you need to create a new stream with the proper settings.
  def update(resource: LiveStream, part: String, optionalArgs: js.Object): LiveStream = js.native
}

