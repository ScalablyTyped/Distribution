package typings.ffmpeg.mod

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

/* Inlined std.Partial<{  position  :'NE' | 'NC' | 'NW' | 'SE' | 'SC' | 'SW' | 'C' | 'CE' | 'CW',   margin_nord  :number,   margin_sud  :number,   margin_east  :number,   margin_west  :number}> */
trait WatermarkSettings extends js.Object {
  var margin_east: js.UndefOr[Double] = js.undefined
  var margin_nord: js.UndefOr[Double] = js.undefined
  var margin_sud: js.UndefOr[Double] = js.undefined
  var margin_west: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[NE | NC | NW | SE | SC | SW | C | CE | CW] = js.undefined
}

object WatermarkSettings {
  @scala.inline
  def apply(
    margin_east: Int | Double = null,
    margin_nord: Int | Double = null,
    margin_sud: Int | Double = null,
    margin_west: Int | Double = null,
    position: NE | NC | NW | SE | SC | SW | C | CE | CW = null
  ): WatermarkSettings = {
    val __obj = js.Dynamic.literal()
    if (margin_east != null) __obj.updateDynamic("margin_east")(margin_east.asInstanceOf[js.Any])
    if (margin_nord != null) __obj.updateDynamic("margin_nord")(margin_nord.asInstanceOf[js.Any])
    if (margin_sud != null) __obj.updateDynamic("margin_sud")(margin_sud.asInstanceOf[js.Any])
    if (margin_west != null) __obj.updateDynamic("margin_west")(margin_west.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatermarkSettings]
  }
}

