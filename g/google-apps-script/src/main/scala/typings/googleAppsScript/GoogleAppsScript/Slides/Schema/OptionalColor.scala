package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalColor extends js.Object {
  var opaqueColor: js.UndefOr[OpaqueColor] = js.native
}

object OptionalColor {
  @scala.inline
  def apply(): OptionalColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalColor]
  }
  @scala.inline
  implicit class OptionalColorOps[Self <: OptionalColor] (val x: Self) extends AnyVal {
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
    def setOpaqueColor(value: OpaqueColor): Self = this.set("opaqueColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpaqueColor: Self = this.set("opaqueColor", js.undefined)
  }
  
}

