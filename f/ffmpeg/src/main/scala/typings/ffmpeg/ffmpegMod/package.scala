package typings.ffmpeg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ffmpegMod {
  import typings.std.Error

  type SaveCallback = js.Function2[/* err */ Error, /* files */ String, Unit]
}
