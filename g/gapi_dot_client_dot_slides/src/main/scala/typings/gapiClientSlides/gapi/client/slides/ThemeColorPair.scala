package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeColorPair extends js.Object {
  /** The concrete color corresponding to the theme color type above. */
  var color: js.UndefOr[RgbColor] = js.native
  /** The type of the theme color. */
  var `type`: js.UndefOr[String] = js.native
}

object ThemeColorPair {
  @scala.inline
  def apply(): ThemeColorPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeColorPair]
  }
  @scala.inline
  implicit class ThemeColorPairOps[Self <: ThemeColorPair] (val x: Self) extends AnyVal {
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
    def setColor(value: RgbColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

