package typings.ffmpeg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ffmpegMod {
  import typings.ffmpeg.Anon_Album
  import typings.ffmpeg.Anon_Audiocodecid
  import typings.ffmpeg.Anon_Author
  import typings.ffmpeg.Anon_C
  import typings.ffmpeg.Anon_Durationtime
  import typings.ffmpeg.Anon_IARL
  import typings.std.Error
  import typings.std.Partial

  type AVIMetadata = Partial[Anon_IARL]
  type FLVMetadata = Partial[Anon_Audiocodecid]
  type FrameToJPGSettings = Partial[Anon_Durationtime]
  type SaveCallback = js.Function2[/* err */ Error, /* files */ String, Unit]
  type StandardVideoMetadata = Partial[Anon_Album]
  type WMVMetadata = Partial[Anon_Author]
  type WatermarkSettings = Partial[Anon_C]
}
