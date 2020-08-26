package typings.googleAppsScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdStyle extends js.Object {
  var colors: js.UndefOr[AdStyleColors] = js.native
  var corners: js.UndefOr[String] = js.native
  var font: js.UndefOr[AdStyleFont] = js.native
  var kind: js.UndefOr[String] = js.native
}

object AdStyle {
  @scala.inline
  def apply(): AdStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdStyle]
  }
  @scala.inline
  implicit class AdStyleOps[Self <: AdStyle] (val x: Self) extends AnyVal {
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
    def setColors(value: AdStyleColors): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setCorners(value: String): Self = this.set("corners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorners: Self = this.set("corners", js.undefined)
    @scala.inline
    def setFont(value: AdStyleFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

