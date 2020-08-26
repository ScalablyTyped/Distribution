package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParagraphMarker extends js.Object {
  var bullet: js.UndefOr[Bullet] = js.native
  var style: js.UndefOr[ParagraphStyle] = js.native
}

object ParagraphMarker {
  @scala.inline
  def apply(): ParagraphMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphMarker]
  }
  @scala.inline
  implicit class ParagraphMarkerOps[Self <: ParagraphMarker] (val x: Self) extends AnyVal {
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
    def setBullet(value: Bullet): Self = this.set("bullet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBullet: Self = this.set("bullet", js.undefined)
    @scala.inline
    def setStyle(value: ParagraphStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

