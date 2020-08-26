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

/* Inlined std.Partial<{  position :'NE' | 'NC' | 'NW' | 'SE' | 'SC' | 'SW' | 'C' | 'CE' | 'CW',   margin_nord :number,   margin_sud :number,   margin_east :number,   margin_west :number}> */
@js.native
trait WatermarkSettings extends js.Object {
  var margin_east: js.UndefOr[Double] = js.native
  var margin_nord: js.UndefOr[Double] = js.native
  var margin_sud: js.UndefOr[Double] = js.native
  var margin_west: js.UndefOr[Double] = js.native
  var position: js.UndefOr[NE | NC | NW | SE | SC | SW | C | CE | CW] = js.native
}

object WatermarkSettings {
  @scala.inline
  def apply(): WatermarkSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatermarkSettings]
  }
  @scala.inline
  implicit class WatermarkSettingsOps[Self <: WatermarkSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMargin_east(value: Double): Self = this.set("margin_east", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin_east: Self = this.set("margin_east", js.undefined)
    @scala.inline
    def setMargin_nord(value: Double): Self = this.set("margin_nord", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin_nord: Self = this.set("margin_nord", js.undefined)
    @scala.inline
    def setMargin_sud(value: Double): Self = this.set("margin_sud", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin_sud: Self = this.set("margin_sud", js.undefined)
    @scala.inline
    def setMargin_west(value: Double): Self = this.set("margin_west", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin_west: Self = this.set("margin_west", js.undefined)
    @scala.inline
    def setPosition(value: NE | NC | NW | SE | SC | SW | C | CE | CW): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

