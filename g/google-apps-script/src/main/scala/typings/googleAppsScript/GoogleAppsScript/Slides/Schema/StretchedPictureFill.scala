package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StretchedPictureFill extends js.Object {
  var contentUrl: js.UndefOr[String] = js.native
  var size: js.UndefOr[Size] = js.native
}

object StretchedPictureFill {
  @scala.inline
  def apply(): StretchedPictureFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StretchedPictureFill]
  }
  @scala.inline
  implicit class StretchedPictureFillOps[Self <: StretchedPictureFill] (val x: Self) extends AnyVal {
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
    def setContentUrl(value: String): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentUrl: Self = this.set("contentUrl", js.undefined)
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

