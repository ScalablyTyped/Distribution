package typings.ffmpeg

import typings.ffmpeg.ffmpegStrings.C
import typings.ffmpeg.ffmpegStrings.CE
import typings.ffmpeg.ffmpegStrings.CW
import typings.ffmpeg.ffmpegStrings.NC
import typings.ffmpeg.ffmpegStrings.NE
import typings.ffmpeg.ffmpegStrings.NW
import typings.ffmpeg.ffmpegStrings.SC
import typings.ffmpeg.ffmpegStrings.SE
import typings.ffmpeg.ffmpegStrings.SW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_C extends js.Object {
  var margin_east: Double
  var margin_nord: Double
  var margin_sud: Double
  var margin_west: Double
  var position: NE | NC | NW | SE | SC | SW | C | CE | CW
}

object Anon_C {
  @scala.inline
  def apply(
    margin_east: Double,
    margin_nord: Double,
    margin_sud: Double,
    margin_west: Double,
    position: NE | NC | NW | SE | SC | SW | C | CE | CW
  ): Anon_C = {
    val __obj = js.Dynamic.literal(margin_east = margin_east, margin_nord = margin_nord, margin_sud = margin_sud, margin_west = margin_west, position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_C]
  }
}

