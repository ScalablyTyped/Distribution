package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AudioStreams extends js.Object {
  /**
    * A list of audio streams contained in the uploaded video file. Each item in the list contains detailed metadata about an audio stream.
    */
  var audioStreams: js.Array[Anon_ChannelCount]
  /**
    * The uploaded video files combined (video and audio) bitrate in bits per second.
    */
  var bitrateBps: scala.Double
  /**
    * The uploaded video files container format.
    */
  var container: java.lang.String
  /**
    * The date and time when the uploaded video file was created. The value is specified in ISO 8601 format. Currently, the following ISO 8601 formats are supported:
    */
  var creationTime: java.lang.String
  /**
    * The length of the uploaded video in milliseconds.
    */
  var durationMs: scala.Double
  /**
    * The uploaded files name. This field is present whether a video file or another type of file was uploaded.
    */
  var fileName: java.lang.String
  /**
    * The uploaded files size in bytes. This field is present whether a video file or another type of file was uploaded.
    */
  var fileSize: scala.Double
  /**
    * The uploaded files type as detected by YouTubes video processing engine. Currently, YouTube only processes video files, but this field is present whether a video file or another type of file was uploaded.
    */
  var fileType: java.lang.String
  /**
    * Geographic coordinates that identify the place where the uploaded video was recorded. Coordinates are defined using WGS 84.
    */
  var recordingLocation: Anon_Elevation
  /**
    * A list of video streams contained in the uploaded video file. Each item in the list contains detailed metadata about a video stream.
    */
  var videoStreams: js.Array[Anon_AspectRatio]
}

