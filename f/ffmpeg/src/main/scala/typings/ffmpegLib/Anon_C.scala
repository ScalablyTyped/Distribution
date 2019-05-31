package typings
package ffmpegLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_C extends js.Object {
  var margin_east: scala.Double
  var margin_nord: scala.Double
  var margin_sud: scala.Double
  var margin_west: scala.Double
  var position: ffmpegLib.ffmpegLibStrings.NE | ffmpegLib.ffmpegLibStrings.NC | ffmpegLib.ffmpegLibStrings.NW | ffmpegLib.ffmpegLibStrings.SE | ffmpegLib.ffmpegLibStrings.SC | ffmpegLib.ffmpegLibStrings.SW | ffmpegLib.ffmpegLibStrings.C | ffmpegLib.ffmpegLibStrings.CE | ffmpegLib.ffmpegLibStrings.CW
}

object Anon_C {
  @scala.inline
  def apply(
    margin_east: scala.Double,
    margin_nord: scala.Double,
    margin_sud: scala.Double,
    margin_west: scala.Double,
    position: ffmpegLib.ffmpegLibStrings.NE | ffmpegLib.ffmpegLibStrings.NC | ffmpegLib.ffmpegLibStrings.NW | ffmpegLib.ffmpegLibStrings.SE | ffmpegLib.ffmpegLibStrings.SC | ffmpegLib.ffmpegLibStrings.SW | ffmpegLib.ffmpegLibStrings.C | ffmpegLib.ffmpegLibStrings.CE | ffmpegLib.ffmpegLibStrings.CW
  ): Anon_C = {
    val __obj = js.Dynamic.literal(margin_east = margin_east, margin_nord = margin_nord, margin_sud = margin_sud, margin_west = margin_west, position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_C]
  }
}

