package typings.ffmpeg

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ffmpegMod {
  type SaveCallback = js.Function2[/* err */ Error, /* files */ String, Unit]
}
