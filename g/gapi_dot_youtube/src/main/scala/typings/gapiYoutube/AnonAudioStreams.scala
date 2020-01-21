package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAudioStreams extends js.Object {
  /**
    * A list of audio streams contained in the uploaded video file. Each item in the list contains detailed metadata about an audio stream.
    */
  var audioStreams: js.Array[AnonBitrateBps]
  /**
    * The uploaded video files combined (video and audio) bitrate in bits per second.
    */
  var bitrateBps: Double
  /**
    * The uploaded video files container format.
    */
  var container: String
  /**
    * The date and time when the uploaded video file was created. The value is specified in ISO 8601 format. Currently, the following ISO 8601 formats are supported:
    */
  var creationTime: String
  /**
    * The length of the uploaded video in milliseconds.
    */
  var durationMs: Double
  /**
    * The uploaded files name. This field is present whether a video file or another type of file was uploaded.
    */
  var fileName: String
  /**
    * The uploaded files size in bytes. This field is present whether a video file or another type of file was uploaded.
    */
  var fileSize: Double
  /**
    * The uploaded files type as detected by YouTubes video processing engine. Currently, YouTube only processes video files, but this field is present whether a video file or another type of file was uploaded.
    */
  var fileType: String
  /**
    * Geographic coordinates that identify the place where the uploaded video was recorded. Coordinates are defined using WGS 84.
    */
  var recordingLocation: AnonElevation
  /**
    * A list of video streams contained in the uploaded video file. Each item in the list contains detailed metadata about a video stream.
    */
  var videoStreams: js.Array[AnonAspectRatio]
}

object AnonAudioStreams {
  @scala.inline
  def apply(
    audioStreams: js.Array[AnonBitrateBps],
    bitrateBps: Double,
    container: String,
    creationTime: String,
    durationMs: Double,
    fileName: String,
    fileSize: Double,
    fileType: String,
    recordingLocation: AnonElevation,
    videoStreams: js.Array[AnonAspectRatio]
  ): AnonAudioStreams = {
    val __obj = js.Dynamic.literal(audioStreams = audioStreams.asInstanceOf[js.Any], bitrateBps = bitrateBps.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], durationMs = durationMs.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], recordingLocation = recordingLocation.asInstanceOf[js.Any], videoStreams = videoStreams.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAudioStreams]
  }
}

