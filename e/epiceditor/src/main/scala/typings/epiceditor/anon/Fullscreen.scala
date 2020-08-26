package typings.epiceditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fullscreen extends js.Object {
  var fullscreen: Double = js.native
  var modifier: Double = js.native
  var preview: Double = js.native
}

object Fullscreen {
  @scala.inline
  def apply(fullscreen: Double, modifier: Double, preview: Double): Fullscreen = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], modifier = modifier.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fullscreen]
  }
  @scala.inline
  implicit class FullscreenOps[Self <: Fullscreen] (val x: Self) extends AnyVal {
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
    def setFullscreen(value: Double): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifier(value: Double): Self = this.set("modifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreview(value: Double): Self = this.set("preview", value.asInstanceOf[js.Any])
  }
  
}

