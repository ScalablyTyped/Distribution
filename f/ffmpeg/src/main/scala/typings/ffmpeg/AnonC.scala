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

trait AnonC extends js.Object {
  var margin_east: Double
  var margin_nord: Double
  var margin_sud: Double
  var margin_west: Double
  var position: NE | NC | NW | SE | SC | SW | C | CE | CW
}

object AnonC {
  @scala.inline
  def apply(
    margin_east: Double,
    margin_nord: Double,
    margin_sud: Double,
    margin_west: Double,
    position: NE | NC | NW | SE | SC | SW | C | CE | CW
  ): AnonC = {
    val __obj = js.Dynamic.literal(margin_east = margin_east.asInstanceOf[js.Any], margin_nord = margin_nord.asInstanceOf[js.Any], margin_sud = margin_sud.asInstanceOf[js.Any], margin_west = margin_west.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonC]
  }
}

