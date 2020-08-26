package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoProperties extends js.Object {
  /**
    * The outline of the video. The default outline matches the defaults for new
    * videos created in the Slides editor.
    */
  var outline: js.UndefOr[Outline] = js.native
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
    def setOutline(value: Outline): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
  }
  
}

