package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CropProperties extends js.Object {
  var angle: js.UndefOr[Double] = js.native
  var offsetBottom: js.UndefOr[Double] = js.native
  var offsetLeft: js.UndefOr[Double] = js.native
  var offsetRight: js.UndefOr[Double] = js.native
  var offsetTop: js.UndefOr[Double] = js.native
}

object CropProperties {
  @scala.inline
  def apply(): CropProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropProperties]
  }
  @scala.inline
  implicit class CropPropertiesOps[Self <: CropProperties] (val x: Self) extends AnyVal {
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    @scala.inline
    def setOffsetBottom(value: Double): Self = this.set("offsetBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetBottom: Self = this.set("offsetBottom", js.undefined)
    @scala.inline
    def setOffsetLeft(value: Double): Self = this.set("offsetLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetLeft: Self = this.set("offsetLeft", js.undefined)
    @scala.inline
    def setOffsetRight(value: Double): Self = this.set("offsetRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetRight: Self = this.set("offsetRight", js.undefined)
    @scala.inline
    def setOffsetTop(value: Double): Self = this.set("offsetTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetTop: Self = this.set("offsetTop", js.undefined)
  }
  
}

