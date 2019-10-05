package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFileDetails extends js.Object {
  /** A list of audio streams contained in the uploaded video file. Each item in the list contains detailed metadata about an audio stream. */
  var audioStreams: js.UndefOr[js.Array[VideoFileDetailsAudioStream]] = js.undefined
  /** The uploaded video file's combined (video and audio) bitrate in bits per second. */
  var bitrateBps: js.UndefOr[String] = js.undefined
  /** The uploaded video file's container format. */
  var container: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the uploaded video file was created. The value is specified in ISO 8601 format. Currently, the following ISO 8601 formats are
    * supported:
    * - Date only: YYYY-MM-DD
    * - Naive time: YYYY-MM-DDTHH:MM:SS
    * - Time with timezone: YYYY-MM-DDTHH:MM:SS+HH:MM
    */
  var creationTime: js.UndefOr[String] = js.undefined
  /** The length of the uploaded video in milliseconds. */
  var durationMs: js.UndefOr[String] = js.undefined
  /** The uploaded file's name. This field is present whether a video file or another type of file was uploaded. */
  var fileName: js.UndefOr[String] = js.undefined
  /** The uploaded file's size in bytes. This field is present whether a video file or another type of file was uploaded. */
  var fileSize: js.UndefOr[String] = js.undefined
  /**
    * The uploaded file's type as detected by YouTube's video processing engine. Currently, YouTube only processes video files, but this field is present
    * whether a video file or another type of file was uploaded.
    */
  var fileType: js.UndefOr[String] = js.undefined
  /** A list of video streams contained in the uploaded video file. Each item in the list contains detailed metadata about a video stream. */
  var videoStreams: js.UndefOr[js.Array[VideoFileDetailsVideoStream]] = js.undefined
}

object VideoFileDetails {
  @scala.inline
  def apply(
    audioStreams: js.Array[VideoFileDetailsAudioStream] = null,
    bitrateBps: String = null,
    container: String = null,
    creationTime: String = null,
    durationMs: String = null,
    fileName: String = null,
    fileSize: String = null,
    fileType: String = null,
    videoStreams: js.Array[VideoFileDetailsVideoStream] = null
  ): VideoFileDetails = {
    val __obj = js.Dynamic.literal()
    if (audioStreams != null) __obj.updateDynamic("audioStreams")(audioStreams)
    if (bitrateBps != null) __obj.updateDynamic("bitrateBps")(bitrateBps)
    if (container != null) __obj.updateDynamic("container")(container)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (durationMs != null) __obj.updateDynamic("durationMs")(durationMs)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize)
    if (fileType != null) __obj.updateDynamic("fileType")(fileType)
    if (videoStreams != null) __obj.updateDynamic("videoStreams")(videoStreams)
    __obj.asInstanceOf[VideoFileDetails]
  }
}

