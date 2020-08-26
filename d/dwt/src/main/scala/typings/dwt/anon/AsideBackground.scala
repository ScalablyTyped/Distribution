package typings.dwt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsideBackground extends js.Object {
  // Example: '#000000'
  var asideBackground: js.UndefOr[String] = js.native
  // Example: 'rgba(67,66,70,1)'
  var bottomMenuBackground: js.UndefOr[String] = js.native
  // Example: '#ffffff'
  var canvasBackground: js.UndefOr[String] = js.native
  var topMenuBackground: js.UndefOr[String] = js.native
}

object AsideBackground {
  @scala.inline
  def apply(): AsideBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsideBackground]
  }
  @scala.inline
  implicit class AsideBackgroundOps[Self <: AsideBackground] (val x: Self) extends AnyVal {
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
    def setAsideBackground(value: String): Self = this.set("asideBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsideBackground: Self = this.set("asideBackground", js.undefined)
    @scala.inline
    def setBottomMenuBackground(value: String): Self = this.set("bottomMenuBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomMenuBackground: Self = this.set("bottomMenuBackground", js.undefined)
    @scala.inline
    def setCanvasBackground(value: String): Self = this.set("canvasBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanvasBackground: Self = this.set("canvasBackground", js.undefined)
    @scala.inline
    def setTopMenuBackground(value: String): Self = this.set("topMenuBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopMenuBackground: Self = this.set("topMenuBackground", js.undefined)
  }
  
}

