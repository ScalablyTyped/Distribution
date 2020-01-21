package typings.ffmpeg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AVIMetadata = typings.std.Partial[typings.ffmpeg.AnonIARL]
  type FLVMetadata = typings.std.Partial[typings.ffmpeg.AnonAudiocodecid]
  type FrameToJPGSettings = typings.std.Partial[typings.ffmpeg.AnonDurationtime]
  type SaveCallback = js.Function2[/* err */ typings.std.Error, /* files */ java.lang.String, scala.Unit]
  type StandardVideoMetadata = typings.std.Partial[typings.ffmpeg.AnonAlbum]
  type WMVMetadata = typings.std.Partial[typings.ffmpeg.AnonAuthor]
  type WatermarkSettings = typings.std.Partial[typings.ffmpeg.AnonC]
}
