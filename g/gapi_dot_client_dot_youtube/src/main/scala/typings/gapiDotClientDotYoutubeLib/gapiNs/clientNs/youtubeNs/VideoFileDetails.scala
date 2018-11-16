package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VideoFileDetails extends js.Object {
  /** A list of audio streams contained in the uploaded video file. Each item in the list contains detailed metadata about an audio stream. */
  var audioStreams: js.UndefOr[js.Array[VideoFileDetailsAudioStream]] = js.undefined
  /** The uploaded video file's combined (video and audio) bitrate in bits per second. */
  var bitrateBps: js.UndefOr[java.lang.String] = js.undefined
  /** The uploaded video file's container format. */
  var container: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The date and time when the uploaded video file was created. The value is specified in ISO 8601 format. Currently, the following ISO 8601 formats are
               * supported:
               * - Date only: YYYY-MM-DD
               * - Naive time: YYYY-MM-DDTHH:MM:SS
               * - Time with timezone: YYYY-MM-DDTHH:MM:SS+HH:MM
               */
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  /** The length of the uploaded video in milliseconds. */
  var durationMs: js.UndefOr[java.lang.String] = js.undefined
  /** The uploaded file's name. This field is present whether a video file or another type of file was uploaded. */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  /** The uploaded file's size in bytes. This field is present whether a video file or another type of file was uploaded. */
  var fileSize: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The uploaded file's type as detected by YouTube's video processing engine. Currently, YouTube only processes video files, but this field is present
               * whether a video file or another type of file was uploaded.
               */
  var fileType: js.UndefOr[java.lang.String] = js.undefined
  /** A list of video streams contained in the uploaded video file. Each item in the list contains detailed metadata about a video stream. */
  var videoStreams: js.UndefOr[js.Array[VideoFileDetailsVideoStream]] = js.undefined
}

