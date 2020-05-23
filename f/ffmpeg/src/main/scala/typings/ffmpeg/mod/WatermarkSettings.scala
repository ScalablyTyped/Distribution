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
    margin_east: js.UndefOr[Double] = js.undefined,
    margin_nord: js.UndefOr[Double] = js.undefined,
    margin_sud: js.UndefOr[Double] = js.undefined,
    margin_west: js.UndefOr[Double] = js.undefined,
    position: NE | NC | NW | SE | SC | SW | C | CE | CW = null
  ): WatermarkSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(margin_east)) __obj.updateDynamic("margin_east")(margin_east.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin_nord)) __obj.updateDynamic("margin_nord")(margin_nord.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin_sud)) __obj.updateDynamic("margin_sud")(margin_sud.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin_west)) __obj.updateDynamic("margin_west")(margin_west.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatermarkSettings]
  }
}

