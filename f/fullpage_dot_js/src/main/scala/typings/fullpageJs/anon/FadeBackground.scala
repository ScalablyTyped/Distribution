package typings.fullpageJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FadeBackground extends js.Object {
  /**
    * @default true
    */
  var fadeBackground: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var fadeContent: js.UndefOr[Boolean] = js.native
  /**
    * @default 100
    */
  var perspective: js.UndefOr[Double] = js.native
}

object FadeBackground {
  @scala.inline
  def apply(): FadeBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FadeBackground]
  }
  @scala.inline
  implicit class FadeBackgroundOps[Self <: FadeBackground] (val x: Self) extends AnyVal {
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
    def setFadeBackground(value: Boolean): Self = this.set("fadeBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeBackground: Self = this.set("fadeBackground", js.undefined)
    @scala.inline
    def setFadeContent(value: Boolean): Self = this.set("fadeContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeContent: Self = this.set("fadeContent", js.undefined)
    @scala.inline
    def setPerspective(value: Double): Self = this.set("perspective", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerspective: Self = this.set("perspective", js.undefined)
  }
  
}

