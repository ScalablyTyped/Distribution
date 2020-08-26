package typings.ffmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  start_time :string | number,   duration_time :string | number,   frame_rate :number,   size :string,   number :number,   every_n_frames :number,   every_n_seconds :number,   every_n_percentage :number,   keep_pixel_aspect_ratio :boolean,   keep_aspect_ration :boolean,   padding_color :string,   file_name :string | undefined}> */
@js.native
trait FrameToJPGSettings extends js.Object {
  var duration_time: js.UndefOr[String | Double] = js.native
  var every_n_frames: js.UndefOr[Double] = js.native
  var every_n_percentage: js.UndefOr[Double] = js.native
  var every_n_seconds: js.UndefOr[Double] = js.native
  var file_name: js.UndefOr[String] = js.native
  var frame_rate: js.UndefOr[Double] = js.native
  var keep_aspect_ration: js.UndefOr[Boolean] = js.native
  var keep_pixel_aspect_ratio: js.UndefOr[Boolean] = js.native
  var number: js.UndefOr[Double] = js.native
  var padding_color: js.UndefOr[String] = js.native
  var size: js.UndefOr[String] = js.native
  var start_time: js.UndefOr[String | Double] = js.native
}

object FrameToJPGSettings {
  @scala.inline
  def apply(): FrameToJPGSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameToJPGSettings]
  }
  @scala.inline
  implicit class FrameToJPGSettingsOps[Self <: FrameToJPGSettings] (val x: Self) extends AnyVal {
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
    def setDuration_time(value: String | Double): Self = this.set("duration_time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration_time: Self = this.set("duration_time", js.undefined)
    @scala.inline
    def setEvery_n_frames(value: Double): Self = this.set("every_n_frames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvery_n_frames: Self = this.set("every_n_frames", js.undefined)
    @scala.inline
    def setEvery_n_percentage(value: Double): Self = this.set("every_n_percentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvery_n_percentage: Self = this.set("every_n_percentage", js.undefined)
    @scala.inline
    def setEvery_n_seconds(value: Double): Self = this.set("every_n_seconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvery_n_seconds: Self = this.set("every_n_seconds", js.undefined)
    @scala.inline
    def setFile_name(value: String): Self = this.set("file_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile_name: Self = this.set("file_name", js.undefined)
    @scala.inline
    def setFrame_rate(value: Double): Self = this.set("frame_rate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrame_rate: Self = this.set("frame_rate", js.undefined)
    @scala.inline
    def setKeep_aspect_ration(value: Boolean): Self = this.set("keep_aspect_ration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeep_aspect_ration: Self = this.set("keep_aspect_ration", js.undefined)
    @scala.inline
    def setKeep_pixel_aspect_ratio(value: Boolean): Self = this.set("keep_pixel_aspect_ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeep_pixel_aspect_ratio: Self = this.set("keep_pixel_aspect_ratio", js.undefined)
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setPadding_color(value: String): Self = this.set("padding_color", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding_color: Self = this.set("padding_color", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStart_time(value: String | Double): Self = this.set("start_time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_time: Self = this.set("start_time", js.undefined)
  }
  
}

