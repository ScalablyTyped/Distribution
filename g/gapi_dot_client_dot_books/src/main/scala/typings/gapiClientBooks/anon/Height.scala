package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Height extends js.Object {
  /** Height or length of this volume (in cm). */
  var height: js.UndefOr[String] = js.native
  /** Thickness of this volume (in cm). */
  var thickness: js.UndefOr[String] = js.native
  /** Width of this volume (in cm). */
  var width: js.UndefOr[String] = js.native
}

object Height {
  @scala.inline
  def apply(): Height = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Height]
  }
  @scala.inline
  implicit class HeightOps[Self <: Height] (val x: Self) extends AnyVal {
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
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setThickness(value: String): Self = this.set("thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

