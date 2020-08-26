package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoProperties extends js.Object {
  var autoPlay: js.UndefOr[Boolean] = js.native
  var end: js.UndefOr[Double] = js.native
  var mute: js.UndefOr[Boolean] = js.native
  var outline: js.UndefOr[Outline] = js.native
  var start: js.UndefOr[Double] = js.native
}

object VideoProperties {
  @scala.inline
  def apply(): VideoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoProperties]
  }
  @scala.inline
  implicit class VideoPropertiesOps[Self <: VideoProperties] (val x: Self) extends AnyVal {
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
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setMute(value: Boolean): Self = this.set("mute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMute: Self = this.set("mute", js.undefined)
    @scala.inline
    def setOutline(value: Outline): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

