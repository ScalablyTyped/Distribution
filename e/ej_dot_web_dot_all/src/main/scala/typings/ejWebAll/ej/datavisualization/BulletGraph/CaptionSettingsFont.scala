package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionSettingsFont extends js.Object {
  /** Specifies the color of the text in caption.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  /** Specifies the fontFamily of caption. Caption text render with this fontFamily
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.native
  /** Specifies the fontStyle of caption
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.native
  /** Specifies the fontWeight of caption
    * @Default {regular}
    */
  var fontWeight: js.UndefOr[FontWeight | String] = js.native
  /** Specifies the opacity of caption. Caption text render with this opacity.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specifies the size of caption. Caption text render with this size
    * @Default {12px}
    */
  var size: js.UndefOr[String] = js.native
}

object CaptionSettingsFont {
  @scala.inline
  def apply(): CaptionSettingsFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSettingsFont]
  }
  @scala.inline
  implicit class CaptionSettingsFontOps[Self <: CaptionSettingsFont] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontStyle(value: FontStyle | String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontWeight(value: FontWeight | String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

